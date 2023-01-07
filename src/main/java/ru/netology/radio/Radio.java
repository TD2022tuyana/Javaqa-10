package ru.netology.radio;

public class Radio {
    private int stationNumber;
    private int volumeSound;
    private final int maxStation;
    private final int maxVolume = 100;
    private final int minVolume = 0;

    public Radio() {
        maxStation = 9;

    }
    public Radio(int stationsCount) {
        maxStation = stationsCount - 1;

    }
    public int getStationNumber() {
        return stationNumber;
    }
    public int getVolumeSound() {
        return volumeSound;
    }
    public void setStationNumber(int newStationNumber) {

        if (newStationNumber < 0) {
            return;
        }
        if (newStationNumber > maxStation) {
            return;
        }
        stationNumber = newStationNumber;
    }
    public void nextStationNumber() { // Следующая радиостанция

        if (stationNumber < maxStation) {
            stationNumber++;
        } else {
            stationNumber = 0;
        }
    }
    public void prevStationNumber() { // Предыдущая радиостанция
        if (stationNumber > 0) {
            stationNumber--;
        } else {
            stationNumber = maxStation;
        }
    }

    public void setVolumeSound(int newVolumeSound) {
        if (newVolumeSound < minVolume) {
            return;
        }

        if (newVolumeSound > maxVolume) {
            newVolumeSound = maxVolume;
        }
        volumeSound = newVolumeSound;
    }
    public void increaseVolume() { // Увеличение громкости
        if (volumeSound < maxVolume) {
            volumeSound++;
        }
    }
    public void descreaseVolume() { // Уменьшение громкости
        if (volumeSound > minVolume) {
            volumeSound--;
        }
    }
}


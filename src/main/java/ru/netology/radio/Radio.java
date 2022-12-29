package ru.netology.radio;
public class Radio {
    private int stationNumber;

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber < 0) {
            return;
        }
        if (newStationNumber > 9) {
            return;
        }
        stationNumber = newStationNumber;
    }

    public void nextStationNumber() { // Следующая радиостанция
        if (stationNumber < 9) {
            stationNumber = stationNumber + 1;
        } else {
            stationNumber = 0;
        }
    }

    public void prevStationNumber() { // Предыдущая радиостанция
        if (stationNumber > 0) {
            stationNumber = stationNumber - 1;
        } else {
            stationNumber = 9;
        }
    }

    private int volumeSound;

    public int getVolumeSound() {
        return volumeSound;
    }

    public void setVolumeSound(int newVolumeSound) {
        if (newVolumeSound < 0) {
            return;
        }
        if (newVolumeSound > 10) {
            return;
        }
        volumeSound = newVolumeSound;
    }

    public void increaseVolume() { // Увеличение громкости
        if (volumeSound < 10) {
            volumeSound = volumeSound + 1;
        }
    }

    public void descreaseVolume() { // Уменьшение громкости
        if (volumeSound > 0) {
            volumeSound = volumeSound - 1;
        }
    }
}

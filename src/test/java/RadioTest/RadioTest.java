package RadioTest;
import ru.netology.radio.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio rad = new Radio();

        rad.setStationNumber(10);

        int expected = 0;
        int actual = rad.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToSetStation() {
        Radio rad = new Radio();

        rad.setStationNumber(-2);

        int expected = 0;
        int actual = rad.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldToStationNumber() {
        Radio rad = new Radio();

        rad.setStationNumber(15);

        int expected = 0;
        int actual = rad.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToNextStation() {
        Radio rad = new Radio();
        rad.setStationNumber(7);

        rad.nextStationNumber();

        int expected = 8;
        int actual = rad.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToZeroStation() {
        Radio rad = new Radio();
        rad.setStationNumber(9);

        rad.nextStationNumber();

        int expected = 0;
        int actual = rad.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToPreviousStation() {
        Radio rad = new Radio();
        rad.setStationNumber(5);

        rad.prevStationNumber();

        int expected = 4;
        int actual = rad.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToNineStation() {
        Radio rad = new Radio();
        rad.setStationNumber(0);

        rad.prevStationNumber();

        int expected = 9;
        int actual = rad.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() { // уровень звука
        Radio rad = new Radio();

        rad.setVolumeSound(10);

        int expected = 10;
        int actual = rad.getVolumeSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToStayTen() {
        Radio rad = new Radio();
        rad.setVolumeSound(10);

        rad.increaseVolume();

        int expected = 10;
        int actual = rad.getVolumeSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToUpVolume() {
        Radio rad = new Radio();
        rad.setVolumeSound(7);

        rad.increaseVolume();

        int expected = 8;
        int actual = rad.getVolumeSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToDecreaseVolume() {
        Radio rad = new Radio();
        rad.setVolumeSound(1);

        rad.descreaseVolume();

        int expected = 0;
        int actual = rad.getVolumeSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToStayZeroVolume() {
        Radio rad = new Radio();
        rad.setVolumeSound(0);

        rad.descreaseVolume();

        int expected = 0;
        int actual = rad.getVolumeSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToVolume() {
        Radio rad = new Radio();

        rad.setVolumeSound(11);

        int expected = 0;
        int actual = rad.getVolumeSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToSetVolume() {
        Radio rad = new Radio();

        rad.setVolumeSound(-1);

        int expected = 0;
        int actual = rad.getVolumeSound();

        Assertions.assertEquals(expected, actual);
    }

}
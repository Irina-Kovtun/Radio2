package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetStationWithinRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    void shouldSetStationOutOfRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(867);
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    void shouldGoNextStationBeforeMaximum() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void shouldGoNextStationAfterMaximum() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    void shouldGoPrevStationBeforeMinimum() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.previousStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void shouldGoPreviousStationAfterMinimum() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.previousStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldSetVolumeWithinRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    void shouldSetVolumeOutOfRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(867);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeWithingRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeOutofRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10,radio.getCurrentVolume());
    }
    @Test
    void shouldDecreaseVolumeWithingRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeOutofRange() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        assertEquals(0,radio.getCurrentVolume());
    }
}



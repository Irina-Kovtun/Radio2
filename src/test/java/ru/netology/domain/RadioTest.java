package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio(20);

    @Test
    void shouldSetStationWithinRange() {
        radio.setCurrentStation(8);
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    void shouldSetStationOverRange() {
        radio.setCurrentStation(21);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetStationBelowRange() {
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldGoNextStationBeforeMaximum() {
        radio.setCurrentStation(5);
        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void shouldGoNextStationAfterMaximum() {
        radio.setCurrentStation(20);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldGoPrevStationBeforeMinimum() {
        radio.setCurrentStation(5);
        radio.previousStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void shouldGoPreviousStationAfterMinimum() {
        radio.setCurrentStation(0);
        radio.previousStation();
        assertEquals(20, radio.getCurrentStation());
    }

    @Test
    void shouldSetVolumeWithinRange() {
        radio.setCurrentVolume(8);
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    void shouldSetVolumeOutOfRange() {
        radio.setCurrentVolume(867);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeWithingRange() {
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeOutofRange() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeWithingRange() {
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeOutofRange() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}



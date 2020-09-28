package ru.netology.domain;

public class Radio {

    private int currentStation;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

    public Radio(){

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation++;
        }
    }

    public void previousStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        currentVolume--;
    }

}

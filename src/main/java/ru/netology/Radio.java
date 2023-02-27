package ru.netology;

public class Radio {


    // Опции Станций
    private int maxStation = 9; // Максмимальная станция
    private int minStation = 0; // Минимальная станция
    private int currentStation; // Выбранная станция
    private int numberStation; // Количество станций

    private int maxVolume; // Максимальная громкость
    private int minVolume; // Минимальная громкость
    private int currentVolume; // Выбранная громкость

    // Опции Станций
    public int getMaxStation() {
        return maxStation;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int numberStation) {
        if (numberStation > maxStation) {
            this.numberStation = 9;
        }
        if (numberStation < minStation) {
            this.numberStation = 0;
        }
        this.numberStation = numberStation - 1;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
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

    public void nextCurrentStation() {
        int currentStation = this.currentStation;
        if (currentStation >= maxStation) {
            this.currentStation = minStation;
        } else {
            this.currentStation = currentStation + 1;
        }
    }

    public void prevCurrentStation() {
        int currentStation = this.currentStation;
        if (currentStation <= minStation) {
            this.currentStation = maxStation;
        } else {
            this.currentStation = currentStation - 1;
        }
    }

    public void remoteCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            this.currentStation = maxStation;
        } else
        if (currentStation < minStation) {
            this.currentStation = minStation;
        } else {
            this.currentStation = currentStation;
        }
    }

    // Опции Громкости
    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextCurrentVolume() {
        int currentVolume = this.currentVolume;
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
        } else {
            this.currentVolume = currentVolume + 1;
        }
    }

    public void prevCurrentVolume() {
        int currentVolume = this.currentVolume;
        if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
        } else {
            this.currentVolume = currentVolume - 1;
        }
    }
}
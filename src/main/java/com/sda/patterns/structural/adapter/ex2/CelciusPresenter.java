package com.sda.patterns.structural.adapter.ex2;

public class CelciusPresenter {

    double temperatureInC;

    public CelciusPresenter() {
    }

    public double getTemperature() {
        return temperatureInC;
    }

    public void setTemperature(double temperatureInC) {
        this.temperatureInC = temperatureInC;
    }
}

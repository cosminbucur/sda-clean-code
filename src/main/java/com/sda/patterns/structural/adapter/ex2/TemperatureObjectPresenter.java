package com.sda.patterns.structural.adapter.ex2;

public class TemperatureObjectPresenter implements TemperatureInfo {
    CelciusPresenter celciusPresenter;
    public TemperatureObjectPresenter() {
        celciusPresenter = new CelciusPresenter();
    }
    @Override
    public double getTemperatureInC() {
        return celciusPresenter.getTemperature();
    }
    @Override
    public double getTemperatureInF() {
        return cToF(celciusPresenter.getTemperature());
    }
    @Override
    public void setTemperatureInC(double temperatureInC) {
        celciusPresenter.setTemperature(temperatureInC);
    }
    @Override
    public void setTemperatureInF(double temperatureInF) {
        celciusPresenter.setTemperature(fToC(temperatureInF));
    }
    private double fToC(double f) {
        return ((f - 32) * 5 / 9);
    }
    private double cToF(double c) {
        return ((c * 9 / 5) + 32);
    }
}

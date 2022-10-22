package com.sda.patterns.structural.adapter.ex2;

interface TemperatureInfo {
    
    double getTemperatureInF();

    void setTemperatureInF(double temperatureInF);

    double getTemperatureInC();

    void setTemperatureInC(double temperatureInC);
}
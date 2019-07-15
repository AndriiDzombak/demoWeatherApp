package com.weatherservice.exposed.model;

public abstract class Forecast implements ForecastInterface {

    @Override
    public long getAccuracy() {
        return 99;
    }
}

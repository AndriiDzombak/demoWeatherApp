package com.weatherservice.exposed;

import com.weatherservice.exposed.model.ForecastInterface;
import com.weatherservice.internal.provider.ServiceProvider;

import java.util.Date;
import java.util.List;

public class AggregatedWeatherService implements WeatherService {

    @Override
    public ForecastInterface getForecast(List<Date> dates) {
        getServiceProviders().forEach(s->s.provide());
        return null;
    }

    @Override
    public List<ServiceProvider> getServiceProviders() {
        return null;
    }
}

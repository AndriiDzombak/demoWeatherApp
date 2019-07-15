package com.weatherservice.internal.provider;

import com.weatherservice.internal.callback.ServiceCallback;

public interface ServiceProvider {

    ServiceCallback provide();
}
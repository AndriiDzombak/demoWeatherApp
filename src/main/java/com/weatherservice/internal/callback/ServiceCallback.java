package com.weatherservice.internal.callback;

import com.sun.deploy.net.HttpResponse;

public interface ServiceCallback {
    HttpResponse getCallback();
}

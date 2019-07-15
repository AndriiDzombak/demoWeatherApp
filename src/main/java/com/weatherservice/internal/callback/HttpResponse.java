package com.weatherservice.internal.callback;

public class HttpResponse implements ServiceCallback {

    private String body;

    public void setBody(String body) {
        this.body = body;
    }

    public com.sun.deploy.net.HttpResponse getCallback() {
        return null;
    }
}

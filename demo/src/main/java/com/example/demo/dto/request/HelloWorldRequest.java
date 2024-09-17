package com.example.demo.dto.request;

public class HelloWorldRequest {
    private String data;

    public HelloWorldRequest(String data) {
        this.data = data;
    }

    public HelloWorldRequest() {

    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

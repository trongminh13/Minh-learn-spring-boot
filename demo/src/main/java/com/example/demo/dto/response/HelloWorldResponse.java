package com.example.demo.dto.response;

public class HelloWorldResponse {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HelloWorldResponse(String message) {
        this.message = message;
    }
}

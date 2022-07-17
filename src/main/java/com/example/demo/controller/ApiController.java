package com.example.demo.controller;

import java.time.LocalDateTime;

public class ApiController {
    private final boolean success;
    private final String message;

    public ApiController(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }
    public String getMessage() {
        return message;
    }
    public String getTimestamp() {
        return LocalDateTime.now().toString();
    }
}

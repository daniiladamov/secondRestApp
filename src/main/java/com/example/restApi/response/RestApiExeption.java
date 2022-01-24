package com.example.restApi.response;

public class RestApiExeption extends RuntimeException  {
    public RestApiExeption(String message) {
        super(message);
    }
}

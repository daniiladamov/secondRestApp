package com.example.restApi.response;

public class RestApiResponse {
    private int status;
    private String massage;

    public RestApiResponse(int status, String massage) {
        this.status = status;
        this.massage = massage;
    }

    private Object data;

    public int getStatus() {
        return status;
    }

    public String getMassage() {
        return massage;
    }

    public Object getData() {
        return data;
    }

    public RestApiResponse(int status, String massage, Object data) {
        this.status = status;
        this.massage = massage;
        this.data = data;
    }
}

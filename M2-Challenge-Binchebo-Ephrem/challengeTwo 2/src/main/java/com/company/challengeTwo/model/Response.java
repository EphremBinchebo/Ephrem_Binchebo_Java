package com.company.challengeTwo.model;


import java.util.Objects;

public class Response {
    private String message;
    private boolean status;

    public Response(String message, boolean status) {
        this.message = message;
        this.status = status;
    }

    public Response() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Response)) return false;
        Response response = (Response) o;
        return status == response.status && Objects.equals(message, response.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, status);
    }

    @Override
    public String toString() {
        return "Response{" +
                "message='" + message + '\'' +
                ", status=" + status +
                '}';
    }
}

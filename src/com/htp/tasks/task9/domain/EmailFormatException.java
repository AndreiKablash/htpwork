package com.htp.tasks.task9.domain;

public class EmailFormatException extends  Exception{
    private String s;

    public EmailFormatException() {
    }

    public EmailFormatException(String s) {
        this.s = s;
    }
    @Override
    public String toString() {
        return "Invalid email format. " +
                "Email should contains '@'." +
                "Your email address: " + s;
    }
}

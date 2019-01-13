package com.htp.tasks.task9.domain;

public class MyFirstException extends Exception{
    private String s;

    public MyFirstException() {
    }
    public MyFirstException(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Invalid name's length for user: '" + s +'\'' + ". "+
                "User name should be from 2 to 30 symbols.";
    }
}



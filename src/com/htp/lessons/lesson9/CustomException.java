package com.htp.lessons.lesson9;

public class CustomException extends Exception {
    private String customMessage;

    public CustomException(String s) {
        customMessage = this.customMessage + s;
    }
    
    @Override
    public String toString() {
        return super.toString()+customMessage;
    }
}

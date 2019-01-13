package com.htp.shieldt.stream.videoEpam;

public class InsufficientFundsException extends Exception {
    String s;

    public InsufficientFundsException() {
    }

    public InsufficientFundsException(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "InsufficientFundsException{" +
                "s='" + s + '\'' +
                '}';
    }
}

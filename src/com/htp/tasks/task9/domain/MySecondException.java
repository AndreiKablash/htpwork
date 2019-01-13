package com.htp.tasks.task9.domain;

public class MySecondException extends Exception {
    private int age;

    public MySecondException() {
    }

    public MySecondException(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Age limitations (16+). Your age is "
                + age + ".";
    }
}

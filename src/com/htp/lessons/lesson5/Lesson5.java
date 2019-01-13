package com.htp.lessons.lesson5;

public class Lesson5 implements MyInterface,MySecondInterface{
    public Boolean bool;
    public Boolean bool1;
    public Boolean bool2;

    public Lesson5() {
    }
    public Lesson5(Boolean bool, Boolean bool1, Boolean bool2) {
        this.bool = bool;
        this.bool1 = bool1;
        this.bool2 = bool2;
    }

    @Override
    public void someInterfaceMethod() {
        System.out.println("someInterfaceMethod");
    }

    @Override
    public Integer someIntegerInterfaceMethod() {
        return 777;
    }

    @Override
    public String someStringInterfaceMethod() {
        return "someInterfaceMethod";
    }

    @Override
    public void parentMethod() {

    }

    @Override
    public void parentMethod2() {

    }
    /*Override
    default void defaultString () {
        System.out.println("someInterfaceMethod");
    }*/
}

package com.htp.lessons.lesson5;

public interface MyInterface {
    public static final String INTERFACE_CONST = "INTERFACE CONST";
    public static final Integer INTERFACE_INTEGER_CONST = 10;
    public static final Boolean INTERFACE_BOOLEAN_CONST = false;

    void someInterfaceMethod();
    Integer someIntegerInterfaceMethod();
    String someStringInterfaceMethod();

    default void defaultString(){
        System.out.println("Interface java 8");
    }

}

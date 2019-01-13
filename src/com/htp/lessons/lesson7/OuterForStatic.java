package com.htp.lessons.lesson7;

public class OuterForStatic {
    public static int outerStatic = 1;
    private String someString;
    private String anotherString;

    public static void method(){
        System.out.println(outerStatic);
        System.out.println("Inner static method");
    }
    static class StaticClass{
        private String qwe;

        public static void staticInnerMethod(){
            System.out.println("we are in staticInnerMethod");
        }

        public void someMethod(){
            new OuterForStatic().anotherString = "";
            System.out.println(outerStatic);
            method();//call static method of outer class
        }
    }

    class InnerClass extends StaticClass{

    }
}

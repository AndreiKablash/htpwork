package com.htp.lessons.lesson7;

public class Lesson7 extends OuterForStatic.StaticClass{


    public static void main(String[] args) {
       // System.out.println(outerStatic);
        OuterForAnonymous outerForAnonymous = new OuterForAnonymous(){
            @Override
            public void methodForAnonymous() {
                System.out.println("hello from anonymous");
            }
        };
        outerForAnonymous.methodForAnonymous();

    }
}

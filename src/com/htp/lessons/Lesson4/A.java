package com.htp.lessons.Lesson4;

//ctrl+h
public class A extends Lesson4{
    private int testAVAr;
    private String testStringAVar;

    static{
        System.out.println("SubBase static block");

    }

    {
        System.out.println("Base logic block");

    }

    public A(){
        super(1,2,3,4);
        System.out.println("Default A");
    }

    public A(int testAVAr, String testStringAVar) {
        super(1,2,3,4);
        this.testAVAr = testAVAr;
        this.testStringAVar = testStringAVar;
        System.out.println("Overload A constructor");
    }

    public int getTestAVAr() {
        return testAVAr+publictestint+protectedtestint;
    }

    public String getTestStringAVar() {
        return testStringAVar;
    }

    public void setTestAVAr(int testAVAr) {
        this.testAVAr = testAVAr;
    }

    public void setTestStringAVar(String testStringAVar) {
        this.testStringAVar = testStringAVar;
    }
    public void testSubclassMerhid(){
        stere();
       // saaaa();
        wwwww();
        finalTest();
    }
    @Override
    public void finalTest(int a){
        System.out.println("I am in subclass method stere");
    }

}

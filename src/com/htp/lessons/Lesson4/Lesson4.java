package com.htp.lessons.Lesson4;

import java.util.Objects;

public class Lesson4 extends Abstract{
    private int testint;
    public int publictestint;
    protected int protectedtestint;
    int frienl;
    static{
        System.out.println("Base static block");
    }
    {
        System.out.println("Base logic block");

    }

    public Lesson4(){
        System.out.println("Default Lesson 4");
    }

    public Lesson4(int testint, int publictestint, int protectedtestint, int frienl) {
        this.testint = testint;
        this.publictestint = publictestint;
        this.protectedtestint = protectedtestint;
        this.frienl = frienl;
        System.out.println("Overload Lesson4 constructior");

    }

    {
        System.out.println("Base logic block");

    }

    public int getTestint() {
        return testint;
    }

    public int getPublictestint() {
        return publictestint;
    }

    public int getProtectedtestint() {
        return protectedtestint;
    }

    public int getFrienl() {
        return frienl;
    }

    public void setTestint(int testint) {
        this.testint = testint;
    }

    public void setPublictestint(int publictestint) {
        this.publictestint = publictestint;
    }

    public void setProtectedtestint(int protectedtestint) {
        this.protectedtestint = protectedtestint;
    }

    public void setFrienl(int frienl) {
        this.frienl = frienl;
    }

    public void stere(){
        System.out.println(" i'am int stere");
    }
    private void saaaa(){
        System.out.println(" i'am int saaaa");
    }
    protected void wwwww(){
        System.out.println(" i'am int wwwww");
    }
    public final void finalTest(){
        System.out.println("I am in stere");
    }
    public void finalTest(int a){
        System.out.println("I am in stere");
    }

    @Override
    void printAnything() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson4 lesson4 = (Lesson4) o;
        return testint == lesson4.testint &&
                publictestint == lesson4.publictestint &&
                protectedtestint == lesson4.protectedtestint &&
                frienl == lesson4.frienl;
    }

    @Override
    public int hashCode() {
        return Objects.hash(testint, publictestint, protectedtestint, frienl);
    }

    @Override
    public String toString() {
        return "Lesson4{" +
                "testint=" + testint +
                ", publictestint=" + publictestint +
                ", protectedtestint=" + protectedtestint +
                ", frienl=" + frienl +
                '}';

    }


}

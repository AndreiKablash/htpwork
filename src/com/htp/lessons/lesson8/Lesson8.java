package com.htp.lessons.lesson8;

import java.util.Locale;

public class Lesson8 {
    private String testCharArray;
    public String createString(char[] charArray){
        new String(charArray,1,2);
        return new String(charArray);
    }

    public String createString(byte[] byteArray){
        return new String(byteArray);
    }

    public static void main(String[] args) {
        System.out.println(new Lesson8("qweqwe").createString(new char[]{'\u004a','2','3'}));
        System.out.println(new Lesson8("213").createString(new byte[]{'1','2','3'}));
        new Lesson8("ef").testStringLeterals();
    }
    public Lesson8() {
    }

   // public String createString(char[])

    public Lesson8(String testCharArray) {
        this.testCharArray = testCharArray;
    }

    public String getTestCharArray() {
        return testCharArray;
    }

    public void setTestCharArray(String testCharArray) {
        this.testCharArray = testCharArray;
    }

    public void testStringLeterals(){
        String java= " java";
        String java2= new String("java");
        System.out.println(java==java2);
        java2=java2.intern();
        System.out.println(java==java2);
        System.out.println(java.equals(java2));
        System.out.println(new String("1122333")+"efef");
        System.out.println(new String("aded").concat("edfef").toLowerCase(Locale.ENGLISH));
        int i =1;
        System.out.println(i+"");
        System.out.println(Integer.toString(i));
        System.out.println(Integer.parseInt("1221"));
        System.out.println(String.valueOf("12"));
        System.out.println(String.format("test %.1f string format %s",1223F,122));
        System.out.println(" Ку ку Петя".replace("Петя", "Вова"));
        System.out.println("Ку ку Петя".lastIndexOf("у"));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(123)
                .append("\t afdef\n")
                .append('a')
                .append(new Object());
        System.out.println(stringBuilder.toString());
        //Formatter formatter = new Formatter();

        //сгенировать строку 100 символ
        // найти последние вхождение буквы 2
        //




     }
}

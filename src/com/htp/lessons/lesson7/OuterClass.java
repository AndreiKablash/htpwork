package com.htp.lessons.lesson7;

import java.util.Date;

public class OuterClass {
    Inner inner;
    private String temptStr;
    private Date date;

    public OuterClass() {
    temptStr = " some outer string";
    date = new Date();
    }

    public OuterClass(Inner inner, String temptStr, Date date) {
        this.inner = inner;
        this.temptStr = temptStr;
        this.date = date;
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.smthMethod();
        Inner inner = new OuterClass().new Inner(10, "Hello");
        System.out.println(inner.getIneerString() + " " + inner.getInnerInt());
        System.out.println(OuterClass.Inner.finalInner);

    }


    public void smthMethod(){
        System.out.println(inner.innerInt);
        System.out.println(inner.innerString);

        //local class
        class InnerMethodClass{
            private String innerMethodStr;

            public InnerMethodClass(String innerMethodStr) {
                this.innerMethodStr = innerMethodStr;
            }

            public String getInnerMethodStr() {
                return innerMethodStr;
            }

            public void setInnerMethodStr(String innerMethodStr) {
                this.innerMethodStr = innerMethodStr;
            }
        }
        System.out.println(new InnerMethodClass("zachemnamtakoe").getInnerMethodStr());
    }

    class Inner /*extends, implements*/ {
       public static final int finalInner = 100_000_000;
       private static final int privateFinalInnerInt=0;
       //public static int staticInt;
        private int innerInt;
        private String innerString;

        public Inner() {
        }

        public Inner(int innerInt, String innerString) {
            this.innerInt = innerInt;
            this.innerString = innerString;
        }

        public int getInnerInt() {
            return innerInt;
        }

        public void setInnerInt(int innerInt) {
            this.innerInt = innerInt;
        }

        public String getIneerString() {
            return innerString;
        }

        public void setIneerString(String ineerString) {
            this.innerString = innerString;
        }

        public void nethod(){
            System.out.println(temptStr);
            System.out.println(date);


        }
    }

}

package com.htp.lessons.lesson7;

public class OuterForAnonymous {
    private String qwe = " test";

    public OuterForAnonymous() {
    }

    public OuterForAnonymous(String qwe) {
        this.qwe = qwe;
    }

    public String getQwe() {
        return qwe;
    }

    public void setQwe(String qwe) {
        this.qwe = qwe;
    }
    public void methodForAnonymous(){
        System.out.println("Hello from OuterClass");
    }
}

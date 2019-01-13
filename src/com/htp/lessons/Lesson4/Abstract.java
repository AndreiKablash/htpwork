package com.htp.lessons.Lesson4;

public abstract class Abstract {
    private int abstractInt;
    protected String className;
    protected Integer count;

    static{
        System.out.println("SubBase logic block");
    }
    public Abstract(){
    }
    public Abstract(int abstractInt, String className, Integer count) {
        this.abstractInt = abstractInt;
        this.className = className;
        this.count = count;
    }

    protected  void printAbstractInfo(){
        System.out.println(abstractInt + " " + className + ": "+ count);
    }

    abstract void printAnything();
}

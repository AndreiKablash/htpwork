package com.htp.lessons.test.enumTest;

public enum Seasons {
    WINTER("winter",1), SPRING("spring",2), SUMMER("summer",3), FALL("fall",4);

    private String strEnum = "one";
    private int intEnum = 0;

    //default constructor
    Seasons() {
    }
    //constructor
    Seasons(String strEnum, int intEnum) { // constructor has private access
        this.strEnum = strEnum;
        this.intEnum = intEnum;
    }

    public String getStrEnum() {
        return strEnum;
    }

    public int getIntEnum() {
        return intEnum;
    }

    public void setStrEnum(String strEnum) {
        this.strEnum = strEnum;
    }

    public void setIntEnum(int intEnum) {
        this.intEnum = intEnum;
    }


    public String IsSummer(){
        switch (this){
            case FALL: return "is getting colder ";
            case WINTER: return "cold weather";
            case SUMMER: return  "hot season";
            case SPRING: return "is getting warmer";
            default: return "non";
        }
    }
    public void IsFall(){
        switch (this){
            case FALL:
                System.out.println("is getting colder ");
                break;
            case WINTER:
                System.out.println("cold weather");
                break;
            case SUMMER:
                System.out.println("hot season");
                break;
            case SPRING:
                System.out.println("is getting warmer");
                break;
            default:
                System.out.println("non");
                break;
        }
    }
    /*@Override
    public String toString() {
        return "Seasons{" +
                "strEnum='" + strEnum + '\'' +
                ", intEnum=" + intEnum +
                '}';
    }*/

    @Override
    public String toString() {
        String lowercase = name().toLowerCase(java.util.Locale.US);//должно возвращать в нижнем регистре
        return lowercase;
    }
}

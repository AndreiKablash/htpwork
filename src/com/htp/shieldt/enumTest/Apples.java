package com.htp.shieldt.enumTest;

public enum Apples {

    Jonathan("jonathan"), GoldenDel("goldenDel"), RedWine("redwine"),Winesap("winesap");

    private String ap;

    Apples() {
    }

    Apples(String ap) {
        this.ap = ap;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    @Override
    public String toString() {
        return "Apples{" +
                "ap='" + ap + '\'' +
                '}';
    }
    public void isAplples(){
        switch(this){
            case Jonathan:
                System.out.println(
                        " Jonathan");
                break;
            case RedWine:
                System.out.println("we have RedWine");
                break;
            default:
                System.out.println("There are no such apples");;
        }
    }


}

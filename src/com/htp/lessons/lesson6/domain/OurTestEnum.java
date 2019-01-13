package com.htp.lessons.lesson6.domain;

public enum OurTestEnum {//static
    SOUTH(2, "south"){
        @Override
        void printSomething() {
            System.out.println("enum value: " + getGlobalSide());
        }
    }, NORTH(){
        @Override
        void printSomething() {
            System.out.println("enum value: " + getGlobalSide());
        }
    }, WEST(4,"west"){
        @Override
        void printSomething() {
            System.out.println("enum value: " + getGlobalSide());
        }
    }, EAST(5,"east"){
        @Override
        void printSomething() {
            System.out.println("enum value: " + getGlobalSide());
        }
    };

    private int globalSideNumber = 999;
    private String globalSide = "xxxx";

    OurTestEnum() {
    }

    OurTestEnum(int globalSideNumber, String globalSide) {
        this.globalSideNumber = globalSideNumber;
        this.globalSide = globalSide;
    }

    public int getGlobalSideNumber() {
        return globalSideNumber;
    }

    public String getGlobalSide() {
        return globalSide;
    }

    public void setGlobalSide(String globalSide) {
        this.globalSide = globalSide;
    }

    public void setGlobalSideNumber(int globalSideNumber) {
        this.globalSideNumber = globalSideNumber;
    }

    abstract void printSomething();

    @Override
    public String toString() {
        return "OurTestEnum{" +
                "globalSideNumber=" + globalSideNumber +
                ", globalSide='" + globalSide + '\'' +
                '}';
    }

    public boolean isNorth(){
        switch (this){
            case NORTH:
                return true;
            case WEST:
            case EAST:
            case SOUTH:
                default: return
                        false;

        }
    }
}

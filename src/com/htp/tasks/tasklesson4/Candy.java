package com.htp.tasks.tasklesson4;

public class Candy extends Sweet {
    private String candyVariety;

    public Candy(){
    }

    public Candy(String sweetKind, String sweetName, int weight, String candyVariety) {
        super(sweetKind, sweetName, weight);
        this.candyVariety = candyVariety;
    }

    public String getCandyVariety() {
        return candyVariety;
    }

    public static void countCandy(String sweetKind, String sweetName, int weight, String candyVariety, int count){
        Candy[] candy = new Candy[count];
        for(int i=0;i<count; i++){
            candy[i]=new Candy(sweetKind,sweetName,weight,candyVariety);
            System.out.println("candy["+i+"]= "+candy[i]);
        }
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

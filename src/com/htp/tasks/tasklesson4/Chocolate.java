package com.htp.tasks.tasklesson4;

public class Chocolate extends Sweet{
    private String chocolateKind;

    public Chocolate(){
    }

    public Chocolate(String sweetKind, String sweetName, int weight, String chocolateKind) {
        super(sweetKind, sweetName, weight);
        this.chocolateKind = chocolateKind;
    }


    public String getChocolateKind() { return chocolateKind;
    }


    public static void chocolatecount(String sweetKind, String sweetName, int weight, String chocolateKind, int count){
       Chocolate[] chocolate = new Chocolate[count];
        for(int i=0;i<count; i++){
            chocolate[i]=new Chocolate(sweetKind,sweetName,weight,chocolateKind);
            System.out.println("chocolate["+i+"]= " + chocolate[i]);
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

package com.htp.shieldt;
class RecTest{
    int volum[];

    public RecTest(int i) {
        volum = new int[i];
    }
    //рекурсивное отображение элементов массива
    void printArray(int i){
        if(i==0) return;
        else printArray(i-1);
        System.out.println("["+(i-1)+"]= "+ volum[i-1]);
    }
}
public class Recurtin {
    public static void main(String[] args) {
        RecTest rec=new RecTest(10);
        int i;
        for(i=0;i<10;i++) rec.volum[i]=i;
        rec.printArray(10);
    }
}

package com.htp.shieldt;
class Stack{
    private int stck[];
    private int tos;
    //резервирование и инициализация стека
    Stack(int size){
       stck=new int[size];
       tos=-1;
    }
    void push(int item){
        if(tos==stck.length-1) System.out.println("стек полон");
        else
            stck[++tos]=item;
    }
    int pop(){
        if(tos<0){System.out.println("стек пуст");
        return  0;}
        else
            return stck[tos--];
    }
}
public class TestStack2 {
    public static void main(String[] args) {
        Stack myStack1=new Stack(5);
        Stack myStack2=new Stack(8);
        for(int i=0;i<5;i++) myStack1.push(i);
        for(int i=0;i<8;i++) myStack2.push(i);
        System.out.println("stack1 ");
        for(int i=0;i<5;i++) System.out.print(myStack1.pop()+ " ");
        System.out.println(" ");
        for(int i=0;i<8;i++) System.out.print(myStack2.pop()+ " ");
    }
}

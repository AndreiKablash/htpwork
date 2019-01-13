package com.htp.lessons.lesson123;

public class Task17 {
    public static void main(String[] args) {
        double massive[] = {5,10,5,15,30,20};
        double m = massive[0];
        int i,j = 0;
        for(i=0;i<massive.length;i++){
            if(m<massive[i]){
                m = massive[i];
                j=i;
            }
        }
        System.out.println("Max value from array massive["+ j + "] = " + m);

        for(i=0;i<massive.length;i++){
            System.out.print((massive[i]/m)+ " ");
        }
    }
}

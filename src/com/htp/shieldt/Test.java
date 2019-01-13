package com.htp.shieldt;

public class Test {
    int a;
    int b;

    Test(int i) {
        a = i;
    }
    Test incrByTen(){
        Test temp = new Test(a+10);
        return temp;
    }





}

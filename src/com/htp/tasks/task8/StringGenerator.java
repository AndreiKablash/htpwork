package com.htp.tasks.task8;

import java.util.Random;

public class StringGenerator {
    public static String stringGenerator(String characters, int length){
        Random rng = new Random();
        char[] text = new char[length];
        for(int i=0;i<length;i++){
            text[i]=characters.charAt(rng.nextInt(characters.length()));
        }
        return new String(text);
    }
}

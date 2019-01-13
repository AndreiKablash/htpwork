package com.htp.tasks.lesson12;

import com.htp.homework.lesson12.util.Performer;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        Performer performer = new Performer();

        //TASK 1
        //Call method to read example of file.java like file.txt and replace all words "public" to "private"
        //parameter: fileName (in this case some string with file path).
        String pathToJavaFile = "src/com/htp/homework/lesson12/domain/Example.java";
        performer.readAndReplace(pathToJavaFile);

        //TASK 2
        //Call method to create file with random sorted integer numbers
        //first parameter: bound - is bound for random number generator (from 0 to bound)
        //second parameter: numberAmount - is amount of numbers that should be created
        //as a result: file with sorted numbers - fileWithNumbers.txt
       // performer.getRandomNumbersFile(100, 10);

        //call the method to create a file.txt and fill the file with random integer numbers
        //call the method to sort existing file.txt with random integer numbers
        //parameter: someFile (instance of File class)
        //as a result: file with sorted numbers - NewFileWithNumbers.txt
        performer.getSortedRandomNumbersFile(performer.getRandomNumbersFile(100, 10));

        //TASK 3

    }
}

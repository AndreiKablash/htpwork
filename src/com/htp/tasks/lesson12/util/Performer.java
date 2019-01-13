package com.htp.tasks.lesson12.util;

import com.htp.homework.lesson12.util.Generator;
import com.htp.homework.lesson12.util.NumberStringComparator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

public class Performer {
    private static final String WORD_SEARCH = "public";
    private static final String WORD_REPLACE = "private";
    private com.htp.homework.lesson12.util.Generator generator;

    public Performer() {
        this.generator = new Generator();
    }

    //The method reads example of file.java like file.txt and replace all words "public" to "private"
    public void readAndReplace(String file) {
        String newFileNamePath = "src/com/htp/homework/lesson12/resources/javaExample.txt";
        try (
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                FileWriter fileWriter = new FileWriter(newFileNamePath, false);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            StringBuilder sb = new StringBuilder();
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                sb.append(s.replace(WORD_SEARCH, WORD_REPLACE)).append("\r\n");
            }
            bufferedWriter.write(sb.toString());
            bufferedWriter.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    //The method is used to create file.txt and fill a file with sorted random integer numbers.
    //file path is "src/com/htp/homework/lesson12/resources/newFileWithNumbers.txt"
    public void getSortedRandomNumbersFile(int bound, int numberAmount) {
        String fileName = "src/com/htp/homework/lesson12/resources/fileWithNumbers.txt";
        try (FileWriter fileWriter = new FileWriter(fileName);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            //creation of TreeSet collection
            TreeSet<Integer> integerTreeSet = new TreeSet<>();
            //call method to fill TreeSet collection with random integer numbers
            generator.getRandomNumbers(integerTreeSet, bound, numberAmount);
            //write in file (numbers that  was sorted in TreeSet collection)
            for (Integer number : integerTreeSet) {
                bufferedWriter.write(number.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    //The method used to create a file.txt and fill the file.txt with random integer numbers
    //This method returns file with numbers.
    public String getRandomNumbersFile(int bound, int numberAmount){
        String pathToNewFile = "src/com/htp/homework/lesson12/resources/NewFileWithNumbers.txt";
        File fileWithNumbers = new File(pathToNewFile);
        try (FileWriter fw = new FileWriter(fileWithNumbers);
             BufferedWriter bw = new BufferedWriter(fw);
             FileReader fr = new FileReader(fileWithNumbers);
             BufferedReader br = new BufferedReader(fr)) {
            //fill the file by random numbers
            int[] arrayForRandomNumbers = generator.getRandomNumbers(bound, numberAmount);
            for (int i = 0; i < arrayForRandomNumbers.length; i++) {
                String line = Integer.toString(arrayForRandomNumbers[i]);
                bw.write(line);
                bw.newLine();
            }
            bw.flush();
        }catch (IOException ex) {
        ex.printStackTrace();
        }
        return fileWithNumbers.getAbsolutePath();
    }

    //The method is used to sort file with numbers
    public void getSortedRandomNumbersFile(String fileName) {
        try (FileReader fr = new FileReader(fileName);
             BufferedReader br = new BufferedReader(fr)) {
            //read the file in TreeSet<> collection to sort numbers by comparator
            TreeSet<String> treeSet = new TreeSet<>(new NumberStringComparator());
            String stringLine;
            while ((stringLine = br.readLine()) != null) {
                treeSet.add(stringLine);
            }
            br.close();
            //fill the file with sorted numbers
            try (FileWriter fw = new FileWriter(fileName);
                 BufferedWriter bw = new BufferedWriter(fw)) {
                for (String str : treeSet) {
                    bw.write(str);
                    bw.newLine();
                }
                bw.flush();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}


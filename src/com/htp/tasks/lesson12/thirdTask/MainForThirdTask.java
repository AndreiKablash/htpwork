package com.htp.tasks.lesson12.thirdTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainForThirdTask {
    public static void main(String[] args) throws IOException {
        String fileName = "src/com/htp/homework/lesson12/thirdTask/someTextFile.txt";
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter("someFile.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            StringBuilder stringBuilder = new StringBuilder();
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                //Split text into words
                String words[] = s.split("\\s*(\\s|,|!|\\?|\\.)\\s*");
                //first word in the line
                String firstWord = words[0];
                //Last word in the line
                String lastWord = words[words.length - 1];
                //Body of the line
                String body = s.substring((s.indexOf(firstWord) + firstWord.length()), s.lastIndexOf(lastWord));
                //last punctuation mark
                String lastChar = s.substring(s.lastIndexOf(lastWord) + lastWord.length());
                stringBuilder.append(lastWord + body + firstWord + lastChar).append("\r\n");
            }
            //Write in file new edited text
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

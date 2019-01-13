package com.htp.lessons.lesson11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IOJavaSheme {
    public static final String TEXT_FILE_NAME = "F:\\text.txt";
    public static final String BINARY_FILE_NAME = "F:\\binary.txt";
    public static final String ARRAY_TEXT_NAME = "F:\\string.txt";
    public static final String SPLIT = "\n";

    public static void main(String[] args) throws IOException {
        IOJavaSheme IOJavaSheme = new IOJavaSheme();
        // IOJavaSheme.binaryProcessing();
        //   IOJavaSheme.textProcessing();

        //Example how to write/read arrays
        try /*with resources only if Autocloseable implemented*/ (
            FileWriter fileWriter = new FileWriter(ARRAY_TEXT_NAME);
            BufferedWriter br = new BufferedWriter(fileWriter);
            PrintWriter pw = new PrintWriter(br);
            FileReader fileReader = new FileReader(ARRAY_TEXT_NAME)) {

            List<String> words = new ArrayList<>();
            words.add("Array");
            words.add("should");
            words.add("be");
            words.add("written");
            words.add("in");
            words.add("file");
            System.out.println("Текстовый Файл открыт для записи");
            // Записать массив
            for(String str: words){
                pw.write(words+SPLIT);
            }
            System.out.println("Записана строка с размерностью: " + 10000);
            // Создать входной поток
            System.out.println("Файл открыт для чтения");
            // Считать в массив
            char[] bufferForFile = new char[10000];
            pw.close();
            int count = fileReader.read(bufferForFile, 0, 10000);
            System.out.println("Считано: " + count + " байт");
            System.out.println(new String(bufferForFile));

            //3 methods how to read array
            BufferedReader reader = new BufferedReader(new FileReader("F:\\array.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line);
            }
            reader.close();

            Scanner s = new Scanner(new File("F:\\array.txt"));
            List<String> list = new ArrayList<>();
            while (s.hasNext()) {
                list.add(s.next());
            }
            s.close();

            List<String> lines = Files.readAllLines(Paths.get("D:\\array.txt"));

            System.out.println(Arrays.toString(words.toArray()));
            System.out.println(Arrays.toString(list.toArray()));
            System.out.println(Arrays.toString(lines.toArray()));

    } catch(
    IOException e)

    {
        System.out.println("Haha  !!!");
    }

}
    private void textProcessing() {
        try( FileWriter fileWriter = new FileWriter(TEXT_FILE_NAME);
             BufferedWriter br = new BufferedWriter(fileWriter);
             PrintWriter pw = new PrintWriter(br);
             FileReader fileReader = new FileReader(TEXT_FILE_NAME)) {

            System.out.println("Текстовый Файл открыт для записи");
            // Записать массив
            String tempString = "Some string for writing in file";
            int stringLength = tempString.length();
            pw.write(tempString);
            System.out.println("Записана строка с размерностью: " + stringLength);
            // Создать входной поток
            System.out.println("Файл открыт для чтения");
            // Считать в массив
            char[] bufferForFile = new char[stringLength];
            pw.close();
            int count = fileReader.read(bufferForFile, 0, stringLength);
            System.out.println("Считано: " + count + " байт");
            System.out.println(new String(bufferForFile));
            System.out.println(Arrays.toString(bufferForFile));
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно произвести запись в файл: "
                    + TEXT_FILE_NAME);
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода: " + e.toString());
        }
    }



    private void binaryProcessing() {
        byte[] bytesToWrite = {1, 2, 3};
        byte[] bytesReaded = new byte[10];
        try (FileOutputStream outFile = new FileOutputStream(BINARY_FILE_NAME);
             FileInputStream inFile = new FileInputStream(BINARY_FILE_NAME)) {
            System.out.println("Файл открыт для записи");
            // Записать массив
            outFile.write(bytesToWrite);
            System.out.println("Записано: " + bytesToWrite.length + " байт");
            // Создать входной поток
            System.out.println("Файл открыт для чтения");
            // Узнать, сколько байт готово к считыванию
            int bytesAvailable = inFile.available();
            System.out.println("Готово к считыванию: " + bytesAvailable
                    + " байт");
            // Считать в массив
            int count = inFile.read(bytesReaded, 0, bytesAvailable);
            System.out.println("Считано: " + count + " байт");
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно произвести запись в файл: "
                    + BINARY_FILE_NAME);
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода: " + e.toString());
        }
    }
}
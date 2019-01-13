package com.htp.tasks.task8;

import java.util.Arrays;

public class Lesson8 {
    private static final String VOWELS = "aeiouy";
    private static final String QUESTION_MARK = "?";


    public static void main(String[] args) {
       /* Random random = new Random();
        char[] chars = {'a','b','b','c','d','e','f','g','h','i','j','k',
                'l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
        ' ','.',',',';',':','!','?'};
        String str = new String (chars);
        String s = StringGenerator.stringGenerator(str,120);
        System.out.println(s);*/

        String s = "Superman is a fictional superhero created by writer Jerry Siegel and artist Joe Shuster. " +
                "He first appeared in Action Comics #1, a comic book published on April 18 (1938)? " +
                "He appears regularly in American comic book published by DC Comics," +
                " and has been adapted to radio shows, newspaper strips, television shows, movies, and video games?";

        //Task#1
        System.out.println("Task #1");
        String modS = "";
        String split = " ";
        String[] texts = s.split(" ");
        for (String text : texts) {
            String firstText = text.substring(0, 1).toUpperCase();
            String allText = text.substring(1);
            modS += firstText + allText + split;
        }
        System.out.println("Edited text: " + modS);

        //Task#2
        System.out.println("Task #2");
        char symbol[] = {',', '.', ':', ';', '!', '?'};
        int numberOfSymbols = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < symbol.length; j++) {
                if (symbol[j] == s.charAt(i))
                    numberOfSymbols++;
            }
        }
        System.out.println("The number of punctuation marks in the text: " + numberOfSymbols);

        //Task#3
        System.out.println("Task #3");
        String sTemp = "";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sTemp += s.charAt(i);
            } else {
                if (!sTemp.equals("")) {
                    sum += Integer.parseInt(sTemp);
                    sTemp = "";
                }
            }
        }
        System.out.println("Sum of numbers in the   string s: " + sum);

        //Task#4
        System.out.println("Task#4");
        StringBuilder builder = new StringBuilder();
        String newText = "";
        String replace = "8";
        for (String text : texts) {
            if (text.length() > 2) {
                newText = text.substring(0, 1) + replace + text.substring(2);
            } else {
                newText = text;
            }
            builder.append(newText + split);
        }
        System.out.println(builder.toString());

        //Task#5
        System.out.println("Task #5");
        char firstChar = '(';
        char secondChar = ')';
        String resultS = s.substring(0, s.indexOf(firstChar)) + s.substring(s.lastIndexOf(secondChar) + 1);
        System.out.println(resultS);

        //Task#6
        System.out.println("Task #6");
        String[] words = s.toLowerCase().replaceAll("[-.?!)(,:]", "").split("\\s");
        String s1 = "";
        int count = 1;
        Arrays.sort(words);
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].compareTo(words[i + 1]) == 0) {
                count++;
            } else {
                System.out.println(words[i] + " - " + count);
                count = 1;
            }
        }

       /* //Task #6 part 2 with using HashMap:
        System.out.println("part 2 for task #6");
        Map<String, Integer> wordsMap = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                Integer countS = wordsMap.get(word);
                if (countS == null) {
                    countS = 0;
                }
                wordsMap.put(word, ++countS);
            }
        }
        for (String word : wordsMap.keySet()) {
            System.out.println(word + ": " + wordsMap.get(word));
        }
        */

        //Task#7
        System.out.println("Task#7");
        String sentences[] = s.toLowerCase().split("[.!?]\\s*");
        int charCount = 0;
        int vowelsCount = 0;
        for (String sentenceForChar : sentences) {
            for (char charSentence : sentenceForChar.toCharArray()) {
                if (Character.isLetter(charSentence)) {
                    charCount++;
                    if (VOWELS.indexOf(charSentence) != -1)
                        vowelsCount++;
                }
            }
            System.out.println(sentenceForChar);
            System.out.println("Number of vowels: " + vowelsCount);
            System.out.println("Number of consonants: " + (charCount - vowelsCount));
        }


        //Task#8
        System.out.println("Task#8");
       /* Pattern pattern = Pattern.compile("([A-Z][^.!?]*)\\?");
        Matcher m = pattern.matcher(s);
        while (m.find())
            System.out.println(m.group());
       */
       // String questionMark = "?";
        int length = 5;
        System.out.println(" Specified Length=" + length);
        //replace all question marks with symbol '?~' to save the question mark '?' after splitting a text.
        String stringA = s.replaceAll("[QUESTION_MARK]", "?~");
        //split the text into sentences
        String sentencesArr[] = stringA.split("[!.~]");
        String wordss[][] = new String[sentencesArr.length][];
        for (int i = 0; i < sentencesArr.length; i++) {
            if (sentencesArr[i].endsWith(QUESTION_MARK)) {
                wordss[i] = sentencesArr[i].toLowerCase().replaceAll("[-.?!)(,:\\d]", "").split("\\s");
                System.out.println(sentencesArr[i]);
                for (int j = 0; j < wordss[i].length; ++j) {
                    if (wordss[i][j].length() == length) System.out.println(wordss[i][j]);
                }
            }
        }
    }
}







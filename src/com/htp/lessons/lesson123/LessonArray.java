package com.htp.lessons.lesson123;

public class LessonArray {
    public static void main(String[] args) {
        //wrappers
        //byte data type
        byte a = 1;
        //wrappling  around byte type
        Byte byteobj = new Byte(a);

        //integer data type
        int i = 1;
        //wrapping around Byte type
        Integer integerobj = new Integer(i);

        //float data type
        float f = 21.1f;
        Float floatobj = new Float(f);

        //Double data type
        double d = 12.12;
        Double doubleobj = new Double(d);

        //char data type
        char c = 'a';
        Character charobj = new Character(c);

        System.out.println("values of Wrappers objects");
        System.out.println("byte object" + byteobj);
        System.out.println("byte integer" + integerobj);
        System.out.println("byte float" + floatobj);
        System.out.println("byte double" + doubleobj);
        System.out.println("byte char" + charobj);

        //unwrapping objects to primitive data types
        byte bv = byteobj;
        int iv = integerobj;
        float fv = floatobj;
        double dv = doubleobj;
        char cv = charobj;
        System.out.println("byte value " + bv);
        System.out.println("int value " + iv);
        System.out.println("float  value" + fv);
        System.out.println("double value " + dv);
        System.out.println("char value " + cv);


        //Arrays

        int[] anArray;
        //allocates memory  for 10 integers
        anArray = new int[10];
        //initialize first element
        anArray[0] = 100;
        //initialize second element
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;
        //output
        System.out.println("element at index 0" + anArray[0]);

        //Declaring  a Variable to Refer to an Array
        byte[] anArryOFBytes;
        short[] anArryOFShorts;
        long[] anArryOFLongs;
        float[] anArryOFfloats;
        double[] anArryOFDoubles;
        boolean[] anArrayBooleans;

        // Creating, Initializing and Accessing Arrays

        int[] oneTypeOfInit = {
                100, 200, 300,
                400, 500, 600,
                700, 800, 900, 1000
        };

        //2d Array
        String[][] names = {
                {"Merry", "Def", "Jet"},
                {"Sher", "Jane"}
        };
        System.out.println(names[0][1] + names[1][0]);

        int arr[][] = {{1, 2, 3}, {2, 4, 5}, {6, 7, 8}};
        //print 1D Array

        for (int j = 0; j < oneTypeOfInit.length; j++) {
            System.out.println(oneTypeOfInit[j]);
        }

        //print 2D Array
        for (int k = 0; k < names.length; k++) {
            for (int m = 0; m < names[k].length; m++) {
                System.out.println(names[k][m]);
            }
        }
            //Ctrl + P
            //Ctrl + Q
            char[] copyFrom = {'f', 'd', 'w', 'e', 'r', 'r', 'r', 'e', 'r'};
            char[] copyTo = new char[7];

            System.arraycopy(copyFrom, 0, copyTo, 0, 7);
            System.out.println(new String(copyTo));

            //different for statement
            double[] myList = {1.9,2.9,3.4,3.5};
            //

            System.out.println("first means");
            for( i=0;i<myList.length;i++){
                System.out.println(myList[i]);
            }

            System.out.println("second means");
            while(i<myList.length){
                System.out.println(myList[i]);
                i++;
            }

            System.out.println("third means");
            for(double t: myList){
                System.out.println(t);
            }

            System.out.println("forth means");
            do{
                System.out.println(myList[i]);
                i++;
            }while(i<myList.length);

        }
    }

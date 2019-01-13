package com.htp.shieldt.serializable.serializationInFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        String stringForFile = "F:\\forjava\\123";
        Counter c1 = null;
        Counter counter = new Counter(2, "sheep");
        try (FileOutputStream fos = new FileOutputStream(stringForFile);
             ObjectOutputStream oos = new ObjectOutputStream(fos);
             FileInputStream fis = new FileInputStream(stringForFile);
             ObjectInputStream ois = new ObjectInputStream(fis))
        {
            //serialising
            oos.writeObject(counter);
            oos.flush();
            //oos.close();
            fos.flush();
            //deserializing
            c1 = (Counter) ois.readObject();
        } catch (IOException ex) {
            ex.printStackTrace();
        }catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        System.out.println(c1.toString());
    }
}

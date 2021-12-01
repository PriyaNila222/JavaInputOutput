package com.company;

//Write a program to read data from properties file

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Program9 {
    public static void main(String[] args) {
        try {
            var fileReader = new FileReader("F:\\JavaInputOutput\\src\\com\\company\\PropertyFile.properties");
            var properties = new Properties();
            properties.load(fileReader);
            Set set = properties.entrySet();

            Iterator iterator = set.iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry)iterator.next();
                System.out.println(entry.getKey() + "= " + entry.getValue());
            }
            fileReader.close();
        }

        catch (IOException IO) {
            IO.printStackTrace();
        }
    }
}

package com.company;

//Write a program to read text from .txt file using FileReader

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file location: ");
        String fileLocation = scanner.nextLine();

        File file = new File(fileLocation);

        try {
            var fileReader = new FileReader(file);
            int value;
            while ((value = fileReader.read()) != -1)
                System.out.print((char) value);
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

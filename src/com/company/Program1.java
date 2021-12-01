package com.company;

//Write a program to read text from .txt file using InputStream

import org.apache.commons.io.IOUtils;
import java.nio.charset.StandardCharsets;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file location: ");
        String fileLocation = scanner.nextLine();

        File file = new File(fileLocation);

        try {
            InputStream inputStream = new FileInputStream(file);
            String fileContent = IOUtils.toString(inputStream, String.valueOf(StandardCharsets.UTF_8));
            System.out.println(fileContent);
        }

        catch (IOException IO) {
            IO.printStackTrace();
        }

    }
}

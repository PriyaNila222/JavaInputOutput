package com.company;

//Read txt from .txt file using BufferedInputStream

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file location: ");
        String fileLocation = scanner.nextLine();

        File file = new File(fileLocation);

        try {
            var fileInputStream = new FileInputStream(file);
            var bufferedInputStream = new BufferedInputStream(fileInputStream);
            int value;
            while((value=bufferedInputStream.read())!=-1){
                System.out.print((char)value);
            }
            bufferedInputStream.close();
            fileInputStream.close();

        }

        catch (IOException IO) {
            IO.printStackTrace();
        }

    }
}

package com.company;

//Write text to .txt file using BufferedWriter

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the location where file has to be saved: ");
        String fileLocation = scanner.nextLine();

        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        String filePath = fileLocation + "\\" + fileName;

        System.out.println("Enter the content(Exit to stop):");
        String content = "";

        while (scanner.hasNext()) {
            content = content + scanner.nextLine() + "\n";
            if(content.contains("Exit")) {
                content = content.replaceAll("Exit", " ");
                break;
            }
        }

        var file = new File(filePath);

        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(content);
            bufferedWriter.close();
            fileWriter.close();
            System.out.println("File is creeated successfully");
        }

        catch (IOException IO) {
            IO.printStackTrace();
        }
    }
}

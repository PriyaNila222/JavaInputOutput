package com.company;

////Write a text to a .txt file using BufferedOutputStream

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Program4 {
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
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            bufferedOutputStream.write(content.getBytes(StandardCharsets.UTF_8));
            bufferedOutputStream.close();
            System.out.println("File is created successfully");
        }

        catch (IOException e) {
            e.printStackTrace();
        }

    }
}

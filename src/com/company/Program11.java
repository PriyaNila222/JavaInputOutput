package com.company;

//Write a program to write data to excel


import org.apache.poi.xssf.usermodel.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowId = 0;
        int columnId = 0;
        XSSFRow row;
        XSSFCell cell0, cell1;

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        XSSFSheet xssfSheet = xssfWorkbook.createSheet("StudentDetails");

        row = xssfSheet.createRow(rowId);
        cell0 = row.createCell(columnId);
        cell0.setCellValue("Name");

        cell1 = row.createCell(++columnId);
        cell1.setCellValue("Rollno");

        System.out.println("\t\t\t\t\t\t\t\tEnter the student Details");
        System.out.print("Enter the number of students: ");
        String numberOfStudents = scanner.nextLine();
        int totalStudents = Integer.parseInt(numberOfStudents);

        for (int value = 1; value <= totalStudents; value++) {
            row = xssfSheet.createRow(++rowId);
            columnId = 0;

            System.out.println("\t\t\t\tStudent Details:" + value);
            System.out.print("Enter the name: ");
            String name = scanner.nextLine();
            cell0 = row.createCell(columnId);
            cell0.setCellValue(name);

            System.out.print("Enter the Roll number: ");
            String rollno = scanner.nextLine();
            cell1 = row.createCell(++columnId);
            cell1.setCellValue(rollno);

        }

        System.out.print("Enter the location where file has to be saved: ");
        String fileLocation = scanner.nextLine();

        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        String filePath = fileLocation + "\\" + fileName;

        var file = new File(filePath);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            xssfWorkbook.write(fileOutputStream);
            fileOutputStream.close();
            xssfWorkbook.close();
            System.out.println("Excel file is created successfully");
        }
        catch (IOException IO) {
            IO.printStackTrace();
        }

    }
}

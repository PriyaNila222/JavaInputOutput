package com.company;

//Write a program to read data from excel

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file location: ");
        String fileLocation = scanner.nextLine();

        File file = new File(fileLocation);



        try {
            var fileInputStream = new FileInputStream(file);
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
            XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);
            Iterator<Row> iterator = xssfSheet.iterator();
            while (iterator.hasNext()) {
                Row row = iterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()){
                    Cell cell = cellIterator.next();
                    switch (cell.getCellType())
                    {
                        case Cell.CELL_TYPE_NUMERIC: {
                            System.out.print(cell.getNumericCellValue() + "\t\t\t");
                            break;
                        }

                        case Cell.CELL_TYPE_STRING: {
                            System.out.print(cell.getStringCellValue() + "\t\t\t");
                            break;
                        }
                    }

                }
                System.out.println("");
            }
            fileInputStream.close();
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}


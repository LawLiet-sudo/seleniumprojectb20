package com.cybertek.tests.day14_reading_excel_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile {

    public static void main(String[] args) throws FileNotFoundException {
        String path = "shopping_list.txt";
        File file = new File(path);

        //check if file exist
        System.out.println(file.exists() );

        Scanner scanner = new Scanner(file);

        System.out.println(scanner.nextLine());
        while(scanner.hasNext() ){
            System.out.println(scanner.nextLine());
        }
    }
}

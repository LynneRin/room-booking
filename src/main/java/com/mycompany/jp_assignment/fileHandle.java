/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jp_assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Lynne
 */
public class fileHandle {
    
    String name;
    File file;
    
    fileHandle(String name) {
        this.name = name;
        file = new File(name);
    }
    
    Boolean writeToFile(String[] line) {
        try {
            FileWriter write = new FileWriter(file.getName(),true);
            String data = Arrays.toString(line);
            data = data.substring(1, data.length() - 1);
            data = data + "\n";
            try (BufferedWriter bufferedWriter = new BufferedWriter(write)) {
                bufferedWriter.write(data);
                return true;
            }
        } catch(IOException e){
            return false;
        }
    }
    
    void truncate() throws IOException {
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.print("");
        }
    }
    
    Object[] readFromFile() throws FileNotFoundException {
        FileReader read = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(read);
        Object[] fileLines = bufferedReader.lines().toArray();

        return fileLines;
    }
    
    int getLineNumber() throws FileNotFoundException {
        int lineNumber = 0;
        Scanner scan = new Scanner(file);
        
        while (scan.hasNextLine()) {
            scan.nextLine();
            lineNumber++;
        }
        
        return lineNumber;
    }   
    
}

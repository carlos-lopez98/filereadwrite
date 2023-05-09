package com.solvd.filereadwrite;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args){
        File file = new File("C:\\Users\\maybe\\kenzie\\customProjects\\filereadwrite\\src\\main\\resources\\input.txt");

        Set<String> uniqueWords = new HashSet<>();

        try {
            //Reads file to String using FileUtils
            String fileToString = FileUtils.readFileToString(file, StandardCharsets.UTF_8);

            //Converts String to array of Words
            String[] wordsNotUnique = fileToString.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

            //Only stores unique words not duplicates
            for(String word: wordsNotUnique){
                uniqueWords.add(word);
            }

        } catch (IOException e) {
            System.out.println("Unable to read file " + e);
            e.printStackTrace();
        }




    }
}

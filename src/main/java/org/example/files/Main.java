package org.example.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String sourceFilePath = "/Users/OleksandrJR/Documents/JavaRushProjects/ABSTRACT_UA/Module 1/L22-Live/src/main/resources/source.txt";
        String outFilePath = "/Users/OleksandrJR/Documents/JavaRushProjects/ABSTRACT_UA/Module 1/L22-Live/src/main/resources/out.txt";
        String value = "Hello from program";

        try (var inputStream = new FileInputStream(sourceFilePath);
             var outputStream = new FileOutputStream(outFilePath))
        {
            inputStream.transferTo(outputStream);
        }catch (IOException e){
            throw e;
        }
    }
}

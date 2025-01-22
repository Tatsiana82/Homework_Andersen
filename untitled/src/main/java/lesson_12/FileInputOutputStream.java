package lesson_12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//Task_1
public class FileInputOutputStream {
    public static void main(String[] args) {
        String textToWrite = "Value 1;Value 2;Value 3";
        String pathToFile = "C:\\Users\\User\\Desktop\\AQA\\test.txt";

        try (FileOutputStream fileOutputStream = new FileOutputStream(pathToFile)) {
            fileOutputStream.write(textToWrite.getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("*******************************");

        byte[] bufferBytes = new byte[10];
        StringBuilder resultText = new  StringBuilder(pathToFile);
    try (FileInputStream fileInputStream = new FileInputStream(pathToFile)) {
        int count;
        while ((count = fileInputStream.read(bufferBytes)) != -1){
            for(int i = 0; i < count; i++) {
                resultText.append((char) bufferBytes[i]);
            }
        }
     } catch (IOException e){
        System.out.println(e.getMessage());
        }
        System.out.println(resultText);
    }
}
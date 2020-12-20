package ru.mirea.gib04.lab8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program3 {

    public static void main(String[] args)  {
        String filePath = "Zapiska.txt";
        String text = "\nЯ Данила, как дела?";

        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(text);
            bufferWriter.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
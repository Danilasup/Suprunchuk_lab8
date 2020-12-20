package ru.mirea.gib04.lab8;

import java.io.*;

public class Program {

    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("Zapiska.txt", false))
        {
            // запись всей строки
            String text = "Привет!";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('1');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
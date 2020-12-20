package ru.mirea.gib04.lab8;

import java.io.*;

public class Program1 {

    public static void main(String[] args) {

        try(FileReader reader = new FileReader("Zapiska.txt"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
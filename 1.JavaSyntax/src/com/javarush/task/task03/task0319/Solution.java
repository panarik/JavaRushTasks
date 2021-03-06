package com.javarush.task.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Предсказание на будущее
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        //поток
        InputStream inputStream = System.in;
        //чтение потока
        Reader inputStream_reader = new InputStreamReader(inputStream);
        //Буфер
        BufferedReader inputStream_bufferedReader = new BufferedReader(inputStream_reader);

        //ввод текста
        String name = inputStream_bufferedReader.readLine();
        String salary = inputStream_bufferedReader.readLine();
        String years = inputStream_bufferedReader.readLine();

        System.out.println(name + " получает " + salary + " через " + years + " лет.");


    }
}

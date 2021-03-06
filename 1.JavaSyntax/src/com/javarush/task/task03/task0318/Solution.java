package com.javarush.task.task03.task0318;

import java.io.*;

/* 
Вася захватит мир через 8 лет. Му-ха-ха!
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sAge = bufferedReader.readLine();
        String name = bufferedReader.readLine();


        System.out.println(name+" захватит мир через "+sAge+" лет. Му-ха-ха!");




    }
}

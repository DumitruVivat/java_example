package main.lesson4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task0 {
    public static void main(String[] args) {

        int length = 10000000;

        List<Integer> intArrayList = new ArrayList<>();
        List<Integer> intLiknkedList = new LinkedList();

        long startTime = System.currentTimeMillis();

        for(int i = 0; i < length; i++){
            intArrayList.add(i);
        }

        long endTime = System.currentTimeMillis();

        double result = endTime - startTime;

        System.out.printf("Run time for arr list = %s %s %n", result, "ms");

        long startTime2 = System.currentTimeMillis();

        for(int i = 0; i < length; i++){
            intLiknkedList.add(i);
        }

        long endTime2 = System.currentTimeMillis();

        double result2 = endTime2 - startTime2;

        System.out.printf("Run time for link list = %s %s %n", result2, "ms");

        int count = 0;

        long startTime3 = System.currentTimeMillis();
        Random random = new Random();

        while(count != 1000){
            intArrayList.add(40000, random.nextInt());
            count+=2;
        }

        long endTime3 = System.currentTimeMillis();

        System.out.println(endTime3 - startTime3);
    }
}

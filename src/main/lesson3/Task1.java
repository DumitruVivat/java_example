package main.lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
//        Animal animal = new Animal("dog","Muhtar");
//        System.out.println(animal);
//
//        String a1 = "mama";
//        String a2 = "mama";
//        System.out.println(a1.equals(a2));


//        List<Object> list = new ArrayList<>();
//        list.add(true);
//        list.add("Hello!");
//        list.add(null);
//
//        for (Object obj : list) {
//            System.out.println(obj);
//        }

//        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        for (int i : list) {
//            System.out.println(i);
//        }
//        list.add(22);


        Random random = new Random();
        int size = 10;
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < size; i++) {
            numbers.add(random.nextInt(-100 , 100));
        }
        System.out.println("Not sorted list: " + numbers);
        Collections.sort(numbers);
        System.out.println("Sorted list: " +numbers);
    }
}

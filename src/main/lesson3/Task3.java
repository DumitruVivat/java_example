package main.lesson3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List mixdeList = new ArrayList<String>();
        mixdeList.add("Hello");
        mixdeList.add(123);
        mixdeList.add("World");
        mixdeList.add("My name is");
        mixdeList.add(-234);

        for (int i = 0; i < mixdeList.size(); i++) {
            Object item = mixdeList.get(i);
            if (item instanceof Integer) {
                mixdeList.remove(i);
            }
        }
        System.out.println(mixdeList);
    }
}

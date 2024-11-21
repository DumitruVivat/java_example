package main.lesson5;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("foo","bar"));
        System.out.println(isIsomorphic("paper","title"));
    }

    public static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Character> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (mapS.containsKey(charS)) {
                if (mapS.get(charS) != charT) {
                    return false;
                }
            } else {
                mapS.put(charS, charT);
            }

            if (mapT.containsKey(charT)) {
                if (mapT.get(charT) != charS) {
                    return false;
                }
            } else {
                mapT.put(charT, charS);
            }
        }
        return true;
    }
}

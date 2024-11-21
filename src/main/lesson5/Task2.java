package main.lesson5;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Task2 {
    public static void main(String[] args) {

        System.out.println(isValid("a+(d*3)"));
        System.out.println(isValid("[a+(1*3)"));
        System.out.println(isValid("[6+(3*3)]"));
        System.out.println(isValid("{a}[+]{(d*3)}"));
        System.out.println(isValid("<{a}+{(d*3)}>"));
        System.out.println(isValid("{a+]}{(d*3)}"));

    }

    public static boolean isValid(String s) {
        Map<Character,Character> bracketMap = new HashMap<>();
        bracketMap.put('{','}');
        bracketMap.put('[',']');
        bracketMap.put('(',')');
        bracketMap.put('<','>');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (bracketMap.containsKey(currentChar)) {
                stack.push(currentChar);
            } else if (bracketMap.containsValue(currentChar)) {
                if (stack.isEmpty() || bracketMap.get(stack.pop()) != currentChar) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

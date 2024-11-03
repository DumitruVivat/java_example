package main.lesson2;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        str = str.replace(",","").toLowerCase().trim();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            if(charArray[i] != charArray[charArray.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}

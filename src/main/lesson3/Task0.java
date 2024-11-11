package main.lesson3;

public class Task0 {
    public static void main(String[] args) {
        isEqual(s1, s6);

    }
    Object object = new Object();
    static String s1 = "hello";
    static String s2 = "hello";

    static String s3 = s1;
    static String s4 = "h" + "e" + "l" + "l" + "o";
    static String s5 = new String("hello");
    static String s6 = new String(new char[] {'h', 'e', 'l', 'o'});

    public static void change() {s1 = "ok";}

    public static void isEqual(String arg0, String arg1) {
        if (arg0 == arg1) {
            System.out.println("Equal address");
        } else if (arg0 != arg1) {
            System.out.println("Not equal address");
        }
        if (arg0.equals(arg1)) {
            System.out.println("Equal value");
        } else if (!arg0.equals(arg1)) {
            System.out.println("Not equal value");
        }
    }
}

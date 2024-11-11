package main.homework2.calculator;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Answer {
    private static final Logger logger = Logger.getLogger(Answer.class.getName());


    public static void runCalculator() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input1 = getInput(scanner, "Enter first number (or 'exit' to stop the application): )");
            if(input1.equalsIgnoreCase("exit")) break;

            String input2 = getInput(scanner, "Enter second number: ");
            String operation = getInput(scanner, "Enter operation (+, -, *, /): ");

            try{
                double num1 = Double.parseDouble(input1);
                double num2 = Double.parseDouble(input2);
                double result = performOperation(num1, num2, operation);
                logOperation(num1, num2, operation, result);
                System.out.println("Result: " + result);
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input");
            } catch (ArithmeticException ex) {
                System.out.println("Arithmetic exception: " + ex.getMessage());
            }
        }
    }

    public static String getInput(Scanner scanner, String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }
    public static double performOperation(double num1, double num2, String operation) {

        switch (operation){
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            case "/":
                if(num2 == 0) throw new ArithmeticException("Division by zero its not possible");
                return num1 / num2;
            default:
                throw new UnsupportedOperationException("Operation not supported: " + operation);
        }
    }

    public static void setupLogger() {
        try{
            FileHandler fh = new FileHandler("calculator_log.txt", true);
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            logger.setUseParentHandlers(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void logOperation(double num1, double num2, String operation, double result) {
        String logMessage = String.format("%f %s %f = %f", num1, operation, num2, result);
        logger.info(logMessage);
    }
}

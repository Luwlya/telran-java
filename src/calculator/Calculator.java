package calculator;

import java.util.Scanner;

public class Calculator {
    static int calculate(int first, String action, int second) {
        int result = 0;
        if (action.equals("+")) {
            result = first + second;
        } else if (action.equals("-")) {
            result = first - second;
        } else if (action.equals("*")) {
            result = first * second;
        } else if (action.equals("/")) {
            result = first / second;
        } else {
            System.out.println("Wrong action: " + action);
        }
        return result;
    }

    static int calculateInSwitch(int first, String action, int second) {
        switch (action) {
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "*":
                return first * second;
            case "/":
                return first / second;
            default:
                System.out.println("Wrong action: " + action);
                return 0;
        }
    }

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int first = scanner.nextInt();
            String action = scanner.next();
            int second = scanner.nextInt();
            int result = calculateInSwitch(first, action, second);
            System.out.println(result);
        }
    }
}

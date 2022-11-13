package calculator;

import java.util.Scanner;

public class Calculator {
    static int calculate(int first, char action, int second) {
        int result = 0;
        if (action == '+') {
            result = first + second;
        } else if (action == '-') {
            result = first - second;
        } else if (action == '*') {
            result = first * second;
        } else if (action == '/') {
            result = first / second;
        } else {
            System.out.println("Wrong action: " + action);
        }
        return result;
    }

    static int calculateInSwitch(int first, char action, int second) {
        switch (action) {
            case '+':
                return first + second;
            case '-':
                return first - second;
            case '*':
                return first * second;
            case '/':
                return first / second;
            default:
                System.out.println("Wrong action: " + action);
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int first = scanner.nextInt();
            char action = scanner.next().charAt(0);
            int second = scanner.nextInt();
            int result = calculateInSwitch(first, action, second);
            System.out.println(result);
        }
    }
}

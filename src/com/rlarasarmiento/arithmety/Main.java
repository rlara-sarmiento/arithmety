package com.rlarasarmiento.arithmety;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        executeInteractively();
    }

    static void executeInteractively() {
        System.out.println("Enter a basic arithmetic operation:\n>>> ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println(userInput);

        Evaluator evaluator = new Evaluator(userInput);
        int result = evaluator.evaluate();
        System.out.println(result);
    }
}

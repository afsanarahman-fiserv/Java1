package com.xpanxion.assignments.shared;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

    private ArrayList<String> prevCalculations;

    public Calculator() {
        prevCalculations = new ArrayList<String>();
    }

    public ArrayList<String> getPrevCalculations() {
        return prevCalculations;
    }

    public void calculate(Scanner console) {
        boolean done = false;
        while(!done) {
            int firstNum, secondNum;
            System.out.print("Enter first number: ");
            String first = console.nextLine();
            if(first.equals("done")) {
                done = true;
                break;
            } else {
                firstNum = Integer.parseInt(first);
            }
            System.out.print("Enter second number: ");
            secondNum = Integer.parseInt(console.nextLine());

            System.out.print("Enter operation (add, sub, mul, div): ");
            String command = console.nextLine();

            processCalculation(command, firstNum, secondNum);
        }

        printHistory();
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int subtract(int a, int b) {
        return a - b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    private int divide(int a, int b) {
        return a / b;
    }

    private void processCalculation(String command, int firstNum, int secondNum) {
        switch(command) {
            case "add":
                int sum = add(firstNum, secondNum);
                System.out.println("Result: " + sum);
                prevCalculations.add(firstNum + " + " + secondNum + " = " + sum);
                break;
            case "sub":
                int difference = subtract(firstNum, secondNum);
                System.out.println("Result: " + difference);
                prevCalculations.add(firstNum + " - " + secondNum + " = " + difference);
                break;
            case "mul":
                int product = multiply(firstNum, secondNum);
                System.out.println("Result: " + product);
                prevCalculations.add(firstNum + " * " + secondNum + " = " + product);
                break;
            case "div":
                int quotient = divide(firstNum, secondNum);
                System.out.println("Result: " + quotient);
                prevCalculations.add(firstNum + " / " + secondNum + " = " + quotient);
                break;
        }
    }

    private void printHistory() {
        for(String calculation : prevCalculations) {
            System.out.println(calculation);
        }
    }

}

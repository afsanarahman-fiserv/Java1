package com.xpanxion.assignments.student;
import java.util.Scanner;

public class JavaOne {

    private static Scanner console = new Scanner(System.in);
    //
    // Constructors
    //

    public JavaOne() {}

    //
    // Public methods
    //

    public void ex1() {
        System.out.print("Enter your name: ");
        String name = console.nextLine();
        System.out.println("Your name in upper case is: " + name.toUpperCase());
    }

    public void ex2() {
        System.out.print("Enter a string: ");
        String input = console.nextLine();
        int count = 0;
        for(int i = 0; i < input.length(); i++) {
            if(Character.isUpperCase(input.charAt(i))) count++;
        }
        System.out.println("Number of uppercase letters: " + count);
    }

    public void ex3() {
        System.out.print("Enter a string: ");
        String input = console.nextLine();
        String[] tokens = input.split(" ");
        String caps = "";
        for(int i = 0; i < tokens.length; i++) {
            if(i % 2 == 0) caps += tokens[i].toUpperCase() + " ";
            else caps += tokens[i] + " ";
        }
        System.out.println(caps);
    }

    public void ex4() {
        System.out.println("Student 1: ex4.");
    }

    public void ex5() {
        System.out.println("Student 1: ex5.");
    }

    public void ex6() {
        System.out.println("Student 1: ex6.");
    }

    public void ex7() {
        System.out.println("Student 1: ex7.");
    }

    public void ex8() {
        System.out.println("Student 1: ex8.");
    }

    public void ex9() {
        System.out.println("Student 1: ex9.");
    }

    public void ex10() {
        System.out.println("Student 1: ex10.");
    }

    //
    // Private helper methods
    //
}

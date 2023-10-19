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
        System.out.print("Enter string: ");
        String input = console.nextLine();
        boolean palindrome = true;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) != input.charAt(input.length()-i-1)) {
                palindrome = false;
            }
        }

        if(palindrome) System.out.println("YES");
        else System.out.println("NO");
    }

    public void ex5() {
        String input = "";
        do {
            System.out.print("Enter a string: ");
            input = console.nextLine();
            if(input.equals("quit")) break;

            int vowels = 0;
            int consonants = 0;
            for(int i = 0; i < input.length(); i++) {
                if(Character.isLetter(input.charAt(i))) {
                    switch(input.charAt(i)) {
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                        case 'A':
                        case 'E':
                        case 'I':
                        case 'O':
                        case 'U':
                            vowels++;
                            break;
                        default:
                            consonants++;
                    }
                }
            }

            System.out.println("Number of vowels: " + vowels);
            System.out.println("Number of consonants: " + consonants);
        } while(!input.equals("quit"));
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

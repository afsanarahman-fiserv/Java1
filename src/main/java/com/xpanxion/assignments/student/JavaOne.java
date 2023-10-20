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
        int sum = 0;
        System.out.print("Enter first number: ");
        sum += console.nextInt();
        System.out.print("Enter second number: ");
        sum += console.nextInt();
        System.out.println("Result: " + sum);
    }

    public void ex7() {
        System.out.print("Enter first number: ");
        int first = console.nextInt();
        System.out.print("Enter second number: ");
        int second = console.nextInt();
        System.out.print("Enter operation (add, sub, mul, div): ");
        String command = console.next();
        System.out.print("Result: ");
        switch (command) {
            case "add":
                System.out.print(first + second);
                break;
            case "sub":
                System.out.print(first - second);
                break;
            case "mul":
                System.out.print(first * second);
                break;
            case "div":
                System.out.print(first / second);
                break;
            default:
                System.out.println("Invalid command entered.");
        }
    }

    public void ex8() {
        System.out.print("Enter price per square feet: ");
        double price = console.nextDouble();
        console.nextLine();
        String input = "";
        int total = 0;
        while(!input.equals("done")) {
            System.out.print("Enter room dimensions (width x height): ");
            input = console.nextLine();

            if(input.equals("done")) break;
            else {
                String[] tokens = input.split(" ");
                int width = Integer.parseInt(tokens[0]);
                int height = Integer.parseInt(tokens[2]);
                total += width * height * price;
            }
        }
        System.out.println("Total cost: $" + total);
    }

    public void ex9() {
        int target = (int)(Math.random() * 5) + 1;
        int guess = -1;
        while(guess != target) {
            System.out.print("Enter a number: ");
            guess = console.nextInt();

            if(guess == target) System.out.println("You guessed it!!!");
            else System.out.println("Try again...");
        }
    }

    public void ex10() {
        System.out.print("Enter a string: ");
        String input = console.nextLine();
        String[] tokens = input.split(" ");
        for(String token : tokens) {
            String spaces = "";
            for (int i = 0; i < token.length(); i++) {
                System.out.println(spaces + token.charAt(i));
                spaces += " ";
            }
        }
    }

    //
    // Private helper methods
    //
}

package com.xpanxion.assignments.student;

import com.xpanxion.assignments.shared.*;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class JavaTwo {

    private static Scanner console = new Scanner(System.in);
    public JavaTwo() {}

    public void ex1() {
        ArrayList<Person> personList = new ArrayList<Person>();
        String input = "";
        while(!input.equals("done")) {
            System.out.print("Enter person: ");
            input = console.nextLine();
            if(!input.equals("done")) {
                String[] tokens = input.split(" ");
                int id = Integer.parseInt(tokens[0].substring(0, tokens[0].length()-1));
                personList.add(new Person(id, tokens[1], tokens[2]));
            }
        }

        for(Person person : personList) {
           System.out.println(person.toString());
        }
    }

    public void ex2() {
        HashMap<Integer, Person> personList = new HashMap<Integer, Person>();
        String input = "";
        while(!input.equals("done")) {
            System.out.print("Enter person: ");
            input = console.nextLine();
            if(!input.equals("done")) {
                String[] tokens = input.split(" ");
                int id = Integer.parseInt(tokens[0].substring(0, tokens[0].length()-1));
                personList.put(id, new Person(id, tokens[1], tokens[2]));
            }
        }

        input = "";
        while(!input.equals("done")) {
            System.out.print("Enter Person ID: ");
            input = console.nextLine();
            if(!input.equals("done")) {
                int id = Integer.parseInt(input);
                Person person = personList.get(id);
                System.out.println(person.toString());
            }
        }
    }

    public void ex3() {
        Invoice invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex4() {
        ex3();
    }

    public void ex5() {
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);
    }

    public void ex6() {
        Calculator calculator = new Calculator();
        calculator.calculate(console);
    }

    public void ex7() {
        var personList = Arrays.asList(
                new Person(1, "Peter", "Jones"),
                new Person(2, "John", "Smith"),
                new Person(3, "Sue", "Anderson")
        );

        personList.stream().map(person -> new Person(person.getId(), person.getFirstName(), "xxx")).forEach(System.out::println);
    }

    public void ex8() {
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );

        personList.stream().sorted((s1, s2)->s1.getFirstName().compareTo(s2.getFirstName())).forEach(System.out::println);
    }

    public void ex9() {
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );
        var filteredList = new ArrayList<Person>();
        for(Person p : personList) {
            if(p.getLastName().equals("Smith")) filteredList.add(p);
        }
        for (Person p : filteredList) {
            System.out.println(p);
        }
    }

    public void ex10() throws InterruptedException {
        CatQueue q = new CatQueue();
        q.enqueue(new Cat("Alice"));
        q.enqueue(new Cat("Bob"));
        q.enqueue(new Cat("Charlie"));
        q.enqueue(new Cat("Dan"));
        while(!q.isEmpty()) {
            q.printQueue();
            q.dequeue();
            Thread.sleep(3000);
        }
    }
}

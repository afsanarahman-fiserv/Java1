package com.xpanxion.assignments;

import com.xpanxion.assignments.shared.*;
import com.xpanxion.assignments.student.JavaOne;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        JavaOne javaOne = new JavaOne();
//        javaOne.ex1();
//        javaOne.ex2();
//        javaOne.ex3();
//        javaOne.ex4();
//        javaOne.ex5();
//        javaOne.ex6();
//        javaOne.ex7();
//        javaOne.ex8();
//        javaOne.ex9();
//        javaOne.ex10();

//        Invoice invoice =  new Invoice(1);
//        invoice.addProduct(new Product(111,"Mustard", 2.00));
//        invoice.addProduct(new Product(222,"Ketchup", 3.00));
//        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
//        NumberFormat formatter = NumberFormat.getCurrencyInstance();
//        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));

//        Scanner console = new Scanner(System.in);
//        Calculator calculator = new Calculator();
//        calculator.calculate(console);

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

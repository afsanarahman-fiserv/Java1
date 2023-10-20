package com.xpanxion.assignments.shared;

import java.util.ArrayList;

public class Invoice {
    private int id;
    private ArrayList<Product> list;

    public Invoice(int id) {
        this.id = id;
        list = new ArrayList<Product>();
    }

    public int getId() {
        return id;
    }
    public ArrayList<Product> getList() {
        return list;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void addProduct(Product product) {
        list.add(product);
    }

    public double getTotalCost() {
        double totalCost = 0;
        for(Product product : list) {
            totalCost += product.getPrice();
        }
        return totalCost;
    }
}

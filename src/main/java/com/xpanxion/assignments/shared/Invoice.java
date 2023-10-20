package com.xpanxion.assignments.shared;

import java.util.ArrayList;

public class Invoice extends Base {
    private ArrayList<Product> list;

    public Invoice(int id) {
        super(id);
        list = new ArrayList<Product>();
    }
    public ArrayList<Product> getList() {
        return list;
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

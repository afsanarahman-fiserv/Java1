package com.xpanxion.assignments.shared;

public abstract class Base {
    protected int id;

    public Base(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}

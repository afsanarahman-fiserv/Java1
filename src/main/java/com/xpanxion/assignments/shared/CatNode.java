package com.xpanxion.assignments.shared;

public class CatNode {
    Cat cat;
    CatNode next;

    public CatNode(Cat cat) {
        this.cat = cat;
        this.next = null;
    }

    public CatNode(Cat cat, CatNode next) {
        this.cat = cat;
        this.next = next;
    }
}

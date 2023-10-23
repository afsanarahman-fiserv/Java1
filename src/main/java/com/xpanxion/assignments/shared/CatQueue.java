package com.xpanxion.assignments.shared;

public class CatQueue {
    CatNode front;
    CatNode rear;

    public CatQueue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(Cat cat) {
        CatNode node = new CatNode(cat);

        if(this.rear == null) {
            this.front = node;
            this.rear = node;
        } else {
            this.rear.next = node;
            this.rear = node;
        }
    }

    public void dequeue() {
        if(this.front == null) return;
        this.front = this.front.next;
        if(this.front == null) this.rear = null;
    }

    public boolean isEmpty() {
        return this.front == null && this.rear == null;
    }

    public void printQueue() {
        if(this.front == null) return;

        System.out.print("[");
        for(CatNode ptr = front; ptr != null; ptr = ptr.next) {
            System.out.print(ptr.cat.toString());
            if(ptr.next != null) System.out.print(", ");
        }
        System.out.println("]");
    }
}

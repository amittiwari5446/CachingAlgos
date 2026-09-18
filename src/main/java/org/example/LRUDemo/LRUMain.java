package org.example.LRUDemo;

public class LRUMain {
    public static void main(String[] args) {
        System.out.println("In LRU Cache Demo...");
        LRUCache lru=new LRUCache(5);

        lru.print();

        lru.put(1,200);
        lru.put(5,201);
        lru.put(2,202);
        lru.print();

        lru.get(1);
        lru.print();

        lru.put(7,203);
        lru.put(4,204);
        lru.put(3,205);
        lru.print();

        lru.get(2);
        lru.print();

        lru.put(8,206);
        lru.print();

    }
}
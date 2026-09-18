package org.example.LRUDemo;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    int capacity;
    Map<Integer, Node> map=new HashMap<>();
    Node head=new Node(0,0);
    Node tail=new Node(0,0);

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key){
        if(!map.containsKey(key)) return -1;
        Node node=map.get(key);
        remove(node);
        insert(node);
        return node.value;
    }

    public void put(int key, int value){
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size()==capacity){
            Node tempNode=tail.prev;
            remove(tempNode);
            map.remove(tempNode.key);
        }
        Node node=new Node(key,value);
        insert(node);
        map.put(key,node);
    }

    private void insert(Node node) {
        node.next=head.next;
        node.prev=head;
        head.next.prev=node;
        head.next=node;
    }

    private void remove(Node node) {
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }


    void print(){
        Node newNode=head;
        while(newNode!=null){
            System.out.print(newNode.key+", ");
            newNode=newNode.next;
        }
        System.out.println();
        System.out.println("----------------");
    }
}

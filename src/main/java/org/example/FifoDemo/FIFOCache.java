package org.example.FifoDemo;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class FIFOCache {
    int capacity;
    Map<Integer,Integer> valueMap=new HashMap<>();
    Queue<Integer> que=new ArrayDeque<>();

    public FIFOCache(int capacity) {
        this.capacity = capacity;
    }

    public void put(Integer key, Integer value){
        if(!valueMap.containsKey(key)){
            if(valueMap.size()==capacity){
                int evict=que.poll();
                valueMap.remove(evict);
            }
            que.add(key);
        }
        valueMap.put(key,value);
    }

    public int get(Integer key){
        return valueMap.getOrDefault(key,-1);
    }
}

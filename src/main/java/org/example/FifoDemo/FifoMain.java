package org.example.FifoDemo;

public class FifoMain {
    public static void main(String[] args) {
        System.out.println("In FIFO Demo...");
        FIFOCache fifo=new FIFOCache(5);

        System.out.println(fifo.valueMap);
        System.out.println(fifo.que);
        System.out.println("-----------------------");

        fifo.put(1,2000);
        System.out.println(fifo.valueMap);
        System.out.println(fifo.que);
        System.out.println("-----------------------");

        fifo.put(3,2001);
        System.out.println(fifo.valueMap);
        System.out.println(fifo.que);
        System.out.println("-----------------------");

        fifo.put(5,2002);
        System.out.println(fifo.valueMap);
        System.out.println(fifo.que);
        System.out.println("-----------------------");

        fifo.put(4,2003);
        System.out.println(fifo.valueMap);
        System.out.println(fifo.que);
        System.out.println("-----------------------");

        fifo.put(2,2004);
        System.out.println(fifo.valueMap);
        System.out.println(fifo.que);
        System.out.println("-----------------------");

        fifo.put(3,2005);
        System.out.println(fifo.valueMap);
        System.out.println(fifo.que);
        System.out.println("-----------------------");

        fifo.put(6,2006);
        System.out.println(fifo.valueMap);
        System.out.println(fifo.que);
        System.out.println("-----------------------");

        fifo.put(9,2007);
        System.out.println(fifo.valueMap);
        System.out.println(fifo.que);
    }
}

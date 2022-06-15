package Deque;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class App {

    public static void main(String[] args) {
        Deque<Integer> dequeue = new LinkedBlockingDeque<Integer>();
        dequeue.add(1);
        dequeue.add(2);
        dequeue.add(3);
        dequeue.add(4);
        dequeue.add(5);
        dequeue.add(9);

        for (Integer integer : dequeue) {
           System.out.println(integer); 
        }

        dequeue.addFirst(0);
        dequeue.addLast(10);
        System.out.println(dequeue);
    }
    
}

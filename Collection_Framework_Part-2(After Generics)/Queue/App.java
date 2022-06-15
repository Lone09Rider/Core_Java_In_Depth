package Queue;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class App {
    public static void main(String[] args) {

        // 4 Types of Queues

        /* ArrayBacked Queue
         * LinkedList Backed Queue
         * Blocking Queue (Blocks Null Values)
         * Priority Queue (Sorted)
        */

        Queue<Integer> queue = new PriorityBlockingQueue<>();
        // System.out.println(queue.element());
        queue.add(1);
        queue.add(3);
        queue.add(2);
        queue.add(4);
        queue.add(6);
        queue.add(5);
        queue.add(7);
        queue.add(9);
        System.out.println(queue.element()); // Gives First Element to be removed or of the List

        System.out.println(queue);
        // First in First Out : FIFO
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue);

        Queue<Integer> queue1 = new LinkedBlockingQueue<>();
        queue1.add(3);
        queue1.add(1);
        queue1.add(2);
        queue1.add(4);
        queue1.add(6);
        queue1.add(5);
        queue1.add(7);
        queue1.add(9);

        System.out.println(queue1);
        // First in First Out : FIFO
        System.out.println(queue1.remove());
        System.out.println(queue1.remove());
        System.out.println(queue1);

        Queue<Integer> queue2 = new ArrayBlockingQueue<Integer>(20);
        queue2.add(3);
        queue2.add(1);
        queue2.add(2);
        queue2.add(4);
        queue2.add(6);
        queue2.add(5);
        queue2.add(7);
        queue2.add(9);

        System.out.println(queue2);
        // First in First Out : FIFO
        System.out.println(queue2.remove());
        System.out.println(queue2.remove());
        System.out.println(queue2);
        System.out.println(queue.element());
    }
}

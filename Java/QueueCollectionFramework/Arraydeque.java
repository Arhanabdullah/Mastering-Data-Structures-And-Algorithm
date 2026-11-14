package Java.QueueCollectionFramework;

import java.util.ArrayDeque;
import java.util.Queue;

public class Arraydeque {
    // we can also implement stack and queue using ArrayDeque class. ArrayDeque
    // class is a resizable array implementation of the Deque interface. It is
    // faster than Stack and LinkedList classes. It is not thread-safe. It does not
    // have any capacity restrictions. It can grow as much as memory allows.
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println("Queue: " + q);
        q.poll();
        System.out.println("Queue after poll: " + q);
        System.out.println("Front element: " + q.peek());
        System.out.println("Is queue empty: " + q.isEmpty());
        System.out.println("Size of queue: " + q.size());
    }
}

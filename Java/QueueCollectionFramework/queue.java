package Java.QueueCollectionFramework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;
public class queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // for adding elements to the queue we use add() function
        // for adding elements to the queue we use offer() function. it is better to use
        // offer() function because it does not throw an exception if the queue is full
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        q.add(10);
        System.out.println("Queue: " + q);
        // for removing elements from the queue we use remove() function
        // for removing elements from the queue we use poll() function. it is better to use
        // poll() function because it does not throw an exception if the queue is empty
        q.poll();
        System.out.println("Queue after poll: " + q);
        // for getting the front element of the queue we use peek() function
        // for getting the front element of the queue we use element() function. it is
        // better to use peek() function because it does not throw an exception if the
        // queue is empty
        System.out.println("Front element: " + q.peek());
        // for checking if the queue is empty we use isEmpty() function
        System.out.println("Is queue empty: " + q.isEmpty());
        // for getting the size of the queue we use size() function
        System.out.println("Size of queue: " + q.size());


        //Use Deque as a Queue
        Deque<Integer> dq = new LinkedList<>();
        //we can use the normal queue methods to add and remove elements from the deque
        // there are some additional methods that we can use to add and remove elements from the deque
        // for adding elements to the deque we can use addFirst() and addLast() methods
        // for adding elements to the deque we can use offerFirst() and offerLast() methods
        dq.addFirst(10);
        dq.offerFirst(30);
        dq.addLast(40);
        dq.offerLast(20);
        System.out.println("Deque: " + dq);
        
        // for removing elements from the deque we can use removeFirst() and removeLast() methods
        // for removing elements from the deque we can use pollFirst() and pollLast() methods
        dq.removeFirst();
        dq.pollLast();
        System.out.println("Deque after removing elements: " + dq);
    }
}

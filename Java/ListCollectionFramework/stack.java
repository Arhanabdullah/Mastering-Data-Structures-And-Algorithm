package Java.ListCollectionFramework;
import java.util.Stack;
public class stack {
    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        //for adding elements to the stack we use push() function

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Stack: " + stack);
        //for removing elements from the stack we use pop() function
        stack.pop();
        System.out.println("Stack after pop: " + stack);
        //for getting the top element of the stack we use peek() function
        System.out.println("Top element: " + stack.peek());
        //for checking if the stack is empty we use isEmpty() function
        System.out.println("Is stack empty: " + stack.isEmpty());
        //for getting the size of the stack we use size() function
        System.out.println("Size of stack: " + stack.size());
        //for searching an element in the stack we use search() function
        System.out.println("Position of 20 in stack: " + stack.search(20));

    }
}
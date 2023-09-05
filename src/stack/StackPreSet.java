package stack;

import java.util.Stack;

public class StackPreSet {
    public static void main(String[] args) {
        Stack<Object> stack = new Stack<>();

        // Push integers to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Push strings to the stack
        stack.push("Hello");
        stack.push("World");
        stack.push("Java");

        // View the top element of the stack
        Object topElement = stack.peek();
        System.out.println("Top element of the stack: " + topElement);

        // Pop an element
        Object poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        // Check if the stack is empty
        System.out.println("Is the stack empty: " + stack.isEmpty());

        // Get the size of the stack
        System.out.println("Size of the stack: " + stack.size());

        // Clear the stack
        stack.clear();
        System.out.println("Is the stack empty after clearing: " + stack.isEmpty());
    }
}

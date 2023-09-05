package Exercises.stack;

import java.util.Stack;

public class StackPreSet {
    public static void main(String[] args) {
        Stack<Object> stack = new Stack<>();

        // Push integers to the Exercises.stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Push strings to the Exercises.stack
        stack.push("Hello");
        stack.push("World");
        stack.push("Java");

        // View the top element of the Exercises.stack
        Object topElement = stack.peek();
        System.out.println("Top element of the Exercises.stack: " + topElement);

        // Pop an element
        Object poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        // Check if the Exercises.stack is empty
        System.out.println("Is the Exercises.stack empty: " + stack.isEmpty());

        // Get the size of the Exercises.stack
        System.out.println("Size of the Exercises.stack: " + stack.size());

        // Clear the Exercises.stack
        stack.clear();
        System.out.println("Is the Exercises.stack empty after clearing: " + stack.isEmpty());
    }
}

package Exercises.stack;

import java.util.Scanner;
import java.util.Stack;

public class InteractiveStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Object> stack = new Stack<>();

        System.out.println("Interactive Stack Example");
        while (true) {
            System.out.print("Enter an element to push onto the Exercises.stack, 'remove' to pop an element, or 'exit' to quit: ");
            String inputLine = scanner.nextLine();
            String[] inputWords = inputLine.split("\\s+"); // 用空格分割输入行

            if (inputWords.length == 1 && inputWords[0].equalsIgnoreCase("exit")) {
                break;
            } else if (inputWords.length == 1 && inputWords[0].equalsIgnoreCase("remove")) {
                // Check if the Exercises.stack is not empty before popping
                if (!stack.isEmpty()) {
                    Object poppedElement = stack.pop();
                    System.out.println("Popped element: " + poppedElement);
                } else {
                    System.out.println("Stack is empty. Cannot pop.");
                }
            } else {
                // Push each word onto the Exercises.stack
                for (String word : inputWords) {
                    stack.push(word);
//                    System.out.println("Pushed element onto the Exercises.stack: " + word);
                }
            }

            // Print the contents of the Exercises.stack
            System.out.println("Current Stack content: " + stack);
        }

        System.out.println("Program has exited.");
        scanner.close();
    }
}

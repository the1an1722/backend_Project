package arrayList;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InteractiveArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Object> arrayList = new ArrayList<>();

        System.out.println("Interactive ArrayList Example");
        while (true) {
            System.out.print("Enter an element to add (string or integer), 'remove' to delete elements, or 'exit' to quit: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            } else if (input.equalsIgnoreCase("remove")) {
                // Remove an element
                System.out.print("Enter the index of the element to remove: ");
                int indexToRemove = -1;
                try {
                    indexToRemove = scanner.nextInt();
                } catch (InputMismatchException e) {
                    scanner.nextLine(); // Consume the whole line if input is not an integer
                }
                scanner.nextLine(); // Consume the newline character

                if (indexToRemove >= 0 && indexToRemove < arrayList.size()) {
                    Object removedElement = arrayList.remove(indexToRemove);
                    System.out.println("Removed element: " + removedElement);
                } else {
                    System.out.println("Invalid index, no element removed.");
                }
            } else {
                // Add an element
                arrayList.add(input);
                System.out.println("Added element: " + input);
            }

            // Print the contents of the ArrayList
            System.out.println("Current ArrayList content: " + arrayList);
        }

        System.out.println("Program has exited.");
        scanner.close();
    }
}

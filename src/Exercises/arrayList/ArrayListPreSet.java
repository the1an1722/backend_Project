package Exercises.arrayList;

import java.util.ArrayList;

public class ArrayListPreSet {
    public static void main(String[] args) {
        ArrayList<Object> mixedList = new ArrayList<>();

        mixedList.add(1);
        mixedList.add("Hello");
        mixedList.add(22);
        mixedList.add("World");
        mixedList.add(31);

        System.out.println("ArrayList before removal: " + mixedList);

        int indexToRemove = 6;
        if (indexToRemove >= 0 && indexToRemove < mixedList.size()) {
            mixedList.remove(indexToRemove);
        } else {
            System.out.println("Invalid index. Element not removed.");
        }

        System.out.println("ArrayList after removal: " + mixedList);
    }
}

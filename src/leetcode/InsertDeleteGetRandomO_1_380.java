package leetcode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
public class InsertDeleteGetRandomO_1_380 {
    class RandomizedSet {
        private ArrayList<Integer> elements;
        private HashMap<Integer, Integer> elementToIndex;
        private Random rand;

        public RandomizedSet() {
            elements = new ArrayList<>();
            elementToIndex = new HashMap<>();
            rand = new Random();
        }

        public boolean insert(int val) {
            if (elementToIndex.containsKey(val)) {
                return false;
            }
            elementToIndex.put(val, elements.size());
            elements.add(val);
            return true;
        }

        public boolean remove(int val) {
            if (!elementToIndex.containsKey(val)) {
                return false;
            }
            int index = elementToIndex.get(val);
            if (index != elements.size() - 1) {
                int lastElement = elements.get(elements.size() - 1);
                elements.set(index, lastElement);
                elementToIndex.put(lastElement, index);
            }
            elements.remove(elements.size() - 1);
            elementToIndex.remove(val);
            return true;
        }

        public int getRandom() {
            int randomIndex = rand.nextInt(elements.size());
            return elements.get(randomIndex);
        }
    }
}

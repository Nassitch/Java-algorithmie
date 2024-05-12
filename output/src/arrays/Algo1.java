package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Algo1 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>(Arrays.asList("apple", "banana", "kiwi"));

        System.out.println("Default array : " + fruits);

        String newFruit = "lemon";
        fruits.add(newFruit);

        System.out.println("Add item in array : " + fruits);

        fruits.removeFirst();

        System.out.println("Remove first item in array : " + fruits);

        String replaceFruit = "orange";
        int indexToReplace = 1;
        fruits.set(indexToReplace, replaceFruit);

        System.out.println("Second item replaced in array : " + fruits);
    }
}

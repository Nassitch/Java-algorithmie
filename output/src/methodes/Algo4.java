package methodes;

import java.util.Arrays;

public class Algo4 {
    public static void main(String[] args) {
        int[] disorderedArray = {1, 2, 9, 5, 7, 4, 6};

        Algo4 algo = new Algo4();
        algo.sortValueInArray(disorderedArray);
    }

    public void sortValueInArray(int[] array) {
        Arrays.sort(array);
        System.out.println("The values sorting : " + Arrays.toString(array));
    };
}

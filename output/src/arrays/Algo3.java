package arrays;

import java.util.Arrays;

public class Algo3 {
    public static void main(String[] args) {
        int[] integerArray = {1, 2, 5, 9, 7};

        Algo3 calc = new Algo3();
        calc.sumOfArray(integerArray);
    }

    public void sumOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i += 1) {
            sum += array[i];
        }
        System.out.println("In this array the total sum is : " + sum);
    }

}


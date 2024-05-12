package arrays;

public class Algo3 {
    public static void main(String[] args) {
        int[] integerArray = {1, 2, 5, 9, 7};

        Algo3 calc = new Algo3();
        calc.sumOfArray(integerArray);
    }

    public void sumOfArray(int[] array) {
        int howMuchContent = array.length;
        System.out.println(howMuchContent + " contents includes in this array.");
    }

}


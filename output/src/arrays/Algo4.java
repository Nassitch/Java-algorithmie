package arrays;

public class Algo4 {
    public static void main(String[] args) {
        int integerToCheck = 7;
        int[] integerArray = {1, 2, 2, 5, 9, 12, 88, 20, 21};

        Algo4 algo = new Algo4();
        algo.checkIfIntegerExists(integerToCheck, integerArray);
    }

    public boolean checkIfIntegerExists(int integerExistant, int[] array) {
            boolean result = false;
        for (int i = 0; i < array.length; i += 1) {
            if (integerExistant == array[i]) {
                result = true;
            }
        }
        System.out.println(result);
        return result;
    }
}

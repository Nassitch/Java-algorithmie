package methodes;

public class Algo5 {
    public static void main(String[] args) {
        String wordOne = "bob";
        String wordTwo = "Omar";
        String wordThree = "Kayak";

        Algo5 algo = new Algo5();
        algo.checkIfPalindrom(wordOne);
        algo.checkIfPalindrom(wordTwo);
        algo.checkIfPalindrom(wordThree);
    }

    public void checkIfPalindrom(String word) {
        StringBuilder wordToCheck = new StringBuilder(word);
        StringBuilder reversedWord = new StringBuilder(word).reverse();
        if (reversedWord.toString().toLowerCase().equals(wordToCheck.toString().toLowerCase())) {
            System.out.println("That is a palindrome");
        } else {
            System.out.println("That is not a palindrome");
        }
    }
}

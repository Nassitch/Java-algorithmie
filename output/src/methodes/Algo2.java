package methodes;

public class Algo2 {
    public static void main(String[] args) {
        String wordOne = "ThisIsTheFirstWordToTesting";
        String wordTwo = "ThisIsTheSecondWordToTesting";
        String wordThree = "wordThree";

        Algo2 algo = new Algo2();
        algo.howMuchCharacters(wordOne);
        algo.howMuchCharacters(wordTwo);
        algo.howMuchCharacters(wordThree);
    }

    public void howMuchCharacters(String word) {
        int wordLength = word.length();
        System.out.println("The total length of this word is : " + wordLength);
    }
}

package methodes;

public class Algo3 {
    public static void main(String[] args) {
        String wordOne = "ThisIsTheFirstWordToTesting";
        String wordTwo = "wordTwo";

        Algo3 algo = new Algo3();
        algo.howMuchVowel(wordOne);
        algo.howMuchVowel(wordTwo);
    }

    public void howMuchVowel(String word) {
        String vowels = "aeiouy";
        int count = 0;
        for (int i = 0; i < word.length(); i += 1) {
            if (vowels.indexOf(word.charAt(i)) != - 1) {
                count += 1;
            }
        }
        System.out.println("The vowels are " + count + " in this word.");
    }
}

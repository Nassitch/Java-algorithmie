package loops;

public class Algo3 {
    public static void main(String[] args) {

        Algo3 algo = new Algo3();
        algo.displayAllSeatsOfTheatre();
    }

    public void displayAllSeatsOfTheatre() {
        String[][] seats = new String[26][100];

        for (int c = 0; c < 26; c += 1) {
            for (int r = 0; r < 100; r += 1) {
                seats[c][r] = (c + 1) + " - " + (r + 1);
                System.out.println(seats[c][r] + " ");
            }
        }
        System.out.println();
    }
}

package arrays;

public class Algo2 {
    public static void main(String[] args) {
        String[] personnages = {
                "John Doe",
                "John Wick",
                "John Cena",
                "John Jones",
                "John Wayne",
                "John Lewis",
                "John Travolta"
        };

        int nbrOfPersons = 0;
        for (int i = 0; i < personnages.length; i += 1) {
            nbrOfPersons = i;
        }

        System.out.println("Total numbers of personnages in the array : " + nbrOfPersons);

        System.out.println("Name of the first personnage : " + personnages[0]);

        System.out.println("Name of the last personnage : " + personnages[6]);

        int lastPerson = 1;
        System.out.println("Name of the last personnage : " + personnages[personnages.length - lastPerson]);


        System.out.println("Name of all personnages :");
        for (int i = 0; i < personnages.length; i += 1) {
            System.out.println(personnages[i]);
        }

        System.out.println("Name of all personnages with number of our string :");
        for (int i = 0; i < personnages.length; i += 1) {
            System.out.println(personnages[i] + " (" + personnages[i].length() + ")");
        }

        System.out.println("Name of all personnages in lowerCase :");
        for (int i = 0; i < personnages.length; i += 1) {
            System.out.println(personnages[i].toLowerCase());
        }

        String includeA = "a";
        int nbrOfPersonIncludeLetter = 0;

        for (int i = 0; i < personnages.length; i += 1) {
            if (personnages[i].contains(includeA)) {
                nbrOfPersonIncludeLetter = nbrOfPersonIncludeLetter + 1;
            }
        }

        System.out.println("Number of personnages includes the 'a' letter : " + nbrOfPersonIncludeLetter);
    }
}

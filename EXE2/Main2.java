package EXE2;

public class Main2 {
    public static void main(String[] args) {

            System.out.println(" Test Voiture");
            Voiture v1 = new Voiture("Toyota", 4, "Essence");
            v1.afficherDetails();
            v1.klaxonner();

            System.out.println("\nTest Voiture2 ");
            Voiture2 v2 = new Voiture2("BMW", 2, "Diesel");
            v2.afficherDetails();
            v2.klaxonner();
        }
}


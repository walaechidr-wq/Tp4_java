package EXE2;

public class Voiture2 extends Véhicule {
    private int nbPortes;
    private String carburant;

    public Voiture2(String marque, int nbPortes, String carburant) {
        super(marque);
        this.nbPortes = nbPortes;
        this.carburant = carburant;
        System.out.println("Constructeur Voiture appelé");
    }

    public void afficherDetails() {
        afficherMarque();
        System.out.println("Portes : " + nbPortes);
        System.out.println("Carburant : " + carburant);
    }

    public void klaxonner() {
        System.out.println("Bip Bip ");
    }
}


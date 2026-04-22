package EXE2;

public class Voiture extends Véhicule{
    public Voiture(String marque){
        super(marque);
    }
    int nbr_portes;
    String carburant;
    public Voiture(String marque,int nbr_portes,String carburant){
        this.nbr_portes=nbr_portes;
        this.carburant=carburant;
        super(marque);
    }
    public void afficherDetails(){
        System.out.println("C' est la "+ marque + " de type " +carburant +" qui a " + nbr_portes + " portes. ");
    }

    public void klaxonner() {
        System.out.println("est klaxonnée!");
    }
}

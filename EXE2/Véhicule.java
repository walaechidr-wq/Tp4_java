package EXE2;

public class Véhicule {
    String marque;
    public Véhicule(String marque){
        this.marque=marque;
    }
    public void afficherMarque(){
        System.out.println("C'est la "+marque);
    }
    public void demarrer(){
        System.out.println("La véhicule est démarée!");
   } public void arreter(){
        System.out.println("La véhicule a arrétée!");
    }
}
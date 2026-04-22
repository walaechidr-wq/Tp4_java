package EXE3;

public class CompteCourant extends Compte{
    private double decouvert;
    public CompteCourant(double solde,double decouvert){
        super(solde);
        this.decouvert=decouvert;
    }
    public boolean autoriserDecouvert(double montant) {
        return (solde - montant) >= -decouvert;
    }
    public void retirer(double montant) {
        if (autoriserDecouvert(montant)) {
            solde -= montant;
        } else {
            System.out.println("Dépassement du découvert autorisé !");
        }
    }
    public double calculerFrais() {
        return 10; // frais fixe (exemple)
    }
    public void afficher() {
        System.out.println("Compte Courant - Solde : " + solde +
                " | Découvert autorisé : " + decouvert);
    }

}

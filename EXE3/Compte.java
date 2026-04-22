package EXE3;

public class Compte {
    protected double solde;
    public Compte(double solde){
        this.solde=solde;
    }
    public void deposer(double montant){
        solde += montant;
        System.out.println("Dépôt de " + montant + " DH effectué.");
    }
    public void retirer(double montant){
        if(solde>=montant){
        solde -= montant;
            System.out.println("Retrait de " + montant + " DH effectué.");
        } else {
            System.out.println("Solde insuffisant !");
        }
    }
    public void consulterSolde(){
        System.out.println("Votre solde est:"+solde);
    }
    public void afficher() {
        System.out.println("Compte Bancaire");
        System.out.println("Solde : " + solde + " DH");
    }
}

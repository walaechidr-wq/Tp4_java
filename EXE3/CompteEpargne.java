package EXE3;

public class CompteEpargne extends Compte {
        private double tauxInteret;

        public CompteEpargne(double soldeInitial, double tauxInteret) {
            super(soldeInitial);
            this.tauxInteret = tauxInteret;
        }
        public double calculerInterets() {
            return solde * tauxInteret;
        }
        public void ajouterInterets() {
            solde += calculerInterets();
        }

        public void afficher() {
            System.out.println("Compte Épargne - Solde : " + solde +
                    " | Taux d'intérêt : " + tauxInteret);
        }
}

package EXE9;

abstract class Vehicule {
        protected double vitesse;

        public Vehicule(double vitesse) {
            this.vitesse = vitesse;
        }

        public void accelerer(double valeur) {
            vitesse += valeur;
            System.out.println("Vitesse actuelle : " + vitesse);
        }

        public void freiner(double valeur) {
            vitesse -= valeur;
            if (vitesse < 0) vitesse = 0;
            System.out.println("Vitesse actuelle : " + vitesse);
        }

        public abstract void demarrer();
}


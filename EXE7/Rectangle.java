package EXE7;

class Rectangle extends Forme {
        private double longueur;
        private double largeur;

        public Rectangle(double longueur, double largeur) {
            this.longueur = longueur;
            this.largeur = largeur;
        }

        public boolean validerDimensions() {
            return longueur > 0 && largeur > 0;
        }

        @Override
        public double calculerSurface() {
            if (!validerDimensions()) {
                System.out.println("Dimensions invalides !");
                return 0;
            }
            return longueur * largeur;
        }

        public double calculerPerimetre() {
            return 2 * (longueur + largeur);
        }
}


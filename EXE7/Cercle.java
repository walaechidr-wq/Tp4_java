package EXE7;

class Cercle extends Forme {
        private double rayon;

        public Cercle(double rayon) {
            this.rayon = rayon;
        }

        // Validation
        public boolean validerDimensions() {
            return rayon > 0;
        }

        @Override
        public double calculerSurface() {
            if (!validerDimensions()) {
                System.out.println("Rayon invalide !");
                return 0;
            }
            return Math.PI * rayon * rayon;
        }

        public double calculerPerimetre() {
            return 2 * Math.PI * rayon;
        }
}


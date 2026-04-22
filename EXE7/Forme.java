package EXE7;

abstract class Forme {
    public abstract double calculerSurface();

        // Méthode concrète
        public void afficherDescription() {
            System.out.println("Ceci est une forme géométrique");
        }

        public void comparerSurface(Forme f) {
            if (this.calculerSurface() > f.calculerSurface()) {
                System.out.println("Cette forme a une surface plus grande");
            } else if (this.calculerSurface() < f.calculerSurface()) {
                System.out.println("L'autre forme a une surface plus grande");
            } else {
                System.out.println("Les deux formes ont la même surface");
            }
        }
}


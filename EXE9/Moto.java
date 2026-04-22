package EXE9;

class Moto extends Vehicule {

    private String typeMoto;

    public Moto(double vitesse, String typeMoto) {
        super(vitesse);
        this.typeMoto = typeMoto;
    }

    @Override
    public void demarrer() {
        System.out.println("La moto démarre avec un bruit puissant ");
    }


    public void faireRoueArriere() {
        System.out.println("La moto fait une roue arrière !");
    }

    public void afficherTypeMoto() {
        System.out.println("Type de moto : " + typeMoto);
    }
}


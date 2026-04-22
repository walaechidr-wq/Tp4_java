package EXE9;

class VoitureElectrique extends Vehicule implements Electrique {

    private int batterie; // en %

    public VoitureElectrique(double vitesse, int batterie) {
        super(vitesse);
        this.batterie = batterie;
    }

    @Override
    public void demarrer() {
        System.out.println("La voiture électrique démarre silencieusement ⚡");
    }

    @Override
    public void charger() {
        batterie = 100;
        System.out.println("Batterie chargée à 100%");
    }

    @Override
    public void verifierBatterie() {
        System.out.println("Niveau batterie : " + batterie + "%");
    }


    public void afficherAutonomie() {
        System.out.println("Autonomie estimée : " + (batterie * 3) + " km");
    }

    public void optimiserConsommation() {
        System.out.println("Mode économie activé");
    }
}


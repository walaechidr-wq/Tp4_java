package EXE9;

public class Main9 {
    public static void main(String[] args) {


        Vehicule v1 = new VoitureElectrique(0, 80);
        Vehicule v2 = new Moto(0, "Sport");

        v1.demarrer();
        v2.demarrer();

        v1.accelerer(50);
        v2.accelerer(70);

        System.out.println("\n Interface Electrique ");


        Electrique e = new VoitureElectrique(0, 60);
        e.charger();
        e.verifierBatterie();

        System.out.println("\n Méthodes spécifiques ");

        VoitureElectrique ve = (VoitureElectrique) v1;
        ve.afficherAutonomie();
        ve.optimiserConsommation();

        Moto m = (Moto) v2;
        m.faireRoueArriere();
        m.afficherTypeMoto();
    }
}


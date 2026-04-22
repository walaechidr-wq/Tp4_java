package EXE8;

public class Main8 {
    public static void main(String[] args) {

        Volant v1 = new Oiseau();
        Volant v2 = new Avion();

        System.out.println(" Vol ");
        v1.voler();
        v2.voler();

        v1.changerAltitude(100);
        v2.changerAltitude(10000);

        v1.atterrir();
        v2.atterrir();

        System.out.println("\nMéthodes spécifiques");

        Oiseau o = (Oiseau) v1;
        o.migrer();
        o.construireNid();

        Avion a = (Avion) v2;
        a.embarquerPassagers(150);
        a.afficherAltitude();
    }
}

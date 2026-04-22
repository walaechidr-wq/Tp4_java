package EXE4;

public class Main4 {
    public static void main(String[] args) {

        Animal a1 = new Chien();
        Animal a2 = new Chat();

        System.out.println(" Polymorphisme ");
        a1.crier();
        a2.crier();

        a1.manger();
        a2.dormir();

        System.out.println("\n Spécifique ");

        Chien c = (Chien) a1;
        c.garder();
        c.jouer();

        Chat ch = (Chat) a2;
        ch.ronronner();
        ch.grimper();
    }
}


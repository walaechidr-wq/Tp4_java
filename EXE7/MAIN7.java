package EXE7;

public class MAIN7 {
    public static void main(String[] args) {

        Forme f1 = new Rectangle(5, 3);
        Forme f2 = new Cercle(4);

        f1.afficherDescription();
        f2.afficherDescription();

        System.out.println("Surface rectangle : " + f1.calculerSurface());
        System.out.println("Surface cercle : " + f2.calculerSurface());

        f1.comparerSurface(f2);


        Rectangle r = (Rectangle) f1;
        System.out.println("Périmètre rectangle : " + r.calculerPerimetre());

        Cercle c = (Cercle) f2;
        System.out.println("Périmètre cercle : " + c.calculerPerimetre());
    }
}


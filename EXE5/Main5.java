package EXE5;

public class Main5 {
        public static void main(String[] args) {

            // Polymorphisme
            Figure f1 = new Cercle(5);
            Figure f2 = new Triangle(3, 4, 5);

            f1.dessiner(); // Cercle
            f2.dessiner(); // Triangle

            f1.deplacer(2, 3);
            f2.redimensionner(2);

            System.out.println("\n Méthodes spécifiques ");

            Cercle c = (Cercle) f1;
            System.out.println("Périmètre cercle : " + c.calculerPerimetre());
            System.out.println("Surface cercle : " + c.calculerSurface());

            Triangle t = (Triangle) f2;
            System.out.println("Périmètre triangle : " + t.calculerPerimetre());
            System.out.println("Surface triangle : " + t.calculerSurface());
        }
    }

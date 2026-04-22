package EXE5;

public class Figure {

    public void dessiner() {
        System.out.println("Dessiner une figure");
    }

    public void deplacer(int x, int y) {
        System.out.println("Déplacer la figure vers (" + x + ", " + y + ")");
    }

    public void redimensionner(double facteur) {
        System.out.println("Redimensionner avec facteur : " + facteur);
    }
}


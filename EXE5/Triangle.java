package EXE5;

public class Triangle extends Figure {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void dessiner() {
        System.out.println("Dessiner un triangle");
    }

    public double calculerPerimetre() {
        return a + b + c;
    }

    public double calculerSurface() {
        double s = calculerPerimetre() / 2; // demi-périmètre
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // formule de Héron
    }
}


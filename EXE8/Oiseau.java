package EXE8;

class Oiseau implements Volant {

    private int altitude;

    @Override
    public void voler() {
        System.out.println("L'oiseau vole ");
    }

    @Override
    public void atterrir() {
        System.out.println("L'oiseau atterrit");
        altitude = 0;
    }

    @Override
    public void changerAltitude(int altitude) {
        this.altitude = altitude;
        System.out.println("Nouvelle altitude (oiseau) : " + altitude);
    }

    public void migrer() {
        System.out.println("L'oiseau migre vers un autre pays");
    }

    public void construireNid() {
        System.out.println("L'oiseau construit un nid");
    }

}

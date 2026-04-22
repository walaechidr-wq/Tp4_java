package EXE10;

class Magazine extends Document implements Empruntable {
    private int numero;
    private String datePublication;

    public Magazine(int id, String titre, String auteur, int numero, String date) {
        super(id, titre, auteur);
        this.numero = numero;
        this.datePublication = date;
    }

    @Override
    public int calculerDureeEmpruntMax() {
        return 7;
    }

    @Override
    public boolean estDisponible() {
        return disponible;
    }

    @Override
    public void reserver() {
        System.out.println("Magazine réservé");
    }

    public boolean estRecent() {
        return true;
    }

    public void afficherEdition() {
        System.out.println("Numéro: " + numero + " | Date: " + datePublication);
    }

}

package EXE10;

abstract class Document {
    protected int identifiant;
    protected String titre;
    protected String auteur;
    protected boolean disponible = true;
    protected int nbEmprunts = 0;

    public Document(int id, String titre, String auteur) {
        this.identifiant = id;
        this.titre = titre;
        this.auteur = auteur;
    }

    public void emprunter() {
        if (disponible) {
            disponible = false;
            nbEmprunts++;
            System.out.println("Document emprunté");
        } else {
            System.out.println("Document indisponible");
        }
    }

    public void retourner() {
        disponible = true;
        System.out.println("Document retourné");
    }

    public void afficherInformations() {
        System.out.println("ID: " + identifiant +
                " | Titre: " + titre +
                " | Auteur: " + auteur +
                " | Disponible: " + disponible);
    }

    // Méthode abstraite
    public abstract int calculerDureeEmpruntMax();
}


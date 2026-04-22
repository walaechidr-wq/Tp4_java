package EXE10;
import java.util.*;

    class Utilisateur {
        private int identifiant;
        private String nom;
        private List<Document> historique = new ArrayList<>();

        public Utilisateur(int id, String nom) {
            this.identifiant = id;
            this.nom = nom;
        }

        public void emprunterDocument(Document d) {
            d.emprunter();
            historique.add(d);
        }

        public void retournerDocument(Document d) {
            d.retourner();
        }

        public void afficherHistorique() {
            for (Document d : historique) {
                System.out.println(d.titre);
            }
        }
    }


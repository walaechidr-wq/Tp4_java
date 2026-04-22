package EXE10;
import java.util.*;

class Bibliotheque {
        private List<Document> documents = new ArrayList<>();

        // Ajouter document
        public void ajouterDocument(Document d) {
            documents.add(d);
        }

        
        public void rechercher(String motCle) {
            for (Document d : documents) {
                if (d.titre.toLowerCase().contains(motCle.toLowerCase()) ||
                        d.auteur.toLowerCase().contains(motCle.toLowerCase())) {

                    d.afficherInformations();
                    System.out.println("-----");
                }
            }
        }

       
        public void afficherDisponibles() {
            for (Document d : documents) {
                if (d.disponible) {
                    d.afficherInformations();
                }
            }
        }

       
        public Document plusEmprunte() {
            if (documents.isEmpty()) return null;

            Document max = documents.get(0);

            for (Document d : documents) {
                if (d.nbEmprunts > max.nbEmprunts) {
                    max = d;
                }
            }
            return max;
        }

        public double calculerPenalite(int joursRetard) {
            double penaliteParJour = 2.0; // 2€ / jour
            return joursRetard * penaliteParJour;
        }
    }


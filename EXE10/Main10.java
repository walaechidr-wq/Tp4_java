package EXE10;
import java.util.*;
public class Main10 {

        public static void main(String[] args) {

            List<Document> docs = new ArrayList<>();

            docs.add(new Livre(1, "Java", "Auteur A", 300, "Informatique"));
            docs.add(new Magazine(2, "Tech Mag", "Auteur B", 12, "2025"));
            docs.add(new DocumentNumerique(3, "PDF Guide", "Auteur C", "PDF", 5.5));

            System.out.println("=== Affichage polymorphique ===");

            for (Document d : docs) {
                d.afficherInformations();
                System.out.println("Durée max: " + d.calculerDureeEmpruntMax());
                System.out.println("------");
            }

            Bibliotheque biblio = new Bibliotheque();

                    // Ajout des documents
                    Livre livre1 = new Livre(1, "Java Programming", "Ali", 300, "Informatique");
                    Magazine mag1 = new Magazine(2, "Tech Today", "Sara", 15, "2025");
                    DocumentNumerique docNum1 = new DocumentNumerique(3, "Guide PDF", "Omar", "PDF", 5.5);

                    biblio.ajouterDocument(livre1);
                    biblio.ajouterDocument(mag1);
                    biblio.ajouterDocument(docNum1);

                    // === TEST POLYMORPHISME ===
                    System.out.println("=== Tous les documents ===");
                    for (Document d : Arrays.asList(livre1, mag1, docNum1)) {
                        d.afficherInformations();
                        System.out.println("Durée max: " + d.calculerDureeEmpruntMax() + " jours");
                        System.out.println("------");
                    }

                    // === RECHERCHE ===
                    System.out.println("\n=== Recherche 'Java' ===");
                    biblio.rechercher("Java");

                    // === DISPONIBLES ===
                    System.out.println("\n=== Documents disponibles ===");
                    biblio.afficherDisponibles();

                    // === EMPRUNT ===
                    System.out.println("\n=== Emprunt ===");
                    livre1.emprunter();
                    mag1.emprunter();

                    // === PLUS EMPRUNTÉ ===
                    System.out.println("\n=== Document le plus emprunté ===");
                    Document plus = biblio.plusEmprunte();
                    if (plus != null) {
                        plus.afficherInformations();
                    }

                    // === PÉNALITÉ ===
                    System.out.println("\n=== Pénalité ===");
                    int joursRetard = 4;
                    double penalite = biblio.calculerPenalite(joursRetard);
                    System.out.println("Retard: " + joursRetard + " jours -> Pénalité: " + penalite + " €");

                    // === MÉTHODES SPÉCIFIQUES ===
                    System.out.println("\n=== Méthodes spécifiques ===");

                    livre1.recommander();
                    mag1.afficherEdition();
                    docNum1.telecharger();
                }
            }


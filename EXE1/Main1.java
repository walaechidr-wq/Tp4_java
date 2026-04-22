package EXE1;

public class Main1 {
    public static void main(String[] args) {
        Personne p1 = new Personne("Chtioui", "Walae", 21);
        p1.AfficherInformations();
        if (p1.estMajeur()) {
            System.out.println("est Majeur");
        } else {
            System.out.println("Mineur!");
        }
        System.out.println(p1.sePresenter());

        Etudiant e1= new Etudiant("Chtioui","Walae",21,"Bac+6",14);

        if(e1.estAdmis()){
            System.out.println("est admis");
        }else{ System.out.println("non admis!");}

        System.out.println("Le profil : "+ e1.afficherProfil());
    }
}
package EXE3;

public class Main3 {
    public static void main(String[] args) {

            CompteCourant cc = new CompteCourant(1000, 500);
            cc.retirer(1300);
            cc.afficher();


            CompteEpargne ce = new CompteEpargne(2000, 0.05);
            ce.ajouterInterets();
            ce.afficher();
        }
}


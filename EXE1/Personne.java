package EXE1;

public class Personne {
     String nom;
     String prenom;
     int age;

    public Personne(String nom,String prenom,int age){
        this.age=age;
        this.nom=nom;
        this.prenom=prenom;
    }
    public  void AfficherInformations(){
        System.out.println("NOM:"+nom);
        System.out.println("PRENOM:"+prenom);
        System.out.println("Age:"+age+"ans");
    }
    public Boolean estMajeur() {
            return age >=18;
    }
    public String sePresenter(){
        return "Bonjour tout le monde! Je suis "+ prenom + nom + ",j'ai "+age+"ans!";
        }

    }



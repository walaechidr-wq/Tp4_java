package EXE1;

public class Etudiant extends Personne{
     String niveauEtude;
     float moyenne;
     public Etudiant(String nom,String prenom,int age ,String niveauEtude,float moyenne){
         super(nom,prenom,age);
         this.moyenne=moyenne;
         this.niveauEtude=niveauEtude;
     }
     public String calculerMention() {
         if (moyenne == 12) return "validé!";
         if (moyenne > 12) return "assez bien!";
         if (moyenne >=14) return "mention bien!";
         if (moyenne >=16) return "mention très bien!";
         return null;
     }
     public Boolean estAdmis(){
         return moyenne>=12;
     }
     public String afficherProfil(){
         return "  Nom:  "+nom+"  Prenom:  "+prenom+"  Age:  "+age+"  Niveau d'étude:  "+niveauEtude+"  Moyenne:  "+moyenne;
     }
}

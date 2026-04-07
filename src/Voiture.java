public class Voiture {
    String marque;
    String modele;
    Pneus pneu;
    int annee;
    double prix;

    public Voiture(String marque, String modele, Pneus pneu, int annee, double prix){
        this.marque = marque;
        this.modele = modele;
        this.pneu = pneu;
        this.annee = annee;
        this.prix = prix;
    }
}

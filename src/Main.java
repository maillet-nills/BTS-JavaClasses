//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // Exercice 1
    String marque= "Peugeot";
    int modele = 208;
    int annee = 2021;
    int prix = 14500;

    System.out.println("La voiture est une " + marque + " " + modele + " datant de " + annee + ", elle coûte " + prix + "€.");

    // Exercice 2
    // 1. Il faudrait à chaque fois créer des variables ce qui n'est pas pratique.
    // 2. Créer une nouvelle variable couleur par exemple et/ou ne plus en utiliser une.
    // 3. La création d'une nouvelle variable pour chaque voiture déjà existante.
    // 4. Il faudra retrouver la variable et re-assigner sa valeur.
    // 5. Cette méthode n'est pas optimale pour Auto+ car il gère plus de 200 véhicules différents.

    // Exercice 3
    // 1. Ce nouveau code nous permet d'avoir une structure préfaite de ce "qu'est une voiture" pour Auto+.
    // 2. Ce nouveau code nous permet de décrire une voiture, car elle contient toutes les "variables" nécessaires.
    // 3. Une classe est une "forme" contenant des propriétés. Grâce aux classes, nous pouvons créer des "Objets", instancces de ces classes.

    //Exercice 4
    //Voiture v1 = new Voiture();
    //Voiture v2 = new Voiture();

    // 1. v1 et v2 représente chacun une voiture.
    // 2. Nous pouvons créer plusieurs variables de type voiture puisqu'il s'agit de voitures différentes et que "Voiture" est une classe.
    // 3. Actuellement, nous ne connaissons pas le modèle ou la marque des deux voitures.
    // 4.

    //v1.marque = "Peugeot";
    //v2.marque = "Toyota";

    // 5. Un objet est une instance d'une classe. Plusieurs objets d'une classe peuvent exister.

    // 6. Mis à jour du code.

    Voiture v1 = new Voiture();
    Voiture v2 = new Voiture();
    Voiture v3 = new Voiture();

    v1.marque = "Peugeot";
    v1.modele = "208";
    v1.annee = 2021;
    v1.prix = 14500;

    v2.marque = "Renault";
    v2.modele = "Clio";
    v2.annee = 2000;;
    v2.prix = 3500;

    v3.marque = "Toyota";
    v3.modele = "Yaris";
    v3.annee = 2015;
    v3.prix = 9800;

    // 7. Plus besoin de créer des variables différentes, en revanche cela prend toujours beaucoup de lignes, ce n'est pas efficace.

    // Exercice 5
    // 1/2. Le bloc de code ajouté permet d'assigner les propriétés de notre voiture en une seule ligne via le constructeur.
    // 3. Le constructeur comme son nom l'indique, permet de créer un objet voiture en une ligne en assignant les propriétés dedans.

}

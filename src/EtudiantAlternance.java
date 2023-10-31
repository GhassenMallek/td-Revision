/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ghassen MALLEK
 */
public class EtudiantAlternance extends Etudiant {
// TODO 8 : compléter la déclaration de la classe EtudiantAlternance
    private int salaire;
// TODO 9 : créer le constructeur paramétré de EtudiantAlternance
    public EtudiantAlternance(int id, String nom, String prenom, float moyenne, int salaire) {
        super(id, nom, prenom, moyenne);
        this.salaire = salaire;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
// TODO 10 : écrire la méthode void ajouterUneAbsence() qui permet d’enlever 50dt du salaire de l’étudiant alternant.
    @Override
    public void ajouterUneAbsence() {
        this.salaire -= 50;
    }
// TODO 11 : redéfinir la méthode toString() de la classe EtudiantAlternance.
    public String toString() {
        return super.toString() + " Salaire= " + salaire;
    }

}

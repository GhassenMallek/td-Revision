/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ghassen MALLEK
 */
public class Etudiant3eme extends Etudiant {
    // TODOO 5 compléter la déclaration de la classe Etudiant3eme.

    private String branche;
// TODO 6 : créer le constructeur paramétré de Etudiant3eme.
    public Etudiant3eme(int id, String nom, String prenom, float moyenne, String branche) {
        super(id, nom, prenom, moyenne);
        this.branche = branche;
    }

    public String getBranche() {
        return branche;
    }

    public void setBranche(String branche) {
        this.branche = branche;
    }
// TODO 7 : écrire la méthode «void ajouterUneAbsence () »
    @Override
    public void ajouterUneAbsence() {
        this.moyenne -= 0.5f;
    }

}

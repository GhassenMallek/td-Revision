/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ghassen MALLEK
 */
public abstract class Etudiant {

    protected int id;
    protected String nom, prenom;
    protected float moyenne;

    public Etudiant() {
    }

    // TODO 1 : créer un constructeur paramétré pour la classe Etudiant.
    public Etudiant(int id, String nom, String prenom, float moyenne) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.moyenne = moyenne;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public float getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }

    // TODO 2 : redéfinir la méthode equals() pour la classe Etudiant selon l’identifiant et le nom.
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o instanceof Etudiant) {
            Etudiant e = (Etudiant) o;
            if (e.getNom().equals(this.nom) && e.getId() == this.id) {
                return true;
            }
        }
        return false;
    }
// TODO 3 : redéfinir la méthode toString() pour la classe Etudiant.
    @Override
    public String toString() {
        return "Etudiant: id= " + id + " nom= " + nom + " prénom= "
                + prenom + " moyenne= " + moyenne;
    }
// TODO 4 : apporter les modifications nécessaires dans la classe Etudiant pour que les deux classes Etudiant3eme et EtudiantAlternance doivent implémenter la méthode void ajouterUneAbsence(). Sachant que cette méthode a un comportement diffèrent dans chaque classe fille.
    public abstract void ajouterUneAbsence();

}

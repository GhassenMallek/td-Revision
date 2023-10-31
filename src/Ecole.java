

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ghassen MALLEK
 */
public class Ecole  {

    private String nom;
    private Etudiant[] etudiants;
    private int nbr_etudiants;
// TODO 12 : déclarer le constructeur de la classe Ecole sachant qu’elle peut contenir au maximum 500 Etudiants.
    public Ecole(String nom) {
        this.nom = nom;
        this.etudiants = new Etudiant[500];
    }
// TODO 14 : implémenter la méthode int rechercher Etudiant (Etudiant e) qui permet de rechercher un étudiant et retourner l’indice sinon -1.
    public int rechercherEtudiant(Etudiant e) {
        for (int i = 0; i < nbr_etudiants; i++) {
            if (etudiants[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }
// TODO 13 / 15  /21

    public void ajouterEtudiant(Etudiant e) throws EtudiantExisteException {
        if (rechercherEtudiant(e) == -1) {
            etudiants[nbr_etudiants] = e;
            nbr_etudiants++;
        } else {
            throw new EtudiantExisteException("Cet étudiant existe déjà");
        }
    }
// TODO 16 : implémenter la méthode getMoyenneDes3A() qui permet de calculer la moyenne des étudiants 3A.
    public float getMoyenne3A() {
        float moy_3A = 0;
        int nbr_etudiants_3A = 0;
        for (int i = 0; i < nbr_etudiants; i++) {
            if (etudiants[i] instanceof Etudiant3eme) {
                moy_3A += etudiants[i].moyenne;
                nbr_etudiants_3A++;
            }
        }
        return moy_3A / nbr_etudiants_3A;
    }
// TODO 17 : implémenter la méthode moyenneSalaireAlternants() qui permet de calculer la moyenne des salaires des étudiants alternants seulement.
    public int moyenneSalaireAlternants() {
        int moy_salaire = 0;
        int nbr_etudiants_alt = 0;
        for (int i = 0; i < nbr_etudiants; i++) {
            if (etudiants[i] instanceof EtudiantAlternance) {
                EtudiantAlternance e = (EtudiantAlternance) etudiants[i];
                moy_salaire += e.getSalaire();
                nbr_etudiants_alt++;
            }
        }
        return moy_salaire / nbr_etudiants_alt;
    }
// TODO 18 : redéfinir la méthode toString() permet de retourner le nom de l’école et les informations de tous les étudiants.
    public String toString() {
        String s = "Nom: " + nom + " - Etudiants: \n";
        for (int i = 0; i < nbr_etudiants; i++) {
            s += etudiants[i].toString();
            s += "\n";
        }
        return s;
    }
// TODO 19 : implémenter la méthode changerEcole(Etudiant etd, Ecole e) qui permet à un étudiant de changer son école.
// TODO 22 : Modifier la méthode changerEcole(Etudiant etd, Ecole e) qui permet à un étudiant de changer son école.   
public void changerEcole(Etudiant etd, Ecole e) {
        int position = rechercherEtudiant(etd);
        if (position != -1) {
            try {
                e.ajouterEtudiant(etd);
            } catch (EtudiantExisteException ex) {
                System.out.println(ex.getMessage());
            }
            for (int i = position; i < nbr_etudiants; i++) {
                etudiants[i] = etudiants[i + 1];
                etudiants[nbr_etudiants] = null;
                nbr_etudiants--;
            }
        } else {
            System.out.println("Cet étudiant n'éxiste pas");
        }
    }
}

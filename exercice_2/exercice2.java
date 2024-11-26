
public class GestionnaireNotes {

    
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        afficherNotes(nomEtudiant, notes);
        double moyenne = calculerMoyenne(notes);
        afficherMoyenne(moyenne);
    }

    
    private void afficherNotes(String nomEtudiant, int[] notes) {
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }
    }

    
    private double calculerMoyenne(int[] notes) {
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }
        return (double) somme / notes.length;
    }

    /**
     * Affiche la moyenne calculée.
     * @param moyenne La moyenne des notes.
     */
    private void afficherMoyenne(double moyenne) {
        System.out.println("Moyenne : " + moyenne);
    }
}

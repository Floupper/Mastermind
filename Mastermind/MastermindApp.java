package Mastermind;

public class MastermindApp {
    public static void main(String[] args) {
        Manche manche1 = new Manche();
        Combinaison combinaison = new Combinaison();

        manche1.affichageCombinaisonSecrete();
        System.out.println("Combinaison : \t      " + combinaison.genererCombinaison());
        System.out.println(
                "Indices :             " + combinaison.verifierCorrespondance(combinaison.genererCombinaison()));
    }
}

package Mastermind;

import java.util.ArrayList;

public class MastermindApp {
    public static void main(String[] args) {
        /*Manche manche1 = new Manche();
        Combinaison combinaison = new Combinaison();
        Score score = new Score();

        manche1.affichageCombinaisonSecrete();
        System.out.println("Combinaison : \t      " + combinaison.genererCombinaison());
        System.out.println(
                "Indices :             " + combinaison.verifierCorrespondance(combinaison.genererCombinaison()));

        LigneIndice ligneIndice = new LigneIndice();
        ArrayList<Indice> ligneindice = combinaison.verifierCorrespondance(combinaison.genererCombinaison());
        for(Indice indice : ligneindice)
        {
            ligneIndice.setIndices(indice);
        }
        score.calculerScoreManche(ligneIndice , new StrategyMode());
        System.out.println("le score de cette manche est de : " + score.getScoreManche(0));*/
        MastermindFacade facade = new MastermindFacade();
        facade.lancerPartie();
    }
}

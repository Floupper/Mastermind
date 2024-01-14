package Mastermind;

import java.util.Scanner;

public class MastermindFacade {
    public void jouerPartie() {
        /****************************************
         * initialisation des variables utiles
         ***************************************/
        int nbManche;
        int nbPionCombinaison;
        int maxTentatives;
        int nbPions;
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Partie partie = new Partie();

        /****************************************
         * paramètres
         ***************************************/
        // choix des paramètres par l'utilisateur
        System.out.println(
                "========================================================\nParamètres : \n========================================================");
        System.out.println("Nombre de Manches : ");
        nbManche = scanner.nextInt();
        System.out.println("Nombre de pions dans une combinaison : ");
        nbPionCombinaison = scanner.nextInt();
        System.out.println("Nombre de tentatives maximum : ");
        maxTentatives = scanner.nextInt();
        System.out.println("Nombre de pions différent : ");
        nbPions = scanner.nextInt();

        // vérification des paramètres
        if (3 <= nbManche && nbManche <= 5) {
            partie.setNbManches(nbManche);
        } else {
            System.out.println("Nombre de manches incorrect, valeur par défaut : 3");
        }
        if (4 <= nbPionCombinaison && nbPionCombinaison <= 6) {
            partie.setNbPionCombinaison(nbPionCombinaison);
        } else {
            System.out.println("Nombre de pions dans une combinaison incorrect, valeur par défaut : 4");
        }
        if (10 <= maxTentatives && maxTentatives <= 12) {
            partie.setMaxTentatives(maxTentatives);
        } else {
            System.out.println("Nombre de tentatives maximum incorrect, valeur par défaut : 10");
        }
        if (nbPions == 8) {
            partie.setNbPions(nbPions);
        } else {
            System.out.println("Nombre de pions différents incorrect, valeur par défaut : 8");
        }

        // affichage des paramètres
        System.out.println(
                "========================================================\nRésumé paramètres : \n========================================================");
        System.out.println("nombre de manches : " + partie.getNbManches() + "\nnombre de pions par combinaison : "
                + partie.getNbPionCombinaison() + "\nnombre de tentatives : " + partie.getMaxTentatives()
                + "\nnombre de pions différents : " + partie.getNbPions());

        /****************************************
         * les manches
         ***************************************/
        for (int i = 0; i < partie.getNbManches(); i++) {
            System.out.println("========================================================\nManche " + (i + 1)
                    + " : \n========================================================");
            Manche manche = new Manche();

            /****************************************
             * les tentatives
             ***************************************/
            while (!manche.verifierFinManche(partie.getMaxTentatives(), partie.getNbPionCombinaison())) {
                System.out.println("========================================================\ntentative "
                        + (manche.getNumTentative())
                        + " : \n========================================================");
                System.out.println("Entrer une combinaison : ");
                System.out.println("Pions dispobible : " + Pions.ROUGE + " " + Pions.BLEU + " " + Pions.VERT + " "
                        + Pions.JAUNE + " " + Pions.ORANGE + " " +
                        Pions.VIOLET + " " + Pions.BLANC + " " + Pions.NOIR);
                manche.unsetCombinaisonJoueur();
                manche.unsetLigneIndice();
                Combinaison combinaison = new Combinaison(0);
                manche._combinaisonsJoueurTest.addCombinaisonJoueur(scanner2.nextLine());
                manche.ajouterTentative(combinaison);
                manche.setLigneIndice();
                /* manche.affichageCombinaisonSecrete(); */
                manche.affichageCombinaisonJoueur();
                manche.affichageIndices();
            }
            /****************************************
             * les scores
             ***************************************/
            /*partie.getScore().calculerScoreManche(manche.getIndices().get(manche.getNumTentative() - 1),
                    new StrategyMode());*/
            partie.getScore().calculerScoreTotal();
            System.out.println("score de la manche : " + partie.getScore().getScoreManche(i));
        }
        System.out.println("========================================================\nfin de partie "
                + "\n========================================================");
        System.out.println("score total : " + partie.getScore().getScoreTotal());
    }
}
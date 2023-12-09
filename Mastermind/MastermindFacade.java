package Mastermind;

import java.util.Scanner;

public class MastermindFacade {
    public void lancerPartie() {
        int nbManche;
        int nbPionCombinaison;
        int maxTentatives;
        int nbPions;
        Scanner scanner = new Scanner(System.in);
        Partie partie = new Partie();

        // choix des settings
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

        System.out.println(
                "========================================================\nRésumé paramètres : \n========================================================");
        System.out.println("nombre de manches : " + partie.getNbManches() + "\nnombre de pions par combinaison : "
                + partie.getNbPionCombinaison() + "\nnombre de tentatives : " + partie.getMaxTentatives()
                + "\nnombre de pions différents : " + partie.getNbPions());

        // boucle des manches
        for (int i = 0; i < partie.getNbManches(); i++) {
            System.out.println("========================================================\nManche " + (i + 1)
                    + " : \n========================================================");

            Manche manche = new Manche();
            manche.affichageCombinaisonSecrete();

            System.out.println("Entrer une combinaison : ");
            System.out.println(
                    "Pions dispobible : " + Pions.ROUGE + " " + Pions.BLEU + " " + Pions.VERT + " " + Pions.JAUNE
                            + " " + Pions.ORANGE + " " + Pions.VIOLET + " " + Pions.BLANC + " " + Pions.NOIR);

            Scanner scanner2 = new Scanner(System.in);
            manche._combinaisonJoueurTest.addCombinaisonJoueur(scanner2.nextLine());
            manche.affichageCombinaisonJoueur();
            manche.affichageIndices();

            // boucle des tentatives

            // Vérifier la condition de fin de manche !!!!!!

            // while (!manche.verifierFinManche(partie.getMaxTentatives(),
            // partie.getNbPionCombinaison())) {
            // Combinaison combinaison = new Combinaison();
            // manche.ajouterTentative(combinaison);
            // System.out.println("tentatives " + i);
            // }
        }
    }
}
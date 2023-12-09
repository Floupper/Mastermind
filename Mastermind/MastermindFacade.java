package Mastermind;

import java.util.Scanner;
public class MastermindFacade
{
    public void lancerPartie()
    {
        int nbManche;
        int nbPionCombinaison;
        int maxTentatives;
        int nbPions;
        Scanner scanner = new Scanner(System.in);
        Partie partie = new Partie();

        //choix des settings
        System.out.println("========================================================\nParamètres : \n========================================================");
        System.out.println("Nombre de Manches : ");
        nbManche = scanner.nextInt();
        System.out.println("Nombre de pions dans une combinaison : ");
        nbPionCombinaison = scanner.nextInt();
        System.out.println("Nombre de tentatives maximum : ");
        maxTentatives = scanner.nextInt();
        System.out.println("Nombre de pions différent : ");
        nbPions = scanner.nextInt();

        if(1 <= nbManche && nbManche <= 5)
        {
            partie.setNbManches(nbManche);
        }
        if(1 <= nbPionCombinaison && nbPionCombinaison <= 6)
        {
            partie.setNbPionCombinaison(nbPionCombinaison);
        }
        if(1 <= maxTentatives && maxTentatives <= 12)
        {
            partie.setMaxTentatives(maxTentatives);
        }
        if(4 <= nbPions && nbPions <= 8)
        {
            partie.setNbPions(nbPions);
        }
        System.out.println("========================================================\nRésumé paramètres : \n========================================================");
        System.out.println("nombre de manches : " + partie.getNbManches() + "\nnombre de pions par combinaison : " + partie.getNbPionCombinaison() + "\nnombre de tentatives : " + partie.getMaxTentatives() + "\nnombre de pions différents : " + partie.getNbPions());

        //boucle des manches
        for(int i = 0; i < partie.getNbManches(); i++)
        {
            System.out.println("========================================================\nManche " + (i+1) + " : \n========================================================");
            Manche manche = new Manche();
            //boucle des tentatives
            while(!manche.verifierFinManche(partie.getMaxTentatives(), partie.getNbPionCombinaison()))
            {
                Combinaison combinaison = new Combinaison();
                manche.ajouterTentative(combinaison);
                System.out.println("tentatives " + i);
            }
        }
    }
}
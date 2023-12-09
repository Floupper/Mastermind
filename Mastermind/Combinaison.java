package Mastermind;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Combinaison {

    private static ArrayList<Pions> _combinaisonSecrete;
    private ArrayList<Pions> _combinaisonJoueur;

    public Combinaison() {
        _combinaisonSecrete = new ArrayList<Pions>();
        _combinaisonSecrete = genererCombinaisonSecrete();
        _combinaisonJoueur = new ArrayList<Pions>();
    }

    public static ArrayList<Pions> genererCombinaisonSecrete() { // static
        Random random = new Random();
        int i = 0;
        while (i < Partie.nbPionsCombinaison) {
            int randomNumber = random.nextInt(Partie.nbPions) + 1;
            switch (randomNumber) {
                case 1:
                    _combinaisonSecrete.add(Pions.ROUGE);
                    break;
                case 2:
                    _combinaisonSecrete.add(Pions.BLEU);
                    break;
                case 3:
                    _combinaisonSecrete.add(Pions.VERT);
                    break;
                case 4:
                    _combinaisonSecrete.add(Pions.JAUNE);
                    break;
                case 5:
                    _combinaisonSecrete.add(Pions.ORANGE);
                    break;
                case 6:
                    _combinaisonSecrete.add(Pions.VIOLET);
                    break;
                case 7:
                    _combinaisonSecrete.add(Pions.BLANC);
                    break;
                case 8:
                    _combinaisonSecrete.add(Pions.NOIR);
                    break;
                default:
                    break;
            }
            i++;
        }
        return _combinaisonSecrete;
    }

    public ArrayList<Indice> verifierCorrespondance(ArrayList<Pions> tentative) {
        LigneIndice ligneIndice = new LigneIndice();
        for (Pions pions : tentative) {
            if (_combinaisonSecrete.contains(pions)) {
                if (_combinaisonSecrete.indexOf(pions) == tentative.indexOf(pions)) {
                    ligneIndice.setIndices(Indice.BIEN_PLACE);
                } else {
                    ligneIndice.setIndices(Indice.MAL_PLACE);
                }
            } else {
                ligneIndice.setIndices(Indice.ABSENT);
            }
        }

        return ligneIndice.getIndices();
    }

    public static ArrayList<Pions> getCombinaisonSecrete() {
        return _combinaisonSecrete;
    }

    public ArrayList<Pions> getCombinaisonJoueur() {
        return _combinaisonJoueur;
    }

    public void setCombinaisonJoueur(Pions combinaisonJoueur) {
        _combinaisonJoueur.add(combinaisonJoueur);
    }

    public void addCombinaisonJoueur(String choix) {
        choix = choix.toUpperCase();
        String[] couleur1 = choix.split(" ");

        for (String string : couleur1) {
            setCombinaisonJoueur(Pions.valueOf(string));
        }
    }
}

package Mastermind.model;

import java.util.ArrayList;
import java.util.Random;

public class Combinaison {
    private ArrayList<Pions> _combinaisonJoueur;
    private static ArrayList<Pions> _combinaisonSecrete;
    public Combinaison(int flag) {
        if(flag == 0){
            _combinaisonJoueur = new ArrayList<Pions>();
        }
        else
        {
            _combinaisonSecrete = new ArrayList<Pions>();
            _combinaisonSecrete = genererCombinaisonSecrete();//pas de regène
        }
    }

    public void setCombinaisonJoueur(Pions combinaisonJoueur) {
        _combinaisonJoueur.add(combinaisonJoueur);
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
    public void addCombinaisonJoueur(String choix) {
        choix = choix.toUpperCase();
        String[] couleur1 = choix.split(" ");

        for (String string : couleur1) {
            setCombinaisonJoueur(Pions.valueOf(string));
        }
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



}

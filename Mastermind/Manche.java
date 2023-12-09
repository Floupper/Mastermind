package Mastermind;

import java.util.ArrayList;

public class Manche {
    protected static ArrayList<LigneIndice> _indices;
    private Combinaison _combinaisonSecrete;
    private ArrayList<Combinaison> _combinaisonsJoueur;
    private int numTentative;
    protected static Combinaison _combinaisonsJoueurTest;
    private LigneIndice ligneIndice;

    public Manche() {
        this._indices = new ArrayList<LigneIndice>();
        this._combinaisonSecrete = new Combinaison();
        this._combinaisonSecrete.getCombinaisonSecrete();
        this._combinaisonsJoueur = new ArrayList<Combinaison>();
        this.ligneIndice = new LigneIndice();
        _combinaisonsJoueurTest = new Combinaison();
        this.numTentative = 0;
    }

    public void affichageCombinaisonSecrete() {
        System.out.println("Combinaison secrète : " + _combinaisonSecrete.getCombinaisonSecrete());
    }

    public void affichageCombinaisonJoueur() {
        System.out.println("Combinaison joueur : " + _combinaisonsJoueurTest.getCombinaisonJoueur());
    }

    public void affichageIndices() {
        ArrayList<Indice> ligneindice = _combinaisonsJoueurTest
                .verifierCorrespondance(_combinaisonsJoueurTest.getCombinaisonJoueur());
        for (Indice indice : ligneindice) {
            ligneIndice.setIndices(indice);
        }
        String afficheIndice = "Indices : \t [";
        for (Indice indice : ligneindice) {
            afficheIndice += indice + ", ";
        }
        afficheIndice = afficheIndice.substring(0, afficheIndice.length() - 2);
        afficheIndice += "]";
        System.out.println(afficheIndice);
    }

    public boolean estGagne(int nbPionsCombinaison) {
        int NbPositionCouleur = this._indices.get(this.numTentative).getNbPositionCouleur();
        if (NbPositionCouleur == nbPionsCombinaison) {
            return true;
        } else {
            return false;
        }
    }

    public boolean estDepasse(int maxTentatives) {
        if (this.numTentative >= maxTentatives) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verifierFinManche(int maxTentatives, int nbPionsCombinaison) {
        if (this.numTentative == 0) {
            return true;
        } else {
            if (estGagne(nbPionsCombinaison) || estDepasse(maxTentatives)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public void ajouterTentative(Combinaison tentative) {
        this._combinaisonsJoueur.add(tentative);
        this.numTentative++;
    }
}

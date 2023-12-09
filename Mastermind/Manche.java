package Mastermind;

import java.util.ArrayList;

public class Manche {
    protected static ArrayList<LigneIndice> _indices;
    private Combinaison _combinaisonSecrete;
    private ArrayList<Combinaison> _combinaisonJoueur;
    private int numTentative;
    protected Combinaison _combinaisonJoueurTest;

    public Manche() {
        this._indices = new ArrayList<LigneIndice>();
        this._combinaisonSecrete = new Combinaison();
        this._combinaisonSecrete.getCombinaisonSecrete();
        this._combinaisonJoueur = new ArrayList<Combinaison>();
        _combinaisonJoueurTest = new Combinaison();
        this.numTentative = 0;
    }

    public void affichageCombinaisonSecrete() {
        System.out.println("Combinaison secrète : " + _combinaisonSecrete.getCombinaisonSecrete());
    }

    public void affichageCombinaisonJoueur() {
        System.out.println("Combinaison joueur : " + _combinaisonJoueurTest.getCombinaisonJoueur());
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
        this._combinaisonJoueur.add(tentative);
        this.numTentative++;
    }
}

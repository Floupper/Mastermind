package Mastermind;

import java.util.ArrayList;

public class Manche {
    private  ArrayList<LigneIndice> _indices;
    private Combinaison _combinaisonSecrete;
    private ArrayList<Combinaison> _combinaisonsJoueur;
    private int numTentative;
    protected static Combinaison _combinaisonsJoueurTest;
    private LigneIndice _ligneIndice;

    public Manche() {
        this._indices = new ArrayList<LigneIndice>();
        this._combinaisonSecrete = new Combinaison(1);
        this._combinaisonSecrete.getCombinaisonSecrete();
        this._combinaisonsJoueur = new ArrayList<Combinaison>();
        this._ligneIndice = new LigneIndice();
        this._combinaisonsJoueurTest = new Combinaison(0);
        this.numTentative = 0;
    }
    public void setLigneIndice() {
        ArrayList<Indice> ligneindice = _combinaisonsJoueurTest.verifierCorrespondance(_combinaisonsJoueurTest.getCombinaisonJoueur());
        for (Indice indice : ligneindice) {
            _ligneIndice.setIndices(indice);
        }
        this._indices.add(this._ligneIndice);
    }
    public void unsetCombinaisonJoueur() {
        _combinaisonsJoueurTest = new Combinaison(0);
    }
    public void unsetLigneIndice() {
        _ligneIndice = new LigneIndice();
    }
    public void ajouterTentative(Combinaison tentative) {
        /*this._combinaisonsJoueurTest = tentative;*/
        this._combinaisonsJoueur.add(tentative);
        this.numTentative++;
    }
    public ArrayList<LigneIndice> getIndices() {
        return this._indices;
    }
    public ArrayList<Combinaison> getCombinaisonsJoueur() {
        return this._combinaisonsJoueur;
    }
    public int getNumTentative(){
        return this.numTentative;
    }
    public void affichageCombinaisonSecrete() {
        System.out.println("Combinaison secrète : " + _combinaisonSecrete.getCombinaisonSecrete());
    }
    public void affichageCombinaisonJoueur() {
        System.out.println("Combinaison joueur : " + _combinaisonsJoueurTest.getCombinaisonJoueur());
    }
    public void affichageIndices() {
        System.out.println("Indices : " + _indices.get(this.numTentative-1).getIndices());
    }
    public boolean estGagne(int nbPionsCombinaison) {
        int NbPositionCouleur = this._indices.get(this.numTentative-1).getNbPositionCouleur();
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
            return false;
        } else {
            if (estGagne(nbPionsCombinaison) || estDepasse(maxTentatives)) {
                return true;
            } else {
                return false;
            }
        }
    }
}

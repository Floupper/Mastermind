package Mastermind;

import java.util.ArrayList;

public class Manche {
    protected static LigneIndice _indices;
    private Combinaison _combinaisonSecrete;
    // private ArrayList<Combinaison> _combinaisonJoueur;

    public Manche() {
        _combinaisonSecrete = new Combinaison();
        _combinaisonSecrete.genererCombinaisonSecrete();
    }

    public void affichageCombinaisonSecrete() {
        System.out.println("Combinaison secrète : " + _combinaisonSecrete.getCombinaisonSecrete());
    }
}

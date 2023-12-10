package Mastermind;

public class Partie {
    private String joueur;
    private Score _score;
    private StrategyMode mode;
    private Manche _manches;
    protected static int nbManche;
    protected static int nbPionsCombinaison;
    protected static int maxTentatives;
    protected static int nbPions;

    public Partie() {
        this.nbManche = 3;
        this.nbPionsCombinaison = 4;
        this.maxTentatives = 10;
        this.nbPions = 8;
        _score = new Score();
        _manches = new Manche();
    }

    public void setMode(StrategyMode mode) {
        this.mode = mode;
    }

    public void setNbManches(int nbManche) {
        this.nbManche = nbManche;
    }

    public void setNbPionCombinaison(int nbPionsCombinaison) {
        this.nbPionsCombinaison = nbPionsCombinaison;
    }

    public void setMaxTentatives(int maxTentatives) {
        this.maxTentatives = maxTentatives;
    }

    public void setNbPions(int nbPions) {
        this.nbPions = nbPions;
    }

    public StrategyMode getMode() {
        return this.mode;
    }

    public int getNbManches() {
        return this.nbManche;
    }

    public Score getScore() {
        return this._score;
    }
    public int getNbPionCombinaison() {
        return this.nbPionsCombinaison;
    }

    public int getMaxTentatives() {
        return this.maxTentatives;
    }

    public int getNbPions() {
        return this.nbPions;
    }
}

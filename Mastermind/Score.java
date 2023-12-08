package Mastermind;

import java.util.ArrayList;

public class Score {
    private ArrayList<Integer> scoreManches;
    private int scoreTotal;

    public Score()
    {
        this.scoreTotal = 0;
        this.scoreManches = new ArrayList<Integer>();
    }

    public int calculerScoreManche(LigneIndice ligneIndice, StrategyMode mode)
    {
        int score = 0;
        ArrayList<Indice> indices = ligneIndice.getIndices();
        for(Indice indice : indices)
        {
            switch(indice){
                case MAL_PLACE:
                    score += 1;
                    break;
                case BIEN_PLACE:
                    score += 3;
            }
        }
        //ajouter 4 si mode == classique
        this.scoreManches.add(score);
        return score;
    }

    public int calculerScoreTotal()
    {
        int score = 0;
        for(int scoreManche : this.scoreManches)
        {
            score += scoreManche;
        }
        this.scoreTotal = score;
        return score;
    }

    public int getScoreManche(Integer numManche)
    {
        return this.scoreManches.get(numManche);//! si numManche commence à 1
    }

    public ArrayList<Integer> getScoreManches()
    {
        return this.scoreManches;
    }

    public int getScoreTotal()
    {
        return this.scoreTotal;
    }
}
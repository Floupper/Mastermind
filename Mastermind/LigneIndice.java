package Mastermind;

import java.util.ArrayList;

public class LigneIndice {

    // private int _nbPionsBienPlaces;
    // private int _nbPionsMalPlaces;
    private ArrayList<Indice> _indices;

    public LigneIndice() {
        _indices = new ArrayList<Indice>();
    }

    public ArrayList<Indice> getIndices() {
        return _indices;
    }

    public void setIndices(Indice indices) {
        _indices.add(indices);
    }
}

package Mastermind.view;

import Mastermind.model.Combinaison;
import Mastermind.model.Indice;
import Mastermind.model.Partie;

import java.awt.*;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;

public class Facile extends JFrame {
    private JPanel panel;
    private JPanel pnlInfo;
    private JPanel informations;
    private JPanel pions;
    private JPanel tentatives;
    private JPanel tentative;
    private JPanel indices;
    private JLabel rouge;
    private JLabel bleu;
    private JLabel vert;
    private JLabel jaune;
    private JLabel orange;
    private JLabel violet;
    private JLabel blanc;
    private JLabel noir;
    /* private JLabel suppr */
    private int position;
    private Partie partie;
    private JLabel numManche;
    private JLabel numTentative;
    private int nbManche;
    private ArrayList<String> tent = new ArrayList<String>();
    private JLabel scoreTotal;
    public Facile(String nomJoueur, int spnNbMancheValue, int spnPionsCombinaisonValue, int spnNbTentativesValue,
            int spnPionsDifferentValue) {
        // définition de la page
        super("Mastermind");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        System.out.println("coucou");

        this.partie = new Partie();
        partie.setJoueur(nomJoueur);
        partie.setNbManches(spnNbMancheValue);
        partie.setNbPionCombinaison(spnPionsCombinaisonValue);
        partie.setMaxTentatives(spnNbTentativesValue);
        partie.setNbPions(spnPionsDifferentValue);
        this.nbManche = 1;

        informations = setInfo();
        pions = setPions();
        tentative = setTentative();
        tentatives = setTentatives();
        indices = setIndices();


        // définition du panel global
        this.panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(informations, BorderLayout.PAGE_START);
        panel.revalidate();
        panel.add(tentatives, BorderLayout.CENTER);
        panel.revalidate();
        panel.add(indices, BorderLayout.LINE_END);
        panel.revalidate();
        panel.add(pions, BorderLayout.PAGE_END);
        panel.revalidate();
        setContentPane(panel);
        setVisible(true);
    }

    public JPanel setInfo() {
        // définition du panel avec les informations sur le jeu
        this.pnlInfo = new JPanel();
        pnlInfo.setLayout(new GridLayout());
        pnlInfo.add(setJoueur());
        pnlInfo.add(setNumManche());
        pnlInfo.add(setNbTentative());
        pnlInfo.add(setScoreTotal());
        return pnlInfo;
    }

    public JLabel setJoueur() {
        // définition du joueur
        JLabel Joueur = new JLabel();
        Joueur.setText("Joueur : " + partie.getJoueur());
        return Joueur;
    }

    public JLabel setNumManche() {
        // définition du numéro de la manche
        this.numManche = new JLabel();
        this.numManche.setText("Manche n°" + this.nbManche);
        return numManche;
    }

    public JLabel setNbTentative() {
        // défintion du score de la manche
        this.numTentative = new JLabel();
        this.numTentative.setText("tentative n°" + partie.get_manches().getNumTentative());
        return numTentative;
    }

    public JLabel setScoreTotal() {
        // défintion du score total
        this.scoreTotal = new JLabel();
        this.scoreTotal.setText("Score Total : " + partie.getScore().getScoreTotal());
        return this.scoreTotal;
    }

    public JPanel setPions() {
        // définition du panel pour choisir les pions
        JPanel pnlPions = new JPanel();
        pnlPions.setLayout(new FlowLayout());
        pnlPions.setBackground(Color.DARK_GRAY);

        // définition des pions
        rouge = setRouge();
        bleu = setBleu();
        vert = setVert();
        jaune = setJaune();
        orange = setOrange();
        violet = setViolet();
        blanc = setBlanc();
        noir = setNoir();
        MouseListener clique = new MouseListener() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                if (position < partie.getNbPionCombinaison()) {
                    if (e.getSource() == rouge) {
                        tentative.remove(position);
                        tentative.add(setRouge(), position);
                        tentative.revalidate();
                        tent.add("rouge");
                        position++;
                        System.out.println("rouge");
                    }
                    if (e.getSource() == bleu) {
                        tentative.remove(position);
                        tentative.add(setBleu(), position);
                        tentative.revalidate();
                        tent.add("bleu");
                        position++;
                        System.out.println("bleu");
                    }
                    if (e.getSource() == vert) {
                        tentative.remove(position);
                        tentative.add(setVert(), position);
                        tentative.revalidate();
                        tent.add("vert");
                        position++;
                        System.out.println("vert");
                    }
                    if (e.getSource() == jaune) {
                        tentative.remove(position);
                        tentative.add(setJaune(), position);
                        tentative.revalidate();
                        tent.add("jaune");
                        position++;
                        System.out.println("jaune");
                    }
                    if (e.getSource() == orange) {
                        tentative.remove(position);
                        tentative.add(setOrange(), position);
                        tentative.revalidate();
                        tent.add("orange");
                        position++;
                        System.out.println("orange");
                    }
                    if (e.getSource() == violet) {
                        tentative.remove(position);
                        tentative.add(setViolet(), position);
                        tentative.revalidate();
                        tent.add("violet");
                        position++;
                        System.out.println("violet");
                    }
                    if (e.getSource() == blanc) {
                        tentative.remove(position);
                        tentative.add(setBlanc(), position);
                        tentative.revalidate();
                        tent.add("blanc");
                        position++;
                        System.out.println("blanc");
                    }
                    if (e.getSource() == noir) {
                        tentative.remove(position);
                        tentative.add(setNoir(), position);
                        tentative.revalidate();
                        tent.add("noir");
                        position++;
                        System.out.println("noir");
                    }
                }
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub

            }
        };

        // ajout de l'event clique aux pions de choix
        rouge.addMouseListener(clique);
        bleu.addMouseListener(clique);
        vert.addMouseListener(clique);
        jaune.addMouseListener(clique);
        orange.addMouseListener(clique);
        violet.addMouseListener(clique);
        blanc.addMouseListener(clique);
        noir.addMouseListener(clique);

        pnlPions.add(rouge);
        pnlPions.add(bleu);
        pnlPions.add(vert);
        pnlPions.add(jaune);
        pnlPions.add(orange);
        pnlPions.add(violet);
        pnlPions.add(blanc);
        pnlPions.add(noir);

        JButton suppr = new JButton("Supprimer");
        suppr.addActionListener(actionEvent -> {
            for (int i = 0; i < partie.getNbPionCombinaison(); i++) {
                tentative.remove(i);
                tentative.add(setVide(), i);
                tentative.revalidate();
            }
            position = 0;
            tent.clear();
            System.out.println("Supprimer");
        });
        pnlPions.add(suppr);

        JButton valider = new JButton("Valider");
        valider.addActionListener(actionEvent -> {
            //regarde si la ligne est complète
            if (this.tent.size() == partie.getNbPionCombinaison())
            {
                //création de la combinaison
                String comb = "";
                for(String pion : tent)
                {
                    comb += pion + " ";
                }
                partie.get_manches().unsetCombinaisonJoueur();
                partie.get_manches().unsetLigneIndice();
                Combinaison combinaison = new Combinaison(0);
                partie.get_manches()._combinaisonsJoueurTest.addCombinaisonJoueur(comb);
                //ajout de la combinaison et de la ligne d'indice
                partie.get_manches().ajouterTentative(combinaison);
                partie.get_manches().setLigneIndice();

                partie.get_manches().affichageCombinaisonJoueur();
                partie.get_manches().affichageCombinaisonSecrete();
                //regarde si combinaison gagnante
                if(partie.get_manches().verifierFinManche(partie.getMaxTentatives(), partie.getNbPionCombinaison()))
                {
                    partie.getScore().calculerScoreManche(partie.get_manches().get_ligneIndice());
                    partie.getScore().calculerScoreTotal();
                    this.scoreTotal.setText("Score Total : " + partie.getScore().getScoreTotal());
                    this.nbManche++;
                    partie.setManche();
                    if (nbManche > partie.getNbManches())
                    {
                        new EcranFin();
                        dispose();
                    }
                    this.numManche.setText("Manche n°" + this.nbManche);
                    tentative = setTentative();
                    tentatives = setTentatives();
                    indices = setIndices();
                    panel.add(tentatives, BorderLayout.CENTER);
                    panel.revalidate();
                    panel.add(indices, BorderLayout.LINE_END);
                    panel.revalidate();
                    this.numTentative.setText("tentative n°" + partie.get_manches().getNumTentative());
                }
                //sinon ajoute visuel
                else {
                    addTentativePasser();
                    addIndice();
                }
                for (int i = 0; i < partie.getNbPionCombinaison(); i++) {
                    tentative.remove(i);
                    tentative.add(setVide(), i);
                    tentative.revalidate();
                }
                position = 0;
                tent.clear();
                this.numTentative.setText("tentative n°" + partie.get_manches().getNumTentative());
            }
            System.out.println("valider");
        });
        pnlPions.add(valider);

        pnlPions.revalidate();
        pnlPions.setVisible(true);
        return pnlPions;
    }

    // type permet de savoir si c'est le panel pions(0) ou tentatives(1)
    public JLabel setRouge() {
        JLabel rouge = new JLabel();
        rouge.setIcon(
                new ImageIcon(getClass().getClassLoader().getResource("PionsPng/rouge.png")));
        return rouge;
    }

    public JLabel setBleu() {
        JLabel bleu = new JLabel();
        bleu.setIcon(
                new ImageIcon(getClass().getClassLoader().getResource("PionsPng/bleu.png")));
        return bleu;
    }

    public JLabel setVert() {
        JLabel vert = new JLabel();
        vert.setIcon(
                new ImageIcon(getClass().getClassLoader().getResource("PionsPng/vert.png")));
        return vert;
    }

    public JLabel setJaune() {
        JLabel jaune = new JLabel();
        jaune.setIcon(
                new ImageIcon(getClass().getClassLoader().getResource("PionsPng/jaune.png")));
        return jaune;
    }

    public JLabel setOrange() {
        JLabel orange = new JLabel();
        orange.setIcon(
                new ImageIcon(getClass().getClassLoader().getResource("PionsPng/orange.png")));
        return orange;
    }

    public JLabel setViolet() {
        JLabel violet = new JLabel();
        violet.setIcon(
                new ImageIcon(getClass().getClassLoader().getResource("PionsPng/violet.png")));
        return violet;
    }

    public JLabel setBlanc() {
        JLabel blanc = new JLabel();
        blanc.setIcon(
                new ImageIcon(getClass().getClassLoader().getResource("PionsPng/blanc.png")));
        return blanc;
    }

    public JLabel setNoir() {
        JLabel noir = new JLabel();
        noir.setIcon(
                new ImageIcon(getClass().getClassLoader().getResource("PionsPng/noir.png")));
        return noir;
    }

    public JPanel setTentatives() {
        JPanel pnlTentatives = new JPanel();
        pnlTentatives.setLayout(new GridLayout(partie.getMaxTentatives(), 1));
        pnlTentatives.setBorder(BorderFactory.createLineBorder(Color.black));
        pnlTentatives.add(tentative);
        return pnlTentatives;
    }

    public void addTentativePasser() {
        JPanel pnlTentative = new JPanel();
        pnlTentative.setLayout(new GridLayout(1, partie.getNbPionCombinaison()));
        for (int i = 0; i < tent.size(); i++) {
            if (tent.get(i) == "rouge") {
                pnlTentative.add(setRouge());
            }
            if (tent.get(i) == "bleu") {
                pnlTentative.add(setBleu());
            }
            if (tent.get(i) == "vert") {
                pnlTentative.add(setVert());
            }
            if (tent.get(i) == "jaune") {
                pnlTentative.add(setJaune());
            }
            if (tent.get(i) == "orange") {
                pnlTentative.add(setOrange());
            }
            if (tent.get(i) == "violet") {
                pnlTentative.add(setViolet());
            }
            if (tent.get(i) == "blanc") {
                pnlTentative.add(setBlanc());
            }
            if (tent.get(i) == "noir") {
                pnlTentative.add(setNoir());
            }
        }
        tentatives.add(pnlTentative);
    }

    public JPanel setTentative() {
        // définition du panel pour une tentative
        position = 0;
        JPanel tentative = new JPanel();
        tentative.setLayout(new GridLayout(1, partie.getNbPionCombinaison()));
        for (int i = 0; i < partie.getNbPionCombinaison(); i++) {
            tentative.add(setVide());
        }
        return tentative;
    }

    public JLabel setVide() {
        JLabel vide = new JLabel();
        vide.setIcon(
                new ImageIcon(getClass().getClassLoader().getResource("PionsPng/vide.png")));
        return vide;
    }

    public JPanel setIndices() {
        JPanel pnlTentatives = new JPanel();
        pnlTentatives.setLayout(new GridLayout(8, 1));
        pnlTentatives.setBorder(BorderFactory.createLineBorder(Color.black));
        pnlTentatives.add(new JLabel());
        return pnlTentatives;
    }

    public void addIndice() {
        // définition du panel des indices
        JPanel indice = new JPanel();
        indice.setLayout(new GridLayout(1, 0));
        for(Indice indiceValue : partie.get_manches().get_ligneIndice().getIndices())
        {
            switch (indiceValue)
            {
                case BIEN_PLACE:
                    indice.add(new JLabel("Noir "));
                    break;
                case MAL_PLACE:
                    indice.add(new JLabel("Blanc "));
                    break;
                case ABSENT:
                    indice.add(new JLabel("O "));
                    break;
            }
        }
        indices.add(indice);
    }
}
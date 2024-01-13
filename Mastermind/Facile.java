package Mastermind;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Facile extends JFrame {
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
    /*private JLabel suppr*/
    private int position;
    
    public Facile() {
        //définition de la page
        super("Mastermind");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        informations = setInfo();
        pions = setPions();
        tentative = setTentative();
        tentatives = setTentatives();
        indices = setIndices();

        //définition du panel global
        JPanel panel = new JPanel();
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

    public JPanel setInfo()
    {
        //définition du panel avec les informations sur le jeu
        JPanel pnlInfo = new JPanel();
        pnlInfo.setLayout(new GridLayout());
        pnlInfo.add(setJoueur());
        pnlInfo.add(setNumManche());
        pnlInfo.add(setScoreManche());
        pnlInfo.add(setScoreTotal());
        return pnlInfo;
    }
    public JLabel setJoueur()
    {
        //définition du joueur
        JLabel Joueur = new JLabel();
        Joueur.setText("Joueur : macron");
        return Joueur;
    }
    public JLabel setNumManche()
    {
        //définition du numéro de la manche
        JLabel numManche = new JLabel();
        numManche.setText("Manche n°1");
        return numManche;
    }
    public JLabel setScoreManche()
    {
        //défintion du score de la manche
        JLabel scoreManche = new JLabel();
        scoreManche.setText("Score de la manche : 25");
        return scoreManche;
    }
    public JLabel setScoreTotal()
    {
        //défintion du score total
        JLabel scoreTotal = new JLabel();
        scoreTotal.setText("Score Total : 100");
        return scoreTotal;
    }
    public JPanel setPions()
    {
        //définition du panel pour choisir les pions
        JPanel pnlPions = new JPanel();
        pnlPions.setLayout(new FlowLayout());
        pnlPions.setBackground(Color.DARK_GRAY);

        //définition des pions
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
                if (position < 4) {
                    if (e.getSource() == rouge) {
                        tentative.remove(position);
                        tentative.add(setRouge(),position);
                        tentative.revalidate();
                        position++;
                        System.out.println("rouge");
                    }
                    if (e.getSource() == bleu) {
                        tentative.remove(position);
                        tentative.add(setBleu(),position);
                        tentative.revalidate();
                        position++;
                        System.out.println("bleu");
                    }
                    if (e.getSource() == vert) {
                        tentative.remove(position);
                        tentative.add(setVert(),position);
                        tentative.revalidate();
                        position++;
                        System.out.println("vert");
                    }
                    if (e.getSource() == jaune) {
                        tentative.remove(position);
                        tentative.add(setJaune(),position);
                        tentative.revalidate();
                        position++;
                        System.out.println("jaune");
                    }
                    if (e.getSource() == orange) {
                        tentative.remove(position);
                        tentative.add(setOrange(),position);
                        tentative.revalidate();
                        position++;
                        System.out.println("orange");
                    }
                    if (e.getSource() == violet) {
                        tentative.remove(position);
                        tentative.add(setViolet(),position);
                        tentative.revalidate();
                        position++;
                        System.out.println("violet");
                    }
                    if (e.getSource() == blanc) {
                        tentative.remove(position);
                        tentative.add(setBlanc(),position);
                        tentative.revalidate();
                        position++;
                        System.out.println("blanc");
                    }
                    if (e.getSource() == noir) {
                        tentative.remove(position);
                        tentative.add(setNoir(),position);
                        tentative.revalidate();
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

        //ajout de l'event clique aux pions de choix
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
        suppr.addActionListener( actionEvent ->{
            for(int i = 0; i < 4; i++)
            {
                position = 0;
                tentative.remove(i);
                tentative.add(setVide(),i);
                tentative.revalidate();
            }
            System.out.println("Supprimer");
        });
        pnlPions.add(suppr);

        JButton valider = new JButton("Valider");
        valider.addActionListener( actionEvent ->{
            ArrayList<String> tent = new ArrayList<String>();
            tent.add("bleu");
            tent.add("blanc");
            tent.add("rouge");
            tent.add("noir");
            addTentativePasser(tent);
            tentatives.revalidate();
            addIndice();
            System.out.println("valider");
        });
        pnlPions.add(valider);

        pnlPions.revalidate();
        pnlPions.setVisible(true);
        return pnlPions;
    }
    //type permet de savoir si c'est le panel pions(0) ou tentatives(1)
    public JLabel setRouge()
    {
        JLabel rouge = new JLabel();
        rouge.setIcon(
                new ImageIcon("../PionsPng/rouge.png"));
        return rouge;
    }
    public JLabel setBleu()
    {
        JLabel bleu = new JLabel();
        bleu.setIcon(
                new ImageIcon("../PionsPng/bleu.png"));
        return bleu;
    }
    public JLabel setVert()
    {
        JLabel vert = new JLabel();
        vert.setIcon(
                new ImageIcon("../PionsPng/vert.png"));
        return vert;
    }
    public JLabel setJaune()
    {
        JLabel jaune = new JLabel();
        jaune.setIcon(
                new ImageIcon("../PionsPng/jaune.png"));
        return jaune;
    }
    public JLabel setOrange()
    {
        JLabel orange = new JLabel();
        orange.setIcon(
                new ImageIcon("../PionsPng/orange.png"));
        return orange;
    }
    public JLabel setViolet()
    {
        JLabel violet = new JLabel();
        violet.setIcon(
                new ImageIcon("../PionsPng/violet.png"));
        return violet;
    }
    public JLabel setBlanc()
    {
        JLabel blanc = new JLabel();
        blanc.setIcon(
                new ImageIcon("../PionsPng/blanc.png"));
        return blanc;
    }
    public JLabel setNoir()
    {
        JLabel noir = new JLabel();
        noir.setIcon(
                new ImageIcon("../PionsPng/noir.png"));
        return noir;
    }
    public JPanel setTentatives()
    {
        JPanel pnlTentatives = new JPanel();
        pnlTentatives.setLayout(new GridLayout(8, 1));
        pnlTentatives.setBorder(BorderFactory.createLineBorder(Color.black));
        pnlTentatives.add(tentative);
        return pnlTentatives;
    }
    public void addTentativePasser(ArrayList<String> tentative)
    {
        JPanel pnlTentative = new JPanel();
        pnlTentative.setLayout(new GridLayout(1, 8));
        for(int i = 0 ; i < tentative.size(); i++)
        {
            if(tentative.get(0) == "rouge")
            {
                pnlTentative.add(setRouge());
            }
            if(tentative.get(0) == "bleu")
            {
                pnlTentative.add(setBleu());
            }
            if(tentative.get(0) == "vert")
            {
                pnlTentative.add(setVert());
            }
            if(tentative.get(0) == "jaune")
            {
                pnlTentative.add(setJaune());
            }
            if(tentative.get(0) == "orange")
            {
                pnlTentative.add(setOrange());
            }
            if(tentative.get(0) == "violet")
            {
                pnlTentative.add(setViolet());
            }
            if(tentative.get(0) == "blanc")
            {
                pnlTentative.add(setBlanc());
            }
            if(tentative.get(0) == "noir") {
                pnlTentative.add(setNoir());
            }
        }
        tentatives.add(pnlTentative);
    }
    public JPanel setTentative()
    {
        //définition du panel pour une tentative
        position = 0;
        JPanel tentative = new JPanel();
        tentative.setLayout(new GridLayout(1, 8));
        for(int i = 0; i < 4; i++)
        {
            tentative.add(setVide());
        }
        return tentative;
    }
    public JLabel setVide()
    {
        JLabel vide = new JLabel();
        vide.setIcon(
                new ImageIcon("../PionsPng/vide.png"));
        return vide;
    }

    public JPanel setIndices()
    {
        JPanel pnlTentatives = new JPanel();
        pnlTentatives.setLayout(new GridLayout(8, 1));
        pnlTentatives.setBorder(BorderFactory.createLineBorder(Color.black));
        pnlTentatives.add(new JLabel());
        return pnlTentatives;
    }
    public void addIndice()
    {
        //définition du panel des indices
        JPanel indice = new JPanel();
        indice.setLayout(new GridLayout(1, 0));
        indice.add(new JLabel("Indice 1"));
        indice.add(new JLabel("Indice 2"));
        indice.add(new JLabel("Indice 3"));
        indice.add(new JLabel("Indice 4"));
        indices.add(indice);
    }
}
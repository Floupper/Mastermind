package Mastermind;

import java.awt.*;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Facile extends JFrame {
    private JLabel rouge;
    private JLabel bleu;
    private JLabel vert;
    private JLabel jaune;
    private JLabel orange;
    private JLabel violet;
    private JLabel blanc;
    private JLabel noir;
    private JLabel scoreTotal;
    private JLabel scoreManche;
    private JLabel numManche;
    private JLabel Joueur;
    private JButton valider;

    public Facile() {
        super("Mastermind");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        rouge = new JLabel();
        rouge.setIcon(
                new ImageIcon("./PionsPng/rouge.png"));

        bleu = new JLabel();
        bleu.setIcon(
                new ImageIcon("./PionsPng/bleu.png"));

        vert = new JLabel();
        vert.setIcon(
                new ImageIcon("./PionsPng/vert.png"));

        jaune = new JLabel();
        jaune.setIcon(
                new ImageIcon("./PionsPng/jaune.png"));

        orange = new JLabel();
        orange.setIcon(
                new ImageIcon("./PionsPng/orange.png"));

        violet = new JLabel();
        violet.setIcon(
                new ImageIcon("./PionsPng/violet.png"));

        blanc = new JLabel();
        blanc.setIcon(
                new ImageIcon("./PionsPng/blanc.png"));

        noir = new JLabel();
        noir.setIcon(
                new ImageIcon("./PionsPng/noir.png"));

        scoreManche = new JLabel();
        scoreManche.setText("Score de la manche : 25");

        scoreTotal = new JLabel();
        scoreTotal.setText("Score Total : 100");

        Joueur = new JLabel();
        Joueur.setText("Joueur : Macron");

        numManche = new JLabel();
        numManche.setText("Manche n°1");

        JPanel informations = new JPanel();
        informations.setLayout(new GridLayout());
        informations.add(Joueur);
        informations.add(numManche);
        informations.add(scoreManche);
        informations.add(scoreTotal);

        JPanel pions = new JPanel();
        pions.setLayout(new FlowLayout());
        pions.setBackground(Color.DARK_GRAY);
        pions.add(rouge);
        pions.revalidate();
        pions.add(bleu);
        pions.revalidate();
        pions.add(vert);
        pions.revalidate();
        pions.add(jaune);
        pions.revalidate();
        pions.add(orange);
        pions.revalidate();
        pions.add(violet);
        pions.revalidate();
        pions.add(blanc);
        pions.revalidate();
        pions.add(noir);
        pions.revalidate();
        valider = new JButton();
        valider.setText("Valider");
        pions.add(valider);

        JPanel indices = new JPanel();
        indices.setLayout(new GridLayout(1, 0));
        indices.setBorder(BorderFactory.createLineBorder(Color.black));

        JPanel tentatives = new JPanel();
        tentatives.setLayout(new GridLayout(1, 8));
        tentatives.setBorder(BorderFactory.createLineBorder(Color.black));

        MouseListener clique = new MouseListener() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                if (e.getSource() == rouge) {
                    tentatives.add(rouge);
                    tentatives.revalidate();
                    System.out.println("rouge");

                }
                if (e.getSource() == bleu) {
                    tentatives.add(bleu);
                    tentatives.revalidate();
                    System.out.println("bleu");
                }
                if (e.getSource() == vert) {
                    tentatives.add(vert);
                    tentatives.revalidate();
                    System.out.println("vert");
                }
                if (e.getSource() == jaune) {
                    tentatives.add(jaune);
                    tentatives.revalidate();
                    System.out.println("jaune");
                }
                if (e.getSource() == orange) {
                    tentatives.add(orange);
                    tentatives.revalidate();
                    System.out.println("orange");
                }
                if (e.getSource() == violet) {
                    tentatives.add(violet);
                    tentatives.revalidate();
                    System.out.println("violet");
                }
                if (e.getSource() == blanc) {
                    tentatives.add(blanc);
                    tentatives.revalidate();
                    System.out.println("blanc");
                }
                if (e.getSource() == noir) {
                    tentatives.add(noir);
                    tentatives.revalidate();
                    System.out.println("noir");
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

        rouge.addMouseListener(clique);
        bleu.addMouseListener(clique);
        vert.addMouseListener(clique);
        jaune.addMouseListener(clique);
        orange.addMouseListener(clique);
        violet.addMouseListener(clique);
        blanc.addMouseListener(clique);
        noir.addMouseListener(clique);

        // A SUPPRIMER (tests AFFICHAGE)
        indices.add(new JLabel("Indice 1"));
        indices.add(new JLabel("Indice 2"));
        indices.add(new JLabel("Indice 3"));
        indices.add(new JLabel("Indice 4"));

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
}
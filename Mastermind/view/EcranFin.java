package Mastermind.view;

import Mastermind.controller.EcranParametres;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EcranFin extends JFrame {
    JPanel panelWin = new JPanel();
    JPanel panelLoose = new JPanel();
    JButton rejouer;

    public EcranFin() {
        // définition de la page
        super("ACKERMANN HARTZ - Mastermind");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setResizable(false);

        affichageWin();

        // affichage de la page de base
        setVisible(true);
    }

    public void affichageWin() {
        // affichage de la page de victoire
        JLabel lblWin = new JLabel("Vous avez gagné !");
        panelWin.add(lblWin);
        // boutton pour rejouer
        rejouer = new JButton("Rejouer");
        rejouer.addActionListener(e -> {
            new EcranParametres();
            dispose();
        });
        panelWin.add(rejouer);
        setContentPane(panelWin);
    }

    public void affichageLoose() {
        // affichage de la page de défaite
        JLabel lblLoose = new JLabel("Vous avez perdu !");
        panelLoose.add(lblLoose);
        // boutton pour rejouer
        rejouer = new JButton("Rejouer");
        rejouer.addActionListener(e -> {
            new EcranParametres();
            dispose();
        });
        panelLoose.add(rejouer);
        setContentPane(panelLoose);
    }
}

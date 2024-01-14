package Mastermind.view;

import Mastermind.controller.EcranParametres;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EcranDemarrage extends JFrame {
    private JButton btnJouer;
    private JButton btnCredits;
    private JPanel panelBoutonsMenu;
    private JPanel menu;
    private JLabel lblTitre;

    public EcranDemarrage() {
        // définition de la page
        super("ACKERMANN HARTZ - Mastermind");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setResizable(false);

        // boutton pour jouer
        btnJouer = new JButton();
        btnJouer.setAlignmentX(CENTER_ALIGNMENT);
        btnJouer.setPreferredSize(new Dimension(500, 30));
        btnJouer.setText("Jouer");
        btnJouer.addActionListener(e -> {
            new EcranParametres();
            dispose();
        });

        // boutton pour voir les crédits
        btnCredits = new JButton();
        btnCredits.setAlignmentX(CENTER_ALIGNMENT);
        btnCredits.setAlignmentY(CENTER_ALIGNMENT);
        btnCredits.setPreferredSize(new Dimension(500, 30));
        btnCredits.setText("Crédits");
        btnCredits.addActionListener(e -> {

        });

        // titre
        lblTitre = new JLabel("Mastermind");
        lblTitre.setAlignmentX(CENTER_ALIGNMENT);
        lblTitre.setAlignmentY(CENTER_ALIGNMENT);
        lblTitre.setFont(lblTitre.getFont().deriveFont(64.0f));
        lblTitre.setPreferredSize(new Dimension(1000, 200));

        JLabel presentation = new JLabel();
        presentation.setAlignmentX(CENTER_ALIGNMENT);
        presentation.setAlignmentY(CENTER_ALIGNMENT);
        presentation.setText(
                "<html>Bienvenue sur le jeu du Mastermind ! <br> Le but du jeu est de trouver la combinaison secrète de l'ordinateur. <br> Pour cela, vous devez proposer une combinaison de pions de couleurs différentes. <br>  L'ordinateur vous indiquera ensuite le nombre de pions bien placés et le nombre de pions mal placés. <br> Vous avez 10 tentatives pour trouver la combinaison secrète. <br> Bonne chance !</html>");
        presentation.setPreferredSize(new Dimension(1000, 200));

        panelBoutonsMenu = new JPanel();
        panelBoutonsMenu.setLayout(new BoxLayout(panelBoutonsMenu, BoxLayout.Y_AXIS));
        panelBoutonsMenu.add(btnJouer);
        panelBoutonsMenu.add(Box.createVerticalStrut(10));
        panelBoutonsMenu.add(btnCredits);

        // page du menu
        menu = new JPanel();
        menu.setLayout(new BoxLayout(menu, BoxLayout.Y_AXIS));
        menu.add(lblTitre);
        menu.add(presentation);
        menu.add(panelBoutonsMenu);

        // affichage de la page de base
        setContentPane(menu);
        setVisible(true);
    }
}

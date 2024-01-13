package Mastermind;

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
    private JPanel menu;
    public EcranDemarrage() {
        //définition de la page
        super("ACKERMANN HARTZ - Mastermind");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setResizable(false);

        //boutton pour jouer
        btnJouer = new JButton("Jouer");
        btnJouer.addActionListener(e -> {
            new WindowSettings();
            dispose();
        });

        //boutton pour voir les crédits
        btnCredits = new JButton("Crédits");
        btnCredits.addActionListener(e -> {

        });

        //page du menu
        menu = new JPanel();
        menu.setLayout(new BoxLayout(menu, BoxLayout.Y_AXIS));
        menu.add(Box.createVerticalGlue());
        menu.add(Box.createHorizontalGlue());

        menu.add(btnJouer);
        menu.add(btnCredits);
        menu.add(Box.createHorizontalGlue());
        menu.add(Box.createVerticalGlue());

        //affichage de la page de base
        setContentPane(menu);
        setVisible(true);
    }
}

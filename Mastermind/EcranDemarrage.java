package Mastermind;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EcranDemarrage extends JFrame {
    private JButton lancerJouer;
    private JButton lancerCredits;
    private JPanel menu;
    private JPanel jouer;
    private JPanel credits;

    public EcranDemarrage() {
        super("ACKERMANN HARTZ - Mastermind");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setResizable(false);

        jouer = new JPanel();
        JLabel test = new JLabel("Ceci lancera l'affichage du menu des paramètres");
        jouer.setPreferredSize(new Dimension(600, 200));
        jouer.add(test);
        jouer.setVisible(false);

        credits = new JPanel();
        JLabel test2 = new JLabel("Ceci lancera l'affichage des crédits");
        credits.setPreferredSize(new Dimension(600, 200));
        credits.add(test2);
        credits.setVisible(false);

        lancerJouer = new JButton("Jouer");
        lancerJouer.addActionListener(e -> {
            menu.setVisible(false);
            jouer.setVisible(true);
        });

        lancerCredits = new JButton("Crédits");
        lancerCredits.addActionListener(e -> {
            menu.setVisible(false);
            credits.setVisible(true);
        });

        menu = new JPanel();
        menu.setLayout(new BoxLayout(menu, BoxLayout.Y_AXIS));
        menu.add(Box.createVerticalGlue());
        menu.add(Box.createHorizontalGlue());
        menu.add(lancerJouer);
        menu.add(lancerCredits);
        menu.add(Box.createHorizontalGlue());
        menu.add(Box.createVerticalGlue());

        setContentPane(menu);
        setVisible(true);
    }
}

package Mastermind.controller;

import Mastermind.view.Classique;
import Mastermind.view.Facile;
import Mastermind.view.Numerique;

import javax.swing.*;

public class EcranParametres extends JFrame {
    // Pour transmettre la valeur de chaque paramètres choisis par l'utilisateur
    private int spnNbMancheValue;
    private int spnPionsCombinaisonValue;
    private int spnNbTentativesValue;
    private int spnPionsDifferentValue;
    private String nomJoueur;

    JSpinner spnNbManche;
    JSpinner spnPionsCombinaison;
    JSpinner spnNbTentatives;
    JSpinner spnPionsDifferent;
    JComboBox cbxMode;
    JTextField txtNom;

    public EcranParametres() {
        // définition de la page
        super("ACKERMANN HARTZ - Mastermind");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setResizable(false);

        // définition des éléments de la page
        JLabel lblNbManche = new JLabel("Nombre de manche");
        SpinnerModel smdNbManche = new SpinnerNumberModel(3, 1, 5, 1);
        spnNbManche = new JSpinner(smdNbManche);

        JLabel lblPionsCombinaison = new JLabel("Nombre de pions par combinaison");
        SpinnerModel smdPionsCombinaison = new SpinnerNumberModel(4, 2, 6, 1);
        spnPionsCombinaison = new JSpinner(smdPionsCombinaison);

        JLabel lblNbTentatives = new JLabel("Nombre de tentatives par manche");
        SpinnerModel smdNbTentatives = new SpinnerNumberModel(10, 2, 12, 1);
        spnNbTentatives = new JSpinner(smdNbTentatives);

        JLabel lblPionsDifferent = new JLabel("Nombre de pions possible par combinaison");
        SpinnerModel smdPionsDifferent = new SpinnerNumberModel(8, 4, 8, 1);
        spnPionsDifferent = new JSpinner(smdPionsDifferent);

        String[] Mode = {"Facile","Classique","Numerique"};
        JComboBox cbxMode = new JComboBox(Mode);


        JLabel lblNom = new JLabel("entrez votre nom");
        txtNom = new JTextField();

        JButton btnValider = new JButton("valider");
        btnValider.addActionListener(e -> {
            System.out.println("Nombre de manche : " + spnNbManche.getValue());
            System.out.println("Nombre de pions par combinaison : " + spnPionsCombinaison.getValue());
            System.out.println("Nombre de tentatives par manche : " + spnNbTentatives.getValue());
            System.out.println("Nombre de pions possible par combinaison : " + spnPionsDifferent.getValue());
            System.out.println("Nom : " + txtNom.getText());
            spnNbMancheValue = (int) spnNbManche.getValue();
            spnPionsCombinaisonValue = (int) spnPionsCombinaison.getValue();
            spnNbTentativesValue = (int) spnNbTentatives.getValue();
            spnPionsDifferentValue = (int) spnPionsDifferent.getValue();
            nomJoueur = txtNom.getText();
            switch(cbxMode.getSelectedItem().toString())
            {
                case "Facile":
                    new Facile(nomJoueur, spnNbMancheValue, spnPionsCombinaisonValue, spnNbTentativesValue,
                            spnPionsDifferentValue);
                    break;
                case "Classique":
                    new Classique(nomJoueur, spnNbMancheValue, spnPionsCombinaisonValue, spnNbTentativesValue,
                            spnPionsDifferentValue);
                    break;
                case "Numerique":
                    new Numerique(nomJoueur, spnNbMancheValue, spnPionsCombinaisonValue, spnNbTentativesValue,
                            spnPionsDifferentValue);
                    break;
            }
            dispose();
        });
        btnValider.setAlignmentX(CENTER_ALIGNMENT);
        btnValider.setAlignmentY(CENTER_ALIGNMENT);

        // panel global
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(lblNbManche);
        panel.add(spnNbManche);
        panel.add(lblPionsCombinaison);
        panel.add(spnPionsCombinaison);
        panel.add(lblNbTentatives);
        panel.add(spnNbTentatives);
        panel.add(lblPionsDifferent);
        panel.add(spnPionsDifferent);
        panel.add(cbxMode);
        panel.add(lblNom);
        panel.add(txtNom);
        panel.add(btnValider);

        setContentPane(panel);
        setVisible(true);
    }
}

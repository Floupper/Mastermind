package Mastermind;

import javax.swing.*;

public class WindowSettings extends JFrame {
    public WindowSettings()
    {
        //définition de la page
        super("ACKERMANN HARTZ - Mastermind");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setResizable(false);

        //définition des éléments de la page
        JLabel lblNbManche = new JLabel("Nombre de manche");
        SpinnerModel smdNbManche = new SpinnerNumberModel(3,3,5,1);
        JSpinner spnNbManche = new JSpinner(smdNbManche);

        JLabel lblPionsCombinaison = new JLabel("Nombre de pions par combinaison");
        SpinnerModel smdPionsCombinaison = new SpinnerNumberModel(4,4,6,1);
        JSpinner spnPionsCombinaison = new JSpinner(smdPionsCombinaison);

        JLabel lblNbTentatives = new JLabel("Nombre de tentatives par manche");
        SpinnerModel smdNbTentatives = new SpinnerNumberModel(10,10,12,1);
        JSpinner spnNbTentatives = new JSpinner(smdNbTentatives);

        JLabel lblPionsDifferent = new JLabel("Nombre de pions possible par combinaison");
        SpinnerModel smdPionsDifferent = new SpinnerNumberModel(8,4,8,1);
        JSpinner spnPionsDifferent = new JSpinner(smdPionsDifferent);

        JLabel lblNom = new JLabel("entrez votre nom");
        JTextField txtNom = new JTextField();

        JButton btnValider = new JButton("valider");
        btnValider.addActionListener(e -> {
            new Facile();
            dispose();
        });
        btnValider.setAlignmentX(CENTER_ALIGNMENT);
        btnValider.setAlignmentY(CENTER_ALIGNMENT);

        //panel global
        JPanel panel = new JPanel();
        panel.setLayout( new BoxLayout(panel,BoxLayout.Y_AXIS));

        panel.add(lblNbManche);
        panel.add(spnNbManche);
        panel.add(lblPionsCombinaison);
        panel.add(spnPionsCombinaison);
        panel.add(lblNbTentatives);
        panel.add(spnNbTentatives);
        panel.add(lblPionsDifferent);
        panel.add(spnPionsDifferent);
        panel.add(lblNom);
        panel.add(txtNom);
        panel.add(btnValider);

        setContentPane(panel);
        setVisible(true);
    }
}

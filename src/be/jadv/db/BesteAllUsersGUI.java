package be.jadv.db;

import javax.swing.*;

public class BesteAllUsersGUI {
    private JPanel pnlMain;
    private JLabel lblTitel;
    private JTextPane hereTheUsersWillTextPane;
    private JButton btnFetchUsers;

    public static void main(String[] args) {

        JFrame frame = new JFrame("BesteAllUsersGUI");
        frame.setContentPane(new BesteAllUsersGUI().pnlMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

package org.endorodrigo;

import javax.swing.*;

public class forma extends JFrame{
    private JLabel panel1;

    public forma(){
        inicializarForna();
    }

    private void inicializarForna() {
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null); //centra la ventana
    }

    public static void main(String[] args) {
        forma frame = new forma();
        frame.setVisible(true);
    }
}

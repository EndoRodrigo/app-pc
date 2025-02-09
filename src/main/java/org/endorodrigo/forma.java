package org.endorodrigo;

import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class forma extends JFrame{
    private JLabel panel1;
    private JPanel panelPrincipal;
    private JTextField campoTexto;
    private JPanel Jp;
    private JLabel replicardor;

    public forma(){
        inicializarForna();
 /*       campoTexto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                replicarTexto();
            }
        });*/
        campoTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                replicarTexto();
            }
        });
    }

    private void replicarTexto() {
       replicardor.setText(campoTexto.getText());
    }

    private void inicializarForna() {
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null); //centra la ventana
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup();
        forma frame = new forma();
        frame.setVisible(true);
    }
}

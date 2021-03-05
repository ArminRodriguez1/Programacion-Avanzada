/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.BorderLayout;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author arodr
 */
public class VentanaMostrarCarta extends JFrame{
     private MostrarCartas panel;

    public VentanaMostrarCarta() throws InterruptedException, IOException {
        JPanel panelSur = new JPanel();
        JButton boton = new JButton("Aceptar");
        this.setTitle("nel pastel");
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.panel = new MostrarCartas();
        JScrollPane scroll = new JScrollPane(this.panel);
        panelSur.add(boton);
        this.setLayout(new BorderLayout());
        this.add(scroll, BorderLayout.CENTER);
        this.add(panelSur, BorderLayout.SOUTH);
        this.setVisible(true);
    }
}

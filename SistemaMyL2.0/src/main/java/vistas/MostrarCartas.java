/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author arodr
 */
public class MostrarCartas extends JPanel{
     private JLabel icon;
    private Image img;

    public MostrarCartas() throws IOException {
        this.setPreferredSize(new Dimension(1000, 4300));
        this.setLayout(new GridLayout(15, 4));
        for (int i = 1; i <= 60; i++) {
            Image img;
            File file = new File("Dato\\" + i + ".png");
            img = ImageIO.read(file);
            Image newImage = img.getScaledInstance(150, 200, java.awt.Image.SCALE_SMOOTH);
            this.icon = new JLabel(new ImageIcon(newImage));
            this.add(icon);

            System.out.println("IMG AGREGADA");

            System.out.println("VA EN LA IMAGEN " + i);
        }
    }
}

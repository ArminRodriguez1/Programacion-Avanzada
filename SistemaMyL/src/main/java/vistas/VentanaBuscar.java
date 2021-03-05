/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.Filtrado;
import modelo.Edicion;
import modelo.Rareza;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author arodr
 */
public class VentanaBuscar extends JFrame implements ActionListener {

    private JPanel paneliz, panelde, panelab, panelar, panelex;
    private JLabel nombre, coste, precio, rareza, edicion;
    private JTextField txtNombre;
    private JComboBox<Rareza> rarezaOpc;
    private JComboBox<Edicion> edicionOpc;
    private JComboBox<Integer> costeOpc;
    private JComboBox precioOpc;
    private JButton btnBuscar, btnCancelar;
    private Filtrado f = new Filtrado();

    public VentanaBuscar() {
        paneliz = new JPanel();
        panelde = new JPanel();
        panelab = new JPanel();
        panelar = new JPanel();
        panelex = new JPanel();
        nombre = new JLabel();
        coste = new JLabel();
        precio = new JLabel();
        rareza = new JLabel();
        edicion = new JLabel();
        txtNombre = new JTextField();
        rarezaOpc = new JComboBox();
        this.edicionOpc = new JComboBox<>();
        edicionOpc.setModel(new DefaultComboBoxModel<>(Edicion.values()));
        String[] ComboBox = {"", "0-500", "500-1.000", "1.000-5.000", "5.000-10.000", "10.000 o más"};
        this.precioOpc = new JComboBox(ComboBox);
        Integer[] ComboBoxCoste = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8};
        this.costeOpc = new JComboBox<>(ComboBoxCoste);
        this.rarezaOpc = new JComboBox<>();
        this.rarezaOpc.setModel(new DefaultComboBoxModel<>(Rareza.values()));

        btnBuscar = new JButton();
        btnCancelar = new JButton();

        this.setTitle("Buscar Carta");
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(350, 270);

        nombre.setText("Nombre");
        coste.setText("Coste (oro carta)");
        precio.setText("Precio ($)");
        rareza.setText("Rareza");
        edicion.setText("Edicion");

        btnBuscar.setText("Buscar");
        btnCancelar.setText("Cancelar");
        this.btnBuscar.addActionListener(this);
        paneliz.setLayout(new GridLayout(5, 0));
        paneliz.add(nombre);
        paneliz.add(precio);
        paneliz.add(coste);
        paneliz.add(rareza);
        paneliz.add(edicion);

        panelde.setLayout(new GridLayout(5, 0));
        panelde.add(txtNombre);
        panelde.add(precioOpc);
        panelde.add(costeOpc);
        panelde.add(rarezaOpc);
        panelde.add(edicionOpc);

        panelar.setLayout(new GridLayout(1, 1));
        panelar.setPreferredSize(new Dimension(250, 100));
        panelar.add(paneliz);
        panelar.add(panelde);

        panelab.setLayout(new FlowLayout());
        panelab.setPreferredSize(new Dimension(200, 50));
        panelab.add(btnBuscar);
        panelab.add(btnCancelar);

        panelex.setLayout(new GridLayout(2, 0));
        panelex.add(panelar);
        panelex.add(panelab);

        this.add(panelex);
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String precio = (String) this.precioOpc.getSelectedItem();
        int coste = (Integer) this.costeOpc.getSelectedItem();
        Edicion edicion = (Edicion) this.edicionOpc.getSelectedItem();
        Rareza rareza = (Rareza) this.rarezaOpc.getSelectedItem();
        String nombre = this.txtNombre.getText();
        if (e.getSource() == this.btnBuscar) {
            if (nombre!="") {
                this.f.filtrarPorNombre(nombre);
            }

        }
    }

}

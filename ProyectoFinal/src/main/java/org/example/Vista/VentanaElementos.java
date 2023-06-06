package org.example.Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaElementos extends JFrame {
    private JLabel lblId;
    private JLabel lblGrupo;
    private JLabel lblNombre;
    private JLabel lblBloque;
    private JLabel lblTipo;
    private JLabel lblUrl;
    private JTextField txtId;
    private JTextField txtGrupo;
    private JTextField txtNombre;
    private JTextField txtBloque;
    private JTextField txtTipo;
    private JTextField txtUrl;
    private JButton btnAgregar;
    private JButton btnCargar;
    private JButton btnEliminar;
    private JButton btnActualizar;
    private JTable tblElemento;
    private JScrollPane scrollPane;
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JLabel imagenElemento;

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblGrupo() {
        return lblGrupo;
    }

    public void setLblGrupo(JLabel lblGrupo) {
        this.lblGrupo = lblGrupo;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblBloque() {
        return lblBloque;
    }

    public void setLblBloque(JLabel lblBloque) {
        this.lblBloque = lblBloque;
    }

    public JLabel getLblTipo() {
        return lblTipo;
    }

    public void setLblTipo(JLabel lblTipo) {
        this.lblTipo = lblTipo;
    }

    public JLabel getLblUrl() {
        return lblUrl;
    }

    public void setLblUrl(JLabel lblUrl) {
        this.lblUrl = lblUrl;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtGrupo() {
        return txtGrupo;
    }

    public void setTxtGrupo(JTextField txtGrupo) {
        this.txtGrupo = txtGrupo;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtBloque() {
        return txtBloque;
    }

    public void setTxtBloque(JTextField txtBloque) {
        this.txtBloque = txtBloque;
    }

    public JTextField getTxtTipo() {
        return txtTipo;
    }

    public void setTxtTipo(JTextField txtTipo) {
        this.txtTipo = txtTipo;
    }

    public JTextField getTxtUrl() {
        return txtUrl;
    }

    public void setTxtUrl(JTextField txtUrl) {
        this.txtUrl = txtUrl;
    }


    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JTable getTblElemento() {
        return tblElemento;
    }

    public void setTblElemento(JTable tblElemento) {
        this.tblElemento = tblElemento;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JLabel getImagenElemento() {
        return imagenElemento;
    }

    public void setImagenElemento(JLabel imagenElemento) {
        this.imagenElemento = imagenElemento;
    }

    public void limpiar(){
        txtGrupo.setText("");
        txtNombre.setText("");
        txtBloque.setText("");
        txtTipo.setText("");
        txtUrl.setText("");
    }

    public VentanaElementos(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 800);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //Panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(239,200,200));
        lblId = new JLabel("Id: ");
        lblGrupo = new JLabel("Grupo: ");
        lblNombre = new JLabel("Nombre:");
        lblBloque = new JLabel("Bloque: ");
        lblTipo = new JLabel("Tipo: ");
        lblUrl = new JLabel("Url: ");
        txtId = new JTextField(3);
        txtId.setText("0");
        txtId.setEnabled(false);
        txtGrupo = new JTextField(15);
        txtNombre = new JTextField(15);
        txtBloque = new JTextField(15);
        txtTipo = new JTextField(15);
        txtUrl = new JTextField(15);
        btnAgregar = new JButton("Agregar");
        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblGrupo);
        panel1.add(txtGrupo);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        panel1.add(lblTipo);
        panel1.add(txtTipo);
        panel1.add(lblBloque);
        panel1.add(txtBloque);
        panel1.add(lblUrl);
        panel1.add(txtUrl);
        panel1.add(btnAgregar);

        //panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(141, 197, 103));
        btnCargar = new JButton("Cargar");
        panel2.add(btnCargar);
        tblElemento = new JTable();
        scrollPane = new JScrollPane(tblElemento);
        panel2.add(scrollPane);

        //panel3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(57, 68, 166));
        imagenElemento = new JLabel("...");
        panel3.add(imagenElemento);

        //panel4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(80, 60, 126));
        panel4.setLayout(new FlowLayout());
        btnEliminar = new JButton("Eliminar");
        panel4.add(btnEliminar);
        btnActualizar = new JButton("Actualizar");
        panel4.add(btnActualizar);

        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }

}
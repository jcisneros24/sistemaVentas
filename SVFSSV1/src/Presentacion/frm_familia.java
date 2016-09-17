package Presentacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Datos.BD;
import Datos.d_familias;
import Logica.c_familias;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class frm_familia extends javax.swing.JFrame {
       DefaultTableModel modeloTabla;
       Connection cnn = BD.getConnection();  
       PreparedStatement ps = null;
    public frm_familia() {
        modeloTabla=new DefaultTableModel(null,getColumnas());
        Filas();
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel2.setBounds(0, 40, 430, 341);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setBounds(20, 30, 120, 30);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setBounds(50, 80, 70, 14);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(50, 120, 70, 14);
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setBounds(50, 160, 70, 14);
        txtbuscar = new javax.swing.JTextField();
        txtbuscar.setBounds(120, 30, 110, 30);
        txtcodigofam = new javax.swing.JTextField();
        txtcodigofam.setBounds(120, 70, 240, 30);
        txthija = new javax.swing.JTextField();
        txthija.setBounds(120, 110, 240, 30);
        txtmadre = new javax.swing.JTextField();
        txtmadre.setBounds(120, 150, 240, 30);
        btnagregar = new javax.swing.JButton();
        btnagregar.setIcon(new ImageIcon(frm_familia.class.getResource("/img/save.png")));
        btnagregar.setBounds(90, 207, 80, 40);
        btnnuevo = new javax.swing.JButton();
        btnnuevo.setIcon(new ImageIcon(frm_familia.class.getResource("/img/plus.png")));
        btnnuevo.setBounds(10, 207, 80, 40);
        btncancelar = new javax.swing.JButton();
        btncancelar.setIcon(new ImageIcon(frm_familia.class.getResource("/img/no.png")));
        btncancelar.setBounds(170, 207, 80, 40);
        btnbuscar = new javax.swing.JButton();
        btnbuscar.setIcon(new ImageIcon(frm_familia.class.getResource("/img/edit_find.png")));
        btnbuscar.setBounds(240, 20, 50, 40);
        btneditar = new javax.swing.JButton();
        btneditar.setIcon(new ImageIcon(frm_familia.class.getResource("/img/pencil3.png")));
        btneditar.setBounds(250, 207, 80, 40);
        btneliminar = new javax.swing.JButton();
        btneliminar.setIcon(new ImageIcon(frm_familia.class.getResource("/img/gnome_edit_delete.png")));
        btneliminar.setBounds(330, 207, 80, 40);
        btncerrarventana = new javax.swing.JButton();
        btncerrarventana.setIcon(new ImageIcon(frm_familia.class.getResource("/img/cancel2.png")));
        btncerrarventana.setBounds(10, 250, 400, 40);
        jPanel3 = new javax.swing.JPanel();
        jPanel3.setBounds(440, 40, 509, 341);
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFamilias = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBounds(0, 0, 951, 35);
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setText("Mantenimiento Familias");
        jLabel1.setBounds(322, 0, 315, 35);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jPanel4ComponentAdded(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulario de Registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 14), java.awt.Color.darkGray)); // NOI18N
        jPanel2.setForeground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(null);

        jLabel2.setText("Buscar familia:");
        jPanel2.add(jLabel2);

        jLabel3.setText("Codigo:");
        jPanel2.add(jLabel3);

        jLabel4.setText("Categoria:");
        jPanel2.add(jLabel4);

        jLabel6.setText("Marca:");
        jPanel2.add(jLabel6);
        jPanel2.add(txtbuscar);

        txtcodigofam.setEnabled(false);
        jPanel2.add(txtcodigofam);

        txthija.setEnabled(false);
        jPanel2.add(txthija);

        txtmadre.setEnabled(false);
        jPanel2.add(txtmadre);
        btnagregar.setEnabled(false);
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnagregar);
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btnnuevo);
        btncancelar.setEnabled(false);
        btncancelar.setMaximumSize(new java.awt.Dimension(80, 20));
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btncancelar);
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnbuscar);
        btneditar.setEnabled(false);
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });
        jPanel2.add(btneditar);
        btneliminar.setDoubleBuffered(true);
        btneliminar.setEnabled(false);
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btneliminar);
        btncerrarventana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarventanaActionPerformed(evt);
            }
        });
        jPanel4.setLayout(null);
        jPanel2.add(btncerrarventana);

        jPanel4.add(jPanel2);
        
        txtidfam = new JTextField();
        txtidfam.setVisible(false);
        txtidfam.setEditable(false);
        txtidfam.setEnabled(false);
        txtidfam.setBounds(370, 57, 33, 20);
        jPanel2.add(txtidfam);
        txtidfam.setColumns(10);
        
        msjcodigo = new JLabel("*");
        msjcodigo.setVisible(false);
        msjcodigo.setForeground(Color.RED);
        msjcodigo.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjcodigo.setBounds(370, 80, 46, 14);
        jPanel2.add(msjcodigo);
        
        msjcategoria = new JLabel("*");
        msjcategoria.setForeground(Color.RED);
        msjcategoria.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjcategoria.setVisible(false);
        msjcategoria.setBounds(370, 120, 46, 14);
        jPanel2.add(msjcategoria);
        
        msjmarca = new JLabel("*");
        msjmarca.setVisible(false);
        msjmarca.setForeground(Color.RED);
        msjmarca.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjmarca.setBounds(370, 160, 46, 14);
        jPanel2.add(msjmarca);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Lista de Familias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        tableFamilias.setModel(modeloTabla);
        jScrollPane1.setViewportView(tableFamilias);
        if (tableFamilias.getColumnModel().getColumnCount() > 0) {
        	tableFamilias.getColumnModel().getColumn(0).setHeaderValue("Codigo");
        	tableFamilias.getColumnModel().getColumn(1).setHeaderValue("Categoria");
        	tableFamilias.getColumnModel().getColumn(2).setHeaderValue("Marca");
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 498, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(273, Short.MAX_VALUE))
        );
        jPanel3.setLayout(jPanel3Layout);

        jPanel4.add(jPanel3);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setForeground(new java.awt.Color(0, 51, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel1);

        jPanel4.add(jPanel1);
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 950, GroupLayout.PREFERRED_SIZE)
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 389, GroupLayout.PREFERRED_SIZE)
        );
        getContentPane().setLayout(groupLayout);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private String[] getColumnas(){
        String  columna[]=new String[]{"Codigo","Categoria","Marca"};
        return columna;
    }
    private void Filas(){
    try{
        for(c_familias fam : d_familias.mostrarFamilias()){
            String Datos[]={fam.getCodfam(),fam.getHija(),fam.getMadre()};
            modeloTabla.addRow(Datos);
        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERROR: "+e.getMessage());
        }
    }    
    private void limpiarCasillas()
    {
        txtbuscar.setText("");
        txtcodigofam.setText("");
        txthija.setText("");
        txtmadre.setText("");
    }
    private void habilitarCajas(){
    txtcodigofam.setEnabled(true);
    txthija.setEnabled(true);
    txtmadre.setEnabled(true);
    }
    private void deshabilitarCajas(){
        txtcodigofam.setEnabled(false);
        txthija.setEnabled(false);
        txtmadre.setEnabled(false);
        }
    private void habilitarBotones(){
    btnagregar.setEnabled(true);
    btneditar.setEnabled(true);
    btncancelar.setEnabled(true); 
    }
    public void buscarFamilias() {
        c_familias fam = null;
        try {
            fam = d_familias.buscarFamiliasCodfam(txtbuscar.getText());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR:" + e.getMessage());
        }
        if (fam != null) {
        	txtidfam.setText(String.valueOf(fam.getIdfam()));
            txtcodigofam.setText(fam.getCodfam());
            txthija.setText(fam.getHija());
            txtmadre.setText(fam.getMadre());
            btncancelar.setEnabled(true);
            btnnuevo.setEnabled(false);
            btneditar.setEnabled(true);
            btneliminar.setEnabled(true);
        } else {
        	txtbuscar.setText("");
        	btnnuevo.setEnabled(true);
            btncancelar.setEnabled(false);;
            txtbuscar.setEditable(true);
            txtbuscar.requestFocus();
            JOptionPane.showMessageDialog(null, "No existe");
        }
    }
    private boolean validarcampos(){
    	boolean flag=true;
    	if(txtcodigofam.getText().equals("")){
    		msjcodigo.setVisible(true);
    		txtcodigofam.requestFocus();
    		flag=false;
    	}
    	if(txthija.getText().equals("")){
    		msjcategoria.setVisible(true);
    		txthija.requestFocus();
    		flag=false;
    	}
    	if(txtmadre.getText().equals("")){
    		msjmarca.setVisible(true);
    		txtmadre.requestFocus();
    		flag=false;
    	}
    	return flag;
    }
    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
       //Agregar un nuevo registro
        if(validarcampos()==false){
        	JOptionPane.showMessageDialog(null, "Ingrese valores correctos");
    		return;
        }else if(validarcampos()==true){
        	try{
        c_familias fam=new c_familias();
        fam.setCodfam(txtcodigofam.getText());
        fam.setHija(txthija.getText());
        fam.setMadre(txtmadre.getText());       
                 d_familias.insertarFamilias(fam);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Datos Agregados Correctamente");
            limpiarCasillas();
            txtbuscar.setEnabled(true);
            btnbuscar.setEnabled(true);
            msjcategoria.setVisible(false);
            msjcodigo.setVisible(false);
            msjmarca.setVisible(false);
        }       
    }//GEN-LAST:event_btnagregarActionPerformed
    private boolean validarbuscary(){
    	boolean flag=true;
    	try{
        	String sqlData;
        	Connection cnn = BD.getConnection();
            Statement st = cnn.createStatement();
            sqlData = "select codfam from familias";
            ResultSet rs = st.executeQuery(sqlData);
           while(rs.next())
           {
        	   String v1=rs.getString("codfam"); 
        	   if(v1.equals(txtbuscar.getText())){
            	buscarFamilias();
                habilitarCajas();
                return false;
        	   }
        	}
        	}
		catch (Exception e) {
	    }
    	return flag;
    }
    private boolean validarbuscarn(){
    	boolean flag=true;
    	try{
        	String sqlData;
        	Connection cnn = BD.getConnection();
            Statement st = cnn.createStatement();
            sqlData = "select codfam from familias";
            ResultSet rs = st.executeQuery(sqlData);
           while(rs.next())
           {
        	   String v1=rs.getString("codfam"); 
        	   if(v1.equals(txtbuscar.getText())){
            	buscarFamilias();
                deshabilitarCajas();
                return false;
        	   }
        	}
        	}
		catch (Exception e) {
	    }
    	return flag;
    }
    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        if (txtbuscar.getText().compareTo("") != 0) {
            int result = JOptionPane.showConfirmDialog(
                    this, "Deseas Buscar la familia para Modificarlo?",
                    "Mensaje..!!",
                    JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
            	if(validarbuscary()==true){
            		JOptionPane.showMessageDialog(null, "Ingrese un codigo correcto");
            		txtbuscar.setText("");
            		txtbuscar.requestFocus();
            	}else if(validarbuscary()==false){
            		JOptionPane.showMessageDialog(null, "Codigo encontrado");
	            	   }
            }
            if (result == JOptionPane.NO_OPTION) {
            	if(validarbuscarn()==true){
            		JOptionPane.showMessageDialog(null, "Ingrese un codigo correcto");
            		txtbuscar.setText("");
            		txtbuscar.requestFocus();
            	}else if(validarbuscarn()==false){
            		JOptionPane.showMessageDialog(null, "Codigo encontrado");
	            	   }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese la familia a Buscar");
            txtbuscar.requestFocus();
        }
    }//GEN-LAST:event_btnbuscarActionPerformed
    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        limpiarCasillas();
        habilitarBotones();
        habilitarCajas();
        txtbuscar.setEnabled(false);
        btnbuscar.setEnabled(false);
        btnagregar.setEnabled(true);
        btneditar.setEnabled(false);
        txtcodigofam.requestFocus();
    }//GEN-LAST:event_btnnuevoActionPerformed
    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        limpiarCasillas();
        deshabilitarCajas();
        btnnuevo.setEnabled(true);
        btnbuscar.setEnabled(true);
        btneditar.setEnabled(false);
        btneliminar.setEnabled(false);
        txtbuscar.setEnabled(true);
        txtbuscar.requestFocus();
    }//GEN-LAST:event_btncancelarActionPerformed
    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
       c_familias fam;
           if(validarcampos()==false){
        	   JOptionPane.showMessageDialog(null, "Ingrese valores correctos");
       		return;
           }else if(validarcampos()==true){
        	   try{
                fam = d_familias.buscarFamiliasCodfam(txtbuscar.getText());
                fam.setIdfam(Integer.parseInt(txtidfam.getText()));
                fam.setCodfam(txtcodigofam.getText());
                fam.setHija(txthija.getText());
                fam.setMadre(txtmadre.getText());
                d_familias.actualizarFamilias(fam);
                JOptionPane.showMessageDialog(null, " [ Datos Actualizados ]");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }
        limpiarCasillas();
        txtbuscar.requestFocus();
        msjcategoria.setVisible(false);
        msjcodigo.setVisible(false);
        msjmarca.setVisible(false);
           }
    }//GEN-LAST:event_btneditarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        try {
            c_familias fam = d_familias.buscarFamiliasCodfam(txtbuscar.getText());
            if (fam == null) {
                JOptionPane.showMessageDialog(null, "No existe");
            } else {
                if (JOptionPane.showConfirmDialog(rootPane, "¿Desea eliminar este regitro?",
                "Eliminar registro", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                    d_familias.eliminarFamilias(fam.getCodfam());             
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
        limpiarCasillas();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btncerrarventanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarventanaActionPerformed
        dispose();
    }//GEN-LAST:event_btncerrarventanaActionPerformed

    private void jPanel4ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel4ComponentAdded
        setLocationRelativeTo(null);
    }//GEN-LAST:event_jPanel4ComponentAdded
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btncerrarventana;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableFamilias;
    private javax.swing.JTextField txthija;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtmadre;
    private javax.swing.JTextField txtcodigofam;
    private JTextField txtidfam;
    private JLabel msjcodigo;
    private JLabel msjcategoria;
    private JLabel msjmarca;
    // End of variables declaration//GEN-END:variables
}

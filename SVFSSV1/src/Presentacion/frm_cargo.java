package Presentacion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Datos.BD;
import Datos.d_familias;
import Datos.d_cargo;
import Logica.c_cargo;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class frm_cargo extends javax.swing.JFrame {
        DefaultTableModel modeloTabla;
        BD cnn=new BD();
    public frm_cargo() {
        modeloTabla=new DefaultTableModel(null,getColumnas());
        Filas();        
        initComponents();        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel2.setBounds(0, 40, 430, 323);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setBounds(10, 50, 110, 30);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setBounds(50, 100, 60, 14);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(25, 140, 120, 14);
        txtbuscar = new javax.swing.JTextField();
        txtbuscar.setBounds(120, 50, 110, 30);
        txtcargo = new javax.swing.JTextField();
        txtcargo.setBounds(120, 90, 240, 30);
        txtsalbase = new javax.swing.JTextField();
        txtsalbase.setBounds(120, 130, 240, 30);
        btnagregar = new javax.swing.JButton();
        btnagregar.setIcon(new ImageIcon(frm_cargo.class.getResource("/img/save.png")));
        btnagregar.setBounds(90, 226, 80, 40);
        btnnuevo = new javax.swing.JButton();
        btnnuevo.setIcon(new ImageIcon(frm_cargo.class.getResource("/img/plus.png")));
        btnnuevo.setBounds(10, 226, 80, 40);
        btncancelar = new javax.swing.JButton();
        btncancelar.setIcon(new ImageIcon(frm_cargo.class.getResource("/img/no.png")));
        btncancelar.setBounds(170, 226, 80, 40);
        btnbuscar = new javax.swing.JButton();
        btnbuscar.setIcon(new ImageIcon(frm_cargo.class.getResource("/img/edit_find.png")));
        btnbuscar.setBounds(240, 40, 50, 40);
        btneditar = new javax.swing.JButton();
        btneditar.setIcon(new ImageIcon(frm_cargo.class.getResource("/img/pencil3.png")));
        btneditar.setBounds(250, 226, 80, 40);
        btneliminar = new javax.swing.JButton();
        btneliminar.setIcon(new ImageIcon(frm_cargo.class.getResource("/img/gnome_edit_delete.png")));
        btneliminar.setBounds(330, 226, 80, 40);
        btncerrarventana = new javax.swing.JButton();
        btncerrarventana.setIcon(new ImageIcon(frm_cargo.class.getResource("/img/cancel2.png")));
        btncerrarventana.setBounds(10, 272, 400, 40);
        jPanel3 = new javax.swing.JPanel();
        jPanel3.setBounds(440, 40, 550, 323);
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCargos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBounds(0, 0, 1000, 35);
        jLabel1 = new javax.swing.JLabel();

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

        jLabel2.setText("Buscar Cargo:");
        jPanel2.add(jLabel2);

        jLabel3.setText("Cargo:");
        jPanel2.add(jLabel3);

        jLabel4.setText("Salario Base:");
        jPanel2.add(jLabel4);
        jPanel2.add(txtbuscar);

        txtcargo.setEnabled(false);
        jPanel2.add(txtcargo);

        txtsalbase.setEnabled(false);
        jPanel2.add(txtsalbase);
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
        
        txtidcargo = new JTextField();
        txtidcargo.setBounds(370, 76, 29, 20);
        txtidcargo.setVisible(false);
        txtidcargo.setEnabled(false);
        txtidcargo.setEditable(false);
        jPanel2.add(txtidcargo);
        txtidcargo.setColumns(10);
        
        txtbonificacion = new JTextField();
        txtbonificacion.setEnabled(false);
        txtbonificacion.setBounds(120, 173, 240, 30);
        jPanel2.add(txtbonificacion);
        
        JLabel lblBonificacion = new JLabel();
        lblBonificacion.setText("Bonificacion:");
        lblBonificacion.setBounds(25, 183, 95, 14);
        jPanel2.add(lblBonificacion);
        
        msjcargo = new JLabel("*");
        msjcargo.setVisible(false);
        msjcargo.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjcargo.setForeground(Color.RED);
        msjcargo.setBounds(370, 100, 46, 14);
        jPanel2.add(msjcargo);
        
        msjsalario = new JLabel("*");
        msjsalario.setVisible(false);
        msjsalario.setForeground(Color.RED);
        msjsalario.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjsalario.setBounds(370, 140, 46, 14);
        jPanel2.add(msjsalario);
        
        msjboni = new JLabel("*");
        msjboni.setVisible(false);
        msjboni.setForeground(Color.RED);
        msjboni.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjboni.setBounds(370, 181, 46, 14);
        jPanel2.add(msjboni);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Lista de Cargos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        tableCargos.setModel(modeloTabla);
        jScrollPane1.setViewportView(tableCargos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
        			.addContainerGap())
        );
        jPanel3.setLayout(jPanel3Layout);

        jPanel4.add(jPanel3);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setForeground(new java.awt.Color(0, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mantenimiento Cargo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 5, 370, 30));

        jPanel4.add(jPanel1);
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 1000, GroupLayout.PREFERRED_SIZE)
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 374, GroupLayout.PREFERRED_SIZE)
        );
        getContentPane().setLayout(groupLayout);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private String[] getColumnas(){
        String  columna[]=new String[]{"Cargo","Salario base","Bonificacion"};
        return columna;
    }
    private void Filas(){
    try{
        for(c_cargo c : d_cargo.mostrarCargo()){
            String Datos[]={c.getCargo(),String.valueOf(c.getSalbase()),String.valueOf(c.getBonificacion())};
            modeloTabla.addRow(Datos);
        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERROR: "+e.getMessage());
        }
    } 
    private void iniciarCajas(){
    	txtcargo.setText("");
    	txtsalbase.setText("");
    	txtbonificacion.setText("");
    }
    
    private void limpiarCasillas()
    {	txtbuscar.setText("");
        txtcargo.setText("");
        txtsalbase.setText("");
        txtbonificacion.setText("");
    }
    private void habilitarCajas(){
    txtcargo.setEnabled(true);
    txtsalbase.setEnabled(true);
    txtbonificacion.setEnabled(true);
    }
    private void deshabilitarCajas(){
        txtcargo.setEnabled(false);
        txtsalbase.setEnabled(false);
        txtbonificacion.setEnabled(false);
        }
    private void habilitarBotones(){
    btnagregar.setEnabled(true);
    btneditar.setEnabled(true);
    btncancelar.setEnabled(true); 
    }
    public void buscarCargos() {
        c_cargo c = null;
        try {
            c = d_cargo.buscarCargo(txtbuscar.getText());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR:" + e.getMessage());
        }
        if (c != null) {
        	txtidcargo.setText(String.valueOf(c.getIdcargo()));
            txtcargo.setText(c.getCargo());
            txtsalbase.setText(String.valueOf(c.getSalbase()));
            txtbonificacion.setText(String.valueOf(c.getBonificacion()));
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
    	if(txtcargo.getText().compareTo("") == 0){
    		msjcargo.setVisible(true);
    		txtcargo.requestFocus();
    		flag= false;
    	}
    	if(txtsalbase.getText().compareTo("") == 0){
    		msjsalario.setVisible(true);
    		txtsalbase.requestFocus();
    		flag=false;
    	}
    	if(txtbonificacion.getText().equals("")){
    		msjboni.setVisible(true);
    		txtbonificacion.requestFocus();
    		flag=false;
    	}
    	return flag;
    }
    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
       //Agregar un nuevo registro  
    	iniciarCajas();
       if(validarcampos()==false){
    	   JOptionPane.showMessageDialog(null, "Ingrese valores correctos");
   		return;
       }else if(validarcampos()==true){
    	   try{
        c_cargo c=new c_cargo();
        c.setCargo(txtcargo.getText());
        c.setSalbase(Double.parseDouble(txtsalbase.getText()));
        c.setBonificacion(Double.parseDouble(txtbonificacion.getText()));
                 d_cargo.insertarCargo(c);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Datos Agregados Correctamente");
            limpiarCasillas();
            txtbuscar.setEnabled(true);
            btnbuscar.setEnabled(true);
            msjboni.setVisible(false);
            msjcargo.setVisible(false);
            msjsalario.setVisible(false);
        }       
    }//GEN-LAST:event_btnagregarActionPerformed
    private boolean validarbuscary(){
    	boolean flag=true;
    	try{
    		String sqlData;
        	Connection cnn = BD.getConnection();
            Statement st = cnn.createStatement();
            sqlData = "select cargo from cargo";
            ResultSet rs = st.executeQuery(sqlData);
           while(rs.next())
           {
        	   String v1=rs.getString("cargo"); 
        	   if(v1.equals(txtbuscar.getText())){
            	buscarCargos();
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
            sqlData = "select cargo from cargo";
            ResultSet rs = st.executeQuery(sqlData);
           while(rs.next())
           {
        	   String v1=rs.getString("cargo"); 
        	   if(v1.equals(txtbuscar.getText())){
            	buscarCargos();
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
                    this, "Deseas Buscar el cargo para Modificarlo?",
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
            JOptionPane.showMessageDialog(null, "Ingrese el codigo a Buscar");
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
        txtcargo.requestFocus();
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
       c_cargo c;
            if(validarcampos()==false){
            	JOptionPane.showMessageDialog(null, "Ingrese valores correctos");
        		return;
            }else if(validarcampos()==true){
            	try{
                c = d_cargo.buscarCargo(txtbuscar.getText());
                c.setIdcargo(Integer.parseInt(txtidcargo.getText()));
                c.setCargo(txtcargo.getText());
                c.setSalbase(Double.parseDouble(txtsalbase.getText()));
                c.setBonificacion(Double.parseDouble(txtbonificacion.getText()));
                d_cargo.actualizarCargo(c);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }
                JOptionPane.showMessageDialog(null, " [ Datos Actualizados ]");
		        limpiarCasillas();
		        txtbuscar.requestFocus();
		        msjboni.setVisible(false);
		        msjcargo.setVisible(false);
		        msjsalario.setVisible(false);
            }
    }//GEN-LAST:event_btneditarActionPerformed
    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        try {
            c_cargo c = d_cargo.buscarCargo(txtbuscar.getText());
            if (c == null) {
                JOptionPane.showMessageDialog(null, "No existe");
            } else {
                if (JOptionPane.showConfirmDialog(rootPane, "¿Desea eliminar este regitro?",
                "Eliminar registro", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                d_cargo.eliminarCargo(String.valueOf(c.getCargo()));
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCargos;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcargo;
    private javax.swing.JTextField txtsalbase;
    private JTextField txtidcargo;
    private JTextField txtbonificacion;
    private JLabel msjcargo;
    private JLabel msjsalario;
    private JLabel msjboni;
}

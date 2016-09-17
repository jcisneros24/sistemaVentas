package Presentacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Datos.BD;
import Datos.d_ciudad;
import Logica.c_ciudad;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
public class frm_ciudad extends javax.swing.JFrame {
        Connection cnn = BD.getConnection();
        DefaultTableModel modeloTabla=new DefaultTableModel();
        PreparedStatement ps = null;
    public frm_ciudad() {
        modeloTabla=new DefaultTableModel(null,getColumnas());
        Filas();
        initComponents();
    }
    public void cargar(){       
       try{
        ps = cnn.prepareStatement("SELECT codciudad,distrito,provincia,region,pais FROM ciudad");
        ResultSet rs = ps.executeQuery();
       while (rs.next()){
       Object dato[]=new  Object[5];
       for (int i=0; i<5; i++){
           dato[i]=rs.getString(i+1);

       }
       modeloTabla.addRow(dato);
       }
       this.tableCiudades.setModel(modeloTabla);

       }catch (Exception e){}
}
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel2.setBounds(0, 40, 430, 434);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setBounds(20, 50, 110, 30);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(40, 152, 80, 14);
        txtbuscar = new javax.swing.JTextField();
        txtbuscar.setBounds(120, 50, 110, 30);
        txtdistrito = new javax.swing.JTextField();
        txtdistrito.setBounds(120, 142, 240, 30);
        btnagregar = new javax.swing.JButton();
        btnagregar.setIcon(new ImageIcon(frm_ciudad.class.getResource("/img/save.png")));
        btnagregar.setBounds(90, 325, 80, 40);
        btnnuevo = new javax.swing.JButton();
        btnnuevo.setIcon(new ImageIcon(frm_ciudad.class.getResource("/img/plus.png")));
        btnnuevo.setBounds(10, 325, 80, 40);
        btncancelar = new javax.swing.JButton();
        btncancelar.setIcon(new ImageIcon(frm_ciudad.class.getResource("/img/no.png")));
        btncancelar.setBounds(170, 325, 80, 40);
        btnbuscar = new javax.swing.JButton();
        btnbuscar.setIcon(new ImageIcon(frm_ciudad.class.getResource("/img/edit_find.png")));
        btnbuscar.setBounds(240, 40, 50, 40);
        btneditar = new javax.swing.JButton();
        btneditar.setIcon(new ImageIcon(frm_ciudad.class.getResource("/img/pencil3.png")));
        btneditar.setBounds(250, 325, 80, 40);
        btneliminar = new javax.swing.JButton();
        btneliminar.setIcon(new ImageIcon(frm_ciudad.class.getResource("/img/gnome_edit_delete.png")));
        btneliminar.setBounds(330, 325, 80, 40);
        btncerrarventana = new javax.swing.JButton();
        btncerrarventana.setIcon(new ImageIcon(frm_ciudad.class.getResource("/img/cancel2.png")));
        btncerrarventana.setBounds(10, 370, 400, 40);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setBounds(45, 192, 70, 14);
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setBounds(50, 230, 70, 14);
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setBounds(50, 272, 60, 14);
        cmbprovincia = new javax.swing.JComboBox();
        cmbprovincia.setBounds(120, 182, 240, 30);
        cmbregion = new javax.swing.JComboBox();
        cmbregion.setBounds(120, 222, 240, 30);
        cmbpais = new javax.swing.JComboBox();
        cmbpais.setBounds(120, 262, 240, 30);
        jPanel3 = new javax.swing.JPanel();
        jPanel3.setBounds(440, 40, 550, 383);
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCiudades = new javax.swing.JTable();
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

        jLabel2.setText("Buscar ciudad:");
        jPanel2.add(jLabel2);

        jLabel4.setText("   Distrito:");
        jPanel2.add(jLabel4);
        jPanel2.add(txtbuscar);

        txtdistrito.setEnabled(false);
        jPanel2.add(txtdistrito);
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

        jLabel5.setText("Provinca:");
        jPanel2.add(jLabel5);

        jLabel6.setText("Regi\u00F3n:");
        jPanel2.add(jLabel6);

        jLabel7.setText("Pa\u00EDs:");
        jPanel2.add(jLabel7);

        cmbprovincia.setModel(new DefaultComboBoxModel(new String[] {"HUAURA", "BARRANCA", "HUARAL", "SAYAN", "SIN_ESPECIFICAR", " "}));
        jPanel2.add(cmbprovincia);

        cmbregion.setModel(new DefaultComboBoxModel(new String[] {"LIMA", "PIURA", "LA LIBERTAD", "ANCASH", "ICA", "AREQUIPA", "TACNA", "SIN_ESPECIFICAR", " "}));
        jPanel2.add(cmbregion);

        cmbpais.setModel(new DefaultComboBoxModel(new String[] {"PER\u00DA", "ECUADOR", "COLOMBIA", "BRASIL", "BOLIVIA", "CHILE", "VENEZUELA", "SIN_ESPECIFICAR"}));
        jPanel2.add(cmbpais);

        jPanel4.add(jPanel2);
        
        txtcodigo = new JTextField();
        txtcodigo.setEnabled(false);
        txtcodigo.setBounds(120, 101, 240, 30);
        jPanel2.add(txtcodigo);
        
        JLabel lblCodigo = new JLabel();
        lblCodigo.setText("Codigo:");
        lblCodigo.setBounds(40, 111, 80, 14);
        jPanel2.add(lblCodigo);
        
        txtidciudad = new JTextField();
        txtidciudad.setVisible(false);
        txtidciudad.setEnabled(false);
        txtidciudad.setEditable(false);
        txtidciudad.setBounds(370, 87, 21, 20);
        jPanel2.add(txtidciudad);
        txtidciudad.setColumns(10);
        
        msjcodigo = new JLabel("*");
        msjcodigo.setVisible(false);
        msjcodigo.setForeground(Color.RED);
        msjcodigo.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjcodigo.setBounds(364, 117, 46, 14);
        jPanel2.add(msjcodigo);
        
        msjdistrito = new JLabel("*");
        msjdistrito.setVisible(false);
        msjdistrito.setForeground(Color.RED);
        msjdistrito.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjdistrito.setBounds(364, 152, 46, 14);
        jPanel2.add(msjdistrito);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Lista de Ciudades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        tableCiudades.setModel(modeloTabla);
        tableCiudades.addKeyListener(new java.awt.event.KeyAdapter() {
        });
        jScrollPane1.setViewportView(tableCiudades);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel3.setLayout(jPanel3Layout);

        jPanel4.add(jPanel3);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setForeground(new java.awt.Color(0, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mantenimiento a Ciudades");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 5, 370, 30));

        jPanel4.add(jPanel1);
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 1002, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 485, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().setLayout(groupLayout);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private String[] getColumnas(){
        String  columna[]=new String[]{"Codigo","Distrito","Provincia","Region","Pais"};
        return columna;
    }
    private void Filas(){
    try{
        for(c_ciudad cd : d_ciudad.mostrarCiudades()){
            String Datos[]={cd.getCodciudad(),cd.getDistrito(),cd.getProvincia(),cd.getRegion(),cd.getPais()};
            modeloTabla.addRow(Datos);
        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERROR: "+e.getMessage());
        }
    }    
    private void limpiarCasillas()
    {
    	txtbuscar.setText("");
    	txtcodigo.setText("");
        txtdistrito.setText("");
        cmbprovincia.setSelectedItem("");
        cmbregion.setSelectedItem("");
        cmbpais.setSelectedItem("");
    }
    private void habilitarCajas(){
    txtcodigo.setEnabled(true);
    txtdistrito.setEnabled(true);
    cmbprovincia.setEnabled(true);
    cmbregion.setEnabled(true);
    cmbpais.setEnabled(true);

    }
    private void deshabilitarCajas(){
        txtcodigo.setEnabled(false);
        txtdistrito.setEnabled(false);
        cmbprovincia.setEnabled(false);
        cmbregion.setEnabled(false);
        cmbpais.setEnabled(false);

        }
    private void habilitarBotones(){
    btnagregar.setEnabled(true);
    btneditar.setEnabled(true);
    btncancelar.setEnabled(true); 
    }
    public void buscarCiudades() {
        c_ciudad cd = null;
        try {
            cd = d_ciudad.buscarCodCiudades(txtbuscar.getText());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR:" + e.getMessage());
        }
        if (cd != null) {
        	txtidciudad.setText(String.valueOf(cd.getIdciudad()));
        	txtcodigo.setText(cd.getCodciudad());
            txtdistrito.setText(cd.getDistrito());
            cmbprovincia.setSelectedItem(cd.getProvincia());
            cmbregion.setSelectedItem(cd.getRegion());
            cmbpais.setSelectedItem(cd.getPais());
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
    private boolean validarcampos() {
		boolean flag=true;
		if(txtcodigo.getText().equals("")){
			msjcodigo.setVisible(true);
			txtcodigo.requestFocus();
			flag=false;
		}
		if(txtdistrito.getText().equals("")){
			msjdistrito.setVisible(true);
			txtdistrito.requestFocus();
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
        c_ciudad cd=new c_ciudad();
        cd.setCodciudad(txtcodigo.getText());
        cd.setDistrito(txtdistrito.getText());
        cd.setProvincia(cmbprovincia.getSelectedItem().toString()); 
        cd.setRegion(cmbprovincia.getSelectedItem().toString()); 
        cd.setPais(cmbpais.getSelectedItem().toString()); 
                 d_ciudad.insertarCiudades(cd);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Datos Agregados Correctamente");
            cargar();
            limpiarCasillas();
            txtbuscar.setEnabled(true);
            btnbuscar.setEnabled(true);
            msjcodigo.setVisible(false);
            msjdistrito.setVisible(false);
        } 
    }//GEN-LAST:event_btnagregarActionPerformed
    private boolean validarbuscary(){
    	boolean flag=true;
    	try{
        	String sqlData;
        	Connection cnn = BD.getConnection();
            Statement st = cnn.createStatement();
            sqlData = "select codciudad from ciudad";
            ResultSet rs = st.executeQuery(sqlData);
           while(rs.next())
           {
        	   String v1=rs.getString("codciudad"); 
        	   if(v1.equals(txtbuscar.getText())){
            	buscarCiudades();
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
            sqlData = "select codciudad from ciudad";
            ResultSet rs = st.executeQuery(sqlData);
           while(rs.next())
           {
        	   String v1=rs.getString("codciudad"); 
        	   if(v1.equals(txtbuscar.getText())){
            	buscarCiudades();
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
                    this, "Deseas Buscar la Ciudad para Modificarlo?",
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
        txtdistrito.requestFocus();
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
       c_ciudad cd;
            if(validarcampos()==false){
            	JOptionPane.showMessageDialog(null, "Ingrese valores correctos");
        		return;
            }else if(validarcampos()==true){
            	try{
                cd = d_ciudad.buscarCodCiudades(txtbuscar.getText());
                cd.setIdciudad(Integer.parseInt(txtidciudad.getText()));
                cd.setCodciudad(txtcodigo.getText());
                cd.setDistrito(txtdistrito.getText());
                cd.setProvincia(cmbprovincia.getSelectedItem().toString());
                cd.setRegion(cmbregion.getSelectedItem().toString());
                cd.setPais(cmbpais.getSelectedItem().toString());
                d_ciudad.actualizarCiudades(cd);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }
                JOptionPane.showMessageDialog(null, " [ Datos Actualizados ]");
        limpiarCasillas();
        txtbuscar.requestFocus();
        msjcodigo.setVisible(false);
        msjdistrito.setVisible(false);
            }
    }//GEN-LAST:event_btneditarActionPerformed
    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        try {
            c_ciudad cd = d_ciudad.buscarCodCiudades(txtbuscar.getText());
            if (cd == null) {
                JOptionPane.showMessageDialog(null, "No existe");
            } else {
                if (JOptionPane.showConfirmDialog(rootPane, "¿Desea eliminar este regitro?",
                "Eliminar registro", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                d_ciudad.eliminarCiudades(cd.getDistrito());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
        limpiarCasillas();
        btnnuevo.setEnabled(true);
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
    private javax.swing.JComboBox cmbpais;
    private javax.swing.JComboBox cmbprovincia;
    private javax.swing.JComboBox cmbregion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCiudades;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtdistrito;
    private JTextField txtcodigo;
    private JTextField txtidciudad;
    private JLabel msjcodigo;
    private JLabel msjdistrito;
}

package Presentacion;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Datos.BD;
import Datos.d_proveedor;
import Logica.c_proveedor;

import com.toedter.calendar.JDateChooser;

public class frm_proveedor extends javax.swing.JFrame {
       DefaultTableModel modeloTabla;
       Connection cnn = BD.getConnection();  
       PreparedStatement ps = null;
    public frm_proveedor() {
        modeloTabla=new DefaultTableModel(null,getColumnas());
        Filas();
        initComponents();
        this.cmbciudad.removeAllItems();
        try {
            ps = cnn.prepareStatement("SELECT codciudad FROM ciudad");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
            this.cmbciudad.addItem(rs.getString("codciudad"));
            }
        } catch (Exception e) {
        }
    }					
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel2.setBounds(0, 40, 1260, 376);
        jPanel3 = new javax.swing.JPanel();
        jPanel3.setBounds(0, 415, 1260, 291);
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProveedor = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBounds(0, 0, 1260, 35);
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
        btnbuscar = new javax.swing.JButton();
        btnbuscar.setBounds(720, 20, 60, 40);
        btnbuscar.setIcon(new ImageIcon(frm_proveedor.class.getResource("/img/edit_find.png")));
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        jPanel2.setLayout(null);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setBounds(393, 29, 157, 30);
        
                jLabel2.setText("Buscar Proveedor:");
                jPanel2.add(jLabel2);
        txtbuscar = new javax.swing.JTextField();
        txtbuscar.setBounds(510, 30, 200, 30);
        jPanel2.add(txtbuscar);
        jPanel2.add(btnbuscar);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setBounds(59, 105, 86, 14);
        
                jLabel3.setText("Nombres:");
                jPanel2.add(jLabel3);
        txtnombres = new javax.swing.JTextField();
        txtnombres.setBounds(120, 95, 270, 30);
        
                txtnombres.setEnabled(false);
                jPanel2.add(txtnombres);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(418, 108, 122, 14);
        
                jLabel4.setText("Razon Social:");
                jPanel2.add(jLabel4);
        txtrazonsocial = new javax.swing.JTextField();
        txtrazonsocial.setBounds(510, 95, 270, 30);
        
                txtrazonsocial.setEnabled(false);
                jPanel2.add(txtrazonsocial);
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setBounds(841, 105, 90, 14);
        
                jLabel6.setText("R.U.C.:");
                jPanel2.add(jLabel6);
        jLabel14 = new javax.swing.JLabel();
        jLabel14.setBounds(59, 145, 86, 14);
        
                jLabel14.setText("Direcci\u00F3n:");
                jPanel2.add(jLabel14);
        txtdireccion = new javax.swing.JTextField();
        txtdireccion.setBounds(120, 135, 270, 30);
        
                txtdireccion.setEnabled(false);
                jPanel2.add(txtdireccion);
        jLabel8 = new javax.swing.JLabel();
        jLabel8.setBounds(442, 145, 98, 14);
        
                jLabel8.setText("Ciudad :");
                jPanel2.add(jLabel8);
        cmbciudad = new javax.swing.JComboBox();
        cmbciudad.setBounds(510, 135, 270, 30);
        
                cmbciudad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Huacho", "Barranca", "Huaura", "Huaral", "Lima" }));
                jPanel2.add(cmbciudad);
        jLabel9 = new javax.swing.JLabel();
        jLabel9.setBounds(832, 145, 99, 14);
        
                jLabel9.setText("Tel\u00E9fono:");
                jPanel2.add(jLabel9);
        txttelefono = new javax.swing.JTextField();
        txttelefono.setBounds(905, 135, 270, 30);
        
                txttelefono.setEnabled(false);
                jPanel2.add(txttelefono);
        jLabel10 = new javax.swing.JLabel();
        jLabel10.setBounds(59, 185, 86, 14);
        
                jLabel10.setText("Celular:");
                jPanel2.add(jLabel10);
        txtcelular = new javax.swing.JTextField();
        txtcelular.setBounds(120, 175, 270, 30);
        
                txtcelular.setEnabled(false);
                jPanel2.add(txtcelular);
        jLabel11 = new javax.swing.JLabel();
        jLabel11.setBounds(450, 185, 90, 14);
        
                jLabel11.setText("E-Mail:");
                jPanel2.add(jLabel11);
        btncerrarventana = new javax.swing.JButton();
        btncerrarventana.setBounds(400, 320, 400, 50);
        btncerrarventana.setIcon(new ImageIcon(frm_proveedor.class.getResource("/img/cancel2.png")));
        btncerrarventana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarventanaActionPerformed(evt);
            }
        });
        btncancelar = new javax.swing.JButton();
        btncancelar.setBounds(560, 265, 80, 50);
        btncancelar.setIcon(new ImageIcon(frm_proveedor.class.getResource("/img/no.png")));
        btncancelar.setEnabled(false);
        btncancelar.setMaximumSize(new java.awt.Dimension(80, 20));
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        txtcorreo = new javax.swing.JTextField();
        txtcorreo.setBounds(510, 175, 270, 30);
        
                txtcorreo.setEnabled(false);
                jPanel2.add(txtcorreo);
        jLabel12 = new javax.swing.JLabel();
        jLabel12.setBounds(852, 185, 79, 14);
        
                jLabel12.setText("Web:");
                jPanel2.add(jLabel12);
        txtweb = new javax.swing.JTextField();
        txtweb.setBounds(905, 175, 270, 30);
        
                txtweb.setEnabled(false);
                jPanel2.add(txtweb);
        jLabel13 = new javax.swing.JLabel();
        jLabel13.setBounds(400, 225, 140, 14);
        
                jLabel13.setText("   Fecha Ingreso:");
                jPanel2.add(jLabel13);
        btnagregar = new javax.swing.JButton();
        btnagregar.setBounds(480, 265, 80, 50);
        btnagregar.setIcon(new ImageIcon(frm_proveedor.class.getResource("/img/save.png")));
        btnagregar.setEnabled(false);
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        btnnuevo = new javax.swing.JButton();
        btnnuevo.setBounds(400, 265, 80, 50);
        btnnuevo.setIcon(new ImageIcon(frm_proveedor.class.getResource("/img/plus.png")));
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        
        dateChooser = new JDateChooser();
        dateChooser.setEnabled(false);
        dateChooser.setBounds(510, 215, 270, 30);
        jPanel2.add(dateChooser);
        jPanel2.add(btnnuevo);
        jPanel2.add(btnagregar);
        jPanel2.add(btncancelar);
        btneliminar = new javax.swing.JButton();
        btneliminar.setBounds(720, 265, 80, 50);
        btneliminar.setIcon(new ImageIcon(frm_proveedor.class.getResource("/img/gnome_edit_delete.png")));
        btneliminar.setDoubleBuffered(true);
        btneliminar.setEnabled(false);
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        btneditar = new javax.swing.JButton();
        btneditar.setBounds(640, 265, 80, 50);
        btneditar.setIcon(new ImageIcon(frm_proveedor.class.getResource("/img/pencil3.png")));
        btneditar.setEnabled(false);
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });
        jPanel2.add(btneditar);
        jPanel2.add(btneliminar);
        jPanel2.add(btncerrarventana);
        jPanel4.setLayout(null);

        jPanel4.add(jPanel2);
        
        txtruc = new JTextField();
        txtruc.setEnabled(false);
        txtruc.setBounds(905, 95, 270, 30);
        jPanel2.add(txtruc);
        txtruc.setColumns(10);
        
        msjruc = new JLabel("*");
        msjruc.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjruc.setVisible(false);
        msjruc.setForeground(Color.RED);
        msjruc.setBounds(1183, 105, 46, 14);
        jPanel2.add(msjruc);
        
        msjfecha = new JLabel("*");
        msjfecha.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjfecha.setVisible(false);
        msjfecha.setForeground(Color.RED);
        msjfecha.setBounds(790, 225, 46, 14);
        jPanel2.add(msjfecha);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Lista de Proveedores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        tableProveedor.setModel(modeloTabla);
        jScrollPane1.setViewportView(tableProveedor);
        if (tableProveedor.getColumnModel().getColumnCount() > 0) {
        	tableProveedor.getColumnModel().getColumn(0).setHeaderValue("Nombres");
        	tableProveedor.getColumnModel().getColumn(1).setHeaderValue("Razon social");
        	tableProveedor.getColumnModel().getColumn(2).setHeaderValue("RUC");
        	tableProveedor.getColumnModel().getColumn(3).setHeaderValue("Dirección");
        	tableProveedor.getColumnModel().getColumn(4).setHeaderValue("Ciudad");
        	tableProveedor.getColumnModel().getColumn(5).setHeaderValue("Telefono");
        	tableProveedor.getColumnModel().getColumn(6).setHeaderValue("Celular");
        	tableProveedor.getColumnModel().getColumn(7).setHeaderValue("Correo");
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 1252, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel3.setLayout(jPanel3Layout);

        jPanel4.add(jPanel3);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setForeground(new java.awt.Color(0, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de Proveedores");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, 35));

        jPanel4.add(jPanel1);
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 1260, GroupLayout.PREFERRED_SIZE)
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 661, GroupLayout.PREFERRED_SIZE)
        );
        getContentPane().setLayout(groupLayout);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private String[] getColumnas(){
        String  columna[]=new String[]{"Nombres","Razon social","RUC","Dirección","Ciudad","telefono","Celular","Correo"};
        return columna;
    }
    private void Filas(){
    try{
        for(c_proveedor p : d_proveedor.mostrarProveedor()){
            String Datos[]={p.getNombres(),p.getRazonsocial(),p.getRuc(),(p.getDireccion()),p.getCodciudad(),p.getTelefono(),p.getCelular(),p.getCorreo()};
            modeloTabla.addRow(Datos);
        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERROR: "+e.getMessage());
        }
    }    
    private void limpiarCasillas()
    {
        txtbuscar.setText("");
        txtnombres.setText("");
        txtrazonsocial.setText("");
        txtruc.setText("");
        txtdireccion.setText("");
        cmbciudad.setSelectedItem("");
        txttelefono.setText("");
        txtcelular.setText("");
        txtcorreo.setText("");
        txtweb.setText("");
        dateChooser.setDate(null);
    }
    private void habilitarCajas(){
    txtnombres.setEnabled(true);
    txtrazonsocial.setEnabled(true);
    txtruc.setEnabled(true);
    txtdireccion.setEnabled(true);
    cmbciudad.setEnabled(true);
    txttelefono.setEnabled(true);
    txtcelular.setEnabled(true);
    txtcorreo.setEnabled(true);
    txtweb.setEnabled(true);
    dateChooser.setEnabled(true); 
    }
    private void deshabilitarCajas(){
        txtnombres.setEnabled(false);
        txtrazonsocial.setEnabled(false);
        txtruc.setEnabled(false);
        txtdireccion.setEnabled(false);
        cmbciudad.setEnabled(false);
        txttelefono.setEnabled(false);
        txtcelular.setEnabled(false);
        txtcorreo.setEnabled(false);
        txtweb.setEnabled(false);
        dateChooser.setEnabled(false); 
        }
    private void habilitarBotones(){
    btnagregar.setEnabled(true);
    btneditar.setEnabled(true);	
    btncancelar.setEnabled(true); 
    }
    private String fecha(){
		String fecha;
		String dia = Integer.toString(dateChooser.getCalendar().get(Calendar.DAY_OF_MONTH));
		String mes = Integer.toString(dateChooser.getCalendar().get(Calendar.MONTH) + 1);
		String year = Integer.toString(dateChooser.getCalendar().get(Calendar.YEAR));
		fecha = (year + "-" + mes+ "-" + dia);
		return fecha;
	}
    public void buscarProveedor() {
        c_proveedor p = null;
        try {
            p = d_proveedor.buscarRuc(txtbuscar.getText());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR:" + e.getMessage());
        }
        if (p != null) {
            txtnombres.setText(p.getNombres());
            txtrazonsocial.setText(p.getRazonsocial());
            txtruc.setText(p.getRuc());
            txtdireccion.setText(p.getDireccion());
            cmbciudad.setSelectedItem(p.getCodciudad());
            txttelefono.setText(p.getTelefono());
            txtcelular.setText(p.getCelular());
            txtcorreo.setText(p.getCorreo());
            txtweb.setText(p.getWeb());
            // dateChooser.setDateFormatString(fecha());
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
    private boolean  validarcamposcorrectos()
    { boolean flag=true;
    {
    	if(txtruc.getText().compareTo("")>11 ){
    		msjruc.setVisible(true);
    		txtruc.requestFocus();
    		flag=false;
    	}
    	if(txtruc.getText().compareTo("") == 0 ){
    		msjruc.setVisible(true);
    		txtruc.requestFocus();
    		flag=false;
    	}
    	if( dateChooser.getDate()==null){
    		msjfecha.setVisible(true);
    		flag=false;
    	} 
    }
    	return flag;
    }
    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
       //Agregar un nuevo registro
    	if (validarcamposcorrectos()==false)
    	{JOptionPane.showMessageDialog(null, "Ingrese valores correctos");
    		return;
    	}
    	else if (validarcamposcorrectos()==true){
    		try { 
    		c_proveedor p=new c_proveedor();
        p.setNombres(txtnombres.getText());
        p.setRazonsocial(txtrazonsocial.getText());
        p.setRuc(txtruc.getText());
        p.setDireccion(txtdireccion.getText());
        p.setCodciudad(cmbciudad.getSelectedItem().toString());
        p.setTelefono(txttelefono.getText());
        p.setCelular(txtcelular.getText());
        p.setCorreo(txtcorreo.getText());
        p.setWeb(txtweb.getText());
        p.setFingreso(fecha());       
        
                 d_proveedor.insertarProveedor(p);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Datos Agregados Correctamente");
            limpiarCasillas();
            txtbuscar.setEnabled(true);
            btnbuscar.setEnabled(true);
        }    
    }
    //GEN-LAST:event_btnagregarActionPerformed
    private boolean validarbuscary(){
    	boolean flag=true;
    	try{
        	String sqlData;
        	Connection cnn = BD.getConnection();
            Statement st = cnn.createStatement();
            sqlData = "select ruc from proveedor";
            ResultSet rs = st.executeQuery(sqlData);
           while(rs.next())
           {
        	   String v1=rs.getString("ruc"); 
        	   if(v1.equals(txtbuscar.getText())){
            	buscarProveedor();
                habilitarCajas();
                txtruc.setEnabled(false);
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
            sqlData = "select ruc from proveedor";
            ResultSet rs = st.executeQuery(sqlData);
           while(rs.next())
           {
        	   String v1=rs.getString("ruc"); 
        	   if(v1.equals(txtbuscar.getText())){
            	buscarProveedor();
                habilitarCajas();
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
                    this, "Deseas Buscar al Proveedor para Modificarlo?",
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
            JOptionPane.showMessageDialog(null, "Ingrese número de documento del Proveedor a Buscar");
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
        txtnombres.requestFocus();
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
       c_proveedor p;
       if (validarcamposcorrectos()==false)
   	{JOptionPane.showMessageDialog(null, "Ingrese valores correctos");
   		return;
   	}
   	else if (validarcamposcorrectos()==true){
   		try {
                p = d_proveedor.buscarRuc(txtbuscar.getText());
                p.setNombres(txtnombres.getText());
                p.setRazonsocial(txtrazonsocial.getText());
                p.setRuc(txtruc.getText());
                p.setDireccion(txtdireccion.getText());
                p.setCodciudad(cmbciudad.getSelectedItem().toString());
                p.setTelefono(txttelefono.getText());
                p.setCelular(txtcelular.getText());
                p.setCorreo(txtcorreo.getText());
                p.setWeb(txtweb.getText());
                //p.setFingreso(fecha());
                d_proveedor.actualizarProveedor(p);
                JOptionPane.showMessageDialog(null, " [ Datos Actualizados ]");
                limpiarCasillas();
                btnnuevo.setEnabled(true);
                btnbuscar.setEnabled(true);
                btneditar.setEnabled(false);
                btneliminar.setEnabled(false);
                limpiarCasillas();
                txtbuscar.requestFocus();
                msjfecha.setVisible(false);
                msjruc.setVisible(false);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }
   	}
    }//GEN-LAST:event_btneditarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        try {
            c_proveedor p = d_proveedor.buscarRuc(txtbuscar.getText());
            if (p == null) {
                JOptionPane.showMessageDialog(null, "No existe");
            } else {
                if (JOptionPane.showConfirmDialog(rootPane, "¿Desea eliminar este regitro?",
                "Eliminar registro", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                    d_proveedor.eliminarProveedor(String.valueOf(p.getRuc()));             
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
    private javax.swing.JComboBox cmbciudad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableProveedor;
    private javax.swing.JTextField txtrazonsocial;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txtweb;
    private JDateChooser dateChooser;
    private JTextField txtruc;
    private JLabel msjruc;
    private JLabel msjfecha;
}

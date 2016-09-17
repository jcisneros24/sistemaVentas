package Presentacion;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Datos.BD;
import Datos.d_empleado;
import Logica.c_empleado;

import com.toedter.calendar.JDateChooser;

public class frm_empleados extends javax.swing.JFrame {
		DefaultTableModel modeloTabla;
        Connection cnn = BD.getConnection();  
       PreparedStatement ps = null;  
       ResultSet rs;
    public frm_empleados() {
        modeloTabla=new DefaultTableModel(null,getColumnas());
        Filas();
        initComponents();
     
        try {
            ps = cnn.prepareStatement("SELECT codciudad FROM ciudad");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
            this.cmbciudad.addItem(rs.getString("codciudad"));
            }
        } catch (Exception e) {
        }
        
        try {
            ps = cnn.prepareStatement("SELECT cargo FROM cargo");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
            this.cmbcargo.addItem(rs.getString("cargo"));
            }
        } catch (Exception e) {
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEmpleado = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
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
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulario de Registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 14), java.awt.Color.darkGray)); // NOI18N
        jPanel2.setForeground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(null);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setBounds(428, 35, 155, 24);
        
                jLabel2.setText("Ingrese D.N.I.:");
                jPanel2.add(jLabel2);
        txtbuscar = new javax.swing.JTextField();
        txtbuscar.setBounds(508, 29, 200, 30);
        jPanel2.add(txtbuscar);
        btnbuscar = new javax.swing.JButton();
        btnbuscar.setBounds(715, 20, 60, 40);
        btnbuscar.setIcon(new ImageIcon(frm_empleados.class.getResource("/img/edit_find.png")));
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnbuscar);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setBounds(41, 105, 86, 14);
        
                jLabel3.setText("Nombres:");
                jPanel2.add(jLabel3);
        txtnombres = new javax.swing.JTextField();
        txtnombres.setBounds(120, 95, 270, 30);
        
                txtnombres.setEnabled(false);
                jPanel2.add(txtnombres);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(449, 105, 83, 14);
        
                jLabel4.setText("Apellidos:");
                jPanel2.add(jLabel4);
        txtapellidos = new javax.swing.JTextField();
        txtapellidos.setBounds(510, 95, 270, 30);
        
                txtapellidos.setEnabled(false);
                jPanel2.add(txtapellidos);
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setBounds(849, 105, 84, 14);
        
                jLabel6.setText("D.N.I. :");
                jPanel2.add(jLabel6);
        txtdni = new javax.swing.JTextField();
        txtdni.setBounds(905, 95, 270, 30);
        
                txtdni.setEnabled(false);
                jPanel2.add(txtdni);
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setBounds(64, 145, 46, 14);
        
                jLabel7.setText("Sexo:");
                jPanel2.add(jLabel7);
        cmbsexo = new javax.swing.JComboBox();
        cmbsexo.setBounds(120, 135, 270, 30);
        
                cmbsexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Maculino", "Femenino" }));
                jPanel2.add(cmbsexo);
        jLabel14 = new javax.swing.JLabel();
        jLabel14.setBounds(448, 145, 84, 14);
        
                jLabel14.setText("Direcci\u00F3n:");
                jPanel2.add(jLabel14);
        txtdireccion = new javax.swing.JTextField();
        txtdireccion.setBounds(510, 135, 270, 30);
        
                txtdireccion.setEnabled(false);
                jPanel2.add(txtdireccion);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setBounds(853, 145, 80, 14);
        
                jLabel5.setText("Cargo:");
                jPanel2.add(jLabel5);
        cmbcargo = new javax.swing.JComboBox();
        cmbcargo.setBounds(905, 135, 270, 30);
        jPanel2.add(cmbcargo);
        jLabel8 = new javax.swing.JLabel();
        jLabel8.setBounds(52, 185, 58, 14);
        
                jLabel8.setText("Ciudad :");
                jPanel2.add(jLabel8);
        
        cmbciudad = new JComboBox();
        cmbciudad.setBounds(120, 175, 270, 30);
        jPanel2.add(cmbciudad);
        jLabel9 = new javax.swing.JLabel();
        jLabel9.setBounds(449, 185, 83, 14);
        
                jLabel9.setText("Tel\u00E9fono:");
                jPanel2.add(jLabel9);
        txttelefono = new javax.swing.JTextField();
        txttelefono.setBounds(510, 175, 270, 30);
        
                txttelefono.setEnabled(false);
                jPanel2.add(txttelefono);
        jLabel10 = new javax.swing.JLabel();
        jLabel10.setBounds(849, 185, 84, 14);
        
                jLabel10.setText("Celular:");
                jPanel2.add(jLabel10);
        btnnuevo = new javax.swing.JButton();
        btnnuevo.setBounds(400, 265, 80, 50);
        btnnuevo.setIcon(new ImageIcon(frm_empleados.class.getResource("/img/plus.png")));
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        txtcelular = new javax.swing.JTextField();
        txtcelular.setBounds(905, 175, 270, 30);
        
                txtcelular.setEnabled(false);
                jPanel2.add(txtcelular);
        jLabel11 = new javax.swing.JLabel();
        jLabel11.setBounds(63, 225, 47, 14);
        
                jLabel11.setText("E-Mail:");
                jPanel2.add(jLabel11);
        txtcorreo = new javax.swing.JTextField();
        txtcorreo.setBounds(120, 215, 270, 30);
        
                txtcorreo.setEnabled(false);
                jPanel2.add(txtcorreo);
        jLabel12 = new javax.swing.JLabel();
        jLabel12.setBounds(469, 225, 63, 14);
        
                jLabel12.setText("Web:");
                jPanel2.add(jLabel12);
        txtweb = new javax.swing.JTextField();
        txtweb.setBounds(510, 215, 270, 30);
        
                txtweb.setEnabled(false);
                jPanel2.add(txtweb);
        jLabel13 = new javax.swing.JLabel();
        jLabel13.setBounds(783, 225, 150, 14);
        
                jLabel13.setText("Fecha de Nacimiento:");
                jPanel2.add(jLabel13);
        
        dateChooser = new JDateChooser();
        dateChooser.setEnabled(false);
        dateChooser.setBounds(905, 215, 270, 30);
        jPanel2.add(dateChooser);
        jPanel2.add(btnnuevo);
        btneditar = new javax.swing.JButton();
        btneditar.setBounds(640, 265, 80, 50);
        btneditar.setIcon(new ImageIcon(frm_empleados.class.getResource("/img/pencil3.png")));
        btneditar.setEnabled(false);
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });
        btnagregar = new javax.swing.JButton();
        btnagregar.setBounds(480, 265, 80, 50);
        btnagregar.setIcon(new ImageIcon(frm_empleados.class.getResource("/img/save.png")));
        btnagregar.setEnabled(false);
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnagregar);
        btncancelar = new javax.swing.JButton();
        btncancelar.setBounds(560, 265, 80, 50);
        btncancelar.setIcon(new ImageIcon(frm_empleados.class.getResource("/img/no.png")));
        btncancelar.setEnabled(false);
        btncancelar.setMaximumSize(new java.awt.Dimension(80, 20));
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btncancelar);
        jPanel2.add(btneditar);
        btncerrarventana = new javax.swing.JButton();
        btncerrarventana.setBounds(400, 320, 400, 50);
        btncerrarventana.setIcon(new ImageIcon(frm_empleados.class.getResource("/img/cancel2.png")));
        btncerrarventana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarventanaActionPerformed(evt);
            }
        });
        btneliminar = new javax.swing.JButton();
        btneliminar.setBounds(720, 265, 80, 50);
        btneliminar.setIcon(new ImageIcon(frm_empleados.class.getResource("/img/gnome_edit_delete.png")));
        btneliminar.setDoubleBuffered(true);
        btneliminar.setEnabled(false);
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btneliminar);
        jPanel2.add(btncerrarventana);

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1250, 370));
        
        msjdni = new JLabel("*");
        msjdni.setVisible(false);
        msjdni.setForeground(Color.RED);
        msjdni.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjdni.setBounds(1185, 105, 46, 14);
        jPanel2.add(msjdni);
        
        msjnacimiento = new JLabel("*");
        msjnacimiento.setVisible(false);
        msjnacimiento.setForeground(Color.RED);
        msjnacimiento.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjnacimiento.setBounds(1185, 225, 46, 14);
        jPanel2.add(msjnacimiento);
        
        msjapellidos = new JLabel("*");
        msjapellidos.setVisible(false);
        msjapellidos.setForeground(Color.RED);
        msjapellidos.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjapellidos.setBounds(783, 101, 46, 14);
        jPanel2.add(msjapellidos);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Lista de Empleados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        tableEmpleado.setModel(modeloTabla);
        jScrollPane1.setViewportView(tableEmpleado);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1242, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 1250, 250));
        jPanel3.getAccessibleContext().setAccessibleName("Lista de empleados");

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setForeground(new java.awt.Color(0, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de Empleados");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 6, 300, 40));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1253, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private String[] getColumnas(){
        String  columna[]=new String[]{"Nombres","Apellidos","DNI","Dirección","Ciudad","Cargo","Correo","Celular"};
        return columna;
    }
    private void Filas(){
    try{
        for(c_empleado c : d_empleado.mostrarEmpleado()){
            String Datos[]={c.getNombres(),c.getApellidos(),String.valueOf(c.getDni()),(c.getDireccion()),c.getCiudad(),c.getCargo(),c.getCorreo(),String.valueOf(c.getCelular())};
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
        txtapellidos.setText("");
        txtdni.setText("");
        cmbsexo.setSelectedItem("");
        txtdireccion.setText("");
        cmbcargo.setSelectedItem("");
        cmbciudad.setSelectedItem("");
        txttelefono.setText("");
        txtcelular.setText("");
        txtcorreo.setText("");
        txtweb.setText("");
        dateChooser.setDate(null);
    }
    private void habilitarCajas(){
    txtnombres.setEnabled(true);
    txtapellidos.setEnabled(true);
    txtdni.setEnabled(true);
    cmbsexo.setEnabled(true);
    txtdireccion.setEnabled(true);
    cmbcargo.setEnabled(true);
    cmbciudad.setEnabled(true);
    txttelefono.setEnabled(true);
    txtcelular.setEnabled(true);
    txtcorreo.setEnabled(true);
    txtweb.setEnabled(true);
    dateChooser.setEnabled(true); 
    }
    private void deshabilitarCajas(){
        txtnombres.setEnabled(false);
        txtapellidos.setEnabled(false);
        txtdni.setEnabled(false);
        cmbsexo.setEnabled(false);
        txtdireccion.setEnabled(false);
        cmbcargo.setEnabled(false);
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
    public void buscarEmpleado() {
        c_empleado emp = null;
        try {
            emp = d_empleado.buscarEmpleadoNumDoc(txtbuscar.getText());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR:" + e.getMessage());
        }
        if (emp != null) {
            txtnombres.setText(emp.getNombres());
            txtapellidos.setText(emp.getApellidos());
            txtdni.setText(String.valueOf(emp.getDni()));
            cmbsexo.setSelectedItem(emp.getSexo());
            txtdireccion.setText(emp.getDireccion());
            cmbcargo.setSelectedItem(emp.getCargo());
            cmbciudad.setSelectedItem(emp.getCiudad());
            txttelefono.setText(String.valueOf(emp.getTelefono()));
            txtcelular.setText(String.valueOf(emp.getCelular()));
            txtcorreo.setText(emp.getCorreo());
            txtweb.setText(emp.getWeb());
            dateChooser.setDateFormatString(emp.getFnaci());
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
        btncancelar.setEnabled(true);
        txtbuscar.setEditable(true);
        btnbuscar.setEnabled(true);
    }
    private boolean validarcamposcorrectos(){
    	boolean flag=true;
    	 if(txtdni.getText().compareTo("") == 0){
    		 msjdni.setVisible(true);
     		txtdni.requestFocus();
     		flag=false;
    	 }
    	 if(txtdni.getText().compareTo("")>8){
    		 msjdni.setVisible(true);
     		txtdni.requestFocus();
     		flag=false;
    	 }
    	 if(txtapellidos.getText().equals("")){
    		 msjapellidos.setVisible(true);
     		msjapellidos.requestFocus();
     		flag=false;
    	 }
    	 if( dateChooser.getDate()==null){
     		msjnacimiento.setVisible(true);
     		flag=false;
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
    		c_empleado emp=new c_empleado();
        emp.setNombres(txtnombres.getText());
        emp.setApellidos(txtapellidos.getText());
        emp.setDni(Integer.parseInt(txtdni.getText()));
        emp.setSexo(cmbsexo.getSelectedItem().toString());
        emp.setDireccion(txtdireccion.getText());
        emp.setCargo(cmbcargo.getSelectedItem().toString());
        emp.setCiudad(cmbciudad.getSelectedItem().toString());
        emp.setTelefono(txttelefono.getText());
        emp.setCelular(txtcelular.getText());
        emp.setCorreo(txtcorreo.getText());
        emp.setWeb(txtweb.getText());
        emp.setFnaci(fecha());       
        
                 d_empleado.insertarEmpleado(emp);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Datos Agregados Correctamente");
            limpiarCasillas();
            txtbuscar.setEnabled(true);
            btnbuscar.setEnabled(true);
        }       
    }//GEN-LAST:event_btnagregarActionPerformed
    private boolean validarbuscary(){
    	boolean flag=true;
    	try{
        	String sqlData;
        	Connection cnn = BD.getConnection();
            Statement st = cnn.createStatement();
            sqlData = "select dni from empleado";
            ResultSet rs = st.executeQuery(sqlData);
           while(rs.next())
           {
        	   String v1=rs.getString("dni"); 
        	   if(v1.equals(txtbuscar.getText())){
            	buscarEmpleado();
                habilitarCajas();
                txtdni.setEnabled(false);
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
            sqlData = "select dni from empleado";
            ResultSet rs = st.executeQuery(sqlData);
           while(rs.next())
           {
        	   String v1=rs.getString("dni"); 
        	   if(v1.equals(txtbuscar.getText())){
            	buscarEmpleado();
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
                    this, "Deseas Buscar al Empleado para Modificarlo?",
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
            JOptionPane.showMessageDialog(null, "Ingrese número de documento del Empleado a Buscar");
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
       c_empleado emp;
       if (validarcamposcorrectos()==false)
   	{JOptionPane.showMessageDialog(null, "Ingrese valores correctos");
   		return;
   	}else if (validarcamposcorrectos()==true){
   		try {
                emp = d_empleado.buscarEmpleadoNumDoc(txtdni.getText());
                emp.setNombres(txtnombres.getText());
                emp.setApellidos(txtapellidos.getText());
                emp.setDni(Integer.parseInt(txtdni.getText()));
                emp.setSexo(cmbsexo.getSelectedItem().toString());
                emp.setDireccion(txtdireccion.getText());
                emp.setCiudad(cmbciudad.getSelectedItem().toString());
                emp.setCargo(cmbcargo.getSelectedItem().toString());
                emp.setTelefono(txttelefono.getText());
                emp.setCelular(txtcelular.getText());
                emp.setCorreo(txtcorreo.getText());
                emp.setWeb(txtweb.getText());
                //emp.setFnaci(fecha());
                d_empleado.actualizarEmpleado(emp);
                JOptionPane.showMessageDialog(null, " [ Datos Actualizados ]");
                btnnuevo.setEnabled(true);
                btnbuscar.setEnabled(true);
                btneditar.setEnabled(false);
                btneliminar.setEnabled(false); 
                limpiarCasillas();
                txtbuscar.requestFocus();
                msjapellidos.setVisible(false);
                msjdni.setVisible(false);
                msjnacimiento.setVisible(false);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }
   	}
    }//GEN-LAST:event_btneditarActionPerformed
    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        try {
            c_empleado emp = d_empleado.buscarEmpleadoNumDoc(txtbuscar.getText());
            if (emp == null) {
                JOptionPane.showMessageDialog(null, "No existe");
            } else {
                if (JOptionPane.showConfirmDialog(rootPane, "¿Desea eliminar este regitro?",
                "Eliminar registro", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                d_empleado.eliminarEmpleado(String.valueOf(emp.getDni()));
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
    private javax.swing.JComboBox cmbcargo;
    private javax.swing.JComboBox cmbsexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableEmpleado;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txtweb;
    private JComboBox cmbciudad;
    private JDateChooser dateChooser;
    private JLabel msjdni;
    private JLabel msjnacimiento;
    private JLabel msjapellidos;
}

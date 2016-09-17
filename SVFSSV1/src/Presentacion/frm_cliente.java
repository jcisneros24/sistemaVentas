package Presentacion;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Calendar;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Datos.BD;
import Datos.d_cliente;
import Logica.c_cliente;

import com.toedter.calendar.JDateChooser;

public class frm_cliente extends javax.swing.JFrame {
	DateFormat df = DateFormat.getDateInstance();
	DefaultTableModel modeloTabla;
	Connection cnn = BD.getConnection();
	PreparedStatement ps = null;
	ResultSet rs;

	public frm_cliente() {
		modeloTabla = new DefaultTableModel(null, getColumnas());
		Filas();
		initComponents();
		this.cmbciudad.removeAllItems();
		try {
			ps = cnn.prepareStatement("SELECT codciudad FROM ciudad");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				this.cmbciudad.addItem(rs.getString("codciudad"));
			}
		} catch (Exception e) {
		}
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel4 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jPanel2.setBounds(0, 40, 1205, 376);
		jPanel3 = new javax.swing.JPanel();
		jPanel3.setBounds(0, 415, 1260, 291);
		jScrollPane1 = new javax.swing.JScrollPane();
		tableCliente = new javax.swing.JTable();
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
		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
				"Formulario de Registro",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Times New Roman", 2, 14),
				java.awt.Color.darkGray)); // NOI18N
		jPanel2.setForeground(new java.awt.Color(204, 255, 204));
		btnagregar = new javax.swing.JButton();
		btnagregar.setBounds(480, 265, 80, 50);
		btnagregar.setIcon(new ImageIcon(frm_cliente.class
				.getResource("/img/save.png")));
		btnagregar.setEnabled(false);
		btnagregar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnagregarActionPerformed(evt);
			}
		});
		jPanel2.setLayout(null);
		jLabel2 = new javax.swing.JLabel();
		jLabel2.setBounds(415, 38, 110, 23);
		
				jLabel2.setText("Ingrese D.N.I.:");
				jPanel2.add(jLabel2);
		btnbuscar = new javax.swing.JButton();
		btnbuscar.setBounds(720, 20, 60, 40);
		btnbuscar.setIcon(new ImageIcon(frm_cliente.class
				.getResource("/img/edit_find.png")));
		btnbuscar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnbuscarActionPerformed(evt);
			}
		});
		txtbuscar = new javax.swing.JTextField();
		txtbuscar.setBounds(510, 31, 200, 30);
		jPanel2.add(txtbuscar);
		jPanel2.add(btnbuscar);
		jLabel3 = new javax.swing.JLabel();
		jLabel3.setBounds(52, 103, 140, 14);
		
				jLabel3.setText("Nombres:");
				jPanel2.add(jLabel3);
		txtnombres = new javax.swing.JTextField();
		txtnombres.setBounds(120, 95, 270, 30);
		
				txtnombres.setEnabled(false);
				jPanel2.add(txtnombres);
		jLabel4 = new javax.swing.JLabel();
		jLabel4.setBounds(451, 103, 119, 14);
		
				jLabel4.setText("Apellidos:");
				jPanel2.add(jLabel4);
		txtapellidos = new javax.swing.JTextField();
		txtapellidos.setBounds(510, 95, 270, 30);
		
				txtapellidos.setEnabled(false);
				jPanel2.add(txtapellidos);
		jLabel6 = new javax.swing.JLabel();
		jLabel6.setBounds(859, 103, 65, 14);
		
				jLabel6.setText("   D.N.I. :");
				jPanel2.add(jLabel6);
		txtdni = new javax.swing.JTextField();
		txtdni.setBounds(909, 95, 270, 30);
			
				txtdni.setEnabled(false);
				jPanel2.add(txtdni);
		jLabel7 = new javax.swing.JLabel();
		jLabel7.setBounds(74, 138, 91, 14);
		
				jLabel7.setText("Sexo:");
				jPanel2.add(jLabel7);
		cmbsexo = new javax.swing.JComboBox();
		cmbsexo.setBounds(120, 130, 270, 30);
		
				cmbsexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
						"Maculino", "Femenino" }));
				jPanel2.add(cmbsexo);
		jLabel14 = new javax.swing.JLabel();
		jLabel14.setBounds(450, 138, 120, 14);
		
				jLabel14.setText("Direcci\u00F3n:");
				jPanel2.add(jLabel14);
		txtdireccion = new javax.swing.JTextField();
		txtdireccion.setBounds(510, 130, 270, 30);
		
				txtdireccion.setEnabled(false);
				jPanel2.add(txtdireccion);
		jLabel8 = new javax.swing.JLabel();
		jLabel8.setBounds(859, 138, 102, 14);
		
				jLabel8.setText("Ciudad :");
				jPanel2.add(jLabel8);
		cmbciudad = new javax.swing.JComboBox();
		cmbciudad.setBounds(909, 130, 270, 30);
		
				cmbciudad.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
						"Huacho", "Barranca", "Huaura", "Huaral", "Lima" }));
				jPanel2.add(cmbciudad);
		jLabel9 = new javax.swing.JLabel();
		jLabel9.setBounds(54, 173, 140, 14);
		
				jLabel9.setText("Tel\u00E9fono:");
				jPanel2.add(jLabel9);
		txttelefono = new javax.swing.JTextField();
		txttelefono.setBounds(120, 165, 270, 30);
		
				txttelefono.setEnabled(false);
				jPanel2.add(txttelefono);
		jLabel10 = new javax.swing.JLabel();
		jLabel10.setBounds(460, 173, 110, 14);
		
				jLabel10.setText("Celular:");
				jPanel2.add(jLabel10);
		txtcelular = new javax.swing.JTextField();
		txtcelular.setBounds(510, 165, 270, 30);
		
				txtcelular.setEnabled(false);
				jPanel2.add(txtcelular);
		jLabel11 = new javax.swing.JLabel();
		jLabel11.setBounds(863, 173, 98, 14);
		
				jLabel11.setText("E-Mail:");
				jPanel2.add(jLabel11);
		txtcorreo = new javax.swing.JTextField();
		txtcorreo.setBounds(909, 165, 270, 30);
		
				txtcorreo.setEnabled(false);
				jPanel2.add(txtcorreo);
		jLabel12 = new javax.swing.JLabel();
		jLabel12.setBounds(76, 208, 140, 14);
		
				jLabel12.setText("Web:");
				jPanel2.add(jLabel12);
		txtweb = new javax.swing.JTextField();
		txtweb.setBounds(120, 200, 270, 30);
		
				txtweb.setEnabled(false);
				jPanel2.add(txtweb);
		jLabel13 = new javax.swing.JLabel();
		jLabel13.setBounds(392, 208, 171, 14);
		
				jLabel13.setText("   Fecha Nacimiento:");
				jPanel2.add(jLabel13);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(510, 200, 270, 30);
		dateChooser.setEnabled(false);
		jPanel2.add(dateChooser);
		btnnuevo = new javax.swing.JButton();
		btnnuevo.setBounds(400, 265, 80, 50);
		btnnuevo.setIcon(new ImageIcon(frm_cliente.class
				.getResource("/img/plus.png")));
		btnnuevo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnnuevoActionPerformed(evt);
			}
		});
		jPanel2.add(btnnuevo);
		jPanel2.add(btnagregar);
		btneditar = new javax.swing.JButton();
		btneditar.setBounds(640, 265, 80, 50);
		btneditar.setIcon(new ImageIcon(frm_cliente.class
				.getResource("/img/pencil3.png")));
		btneditar.setEnabled(false);
		btneditar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btneditarActionPerformed(evt);
			}
		});
		btncancelar = new javax.swing.JButton();
		btncancelar.setBounds(560, 265, 80, 50);
		btncancelar.setIcon(new ImageIcon(frm_cliente.class
				.getResource("/img/no.png")));
		btncancelar.setEnabled(false);
		btncancelar.setMaximumSize(new java.awt.Dimension(80, 20));
		btncancelar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btncancelarActionPerformed(evt);
			}
		});
		jPanel2.add(btncancelar);
		jPanel2.add(btneditar);
		btneliminar = new javax.swing.JButton();
		btneliminar.setBounds(720, 265, 80, 50);
		btneliminar.setIcon(new ImageIcon(frm_cliente.class
				.getResource("/img/gnome_edit_delete.png")));
		btneliminar.setDoubleBuffered(true);
		btneliminar.setEnabled(false);
		btneliminar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btneliminarActionPerformed(evt);
			}
		});
		jPanel2.add(btneliminar);
		btncerrarventana = new javax.swing.JButton();
		btncerrarventana.setBounds(400, 320, 400, 50);
		btncerrarventana.setIcon(new ImageIcon(frm_cliente.class
				.getResource("/img/cancel2.png")));
		btncerrarventana.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btncerrarventanaActionPerformed(evt);
			}
		});
		jPanel2.add(btncerrarventana);
		jPanel4.setLayout(null);

		jPanel4.add(jPanel2);
		
		msjdni = new JLabel("*");
		msjdni.setVisible(false);
		msjdni.setForeground(Color.RED);
		msjdni.setFont(new Font("Tahoma", Font.PLAIN, 20));
		msjdni.setBounds(1186, 103, 19, 14);
		jPanel2.add(msjdni);
		
		msjnacimiento = new JLabel("*");
		msjnacimiento.setVisible(false);
		msjnacimiento.setForeground(Color.RED);
		msjnacimiento.setFont(new Font("Tahoma", Font.PLAIN, 20));
		msjnacimiento.setBounds(790, 208, 46, 14);
		jPanel2.add(msjnacimiento);
		
		msjnombres = new JLabel("*");
		msjnombres.setVisible(false);
		msjnombres.setForeground(Color.RED);
		msjnombres.setFont(new Font("Tahoma", Font.PLAIN, 20));
		msjnombres.setBounds(395, 103, 46, 14);
		jPanel2.add(msjnombres);

		jPanel3.setBackground(new java.awt.Color(255, 255, 255));
		jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createTitledBorder(""),
				"Lista de Clientes",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Times New Roman", 2, 14),
				new java.awt.Color(102, 102, 102))); // NOI18N

		tableCliente.setModel(modeloTabla);
		jScrollPane1.setViewportView(tableCliente);
		if (tableCliente.getColumnModel().getColumnCount() > 0) {
			tableCliente.getColumnModel().getColumn(0)
					.setHeaderValue("Nombres");
			tableCliente.getColumnModel().getColumn(1)
					.setHeaderValue("Apellidos");
			tableCliente.getColumnModel().getColumn(2).setHeaderValue("DNI");
			tableCliente.getColumnModel().getColumn(3)
					.setHeaderValue("Dirección");
			tableCliente.getColumnModel().getColumn(4).setHeaderValue("Ciudad");
			tableCliente.getColumnModel().getColumn(5).setHeaderValue("E-Mail");
			tableCliente.getColumnModel().getColumn(6).setHeaderValue("Web");
			tableCliente.getColumnModel().getColumn(7)
					.setHeaderValue("Celular");
		}

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3Layout.setHorizontalGroup(
			jPanel3Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, jPanel3Layout.createSequentialGroup()
					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 1200, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(52, Short.MAX_VALUE))
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
		jLabel1.setText("Registro de Clientes");
		jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(
				500, 0, -1, 35));

		jPanel4.add(jPanel1);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 1207, GroupLayout.PREFERRED_SIZE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 661, GroupLayout.PREFERRED_SIZE)
		);
		getContentPane().setLayout(groupLayout);

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents
	private String[] getColumnas() {
		String columna[] = new String[] { "Nombres", "Apellidos", "DNI",
				"Dirección", "Ciudad", "Correo", "Web", "Celular" };
		return columna;
	}
	private void Filas() {
		try {
			for (c_cliente c : d_cliente.mostrarCliente()) {
				String Datos[] = { c.getNombres(), c.getApellidos(),
						String.valueOf(c.getDni()), (c.getDireccion()),
						c.getCiudad(), c.getCorreo(), c.getWeb(),
						String.valueOf(c.getCelular()) };
				modeloTabla.addRow(Datos);
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
		}
	}
	private String fecha_naci(){
		String fnaci;
		String dia = Integer.toString(dateChooser.getCalendar().get(Calendar.DAY_OF_MONTH));
		String mes = Integer.toString(dateChooser.getCalendar().get(Calendar.MONTH) + 1);
		String year = Integer.toString(dateChooser.getCalendar().get(Calendar.YEAR));
		fnaci = (year + "-" + mes+ "-" + dia);
		return fnaci;
	}
	private void limpiarCasillas() {
		txtbuscar.setText("");
		txtnombres.setText("");
		txtapellidos.setText("");
		txtdni.setText("");
		cmbsexo.setSelectedItem("");
		txtdireccion.setText("");
		cmbciudad.setSelectedItem("");
		txttelefono.setText("");
		txtcelular.setText("");
		txtcorreo.setText("");
		txtweb.setText("");
		dateChooser.setDate(null);
	}
	private void habilitarCajas() {
		txtnombres.setEnabled(true);
		txtapellidos.setEnabled(true);
		txtdni.setEnabled(true);
		cmbsexo.setEnabled(true);
		txtdireccion.setEnabled(true);
		cmbciudad.setEnabled(true);
		txttelefono.setEnabled(true);
		txtcelular.setEnabled(true);
		txtcorreo.setEnabled(true);
		txtweb.setEnabled(true);
		dateChooser.setEnabled(true);
	}
	private void deshabilitarCajas() {
		txtnombres.setEnabled(false);
		txtapellidos.setEnabled(false);
		txtdni.setEnabled(false);
		cmbsexo.setEnabled(false);
		txtdireccion.setEnabled(false);
		cmbciudad.setEnabled(false);
		txttelefono.setEnabled(false);
		txtcelular.setEnabled(false);
		txtcorreo.setEnabled(false);
		txtweb.setEnabled(false);
		dateChooser.setEnabled(false);
	}
	private void habilitarBotones() {
		btnagregar.setEnabled(true);
		btneditar.setEnabled(true);
		btncancelar.setEnabled(true);
	}
	public void buscarCliente() {
		c_cliente c = null;
		try {
			c = d_cliente.buscarClienteNumDoc(txtbuscar.getText());
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERROR:" + e.getMessage());
		}
		if (c != null) {
			txtnombres.setText(c.getNombres());
			txtapellidos.setText(c.getApellidos());
			txtdni.setText(String.valueOf(c.getDni()));
			cmbsexo.setSelectedItem(c.getSexo());
			txtdireccion.setText(c.getDireccion());
			cmbciudad.setSelectedItem(c.getCiudad());
			txttelefono.setText(String.valueOf(c.getTelefono()));
			txtcelular.setText(String.valueOf(c.getCelular()));
			txtcorreo.setText(c.getCorreo());
			txtweb.setText(c.getWeb());
			dateChooser.setDateFormatString(c.getFnaci());
			btncancelar.setEnabled(true);
			btnnuevo.setEnabled(false);
			btneditar.setEnabled(true);
			btneliminar.setEnabled(true);
		} else {
			txtbuscar.setText("");
			btnnuevo.setEnabled(true);
			btncancelar.setEnabled(false);
			txtbuscar.setEditable(true);
			txtbuscar.requestFocus();
			JOptionPane.showMessageDialog(null, "No existe");
		}
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
		 if(txtnombres.getText().equals("")){
			 msjnombres.setVisible(true);
	     		txtdni.requestFocus();
	     		flag=false;
		 }
		 if( dateChooser.getDate()==null){
	    		msjnacimiento.setVisible(true);
	    		flag=false;
	    	} 
		return flag;
	}
	private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnagregarActionPerformed
		// Agregar un nuevo registro
		if (validarcamposcorrectos()==false)
    	{JOptionPane.showMessageDialog(null, "Ingrese valores correctos");
    		return;
    	}
    	else if (validarcamposcorrectos()==true){						
			try {				
				c_cliente c = new c_cliente();
				c.setNombres(txtnombres.getText());
				c.setApellidos(txtapellidos.getText());
				c.setDni(Integer.parseInt(txtdni.getText()));
				c.setSexo(cmbsexo.getSelectedItem().toString());
				c.setDireccion(txtdireccion.getText());
				c.setCiudad(cmbciudad.getSelectedItem().toString());
				c.setTelefono(txttelefono.getText());
				c.setCelular(txtcelular.getText());
				c.setCorreo(txtcorreo.getText());
				c.setWeb(txtweb.getText());				
				c.setFnaci(fecha_naci());			
				d_cliente.insertarCliente(c);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,
						"Error BD: " + e.getMessage());
			}
			JOptionPane
					.showMessageDialog(null, "Datos Agregados Correctamente");
			limpiarCasillas();
			txtbuscar.setEnabled(true);
			btnbuscar.setEnabled(true);
			msjdni.setVisible(false);
			msjnacimiento.setVisible(false);
			msjnombres.setVisible(false);
		}
	}// GEN-LAST:event_btnagregarActionPerformed
	private boolean validarbuscary(){
    	boolean flag=true;
    	try{
        	String sqlData;
        	Connection cnn = BD.getConnection();
            Statement st = cnn.createStatement();
            sqlData = "select dni from cliente";
            ResultSet rs = st.executeQuery(sqlData);
           while(rs.next())
           {
        	   String v1=rs.getString("dni"); 
        	   if(v1.equals(txtbuscar.getText())){
            	buscarCliente();
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
            sqlData = "select dni from cliente";
            ResultSet rs = st.executeQuery(sqlData);
           while(rs.next())
           {
        	   String v1=rs.getString("dni"); 
        	   if(v1.equals(txtbuscar.getText())){
            	buscarCliente();
                deshabilitarCajas();
                return false;
        	   }
        	}
        	}
		catch (Exception e) {
	    }
    	return flag;
    }
	private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnbuscarActionPerformed
		if (txtbuscar.getText().compareTo("") != 0) {
			int result = JOptionPane.showConfirmDialog(this,
					"Deseas Buscar al Cliente para Modificarlo?",
					"Mensaje..!!", JOptionPane.YES_NO_OPTION);
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
			JOptionPane.showMessageDialog(null,
					"Ingrese número de documento del Cliente a Buscar");
			txtbuscar.requestFocus();
		}
	}// GEN-LAST:event_btnbuscarActionPerformed
	private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnnuevoActionPerformed
		limpiarCasillas();
		habilitarBotones();
		habilitarCajas();
		txtbuscar.setEnabled(false);
		btnbuscar.setEnabled(false);
		btnagregar.setEnabled(true);
		btneditar.setEnabled(false);
		txtnombres.requestFocus();
	}// GEN-LAST:event_btnnuevoActionPerformed
	private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btncancelarActionPerformed
		limpiarCasillas();
		deshabilitarCajas();
		btnnuevo.setEnabled(true);
		btnbuscar.setEnabled(true);
		btneditar.setEnabled(false);
		btneliminar.setEnabled(false);
		txtbuscar.setEnabled(true);
		txtbuscar.requestFocus();
	}// GEN-LAST:event_btncancelarActionPerformed
	private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btneditarActionPerformed
		c_cliente c;
			if (validarcamposcorrectos()==false)
	    	{JOptionPane.showMessageDialog(null, "Ingrese valores correctos");
	    		return;
	    	}
	    	else if (validarcamposcorrectos()==true){
	    		try {
	    		c = d_cliente.buscarClienteNumDoc(txtdni.getText());
				c.setNombres(txtnombres.getText());
				c.setApellidos(txtapellidos.getText());
				c.setDni(Integer.parseInt(txtdni.getText()));
				c.setSexo(cmbsexo.getSelectedItem().toString());
				c.setDireccion(txtdireccion.getText());
				c.setCiudad(cmbciudad.getSelectedItem().toString());
				c.setTelefono(txttelefono.getText());
				c.setCelular(txtcelular.getText());
				c.setCorreo(txtcorreo.getText());
				c.setWeb(txtweb.getText());
				//c.setFnaci(fecha_naci());
				d_cliente.actualizarCliente(c);
				JOptionPane.showMessageDialog(null, " [ Datos Actualizados ]");
				btnnuevo.setEnabled(true);
				btnbuscar.setEnabled(true);
				btneditar.setEnabled(false);
				btneliminar.setEnabled(false);
				limpiarCasillas();
				txtbuscar.requestFocus();
				msjdni.setVisible(false);
				msjnacimiento.setVisible(false);
				msjnombres.setVisible(false);
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
		}
		
	}// GEN-LAST:event_btneditarActionPerformed
	}
	private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btneliminarActionPerformed
		// TODO add your handling code here:
		try {
			c_cliente c = d_cliente.buscarClienteNumDoc(txtbuscar.getText());
			if (c == null) {
				JOptionPane.showMessageDialog(null, "No existe");
			} else {
				if (JOptionPane.showConfirmDialog(rootPane,
						"¿Desea eliminar este regitro?", "Eliminar registro",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
					d_cliente.eliminarCliente(String.valueOf(c.getDni()));
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
		}
		limpiarCasillas();
	}// GEN-LAST:event_btneliminarActionPerformed

	private void btncerrarventanaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btncerrarventanaActionPerformed
		dispose();
	}// GEN-LAST:event_btncerrarventanaActionPerformed

	private void jPanel4ComponentAdded(java.awt.event.ContainerEvent evt) {// GEN-FIRST:event_jPanel4ComponentAdded
		setLocationRelativeTo(null);
	}// GEN-LAST:event_jPanel4ComponentAdded
		// Variables declaration - do not modify//GEN-BEGIN:variables

	private javax.swing.JButton btnagregar;
	private javax.swing.JButton btnbuscar;
	private javax.swing.JButton btncancelar;
	private javax.swing.JButton btncerrarventana;
	private javax.swing.JButton btneditar;
	private javax.swing.JButton btneliminar;
	private javax.swing.JButton btnnuevo;
	private javax.swing.JComboBox cmbciudad;
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
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable tableCliente;
	private javax.swing.JTextField txtapellidos;
	private javax.swing.JTextField txtcelular;
	private javax.swing.JTextField txtbuscar;
	private javax.swing.JTextField txtcorreo;
	private javax.swing.JTextField txtdireccion;
	private javax.swing.JTextField txtdni;
	private javax.swing.JTextField txtnombres;
	private javax.swing.JTextField txttelefono;
	private javax.swing.JTextField txtweb;
	private JDateChooser dateChooser;
	private JLabel msjdni;
	private JLabel msjnacimiento;
	private JLabel msjnombres;
}

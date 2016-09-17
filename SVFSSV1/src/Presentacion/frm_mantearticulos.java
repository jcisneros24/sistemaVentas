package Presentacion;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import Datos.BD;
import Datos.d_articulos;
import Logica.c_articulos;

import com.toedter.calendar.JDateChooser;
import java.awt.Font;
import java.awt.Color;

public class frm_mantearticulos extends javax.swing.JFrame {
       DefaultTableModel modeloTabla;
       private TableRowSorter trsfiltro;
       Connection cnn = BD.getConnection();  
       PreparedStatement ps = null;
    public frm_mantearticulos() {
        modeloTabla=new DefaultTableModel(null,getColumnas());
        Filas();
        initComponents();
        this.cmbfamilia.removeAllItems();
        try {
            ps = cnn.prepareStatement("SELECT codfam FROM familias");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
            this.cmbfamilia.addItem(rs.getString("codfam"));
            }
        } catch (Exception e) {
        }
        try {
            ps = cnn.prepareStatement("SELECT codmedida FROM medida");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
            this.cmbmedida.addItem(rs.getString("codmedida"));
            }
        } catch (Exception e) {
        }
        try {
            ps = cnn.prepareStatement("SELECT nombres FROM proveedor");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
            this.cmbproveedor.addItem(rs.getString("nombres"));
            }
        } catch (Exception e) {
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel2.setBounds(0, 40, 430, 510);
        jPanel3 = new javax.swing.JPanel();
        jPanel3.setBorder(new TitledBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Lista de Articulos", TitledBorder.LEADING, TitledBorder.TOP, null, null), "Lista de Articulos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        jPanel3.setBounds(440, 40, 810, 510);
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane1.addPropertyChangeListener(new PropertyChangeListener() {
        	public void propertyChange(PropertyChangeEvent arg0) {
        	}
        });
        jScrollPane1.setBounds(4, 59, 802, 445);
        tableArticulo = new javax.swing.JTable();
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
        jPanel2.setLayout(null);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setBounds(10, 29, 96, 20);
        
                jLabel2.setText("Buscar Articulo:");
                jPanel2.add(jLabel2);
        txtbuscar = new javax.swing.JTextField();
        txtbuscar.setBounds(116, 25, 200, 30);
        jPanel2.add(txtbuscar);
        btnbuscar = new javax.swing.JButton();
        btnbuscar.setBounds(327, 15, 60, 40);
        btnbuscar.setIcon(new ImageIcon(frm_mantearticulos.class.getResource("/img/edit_find.png")));
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnbuscar);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setBounds(64, 71, 95, 14);
        
                jLabel3.setText("Codigo:");
                jPanel2.add(jLabel3);
        txtcodigo = new javax.swing.JTextField();
        txtcodigo.setBounds(116, 65, 270, 30);
        
                txtcodigo.setEnabled(false);
                jPanel2.add(txtcodigo);
        
        txtidarticulo = new JTextField();
        txtidarticulo.setBounds(389, 66, 35, 14);
        txtidarticulo.setVisible(false);
        txtidarticulo.setEnabled(false);
        txtidarticulo.setEditable(false);
        jPanel2.add(txtidarticulo);
        txtidarticulo.setColumns(10);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(43, 111, 116, 14);
        
                jLabel4.setText("Descripcion:");
                jPanel2.add(jLabel4);
        txtdescripcion = new javax.swing.JTextField();
        txtdescripcion.setBounds(116, 105, 270, 30);
        
                txtdescripcion.setEnabled(false);
                jPanel2.add(txtdescripcion);
        
        lblColor = new JLabel();
        lblColor.setBounds(72, 151, 87, 14);
        lblColor.setText("Color:");
        jPanel2.add(lblColor);
        
        txtcolor = new JTextField();
        txtcolor.setBounds(116, 145, 270, 30);
        txtcolor.setEnabled(false);
        jPanel2.add(txtcolor);
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setBounds(67, 191, 92, 14);
        
                jLabel7.setText("Familia:");
                jPanel2.add(jLabel7);
        cmbfamilia = new javax.swing.JComboBox();
        cmbfamilia.setBounds(118, 185, 270, 30);
        jPanel2.add(cmbfamilia);
        jLabel8 = new javax.swing.JLabel();
        jLabel8.setBounds(35, 231, 124, 14);
        
                jLabel8.setText("          Medida:");
                jPanel2.add(jLabel8);
        cmbmedida = new javax.swing.JComboBox();
        cmbmedida.setBounds(118, 225, 270, 30);
        jPanel2.add(cmbmedida);
        jLabel10 = new javax.swing.JLabel();
        jLabel10.setBounds(49, 271, 110, 14);
        
                jLabel10.setText("Proveedor:");
                jPanel2.add(jLabel10);
        
        cmbproveedor = new JComboBox();
        cmbproveedor.setBounds(118, 265, 270, 30);
        jPanel2.add(cmbproveedor);
        
        JLabel lblFechaDeIngreso = new JLabel();
        lblFechaDeIngreso.setBounds(10, 352, 145, 14);
        lblFechaDeIngreso.setText("Fecha de Ingreso:");
        jPanel2.add(lblFechaDeIngreso);
        btnagregar = new javax.swing.JButton();
        btnagregar.setBounds(90, 402, 80, 50);
        btnagregar.setIcon(new ImageIcon(frm_mantearticulos.class.getResource("/img/save.png")));
        btnagregar.setEnabled(false);
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        btnnuevo = new javax.swing.JButton();
        btnnuevo.setBounds(10, 402, 80, 50);
        btnnuevo.setIcon(new ImageIcon(frm_mantearticulos.class.getResource("/img/plus.png")));
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        
        dateChooser = new JDateChooser();
        dateChooser.setEnabled(false);
        dateChooser.setBounds(118, 347, 270, 30);
        jPanel2.add(dateChooser);
        jPanel2.add(btnnuevo);
        jPanel2.add(btnagregar);
        btncancelar = new javax.swing.JButton();
        btncancelar.setBounds(170, 402, 80, 50);
        btncancelar.setIcon(new ImageIcon(frm_mantearticulos.class.getResource("/img/no.png")));
        btncancelar.setEnabled(false);
        btncancelar.setMaximumSize(new java.awt.Dimension(80, 20));
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btncancelar);
        btneliminar = new javax.swing.JButton();
        btneliminar.setBounds(330, 402, 80, 50);
        btneliminar.setIcon(new ImageIcon(frm_mantearticulos.class.getResource("/img/gnome_edit_delete.png")));
        btneliminar.setDoubleBuffered(true);
        btneliminar.setEnabled(false);
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        btneditar = new javax.swing.JButton();
        btneditar.setBounds(250, 402, 80, 50);
        btneditar.setIcon(new ImageIcon(frm_mantearticulos.class.getResource("/img/pencil3.png")));
        btneditar.setEnabled(false);
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });
        jPanel2.add(btneditar);
        jPanel2.add(btneliminar);
        btncerrarventana = new javax.swing.JButton();
        btncerrarventana.setBounds(10, 456, 400, 50);
        btncerrarventana.setIcon(new ImageIcon(frm_mantearticulos.class.getResource("/img/cancel2.png")));
        btncerrarventana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarventanaActionPerformed(evt);
            }
        });
        jPanel2.add(btncerrarventana);
        jPanel4.setLayout(null);

        jPanel4.add(jPanel2);
        
        JLabel lblEstado = new JLabel();
        lblEstado.setText("Estado:");
        lblEstado.setBounds(48, 312, 110, 14);
        jPanel2.add(lblEstado);
        
        cmbestado = new JComboBox();
        cmbestado.setModel(new DefaultComboBoxModel(new String[] {"ACTIVO", "INACTIVO"}));
        cmbestado.setBounds(118, 305, 270, 30);
        jPanel2.add(cmbestado);
        
        msjcodarti = new JLabel("*");
        msjcodarti.setVisible(false);
        msjcodarti.setForeground(Color.RED);
        msjcodarti.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjcodarti.setBounds(389, 81, 46, 14);
        jPanel2.add(msjcodarti);
        
        msjdescripcion = new JLabel("*");
        msjdescripcion.setVisible(false);
        msjdescripcion.setForeground(Color.RED);
        msjdescripcion.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjdescripcion.setBounds(389, 111, 46, 14);
        jPanel2.add(msjdescripcion);
        
        msjcolor = new JLabel("*");
        msjcolor.setVisible(false);
        msjcolor.setForeground(Color.RED);
        msjcolor.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjcolor.setBounds(389, 151, 46, 14);
        jPanel2.add(msjcolor);
        
        msjfingreso = new JLabel("*");
        msjfingreso.setVisible(false);
        msjfingreso.setForeground(Color.RED);
        msjfingreso.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjfingreso.setBounds(389, 352, 46, 14);
        jPanel2.add(msjfingreso);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tableArticulo.setModel(modeloTabla);
        jScrollPane1.setViewportView(tableArticulo);
        if (tableArticulo.getColumnModel().getColumnCount() > 0) {
        	tableArticulo.getColumnModel().getColumn(0).setHeaderValue("Codigo");
        	tableArticulo.getColumnModel().getColumn(1).setHeaderValue("Descripcion");
        	tableArticulo.getColumnModel().getColumn(2).setHeaderValue("Familia");
        	tableArticulo.getColumnModel().getColumn(3).setHeaderValue("Estado");

        }
        jPanel4.add(jPanel3);
        jPanel3.setLayout(null);
        jPanel3.add(jScrollPane1);
        
        txtbuscarPorTeclado = new JTextField();
        txtbuscarPorTeclado.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyTyped(KeyEvent arg0) {
        		txtbuscarPorTeclado.addKeyListener(new KeyAdapter() {
        			public void keyReleased(final KeyEvent e) {
        			String cadena = (txtbuscarPorTeclado.getText()).toUpperCase();
        			txtbuscarPorTeclado.setText(cadena);
        			repaint();
        			filtro();	
        			}
        			});
        			trsfiltro = new TableRowSorter(tableArticulo.getModel());
        			tableArticulo.setRowSorter(trsfiltro);
        	}        	
        });
        txtbuscarPorTeclado.setBounds(114, 20, 344, 30);
        jPanel3.add(txtbuscarPorTeclado);
        txtbuscarPorTeclado.setColumns(10);
        
        JLabel lblBuscarArticulo = new JLabel("Buscar Articulo:");
        lblBuscarArticulo.setBounds(10, 34, 153, 14);
        jPanel3.add(lblBuscarArticulo);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setForeground(new java.awt.Color(0, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mantenimiento de Articulos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, 35));

        jPanel4.add(jPanel1);
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 1262, GroupLayout.PREFERRED_SIZE)
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 555, GroupLayout.PREFERRED_SIZE)
        );
        getContentPane().setLayout(groupLayout);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private String[] getColumnas(){
        String  columna[]=new String[]{"Codigo","Descripcion","Familia","Estado"};
        return columna;
    }
    private void Filas(){
    try{
        for(c_articulos a : d_articulos.mostrarArticulosMantenimiento()){
            String Datos[]={a.getCodarticulo(),a.getDescripcion(),a.getCodfam(),a.getEstado()};
            modeloTabla.addRow(Datos);
        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERROR: "+e.getMessage());
        }
    }      
    public void filtro() {
    	trsfiltro.setRowFilter(RowFilter.regexFilter(txtbuscarPorTeclado.getText(), 1));
    	}  
    private void limpiarCasillas()
    {
        txtbuscar.setText("");
        txtcodigo.setText("");
        txtdescripcion.setText("");
        txtcolor.setText("");
        cmbfamilia.setSelectedItem("");
        cmbmedida.setSelectedItem("");
        dateChooser.setDate(null);
        cmbproveedor.setSelectedItem("");
        cmbestado.setSelectedItem("");
        cmbestado.setSelectedItem("");
    }
    private void habilitarCajas(){
    txtcodigo.setEnabled(true);
    txtdescripcion.setEnabled(true);
    txtcolor.setEnabled(true);
    cmbfamilia.setEnabled(true);
    cmbmedida.setEnabled(true);
    cmbproveedor.setEnabled(true);
    cmbestado.setEnabled(true);
    dateChooser.setEnabled(true);
    }
    private void deshabilitarCajas(){
        txtcodigo.setEnabled(false);
        txtdescripcion.setEnabled(false);
        txtcolor.setEnabled(false);
        cmbfamilia.setEnabled(false);
        cmbmedida.setEnabled(false);
        cmbproveedor.setEnabled(false);
        cmbestado.setEnabled(false);
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
    public void buscarArticulo() {
        c_articulos a = null;
        try {
            a = d_articulos.buscarArtCod(txtbuscar.getText());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR:" + e.getMessage());
        }
        if (a != null) {
        	txtidarticulo.setText(String.valueOf(a.getIdarticulo()));
            txtcodigo.setText(a.getCodarticulo());
            txtdescripcion.setText(a.getDescripcion());
            txtcolor.setText(a.getColor());
            cmbfamilia.setSelectedItem(a.getCodfam());
            cmbmedida.setSelectedItem(a.getCodmedida());
            cmbproveedor.setSelectedItem(a.getCodprove());
            cmbestado.setSelectedItem(a.getEstado());
            dateChooser.setDateFormatString(a.getFingreso());
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
    	 if(txtcodigo.getText().compareTo("") == 0){
    		 msjcodarti.setVisible(true);
     		flag=false;
    	 }
    	 if(txtdescripcion.getText().equals("")){
    		 msjdescripcion.setVisible(true);
     		flag=false;
    	 }
    	 if(txtcolor.getText().equals("")){
    		 msjcolor.setVisible(true);
     		flag=false;
    	 }
    	 if( dateChooser.getDate()==null){
     		msjfingreso.setVisible(true);
     		flag=false;
     	} 
    	return flag;
    }
    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
       //Agregar un nuevo registro
    	if (validarcampos()==false)
    	{JOptionPane.showMessageDialog(null, "Ingrese valores correctos");
    		return;
    	}
    	else if (validarcampos()==true){
    		try { 
        c_articulos a=new c_articulos();
        a.setCodarticulo(txtcodigo.getText());
        a.setDescripcion(txtdescripcion.getText());
        a.setColor(txtcolor.getText());
        a.setCodfam(cmbfamilia.getSelectedItem().toString());
        a.setCodmedida(cmbmedida.getSelectedItem().toString());
        a.setCodprove(cmbproveedor.getSelectedItem().toString());
        a.setEstado(cmbestado.getSelectedItem().toString());
        a.setFingreso(fecha());
                 d_articulos.insertarArticulo(a);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Datos Agregados Correctamente");
            limpiarCasillas();
            txtbuscar.setEnabled(true);
            btnbuscar.setEnabled(true);
            msjcodarti.setVisible(false);
            msjdescripcion.setVisible(false);
            msjcolor.setVisible(false);
            msjfingreso.setVisible(false);
        }   
    }//GEN-LAST:event_btnagregarActionPerformed
    private boolean validarbuscary(){
    	boolean flag=true;
    	try{
        	String sqlData;
        	Connection cnn = BD.getConnection();
            Statement st = cnn.createStatement();
            sqlData = "select codarticulo from articulos";
            ResultSet rs = st.executeQuery(sqlData);
           while(rs.next())
           {
        	   String v1=rs.getString("codarticulo"); 
        	   if(v1.equals(txtbuscar.getText())){
            	buscarArticulo();
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
            sqlData = "select codarticulo from articulos";
            ResultSet rs = st.executeQuery(sqlData);
           while(rs.next())
           {
        	   String v1=rs.getString("codarticulo"); 
        	   if(v1.equals(txtbuscar.getText())){
            	buscarArticulo();
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
                    this, "Deseas Buscar al Articulo para Modificarlo?",
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
            JOptionPane.showMessageDialog(null, "Ingrese codigo del producto a buscar");
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
        txtcodigo.requestFocus();
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
       c_articulos a;
       if (validarcampos()==false)
   	{JOptionPane.showMessageDialog(null, "Ingrese valores correctos");
   		return;
   	}
   	else if (validarcampos()==true){
   		try {
            	a = d_articulos.buscarArtCod((txtbuscar.getText()));
                a.setCodarticulo(txtcodigo.getText());
                a.setDescripcion(txtdescripcion.getText());
                a.setColor(txtcolor.getText());
                a.setCodfam(cmbfamilia.getSelectedItem().toString());
                a.setCodmedida(cmbmedida.getSelectedItem().toString());
                a.setCodprove(cmbproveedor.getSelectedItem().toString());
                a.setEstado(cmbestado.getSelectedItem().toString());
                a.setFingreso(fecha());
                d_articulos.actualizarArticulo(a);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }
	   		 JOptionPane.showMessageDialog(null, " [ Datos Actualizados ]");
		   	 limpiarCasillas();
		     txtbuscar.requestFocus();
		     msjdescripcion.setVisible(false);
		     msjcolor.setVisible(false);
		     msjfingreso.setVisible(false);
   	}
    }//GEN-LAST:event_btneditarActionPerformed
    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        try {
            c_articulos a = d_articulos.buscarArtCod(txtbuscar.getText());
            if (a == null) {
                JOptionPane.showMessageDialog(null, "No existe");
            } else {
                if (JOptionPane.showConfirmDialog(rootPane, "¿Desea eliminar este regitro?",
                "Eliminar registro", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                    d_articulos.eliminarArticulo((a.getCodarticulo()));             
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
    private javax.swing.JComboBox cmbmedida;
    private javax.swing.JComboBox cmbfamilia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableArticulo;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcodigo;
    private JTextField txtcolor;
    private JLabel lblColor;
    private JTextField txtidarticulo;
    private JTextField txtbuscarPorTeclado;
    private JComboBox cmbproveedor;
    private JDateChooser dateChooser;
    private JComboBox cmbestado;
    private JLabel msjcodarti;
    private JLabel msjdescripcion;
    private JLabel msjcolor;
    private JLabel msjfingreso;
}

package Presentacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Datos.BD;
import Datos.d_tarifas;
import Logica.c_tarifas;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
public class frm_tarifas extends javax.swing.JFrame {
        Connection cnn = BD.getConnection();
        DefaultTableModel modeloTabla=new DefaultTableModel();
        PreparedStatement ps = null;
    public frm_tarifas() {
        modeloTabla=new DefaultTableModel(null,getColumnas());
        Filas();
        initComponents();
    }
    public void cargar(){       
       try{
        ps = cnn.prepareStatement("SELECT codarticulo,pcunt,pvunt,descventa,desccompra FROM tarifas");
        ResultSet rs = ps.executeQuery();
       while (rs.next()){
       Object dato[]=new  Object[5];
       for (int i=0; i<5; i++){
           dato[i]=rs.getString(i+1);

       }
       modeloTabla.addRow(dato);
       }
       this.tableTarifas.setModel(modeloTabla);

       }catch (Exception e){}
}
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel2.setBounds(0, 40, 430, 434);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setBounds(10, 50, 173, 30);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(10, 152, 120, 14);
        txtbuscar = new javax.swing.JTextField();
        txtbuscar.setBounds(120, 50, 160, 30);
        txtpcunt = new javax.swing.JTextField();
        txtpcunt.setBounds(120, 142, 240, 30);
        btnagregar = new javax.swing.JButton();
        btnagregar.setIcon(new ImageIcon(frm_tarifas.class.getResource("/img/save.png")));
        btnagregar.setBounds(90, 325, 80, 40);
        btnnuevo = new javax.swing.JButton();
        btnnuevo.setIcon(new ImageIcon(frm_tarifas.class.getResource("/img/plus.png")));
        btnnuevo.setBounds(10, 325, 80, 40);
        btncancelar = new javax.swing.JButton();
        btncancelar.setIcon(new ImageIcon(frm_tarifas.class.getResource("/img/no.png")));
        btncancelar.setBounds(170, 325, 80, 40);
        btnbuscar = new javax.swing.JButton();
        btnbuscar.setIcon(new ImageIcon(frm_tarifas.class.getResource("/img/edit_find.png")));
        btnbuscar.setBounds(355, 40, 60, 40);
        btneditar = new javax.swing.JButton();
        btneditar.setIcon(new ImageIcon(frm_tarifas.class.getResource("/img/pencil3.png")));
        btneditar.setBounds(250, 325, 80, 40);
        btneliminar = new javax.swing.JButton();
        btneliminar.setIcon(new ImageIcon(frm_tarifas.class.getResource("/img/gnome_edit_delete.png")));
        btneliminar.setBounds(330, 325, 80, 40);
        btncerrarventana = new javax.swing.JButton();
        btncerrarventana.setIcon(new ImageIcon(frm_tarifas.class.getResource("/img/cancel2.png")));
        btncerrarventana.setBounds(10, 370, 400, 40);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setBounds(26, 191, 120, 14);
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setBounds(41, 230, 89, 14);
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setBounds(32, 272, 89, 14);
        jPanel3 = new javax.swing.JPanel();
        jPanel3.setBounds(440, 40, 550, 434);
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTarifas = new javax.swing.JTable();
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

        jLabel2.setText("Codigo del Articulo:");
        jPanel2.add(jLabel2);

        jLabel4.setText("Prec. Compra unt :");
        jPanel2.add(jLabel4);
        jPanel2.add(txtbuscar);

        txtpcunt.setEnabled(false);
        jPanel2.add(txtpcunt);
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

        jLabel5.setText("Prec. Venta unt:");
        jPanel2.add(jLabel5);

        jLabel6.setText("Desc. Venta:");
        jPanel2.add(jLabel6);

        jLabel7.setText("Desc. Compra:");
        jPanel2.add(jLabel7);

        jPanel4.add(jPanel2);
        
        txtcodigo = new JTextField();  
        txtcodigo.setEnabled(false);
        txtcodigo.setBounds(120, 101, 240, 30);
        jPanel2.add(txtcodigo);
        txtcodigo.setText(new frm_mostrarArticulo().send);
        
        JLabel lblCodigo = new JLabel();
        lblCodigo.setText("Codigo:");
        lblCodigo.setBounds(40, 111, 80, 14);
        jPanel2.add(lblCodigo);
        
        txtidarticulos = new JTextField();
        txtidarticulos.setVisible(false);
        txtidarticulos.setEnabled(false);
        txtidarticulos.setEditable(false);
        txtidarticulos.setBounds(372, 149, 24, 4);
        jPanel2.add(txtidarticulos);
        txtidarticulos.setColumns(10);
        
        txtpvunt = new JTextField();
        txtpvunt.setEnabled(false);
        txtpvunt.setBounds(120, 183, 240, 30);
        jPanel2.add(txtpvunt);
        
        txtdescventa = new JTextField();
        txtdescventa.setEnabled(false);
        txtdescventa.setBounds(120, 227, 240, 30);
        jPanel2.add(txtdescventa);
        
        txtdesccompra = new JTextField();
        txtdesccompra.setEnabled(false);
        txtdesccompra.setBounds(120, 269, 240, 30);
        jPanel2.add(txtdesccompra);
        
        JButton btnNewButton = new JButton("");
        btnNewButton.setIcon(new ImageIcon(frm_tarifas.class.getResource("/img/binoculars.png")));
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		frm_mostrarArticulo frmarti=new frm_mostrarArticulo();
        		frmarti.setVisible(true);
        		txtcodigo.setEnabled(true);
        	}
        });
        btnNewButton.setBounds(290, 40, 60, 40);
        jPanel2.add(btnNewButton);
        
        msjcodigo = new JLabel("*");
        msjcodigo.setVisible(false);
        msjcodigo.setForeground(Color.RED);
        msjcodigo.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjcodigo.setBounds(369, 109, 46, 14);
        jPanel2.add(msjcodigo);
        
        msjpcunt = new JLabel("*");
        msjpcunt.setForeground(Color.RED);
        msjpcunt.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjpcunt.setVisible(false);
        msjpcunt.setBounds(370, 152, 46, 14);
        jPanel2.add(msjpcunt);
        
        msjpvunt = new JLabel("*");
        msjpvunt.setVisible(false);
        msjpvunt.setForeground(Color.RED);
        msjpvunt.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjpvunt.setBounds(369, 191, 46, 14);
        jPanel2.add(msjpvunt);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Tarifas de Articulos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        tableTarifas.setModel(modeloTabla);
        tableTarifas.addKeyListener(new java.awt.event.KeyAdapter() {
        });
        jScrollPane1.setViewportView(tableTarifas);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3.setLayout(jPanel3Layout);

        jPanel4.add(jPanel3);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setForeground(new java.awt.Color(0, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mantenimiento Tarifas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 5, 370, 30));

        jPanel4.add(jPanel1);
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 1002, GroupLayout.PREFERRED_SIZE)
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 485, GroupLayout.PREFERRED_SIZE)
        );
        getContentPane().setLayout(groupLayout);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private String[] getColumnas(){
        String  columna[]=new String[]{"Codigo","pcunt","pvunt","descVenta","descCompra"};
        return columna;
    }
    private void Filas(){
    try{
        for(c_tarifas t : d_tarifas.mostrarTarifas()){
            String Datos[]={t.getCodarticulo(),String.valueOf(t.getPcunt()),String.valueOf(t.getPvunt()),String.valueOf(t.getDesventa()),String.valueOf(t.getDescompra())};
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
        txtpcunt.setText("");
        txtpvunt.setText("");
        txtdescventa.setText("");
        txtdesccompra.setText("");
    }
    private void habilitarCajas(){
    txtcodigo.setEnabled(true);
    txtpcunt.setEnabled(true);
    txtpvunt.setEnabled(true);
    txtdescventa.setEnabled(true);
    txtdesccompra.setEnabled(true);
    }
    private void deshabilitarCajas(){
        txtcodigo.setEnabled(false);
        txtpcunt.setEnabled(false);
        txtpvunt.setEnabled(false);
        txtdescventa.setEnabled(false);
        txtdesccompra.setEnabled(false);
        }
    private void habilitarBotones(){
    btnagregar.setEnabled(true);
    btneditar.setEnabled(true);
    btncancelar.setEnabled(true); 
    }
    public void buscarTarifas() {
        c_tarifas t = null;
        try {
            t = d_tarifas.buscarCodArti(txtbuscar.getText());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR:" + e.getMessage());
        }
        if (t != null) {
        	txtidarticulos.setText(String.valueOf(t.getIdtarifas()));
        	txtcodigo.setText(t.getCodarticulo());
            txtpcunt.setText(String.valueOf(t.getPcunt()));
            txtpvunt.setText(String.valueOf(t.getPvunt()));
            txtdescventa.setText(String.valueOf(t.getDesventa()));
            txtdesccompra.setText(String.valueOf(t.getDescompra()));
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
		if(txtpcunt.getText().equals("")){
			msjpcunt.setVisible(true);
			txtpcunt.requestFocus();
			flag=false;
		}
		if(txtpvunt.getText().equals("")){
			msjpvunt.setVisible(true);
			txtpvunt.requestFocus();
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
        c_tarifas t=new c_tarifas();
        t.setCodarticulo(txtcodigo.getText());
        t.setPcunt(Double.parseDouble(txtpcunt.getText()));
        t.setPvunt(Double.parseDouble(txtpvunt.getText()));
        t.setDesventa(Double.parseDouble(txtdescventa.getText()));
        t.setDescompra(Double.parseDouble(txtdesccompra.getText()));      
                 d_tarifas.insertarTarifas(t);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Datos Agregados Correctamente");
            cargar();
            limpiarCasillas();
            txtbuscar.setEnabled(true);
            btnbuscar.setEnabled(true);
            msjcodigo.setVisible(false);
            msjpcunt.setVisible(false);
            msjpvunt.setVisible(false);   
        } 
    }//GEN-LAST:event_btnagregarActionPerformed
    private boolean validarbuscary(){
    	boolean flag=true;
    	try{
        	String sqlData;
        	Connection cnn = BD.getConnection();
            Statement st = cnn.createStatement();
            sqlData = "select codarticulo from tarifas";
            ResultSet rs = st.executeQuery(sqlData);
           while(rs.next())
           {
        	   String v1=rs.getString("codarticulo"); 
        	   if(v1.equals(txtbuscar.getText())){
            	buscarTarifas();
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
            sqlData = "select codarticulo from tarifas";
            ResultSet rs = st.executeQuery(sqlData);
           while(rs.next())
           {
        	   String v1=rs.getString("codarticulo"); 
        	   if(v1.equals(txtbuscar.getText())){
            	buscarTarifas();
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
                    this, "Deseas Buscar el articulo para modifcar su tarifa?",
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
        txtpcunt.requestFocus();
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
       c_tarifas t;
            if(validarcampos()==false){
            	JOptionPane.showMessageDialog(null, "Ingrese valores correctos");
        		return;
            }else if(validarcampos()==true){
            	try{
                t = d_tarifas.buscarCodArti(txtbuscar.getText());
                t.setIdtarifas(Integer.parseInt(txtidarticulos.getText()));              
                t.setCodarticulo(txtcodigo.getText());
                t.setPcunt(Double.parseDouble(txtpcunt.getText()));
                t.setPvunt(Double.parseDouble(txtpvunt.getText()));
                t.setDesventa(Double.parseDouble(txtdescventa.getText()));
                t.setDescompra(Double.parseDouble(txtdesccompra.getText()));   
                d_tarifas.actualizarTarifas(t);
            	JOptionPane.showMessageDialog(null, " [ Datos Actualizados ]");
		        limpiarCasillas();
		        txtbuscar.requestFocus();
		        msjcodigo.setVisible(false);
		        msjpcunt.setVisible(false);
		        msjpvunt.setVisible(false); 
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }
            }
    }//GEN-LAST:event_btneditarActionPerformed
    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        try {
            c_tarifas t = d_tarifas.buscarCodArti(txtbuscar.getText());
            if (t == null) {
                JOptionPane.showMessageDialog(null, "No existe");
            } else {
                if (JOptionPane.showConfirmDialog(rootPane, "¿Desea eliminar este regitro?",
                "Eliminar registro", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                d_tarifas.eliminarTarifas(t.getCodarticulo());
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
    private javax.swing.JTable tableTarifas;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtpcunt;
    private JTextField txtcodigo;
    private JTextField txtidarticulos;
    private JTextField txtpvunt;
    private JTextField txtdescventa;
    private JTextField txtdesccompra;
    private JLabel msjcodigo;
    private JLabel msjpcunt;
    private JLabel msjpvunt;
	public JTextField getTxtcodigo() {
		return txtcodigo;
	}

}

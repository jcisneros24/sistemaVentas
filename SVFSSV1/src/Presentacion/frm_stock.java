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
import Datos.d_stock;
import Logica.c_stock;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
public class frm_stock extends javax.swing.JFrame {
        Connection cnn = BD.getConnection();
        DefaultTableModel modeloTabla=new DefaultTableModel();
        PreparedStatement ps = null;
    public frm_stock() {
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
        jLabel4.setBounds(33, 152, 97, 14);
        txtbuscar = new javax.swing.JTextField();
        txtbuscar.setBounds(120, 50, 160, 30);
        txtstockinicial = new javax.swing.JTextField();
        txtstockinicial.setBounds(120, 142, 240, 30);
        btnagregar = new javax.swing.JButton();
        btnagregar.setIcon(new ImageIcon(frm_stock.class.getResource("/img/save.png")));
        btnagregar.setBounds(90, 325, 80, 40);
        btnnuevo = new javax.swing.JButton();
        btnnuevo.setIcon(new ImageIcon(frm_stock.class.getResource("/img/plus.png")));
        btnnuevo.setBounds(10, 325, 80, 40);
        btncancelar = new javax.swing.JButton();
        btncancelar.setIcon(new ImageIcon(frm_stock.class.getResource("/img/no.png")));
        btncancelar.setBounds(170, 325, 80, 40);
        btnbuscar = new javax.swing.JButton();
        btnbuscar.setIcon(new ImageIcon(frm_stock.class.getResource("/img/edit_find.png")));
        btnbuscar.setBounds(355, 40, 60, 40);
        btneditar = new javax.swing.JButton();
        btneditar.setIcon(new ImageIcon(frm_stock.class.getResource("/img/pencil3.png")));
        btneditar.setBounds(250, 325, 80, 40);
        btneliminar = new javax.swing.JButton();
        btneliminar.setIcon(new ImageIcon(frm_stock.class.getResource("/img/gnome_edit_delete.png")));
        btneliminar.setBounds(330, 325, 80, 40);
        btncerrarventana = new javax.swing.JButton();
        btncerrarventana.setIcon(new ImageIcon(frm_stock.class.getResource("/img/cancel2.png")));
        btncerrarventana.setBounds(10, 370, 400, 40);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setBounds(26, 191, 120, 14);
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setBounds(26, 230, 104, 14);
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setBounds(26, 272, 95, 14);
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

        jLabel4.setText("Stock Inicial:");
        jPanel2.add(jLabel4);
        jPanel2.add(txtbuscar);

        txtstockinicial.setEnabled(false);
        jPanel2.add(txtstockinicial);
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

        jLabel5.setText("Stock Actual:");
        jPanel2.add(jLabel5);

        jLabel6.setText("Stock Minimo:");
        jPanel2.add(jLabel6);

        jLabel7.setText("Stock Maximo:");
        jPanel2.add(jLabel7);

        jPanel4.add(jPanel2);
        
        txtcodigo = new JTextField();  
        txtcodigo.setEnabled(false);
        txtcodigo.setBounds(120, 101, 240, 30);
        jPanel2.add(txtcodigo);
        
        JLabel lblCodigo = new JLabel();
        lblCodigo.setText("Codigo:");
        lblCodigo.setBounds(40, 111, 80, 14);
        jPanel2.add(lblCodigo);
        
        txtidstock = new JTextField();
        txtidstock.setVisible(false);
        txtidstock.setEnabled(false);
        txtidstock.setEditable(false);
        txtidstock.setBounds(370, 142, 28, 7);
        jPanel2.add(txtidstock);
        txtidstock.setColumns(10);
        
        txtstockactual = new JTextField();
        txtstockactual.setEnabled(false);
        txtstockactual.setBounds(120, 183, 240, 30);
        jPanel2.add(txtstockactual);
        
        txtstockmin = new JTextField();
        txtstockmin.setEnabled(false);
        txtstockmin.setBounds(120, 227, 240, 30);
        jPanel2.add(txtstockmin);
        
        txtstockmax = new JTextField();
        txtstockmax.setEnabled(false);
        txtstockmax.setBounds(120, 269, 240, 30);
        jPanel2.add(txtstockmax);
        
        JButton btnNewButton = new JButton("");
        btnNewButton.setIcon(new ImageIcon(frm_stock.class.getResource("/img/binoculars.png")));
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
        
        msjstockini = new JLabel("*");
        msjstockini.setVisible(false);
        msjstockini.setForeground(Color.RED);
        msjstockini.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjstockini.setBounds(370, 152, 46, 14);
        jPanel2.add(msjstockini);
        
        msjstockactual = new JLabel("*");
        msjstockactual.setVisible(false);
        msjstockactual.setForeground(Color.RED);
        msjstockactual.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjstockactual.setBounds(369, 191, 46, 14);
        jPanel2.add(msjstockactual);
        
        msjstockmin = new JLabel("*");
        msjstockmin.setVisible(false);
        msjstockmin.setForeground(Color.RED);
        msjstockmin.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjstockmin.setBounds(369, 230, 46, 14);
        jPanel2.add(msjstockmin);
        
        msjstockmax = new JLabel("*");
        msjstockmax.setVisible(false);
        msjstockmax.setForeground(Color.RED);
        msjstockmax.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjstockmax.setBounds(369, 277, 46, 14);
        jPanel2.add(msjstockmax);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Stock de Articulos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 14), new java.awt.Color(102, 102, 102))); // NOI18N

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
        jLabel1.setText("Mantenimiento Stock");
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
        String  columna[]=new String[]{"Codigo","StockInicial","StockActual","StockMin","StockMax"};
        return columna;
    }
    private void Filas(){
    try{
        for(c_stock s : d_stock.mostrarStock()){
            String Datos[]={s.getCodarticulo(),String.valueOf(s.getStockinicial()),String.valueOf(s.getStockactual()),String.valueOf(s.getStockmin()),String.valueOf(s.getStockmax())};
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
        txtstockinicial.setText("");
        txtstockactual.setText("");
        txtstockmin.setText("");
        txtstockmax.setText("");
    }
    private void habilitarCajas(){
    txtcodigo.setEnabled(true);
    txtstockinicial.setEnabled(true);
    txtstockactual.setEnabled(true);
    txtstockmin.setEnabled(true);
    txtstockmax.setEnabled(true);
    }
    private void deshabilitarCajas(){
        txtcodigo.setEnabled(false);
        txtstockinicial.setEnabled(false);
        txtstockactual.setEnabled(false);
        txtstockmin.setEnabled(false);
        txtstockmax.setEnabled(false);
        }
    private void habilitarBotones(){
    btnagregar.setEnabled(true);
    btneditar.setEnabled(true);
    btncancelar.setEnabled(true); 
    }
    public void buscarStock() {
        c_stock s = null;
        try {
            s = d_stock.buscarCodArti(txtbuscar.getText());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR:" + e.getMessage());
        }
        if (s != null) {
        	txtidstock.setText(String.valueOf(s.getIdstock()));
        	txtcodigo.setText(s.getCodarticulo());
            txtstockinicial.setText(String.valueOf(s.getStockinicial()));
            txtstockactual.setText(String.valueOf(s.getStockactual()));
            txtstockmin.setText(String.valueOf(s.getStockmin()));
            txtstockmax.setText(String.valueOf(s.getStockmax()));
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
    private boolean validarcampos(){
    	boolean flag=true;
    	if(txtcodigo.getText().equals("")){
    		msjcodigo.setVisible(true);
    		txtcodigo.requestFocus();
    		flag=false;
    	}
    	if(txtstockactual.getText().equals("")){
    		msjstockactual.setVisible(true);
    		txtstockactual.requestFocus();
    		flag=false;
    	}
    	if(txtstockinicial.getText().equals("")){
    		msjstockini.setVisible(true);
    		txtstockinicial.requestFocus();
    		flag=false;
    	}
    	if(txtstockmin.getText().equals("")){
    		msjstockmin.setVisible(true);
    		txtstockmin.requestFocus();
    		flag=false;
    	}
    	if(txtstockmax.getText().equals("")){
    		msjstockmax.setVisible(true);
    		txtstockmax.requestFocus();
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
        c_stock s=new c_stock();
        s.setCodarticulo(txtcodigo.getText());
        s.setStockinicial(Double.parseDouble(txtstockinicial.getText()));
        s.setStockactual(Double.parseDouble(txtstockactual.getText()));
        s.setStockmin(Double.parseDouble(txtstockmin.getText()));
        s.setStockmax(Double.parseDouble(txtstockmax.getText()));      
                 d_stock.insertarStock(s);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Datos Agregados Correctamente");
            cargar();
            limpiarCasillas();
            txtbuscar.setEnabled(true);
            btnbuscar.setEnabled(true);
            msjcodigo.setVisible(false);
            msjstockactual.setVisible(false);
            msjstockini.setVisible(false);
            msjstockmax.setVisible(false);
            msjstockmin.setVisible(false); 
        } 
    }//GEN-LAST:event_btnagregarActionPerformed
    private boolean validarbuscary(){
    	boolean flag=true;
    	try{
        	String sqlData;
        	Connection cnn = BD.getConnection();
            Statement st = cnn.createStatement();
            sqlData = "select codarticulo from stock";
            ResultSet rs = st.executeQuery(sqlData);
           while(rs.next())
           {
        	   String v1=rs.getString("codarticulo"); 
        	   if(v1.equals(txtbuscar.getText())){
            	buscarStock();
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
            sqlData = "select codarticulo from stock";
            ResultSet rs = st.executeQuery(sqlData);
           while(rs.next())
           {
        	   String v1=rs.getString("codarticulo"); 
        	   if(v1.equals(txtbuscar.getText())){
            	buscarStock();
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
                    this, "Deseas Buscar el articulo para modifcar su stock?",
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
        txtstockinicial.requestFocus();
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
       c_stock s;
            if(validarcampos()==false){
            	JOptionPane.showMessageDialog(null, "Ingrese valores correctos");
        		return;
            }else if(validarcampos()==true){
            	try{
                s = d_stock.buscarCodArti(txtbuscar.getText());
                s.setIdstock(Integer.parseInt(txtidstock.getText()));              
                s.setCodarticulo(txtcodigo.getText());
                s.setStockinicial(Double.parseDouble(txtstockinicial.getText()));
                s.setStockactual(Double.parseDouble(txtstockactual.getText()));
                s.setStockmin(Double.parseDouble(txtstockmin.getText()));
                s.setStockmax(Double.parseDouble(txtstockmax.getText()));   
                d_stock.actualizarStock(s);
            	JOptionPane.showMessageDialog(null, " [ Datos Actualizados ]");
		        limpiarCasillas();
		        txtbuscar.requestFocus();
		        msjcodigo.setVisible(false);
	            msjstockactual.setVisible(false);
	            msjstockini.setVisible(false);
	            msjstockmax.setVisible(false);
	            msjstockmin.setVisible(false);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }             
            }
    }//GEN-LAST:event_btneditarActionPerformed
    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        try {
            c_stock s = d_stock.buscarCodArti(txtbuscar.getText());
            if (s == null) {
                JOptionPane.showMessageDialog(null, "No existe");
            } else {
                if (JOptionPane.showConfirmDialog(rootPane, "¿Desea eliminar este regitro?",
                "Eliminar registro", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                d_stock.eliminarStocks(s.getCodarticulo());
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
    private javax.swing.JTextField txtstockinicial;
    private JTextField txtcodigo;
    private JTextField txtidstock;
    private JTextField txtstockactual;
    private JTextField txtstockmin;
    private JTextField txtstockmax;
    private JLabel msjcodigo;
    private JLabel msjstockini;
    private JLabel msjstockactual;
    private JLabel msjstockmin;
    private JLabel msjstockmax;
	public JTextField getTxtcodigo() {
		return txtcodigo;
	}

}

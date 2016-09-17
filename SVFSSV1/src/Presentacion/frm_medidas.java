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
import Datos.d_medidas;
import Logica.c_medidas;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class frm_medidas extends javax.swing.JFrame {
        DefaultTableModel modeloTabla;
        BD cnn=new BD();
    public frm_medidas() {
        modeloTabla=new DefaultTableModel(null,getColumnas());
        Filas();
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setBounds(10, 50, 110, 30);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setBounds(50, 100, 60, 14);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(40, 140, 80, 14);
        txtbuscar = new javax.swing.JTextField();
        txtbuscar.setBounds(120, 50, 110, 30);
        txtcodigo = new javax.swing.JTextField();
        txtcodigo.setBounds(120, 90, 240, 30);
        txtmedida = new javax.swing.JTextField();
        txtmedida.setBounds(120, 130, 240, 30);
        btnagregar = new javax.swing.JButton();
        btnagregar.setIcon(new ImageIcon(frm_medidas.class.getResource("/img/save.png")));
        btnagregar.setBounds(100, 189, 80, 40);
        btnnuevo = new javax.swing.JButton();
        btnnuevo.setIcon(new ImageIcon(frm_medidas.class.getResource("/img/plus.png")));
        btnnuevo.setBounds(20, 189, 80, 40);
        btncancelar = new javax.swing.JButton();
        btncancelar.setIcon(new ImageIcon(frm_medidas.class.getResource("/img/no.png")));
        btncancelar.setBounds(180, 189, 80, 40);
        btnbuscar = new javax.swing.JButton();
        btnbuscar.setIcon(new ImageIcon(frm_medidas.class.getResource("/img/edit_find.png")));
        btnbuscar.setBounds(240, 40, 50, 40);
        btneditar = new javax.swing.JButton();
        btneditar.setIcon(new ImageIcon(frm_medidas.class.getResource("/img/pencil3.png")));
        btneditar.setBounds(260, 189, 80, 40);
        btneliminar = new javax.swing.JButton();
        btneliminar.setIcon(new ImageIcon(frm_medidas.class.getResource("/img/gnome_edit_delete.png")));
        btneliminar.setBounds(340, 189, 80, 40);
        btncerrarventana = new javax.swing.JButton();
        btncerrarventana.setIcon(new ImageIcon(frm_medidas.class.getResource("/img/cancel2.png")));
        btncerrarventana.setBounds(20, 235, 400, 40);
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMedidas = new javax.swing.JTable();
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

        jLabel2.setText("Buscar Medida:");
        jPanel2.add(jLabel2);

        jLabel3.setText("Codigo:");
        jPanel2.add(jLabel3);

        jLabel4.setText("   Medida:");
        jPanel2.add(jLabel4);
        jPanel2.add(txtbuscar);

        txtcodigo.setEnabled(false);
        jPanel2.add(txtcodigo);

        txtmedida.setEnabled(false);
        jPanel2.add(txtmedida);
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
        jPanel2.add(btncerrarventana);

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 430, 290));
        
        txtidmedida = new JTextField();
        txtidmedida.setVisible(false);
        txtidmedida.setEnabled(false);
        txtidmedida.setEditable(false);
        txtidmedida.setBounds(370, 90, 40, 6);
        jPanel2.add(txtidmedida);
        txtidmedida.setColumns(10);
        
        msjcodigo = new JLabel("*");
        msjcodigo.setVisible(false);
        msjcodigo.setForeground(Color.RED);
        msjcodigo.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjcodigo.setBounds(370, 100, 46, 14);
        jPanel2.add(msjcodigo);
        
        msjmedida = new JLabel("*");
        msjmedida.setVisible(false);
        msjmedida.setForeground(Color.RED);
        msjmedida.setEnabled(true);
        msjmedida.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjmedida.setBounds(370, 140, 46, 14);
        jPanel2.add(msjmedida);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Lista de Medidas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        tableMedidas.setModel(modeloTabla);
        jScrollPane1.setViewportView(tableMedidas);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 550, 290));

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setForeground(new java.awt.Color(0, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mantenimiento Medidas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 5, 370, 30));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private String[] getColumnas(){
        String  columna[]=new String[]{"codmedida","medida"};
        return columna;
    }
    private void Filas(){
    try{
        for(c_medidas m : d_medidas.mostrarMedidas()){
            String Datos[]={m.getCodmedida(),m.getMedida()};
            modeloTabla.addRow(Datos);
        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERROR: "+e.getMessage());
        }
    }    
    private void limpiarCasillas()
    {	txtbuscar.setText("");
        txtcodigo.setText("");
        txtmedida.setText("");
    }
    private void habilitarCajas(){
    txtcodigo.setEnabled(true);
    txtmedida.setEnabled(true);
    }
    private void deshabilitarCajas(){
        txtcodigo.setEnabled(false);
        txtmedida.setEnabled(false);
        }
    private void habilitarBotones(){
    btnagregar.setEnabled(true);
    btneditar.setEnabled(true);
    btncancelar.setEnabled(true); 
    }
    public void buscarMedidas() {
        c_medidas m = null;
        try {
            m = d_medidas.buscarCodMedidas(txtbuscar.getText());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR:" + e.getMessage());
        }
        if (m != null) {
        	txtidmedida.setText(String.valueOf(m.getIdmedida()));
            txtcodigo.setText(m.getCodmedida());
            txtmedida.setText(m.getMedida());
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
    		msjcodigo.setVisible(true);
    		txtcodigo.requestFocus();
    		flag=false;
    	}
    	if(txtmedida.getText().equals("")){
    		msjmedida.setVisible(true);
    		txtmedida.requestFocus();
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
        c_medidas m=new c_medidas();
        m.setCodmedida(txtcodigo.getText());
        m.setMedida(txtmedida.getText());
                 d_medidas.insertarMedidas(m);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Datos Agregados Correctamente");
            limpiarCasillas();
            txtbuscar.setEnabled(true);
            btnbuscar.setEnabled(true);
            msjcodigo.setVisible(false);
            msjmedida.setVisible(false);
        }       
    }//GEN-LAST:event_btnagregarActionPerformed
    private boolean validarbuscary(){
    	boolean flag=true;
    	try{
        	String sqlData;
        	Connection cnn = BD.getConnection();
            Statement st = cnn.createStatement();
            sqlData = "select medida from medida";
            ResultSet rs = st.executeQuery(sqlData);
           while(rs.next())
           {
        	   String v1=rs.getString("medida"); 
        	   if(v1.equals(txtbuscar.getText())){
            	buscarMedidas();
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
            sqlData = "select medida from medida";
            ResultSet rs = st.executeQuery(sqlData);
           while(rs.next())
           {
        	   String v1=rs.getString("medida"); 
        	   if(v1.equals(txtbuscar.getText())){
            	buscarMedidas();
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
                    this, "Deseas Buscar la medida para Modificarlo?",
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
       c_medidas m;
            try {if(txtcodigo.getText()!=null || txtmedida.getText()!=null){
                m = d_medidas.buscarCodMedidas(txtbuscar.getText());
                m.setIdmedida(Integer.parseInt(txtidmedida.getText()));
                m.setCodmedida(txtcodigo.getText());
                m.setMedida(txtmedida.getText());
                d_medidas.actualizarMedida(m);
                JOptionPane.showMessageDialog(null, " [ Datos Actualizados ]");
            }else{JOptionPane.showMessageDialog(null, "Todos los campos deben ser llenados");}
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }
        limpiarCasillas();
        txtbuscar.requestFocus();
    }//GEN-LAST:event_btneditarActionPerformed
    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        try {
            c_medidas m = d_medidas.buscarCodMedidas(txtbuscar.getText());
            if (m == null) {
                JOptionPane.showMessageDialog(null, "No existe");
            } else {
                if (JOptionPane.showConfirmDialog(rootPane, "¿Desea eliminar este regitro?",
                "Eliminar registro", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                d_medidas.eliminarMedidas(String.valueOf(m.getMedida()));
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
    private javax.swing.JTable tableMedidas;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtmedida;
    private JTextField txtidmedida;
    private JLabel msjcodigo;
    private JLabel msjmedida;
    // End of variables declaration//GEN-END:variables
}

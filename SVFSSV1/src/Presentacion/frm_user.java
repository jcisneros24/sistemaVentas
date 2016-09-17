package Presentacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Datos.BD;
import Datos.d_user;
import Logica.c_user;
import javax.swing.ImageIcon;
public class frm_user extends javax.swing.JFrame {
        Connection cnn = BD.getConnection();
        DefaultTableModel modeloTabla=new DefaultTableModel();
        PreparedStatement ps = null;
    public frm_user() {
        modeloTabla=new DefaultTableModel(null,getColumnas());
        Filas();
        initComponents();
        this.cmbtipouser.removeAllItems();
        try {
            ps = cnn.prepareStatement("SELECT codtipouser FROM tipouser");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
            this.cmbtipouser.addItem(rs.getString("codtipouser"));
            }
        } catch (Exception e) {
        }
    }
    public void cargar(){       
       try{
        ps = cnn.prepareStatement("SELECT coduser,user,password,codtipouser FROM user");
        ResultSet rs = ps.executeQuery();
       while (rs.next()){
       Object dato[]=new  Object[5];
       for (int i=0; i<5; i++){
           dato[i]=rs.getString(i+1);

       }
       modeloTabla.addRow(dato);
       }
       this.tableUser.setModel(modeloTabla);

       }catch (Exception e){}
}
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel2.setBounds(0, 40, 430, 383);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setBounds(20, 50, 110, 30);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(49, 152, 71, 14);
        txtbuscar = new javax.swing.JTextField();
        txtbuscar.setBounds(120, 50, 110, 30);
        txtuser = new javax.swing.JTextField();
        txtuser.setBounds(120, 142, 240, 30);
        btnagregar = new javax.swing.JButton();
        btnagregar.setIcon(new ImageIcon(frm_user.class.getResource("/img/save.png")));
        btnagregar.setBounds(90, 275, 80, 40);
        btnnuevo = new javax.swing.JButton();
        btnnuevo.setIcon(new ImageIcon(frm_user.class.getResource("/img/plus.png")));
        btnnuevo.setBounds(10, 275, 80, 40);
        btncancelar = new javax.swing.JButton();
        btncancelar.setIcon(new ImageIcon(frm_user.class.getResource("/img/cancel2.png")));
        btncancelar.setBounds(170, 275, 80, 40);
        btnbuscar = new javax.swing.JButton();
        btnbuscar.setIcon(new ImageIcon(frm_user.class.getResource("/img/edit_find.png")));
        btnbuscar.setBounds(240, 40, 60, 40);
        btneditar = new javax.swing.JButton();
        btneditar.setIcon(new ImageIcon(frm_user.class.getResource("/img/pencil3.png")));
        btneditar.setBounds(250, 275, 80, 40);
        btneliminar = new javax.swing.JButton();
        btneliminar.setIcon(new ImageIcon(frm_user.class.getResource("/img/gnome_edit_delete.png")));
        btneliminar.setBounds(330, 275, 80, 40);
        btncerrarventana = new javax.swing.JButton();
        btncerrarventana.setIcon(new ImageIcon(frm_user.class.getResource("/img/cancel2.png")));
        btncerrarventana.setBounds(10, 320, 400, 40);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setBounds(30, 231, 100, 14);
        cmbtipouser = new javax.swing.JComboBox();
        cmbtipouser.setBounds(120, 223, 240, 30);
        jPanel3 = new javax.swing.JPanel();
        jPanel3.setBounds(440, 40, 550, 383);
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUser = new javax.swing.JTable();
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

        jLabel4.setText("Usuario:");
        jPanel2.add(jLabel4);
        jPanel2.add(txtbuscar);

        txtuser.setEnabled(false);
        jPanel2.add(txtuser);
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

        jLabel5.setText("Tipo Usuario:");
        jPanel2.add(jLabel5);
        jPanel2.add(cmbtipouser);
        
        txtcodigo = new JTextField();
        txtcodigo.setEnabled(false);
        txtcodigo.setBounds(120, 101, 240, 30);
        jPanel2.add(txtcodigo);
        
        JLabel lblCodigo = new JLabel();
        lblCodigo.setText("Codigo:");
        lblCodigo.setBounds(49, 111, 71, 14);
        jPanel2.add(lblCodigo);
        
        txtiduser = new JTextField();
        txtiduser.setVisible(false);
        txtiduser.setEnabled(false);
        txtiduser.setEditable(false);
        txtiduser.setBounds(370, 106, 21, 20);
        jPanel2.add(txtiduser);
        txtiduser.setColumns(10);
        
        txtpassword = new JTextField();
        txtpassword.setEnabled(false);
        txtpassword.setBounds(120, 177, 240, 30);
        jPanel2.add(txtpassword);
        
        JLabel lblPassword = new JLabel();
        lblPassword.setText("Password:");
        lblPassword.setBounds(40, 187, 80, 14);
        jPanel2.add(lblPassword);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Lista de Usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        tableUser.setModel(modeloTabla);
        tableUser.addKeyListener(new java.awt.event.KeyAdapter() {
        });
        jScrollPane1.setViewportView(tableUser);

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

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setForeground(new java.awt.Color(0, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mantenimiento Usuarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 5, 370, 30));
        jPanel4.setLayout(null);
        jPanel4.add(jPanel2);
        jPanel4.add(jPanel3);
        jPanel4.add(jPanel1);
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 1002, GroupLayout.PREFERRED_SIZE)
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 431, GroupLayout.PREFERRED_SIZE)
        );
        getContentPane().setLayout(groupLayout);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private String[] getColumnas(){
        String  columna[]=new String[]{"Codigo","Usuario","Password","TipoUsuario"};
        return columna;
    }
    private void Filas(){
    try{
        for(c_user u : d_user.mostrarUser()){
            String Datos[]={u.getCoduser(),u.getUser(),u.getPassword(),u.getCodtipouser()};
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
        txtuser.setText("");
        txtpassword.setText("");
        cmbtipouser.setSelectedItem("");
    }
    private void habilitarCajas(){
    txtcodigo.setEnabled(true);
    txtuser.setEnabled(true);
    txtpassword.setEnabled(true);
    cmbtipouser.setEnabled(true);
    }
    private void deshabilitarCajas(){
        txtcodigo.setEnabled(false);
        txtuser.setEnabled(false);
        txtpassword.setEnabled(false);
        cmbtipouser.setEnabled(false);
        }
    private void habilitarBotones(){
    btnagregar.setEnabled(true);
    btneditar.setEnabled(true);
    btncancelar.setEnabled(true); 
    }
    public void buscarUsuarios() {
        c_user u = null;
        try {
            u = d_user.buscarCodUser(txtbuscar.getText());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR:" + e.getMessage());
        }
        if (u != null) {
        	txtiduser.setText(String.valueOf(u.getIduser()));
        	txtcodigo.setText(u.getCoduser());
            txtuser.setText(u.getUser());
            txtpassword.setText(u.getPassword());
            cmbtipouser.setSelectedItem(u.getCodtipouser());
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
    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
       //Agregar un nuevo registro
        if (txtuser.getText().compareTo("") == 0){
                JOptionPane.showMessageDialog(null, "Llene todos los campos por favor");
                txtuser.requestFocus();
                } else{
        c_user u=new c_user();
        u.setCoduser(txtcodigo.getText());
        u.setUser(txtuser.getText());
        u.setPassword(txtpassword.getText()); 
        u.setCodtipouser(cmbtipouser.getSelectedItem().toString()); 
        try {
                 d_user.insertarUser(u);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Datos Agregados Correctamente");
            cargar();
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
            sqlData = "select coduser from user";
            ResultSet rs = st.executeQuery(sqlData);
           while(rs.next())
           {
        	   String v1=rs.getString("coduser"); 
        	   if(v1.equals(txtbuscar.getText())){
            	buscarUsuarios();
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
            sqlData = "select coduser from user";
            ResultSet rs = st.executeQuery(sqlData);
           while(rs.next())
           {
        	   String v1=rs.getString("coduser"); 
        	   if(v1.equals(txtbuscar.getText())){
            	buscarUsuarios();
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
                    this, "Deseas Buscar el Usuario para Modificarlo?",
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
        txtuser.requestFocus();
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
       c_user u;
            try { if(txtcodigo.getText()!=null || txtuser.getText()!=null){
                u = d_user.buscarCodUser(txtbuscar.getText());
                u.setIduser(Integer.parseInt(txtiduser.getText()));
                u.setCoduser(txtcodigo.getText());
                u.setUser(txtuser.getText());
                u.setPassword(txtpassword.getText());
                u.setCodtipouser(cmbtipouser.getSelectedItem().toString());
                d_user.actualizarUser(u);
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
            c_user u = d_user.buscarCodUser(txtbuscar.getText());
            if (u == null) {
                JOptionPane.showMessageDialog(null, "No existe");
            } else {
                if (JOptionPane.showConfirmDialog(rootPane, "¿Desea eliminar este regitro?",
                "Eliminar registro", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                d_user.eliminarUser(u.getCoduser());
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
    public static void main(String args[]) {
 
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btncerrarventana;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JComboBox cmbtipouser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableUser;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtuser;
    private JTextField txtcodigo;
    private JTextField txtiduser;
    private JTextField txtpassword;
}

package Presentacion;

import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Datos.BD;
import Datos.d_proveedor;
import Logica.c_proveedor;

import com.mysql.jdbc.Connection;
import javax.swing.ImageIcon;

public class agregarProveedor extends javax.swing.JFrame {
	BD cnn;
//    Connection cnn = (Connection) BD.getConnection();
    /** Creates new form agregarProveedor */
    public agregarProveedor() {
    	setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Agregar Proveedor");
        this.setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnGuardar1 = new javax.swing.JButton();
        btnGuardar1.setIcon(new ImageIcon(agregarProveedor.class.getResource("/img/save.png")));
        btnGuardar1.setBounds(190, 280, 60, 40);
        BtnCancelar1 = new javax.swing.JButton();
        BtnCancelar1.setIcon(new ImageIcon(agregarProveedor.class.getResource("/img/no.png")));
        BtnCancelar1.setBounds(270, 280, 60, 40);
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBounds(48, 71, 84, 16);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setBounds(35, 115, 183, 16);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setBounds(75, 158, 85, 16);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(48, 205, 86, 16);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setBounds(66, 246, 94, 16);
        txtnombres = new javax.swing.JTextField();
        txtnombres.setBounds(183, 67, 231, 20);
        txtrazonsocial = new javax.swing.JTextField();
        txtrazonsocial.setBounds(183, 111, 231, 20);
        txtruc = new javax.swing.JTextField();
        txtruc.setBounds(183, 154, 231, 20);
        txtdireccion = new javax.swing.JTextField();
        txtdireccion.setBounds(183, 198, 231, 20);
        txtcelular = new javax.swing.JTextField();
        txtcelular.setBounds(183, 242, 231, 20);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });
        BtnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelar1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12));
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Nombres  : ");

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12));
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Razon Social:");

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12));
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("R.U.C.");

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12));
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Direcci\u00F3n  : ");

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12));
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Celular :");

        txtnombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });
        jPanel1.setLayout(null);
        jPanel1.add(jLabel1);
        jPanel1.add(jLabel2);
        jPanel1.add(jLabel4);
        jPanel1.add(jLabel5);
        jPanel1.add(jLabel3);
        jPanel1.add(txtcelular);
        jPanel1.add(txtdireccion);
        jPanel1.add(txtruc);
        jPanel1.add(txtrazonsocial);
        jPanel1.add(txtnombres);
        jPanel1.add(btnGuardar1);
        jPanel1.add(BtnCancelar1);
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.TRAILING)
        		.addComponent(jPanel1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.TRAILING)
        		.addComponent(jPanel1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
        );
        
        panel = new JPanel();
        panel.setBackground(new Color(0, 204, 255));
        panel.setBounds(0, 0, 498, 37);
        jPanel1.add(panel);
        panel.setLayout(null);
        
        JLabel lblRegistrarCliente = new JLabel("Registrar Proveedor");
        lblRegistrarCliente.setForeground(Color.WHITE);
        lblRegistrarCliente.setFont(new Font("Times New Roman", Font.BOLD, 23));
        lblRegistrarCliente.setBounds(165, 5, 252, 30);
        panel.add(lblRegistrarCliente);
        
        msjnombres = new JLabel("*");
        msjnombres.setForeground(Color.RED);
        msjnombres.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjnombres.setBounds(418, 70, 46, 14);
        jPanel1.add(msjnombres);
        
        msjrazonsocial = new JLabel("*");
        msjrazonsocial.setVisible(false);
        msjrazonsocial.setForeground(Color.RED);
        msjrazonsocial.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjrazonsocial.setBounds(418, 117, 46, 14);
        jPanel1.add(msjrazonsocial);
        
        msjruc = new JLabel("*");
        msjruc.setVisible(false);
        msjruc.setForeground(Color.RED);
        msjruc.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjruc.setBounds(418, 158, 46, 14);
        jPanel1.add(msjruc);
        getContentPane().setLayout(groupLayout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelar1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
}//GEN-LAST:event_BtnCancelar1ActionPerformed

    private void TxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreActionPerformed
    private void limpiar() {
        txtnombres.setText("");
        txtrazonsocial.setText("");
        txtruc.setText("");
        txtdireccion.setText("");
        txtcelular.setText("");
    }
    String accion = "Insertar";
    private boolean validarcampos(){
    	boolean flag=true;
    	if(txtruc.getText().compareTo("")>11 ){
    		msjruc.setVisible(true);
    		txtruc.requestFocus();
    		flag=false;
    	}
    	if(txtruc.getText().compareTo("")==0 ){
    		msjruc.setVisible(true);
    		txtruc.requestFocus();
    		flag=false;
    	}
    	if(txtnombres.getText().equals("")){
    		msjnombres.setVisible(true);
    		txtnombres.requestFocus();
    		flag=false;
    	}
    	if(txtrazonsocial.getText().equals("")){
    		msjrazonsocial.setVisible(true);
    		txtrazonsocial.requestFocus();
    		flag=false;
    	}
    	return flag;
    }
    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        // TODO add your handling code here:       
    	 //Agregar un nuevo registro
    	if(validarcampos()==false){
    		JOptionPane.showMessageDialog(null, "Ingrese valores correctos.");
    		return;
    	}
    	else if(validarcampos()==true){
    		try{
        c_proveedor p=new c_proveedor();
        p.setNombres(txtnombres.getText());
        p.setRazonsocial(txtrazonsocial.getText());
        p.setRuc(txtruc.getText());
        p.setDireccion(txtdireccion.getText());
        p.setCelular(txtcelular.getText());      
                 d_proveedor.insertarProveedor(p);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Datos Agregados Correctamente");
            msjnombres.setVisible(false);
            msjrazonsocial.setVisible(false);
            msjruc.setVisible(false);
            dispose();
        }       
    }//GEN-LAST:event_btnGuardar1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new agregarProveedor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar1;
    private javax.swing.JTextField txtrazonsocial;
    private javax.swing.JTextField txtruc;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private JPanel panel;
    private JLabel msjnombres;
    private JLabel msjrazonsocial;
    private JLabel msjruc;
}

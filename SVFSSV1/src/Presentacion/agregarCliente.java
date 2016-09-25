package Presentacion;

import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Datos.BD;
import Datos.d_cliente;
import Logica.c_cliente;

import com.mysql.jdbc.Connection;

public class agregarCliente extends javax.swing.JFrame {
	BD cnn;
//    Connection cnn = (Connection) BD.getConnection();
    /** Creates new form agregarClientes */
    public agregarCliente() {
    	setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Agregar Cliente");
        this.setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnGuardar1 = new javax.swing.JButton();
        btnGuardar1.setIcon(new ImageIcon(agregarCliente.class.getResource("/img/save.png")));
        btnGuardar1.setBounds(190, 280, 60, 40);
        BtnCancelar1 = new javax.swing.JButton();
        BtnCancelar1.setIcon(new ImageIcon(agregarCliente.class.getResource("/img/no.png")));
        BtnCancelar1.setBounds(270, 280, 60, 40);
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBounds(48, 71, 84, 16);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setBounds(48, 115, 86, 16);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setBounds(75, 158, 85, 16);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(48, 205, 86, 16);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setBounds(66, 246, 94, 16);
        txtnombres = new javax.swing.JTextField();
        txtnombres.setBounds(183, 67, 231, 20);
        txtapellidos = new javax.swing.JTextField();
        txtapellidos.setBounds(183, 111, 231, 20);
        txtdni = new javax.swing.JTextField();
        txtdni.setBounds(183, 154, 231, 20);
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
        jLabel2.setText("Apellidos  : ");

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12));
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("D.N.I. :");

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
        jPanel1.add(txtdni);
        jPanel1.add(txtapellidos);
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
        		.addComponent(jPanel1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );
        
        panel = new JPanel();
        panel.setBackground(new Color(0, 204, 255));
        panel.setBounds(0, 0, 498, 37);
        jPanel1.add(panel);
        panel.setLayout(null);
        
        JLabel lblRegistrarCliente = new JLabel("Registrar Cliente");
        lblRegistrarCliente.setForeground(Color.WHITE);
        lblRegistrarCliente.setFont(new Font("Times New Roman", Font.BOLD, 23));
        lblRegistrarCliente.setBounds(165, 5, 204, 21);
        panel.add(lblRegistrarCliente);
        
        msjnombres = new JLabel("*");
        msjnombres.setVisible(false);
        msjnombres.setForeground(Color.RED);
        msjnombres.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjnombres.setBounds(424, 67, 46, 14);
        jPanel1.add(msjnombres);
        
        msjapellidos = new JLabel("*");
        msjapellidos.setVisible(false);
        msjapellidos.setForeground(Color.RED);
        msjapellidos.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjapellidos.setBounds(424, 117, 46, 14);
        jPanel1.add(msjapellidos);
        
        msjdni = new JLabel("*");
        msjdni.setVisible(false);
        msjdni.setForeground(Color.RED);
        msjdni.setFont(new Font("Tahoma", Font.PLAIN, 20));
        msjdni.setBounds(424, 158, 46, 14);
        jPanel1.add(msjdni);
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
        txtapellidos.setText("");
        txtdni.setText("");
        txtdireccion.setText("");
        txtcelular.setText("");
    }
    String accion = "Insertar";
    private boolean validarcampos(){
    	boolean flag=true;
    	if(txtdni.getText().compareTo("")>8){
    		 msjdni.setVisible(true);
      		flag=false;
    	}
    	if(txtdni.getText().compareTo("") == 0){
   		 msjdni.setVisible(true);
     		flag=false;
    	}
    	if(txtnombres.getText().equals("")){
   		 msjnombres.setVisible(true);
     		flag=false;
    	}
    	if(txtapellidos.getText().equals("")){
      		 msjapellidos.setVisible(true);
        		flag=false;
       	}
    	return flag;
    }
    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        // TODO add your handling code here:       
    	 //Agregar un nuevo registro
    	if (validarcampos()==false)
    	{JOptionPane.showMessageDialog(null, "Ingrese valores correctos");
    		return;
    	}
    	else if (validarcampos()==true){
    		try { 
        c_cliente c=new c_cliente();
        c.setNombres(txtnombres.getText());
        c.setApellidos(txtapellidos.getText());
        c.setDni(Integer.parseInt(txtdni.getText()));
        c.setDireccion(txtdireccion.getText());
        c.setCelular(txtcelular.getText());      
                 d_cliente.insertarCliente(c);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Datos Agregados Correctamente");
            msjdni.setVisible(false);
            msjapellidos.setVisible(false);
            msjnombres.setVisible(false);
            dispose();
        }       
 
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new agregarCliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar1;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtdni;
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
    private JLabel msjapellidos;
    private JLabel msjdni;
}

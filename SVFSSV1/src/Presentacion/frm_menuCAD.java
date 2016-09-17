package Presentacion;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
public class frm_menuCAD extends javax.swing.JFrame {

    public frm_menuCAD() {
    	setFont(new Font("Dialog", Font.BOLD, 16));
    	getContentPane().setBackground(new Color(70, 130, 180));
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem5.setIcon(new ImageIcon(frm_menuCAD.class.getResource("/img/ventas.png")));
        jMenuItem5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		frm_venta frmv=new frm_venta();
        		frmv.setVisible(true);
        	}
        });
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem1.setIcon(new ImageIcon(frm_menuCAD.class.getResource("/img/cliente.png")));
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem4.setIcon(new ImageIcon(frm_menuCAD.class.getResource("/img/familias.png")));
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem3.setIcon(new ImageIcon(frm_menuCAD.class.getResource("/img/ciudad.png")));
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem7.setIcon(new ImageIcon(frm_menuCAD.class.getResource("/img/medidas.png")));
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem6.setIcon(new ImageIcon(frm_menuCAD.class.getResource("/img/reporvc.png")));
        jMenuItem6.addActionListener(new ActionListener() {
        	
        	public void actionPerformed(ActionEvent arg0) {
        		 frm_reporteVentas frv=new frm_reporteVentas();
        		 frv.setVisible(true);
        		
        	}
        });
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONTROL ADMINISTRATIVO");
        setExtendedState(6);
        setIconImages(null);

        jMenu1.setText("Movimientos");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu1.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu1MenuSelected(evt);
            }
        });

        jMenuItem5.setText("Registrar Ventas");
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);
        
        mntmRegistrarCompras = new JMenuItem("Registrar Compras");
        mntmRegistrarCompras.setIcon(new ImageIcon(frm_menuCAD.class.getResource("/img/compras.png")));
        mntmRegistrarCompras.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frm_compra frmc=new frm_compra();
        		frmc.setVisible(true);
        	}
        });
        jMenu1.add(mntmRegistrarCompras);

        jMenu3.setText("Mantenimiento");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem4.setText("Familias");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem3.setText("Ciudades");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem7.setText("Medidas");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);
        
        mntmProveedores = new JMenuItem("Proveedores");
        mntmProveedores.setIcon(new ImageIcon(frm_menuCAD.class.getResource("/img/proveedor.png")));
        mntmProveedores.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		frm_proveedor frmpro=new frm_proveedor();
        		frmpro.setVisible(true);
        	}
        });
        jMenu3.add(mntmProveedores);
        
        mntmArtculos = new JMenuItem("Art\u00EDculos");
        mntmArtculos.setIcon(new ImageIcon(frm_menuCAD.class.getResource("/img/articulos.png")));
        mntmArtculos.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frm_mantearticulos frma=new frm_mantearticulos();
        		frma.setVisible(true);
        	}
        });
        jMenu3.add(mntmArtculos);
        
        mntmTarifas = new JMenuItem("Tarifas");
        mntmTarifas.setIcon(new ImageIcon(frm_menuCAD.class.getResource("/img/tarifas.png")));
        mntmTarifas.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frm_tarifas frmt=new frm_tarifas();
        		frmt.setVisible(true);
        	}
        });
        jMenu3.add(mntmTarifas);
        
        mntmStock = new JMenuItem("Stock");
        mntmStock.setIcon(new ImageIcon(frm_menuCAD.class.getResource("/img/stock.png")));
        mntmStock.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frm_stock frmst=new frm_stock();
        		frmst.setVisible(true);
        	}
        });
        jMenu3.add(mntmStock);
        
        mntmUsuarios = new JMenuItem("Usuarios");
        mntmUsuarios.setIcon(new ImageIcon(frm_menuCAD.class.getResource("/img/usuario.png")));
        mntmUsuarios.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frm_user frmuser=new frm_user();
        		frmuser.setVisible(true);
        	}
        });
        jMenu3.add(mntmUsuarios);
        
        mntmEmpleados = new JMenuItem("Empleados");
        mntmEmpleados.setIcon(new ImageIcon(frm_menuCAD.class.getResource("/img/empleado.png")));
        mntmEmpleados.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		frm_empleados frmemple=new frm_empleados();
        		frmemple.setVisible(true);
        	}
        });
        jMenu3.add(mntmEmpleados);
        
        mntmCargos = new JMenuItem("Cargos");
        mntmCargos.setIcon(new ImageIcon(frm_menuCAD.class.getResource("/img/cargos.png")));
        mntmCargos.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		frm_cargo frmc=new frm_cargo();
        		frmc.setVisible(true);
        	}
        });
        jMenu3.add(mntmCargos);

        jMenu4.setText("Informes");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem6.setText("Reporte Ventas");
        jMenu4.add(jMenuItem6);

        jMenuBar1.add(jMenu4);
        
        mntmHistorialCompras = new JMenuItem("Reporte Stock");
        mntmHistorialCompras.setIcon(new ImageIcon(frm_menuCAD.class.getResource("/img/reporstock.png")));
        mntmHistorialCompras.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		frm_reporteStock frs=new frm_reporteStock();
        		frs.setVisible(true);
        	}
        });
        jMenu4.add(mntmHistorialCompras);

        jMenu2.setText("Salir");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem2.setText("Salir del sistema");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 822, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu1MenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1MenuSelected

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        frm_cliente frmcliente=new frm_cliente();
        frmcliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir del sistema?",
                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        frm_familia frmf=new frm_familia();
        frmf.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        frm_ciudad frmcd=new frm_ciudad();
        frmcd.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        frm_medidas frmm=new frm_medidas();
        frmm.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_menuCAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_menuCAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_menuCAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_menuCAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_menuCAD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private JMenuItem mntmRegistrarCompras;
    private JMenuItem mntmProveedores;
    private JMenuItem mntmArtculos;
    private JMenuItem mntmTarifas;
    private JMenuItem mntmStock;
    private JMenuItem mntmUsuarios;
    private JMenuItem mntmEmpleados;
    private JMenuItem mntmCargos;
    private JMenuItem mntmHistorialCompras;
    // End of variables declaration//GEN-END:variables
}

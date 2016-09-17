package Presentacion;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Datos.BD;
import Datos.d_detacompra;
import Datos.d_proveedor;
import Datos.d_updatestock;
import Logica.c_carrito;
import Logica.c_detacompra;
import Logica.c_proveedor;
import Logica.c_updatestock;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPanel;

import java.awt.Window.Type;

import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class frm_compra extends javax.swing.JFrame {
	Connection cnn = BD.getConnection();
    agregarProveedor aP = new agregarProveedor();
    buscarArticulo bP = new buscarArticulo();
    static double totalProd;
    int numFac=0;
    static ArrayList <c_updatestock> listproduct = new ArrayList<c_updatestock>();
    static ArrayList <c_detacompra> compras = new ArrayList<c_detacompra>();
    public frm_compra() {
    	setUndecorated(true);
    	setAutoRequestFocus(false);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setResizable(false); 	
    	getContentPane().setBackground(Color.WHITE);
        initComponents();
        this.setTitle("VENTA");
        this.setLocationRelativeTo(null);
        Date fecha = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");
        jblFecha.setText(""+sd.format(fecha));
        jpFactura.setLayout(null);
        jpFactura.add(jLabel5);
        jpFactura.add(jLabel4);
        jpFactura.add(jblFecha);
        jpFactura.add(jLabel2);
        jpFactura.add(txtbuscar);
        jpFactura.add(btnBuscarProveedor);
        jpFactura.add(jButton1);
        jpFactura.add(jLabel1);
        jpFactura.add(jLabel3);
        jpFactura.add(txtnombres);
        jpFactura.add(txtdireccion);
        jpFactura.add(jLabel6);
        jpFactura.add(txtcelular);
        
        txtnumventa = new JTextField();
        txtnumventa.setEditable(false);
        txtnumventa.setBounds(100, 35, 86, 20);
        jpFactura.add(txtnumventa);
        txtnumventa.setColumns(10);
    	
    	cmbidcompro = new JComboBox();
    	cmbidcompro.setModel(new DefaultComboBoxModel(new String[] {"BOLETA", "FACTURA", "SIN_ESPECIFICAR"}));
    	cmbidcompro.setBounds(505, 182, 145, 20);
    	jpFactura.add(cmbidcompro);
    	
    	JLabel lblEmpleado = new JLabel();
    	lblEmpleado.setText("EMPLEADO:");
    	lblEmpleado.setFont(new Font("Tahoma", Font.BOLD, 12));
    	lblEmpleado.setBounds(16, 189, 79, 15);
    	jpFactura.add(lblEmpleado);
    	
    	JLabel lblComprobante = new JLabel();
    	lblComprobante.setText("COMPROBANTE:");
    	lblComprobante.setFont(new Font("Tahoma", Font.BOLD, 12));
    	lblComprobante.setBounds(382, 187, 102, 15);
    	jpFactura.add(lblComprobante);
    	
    	cmbempleado = new JComboBox();
    	cmbempleado.setBounds(102, 182, 135, 20);
    	jpFactura.add(cmbempleado);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFactura = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBounds(16, 114, 76, 15);
        txtnombres = new javax.swing.JTextField();
        txtnombres.setBounds(102, 112, 285, 20);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setBounds(41, 76, 76, 15);
        txtbuscar = new javax.swing.JTextField();
        txtbuscar.setBounds(102, 74, 189, 20);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setBounds(10, 153, 82, 15);
        txtdireccion = new javax.swing.JTextField();
        txtdireccion.setBounds(102, 151, 285, 20);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(333, 30, 123, 15);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setBounds(16, 35, 86, 15);
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setBounds(427, 114, 68, 15);
        txtcelular = new javax.swing.JTextField();
        txtcelular.setBounds(505, 112, 135, 20);
        btnBuscarProveedor = new javax.swing.JButton();
        btnBuscarProveedor.setIcon(new ImageIcon(frm_compra.class.getResource("/img/edit_find.png")));
        btnBuscarProveedor.setBounds(310, 55, 50, 40);
        jblFecha = new javax.swing.JLabel();
        jblFecha.setBounds(466, 30, 86, 14);
        jButton1 = new javax.swing.JButton();
        jButton1.setIcon(new ImageIcon(frm_compra.class.getResource("/img/plus.png")));
        jButton1.setBounds(380, 55, 50, 40);
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane1.setBounds(10, 30, 570, 170);
        TablaProductos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setBounds(389, 230, 66, 15);
        txtsubtotal = new javax.swing.JTextField();
        txtsubtotal.setEditable(false);
        txtsubtotal.setBounds(481, 220, 100, 30);
        jLabel8 = new javax.swing.JLabel();
        jLabel8.setBounds(332, 280, 131, 15);
        txtigv = new javax.swing.JTextField();
        txtigv.setEditable(false);
        txtigv.setBounds(481, 270, 100, 30);
        jLabel10 = new javax.swing.JLabel();
        jLabel10.setBounds(366, 340, 89, 15);
        txtotal = new javax.swing.JTextField();
        txtotal.setEditable(false);
        txtotal.setForeground(new Color(0, 51, 102));
        txtotal.setFont(new Font("Tahoma", Font.BOLD, 25));
        txtotal.setBounds(481, 320, 100, 60);
        brnAgregar = new javax.swing.JButton();
        brnAgregar.setIcon(new ImageIcon(frm_compra.class.getResource("/img/plus.png")));
        brnAgregar.setBounds(590, 105, 120, 40);
        btnGrabar = new javax.swing.JButton();
        btnGrabar.setIcon(new ImageIcon(frm_compra.class.getResource("/img/save.png")));
        btnGrabar.setBounds(192, 275, 100, 80);
        jButton3 = new javax.swing.JButton();
        jButton3.setText("Catalogo");
        jButton3.setIcon(new ImageIcon(frm_compra.class.getResource("/img/binoculars.png")));
        jButton3.setBounds(590, 60, 120, 40);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jpFactura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de la Compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setText("NOMBRES : ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setText("R.U.C.:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setText("DIRECCION :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel4.setText("FECHA EMISION: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel5.setText("Compra N\u00BA : ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel6.setText("CELULAR:");
        btnBuscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProveedorActionPerformed(evt);
            }
        });

        jblFecha.setText("jLabel11");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles de la Compra ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Producto", "Cantidad", "P. Unitario", "P. Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaProductos);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel7.setText("Subtotal : ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel8.setText("Impuesto  IGV 18%: ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel10.setText("Total a Pagar :");

        brnAgregar.setText("Carrito");
        brnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnAgregarActionPerformed(evt);
            }
        });
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btnGrabarActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        
        panel = new JPanel();
        panel.setBackground(new Color(0, 204, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(panel, GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
        		.addComponent(jpFactura, GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
        		.addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(panel, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jpFactura, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
        			.addGap(6))
        );
        panel.setLayout(null);
        
        lblRegistrarVentas = new JLabel("Registrar Compras");
        lblRegistrarVentas.setForeground(Color.WHITE);
        lblRegistrarVentas.setBackground(Color.WHITE);
        lblRegistrarVentas.setFont(new Font("Times New Roman", Font.BOLD, 30));
        lblRegistrarVentas.setBounds(210, 2, 254, 35);
        panel.add(lblRegistrarVentas);
        jPanel4.setLayout(null);
        jPanel4.add(jLabel10);
        jPanel4.add(jLabel7);
        jPanel4.add(txtotal);
        jPanel4.add(txtsubtotal);
        jPanel4.add(jLabel8);
        jPanel4.add(txtigv);
        jPanel4.add(jScrollPane1);
        jPanel4.add(brnAgregar);
        jPanel4.add(jButton3);
        jPanel4.add(btnGrabar);
        jButton2 = new javax.swing.JButton();
        jButton2.setIcon(new ImageIcon(frm_compra.class.getResource("/img/cancel2.png")));
        jButton2.setBounds(58, 275, 100, 80);
        jPanel4.add(jButton2);
                
                btnEliminar = new JButton("Eliminar");
                btnEliminar.setIcon(new ImageIcon(frm_compra.class.getResource("/img/gnome_edit_delete.png")));
                btnEliminar.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                		int rpta=JOptionPane.showConfirmDialog(rootPane, "¿Desea eliminar este producto?",
                                "Eliminar", JOptionPane.YES_NO_OPTION);
                		if (rpta== JOptionPane.YES_OPTION){

                		DefaultTableModel dtm = (DefaultTableModel) TablaProductos.getModel();
                		dtm.removeRow(TablaProductos.getSelectedRow()); 
                		}else{
                			return;
                		}
                	}
                });
                btnEliminar.setBounds(590, 150, 120, 40);
                jPanel4.add(btnEliminar);
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton2ActionPerformed(evt);
                    }
                });
        getContentPane().setLayout(layout);
        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void limpiarCasillas()
    {
        txtbuscar.setText("");
        txtnombres.setText("");
        txtdireccion.setText("");
        txtcelular.setText("");
        cmbempleado.setSelectedItem("");;
        TablaProductos.setModel(new DefaultTableModel());
        txtsubtotal.setText("");
        txtigv.setText("");
        txtotal.setText("");
    }
    private void habilitarCajas(){
    txtnombres.setEnabled(true);
    txtdireccion.setEnabled(true);
    txtcelular.setEnabled(true); 
    }
    private void deshabilitarCajas(){
        txtnombres.setEnabled(false);
        txtdireccion.setEnabled(false);
        txtcelular.setEnabled(false); 
        }
    private void brnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnAgregarActionPerformed
      DefaultTableModel productosFila = (DefaultTableModel) TablaProductos.getModel();             
      String sqlarticulos="";
      String clave="";
      double cantidad=0;  
      
      	try {
      		clave = JOptionPane.showInputDialog(null, "Ingrese el codigo del producto:", "Entrada", 1);
  	    		if(clave==null||clave.equals(""))
  	    			return;
  	    		else
  	    			cantidad = Double.parseDouble(JOptionPane.showInputDialog("La cantidad: ",0));  
  	    		if(cantidad==0||clave.equals(""))
  	    			return;
  	    		else{

        sqlarticulos = "SELECT s.codarticulo, t.pvunt,s.stockactual,s.idstock FROM articulos a INNER JOIN tarifas t ON a.codarticulo= t.codarticulo INNER JOIN stock s ON s.codarticulo=a.codarticulo "
                + "WHERE a.codarticulo= '"+clave+"'";        
        c_carrito carrito = new c_carrito();
        c_updatestock updatestock=new c_updatestock();
        c_detacompra compra=new c_detacompra();
        Object contTabla []= new Object[5];        
        try
        {
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sqlarticulos);
            while(rs.next())
            { 
            	carrito.setNumventa(txtnumventa.getText());
                carrito.setCodarticulo(rs.getString("codarticulo"));
                carrito.cantidad=cantidad;
                carrito.setPvunt (rs.getDouble("pvunt"));
                carrito.importe=(total(carrito.getCantidad(),carrito.getPvunt()));
                
                compra.setNumcompro(txtnumventa.getText());
                compra.setCodarticulo(rs.getString("codarticulo"));
                compra.cantidad=cantidad;
                compra.setPvunt(rs.getDouble("pvunt"));
                compra.total=total(carrito.getCantidad(),carrito.getPvunt());
                compras.add(compra);
                
                updatestock.setStockactual(rs.getDouble("stockactual"));
                updatestock.cantidad=cantidad;
                updatestock.setCodarticulo(rs.getString("codarticulo"));
                updatestock.setIdstock(rs.getInt("idstock"));
                updatestock.setStockfinal(rs.getDouble("stockactual")+updatestock.cantidad);
                listproduct.add(updatestock);
         
                contTabla[0] = carrito.getNumventa();
                contTabla[1] = carrito.getCodarticulo();
                contTabla[2] = carrito.getCantidad();
                contTabla[3] = carrito.getPvunt();                                            
                contTabla[4] = carrito.getImporte();
                productosFila.addRow(contTabla);
            } 
            TablaProductos.setModel(productosFila);            
            totalFacturado();   
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        } 
		
  	    		}
      	}
      	catch(Exception e) {
      		JOptionPane.showMessageDialog(null, "No escribio nada", "Error", 0);
      	} 
        
    }//GEN-LAST:event_brnAgregarActionPerformed
    public void buscarProveedor() {
        c_proveedor p = null;
        try {
            p = d_proveedor.buscarRuc(txtbuscar.getText());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR:" + e.getMessage());
        }
        if (p != null) {
            txtnombres.setText(p.getNombres());
            txtbuscar.setText(String.valueOf(p.getRuc()));
            txtdireccion.setText(p.getDireccion());
            txtcelular.setText(String.valueOf(p.getCelular()));
        } else {
        	JOptionPane.showMessageDialog(null, "No existe");
        	txtbuscar.setText("");
            txtbuscar.setEditable(true);
            txtbuscar.requestFocus();
            
        }
    }
    private void btnBuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        
    	if (txtbuscar.getText().compareTo("") != 0) {
            int result = JOptionPane.showConfirmDialog(
                    this, "Esta seguro?",
                    "Mensaje..!!",
                    JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                buscarProveedor();
                habilitarCajas();
            }
            if (result == JOptionPane.NO_OPTION) {
                limpiarCasillas();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese R.U.C.	 del Proveedor a Buscar");
            txtbuscar.requestFocus();
        }
    	deshabilitarCajas();
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       txtnumventa.setText(generarFactura());                
    }//GEN-LAST:event_formWindowOpened
    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_btnGrabarActionPerformed
   if(txtotal.getText().compareTo("") == 0){
	   JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios!!");
	   return;
   }else
   {
	   int rpta = JOptionPane.showConfirmDialog(this, "Esta seguro?","Mensaje..!!",JOptionPane.YES_NO_OPTION);
	  if(rpta==JOptionPane.YES_OPTION){
		  	String numcompro;
	        String tipocompro;
	        String rucprovee;
	        String dniempleado;
	        String fechaventa;  
	        
	        rucprovee 	= txtbuscar.getText();
	        dniempleado = cmbempleado.getSelectedItem().toString();
	        numcompro 	= txtnumventa.getText();
	        tipocompro	=cmbidcompro.getSelectedItem().toString();
	        fechaventa 	= jblFecha.getText();
	        
	        String sqlventa = "";
	        String mensaje = "LOS DATOS SE HAN GUARDADO CORRECTAMENTE";

	        sqlventa = "INSERT INTO COMPRAS(numcompro, tipocompro, rucprovee, dniempleado, fechacompra)"
	                + "VALUES(?, ?, ?, ?, ?)";
	        
	        try {
	            com.mysql.jdbc.PreparedStatement pst = (com.mysql.jdbc.PreparedStatement) cnn.prepareStatement(sqlventa);
	            pst.setString(1, numcompro);
	            pst.setString(2, tipocompro);
	            pst.setString(3, rucprovee);
	            pst.setString(4, dniempleado);
	            pst.setString(5, fechaventa);
	            int n = pst.executeUpdate();
	        	if ( n>0){
	        	JOptionPane.showMessageDialog(null, mensaje);
	        	limpiarCasillas();
	        	}           
	        } catch (SQLException ex) {
	            JOptionPane.showMessageDialog(null, ex);
	        }

	        for (c_detacompra y : compras) {
	        	d_detacompra.insertarDetaCompra(y);
			}
	        for (c_updatestock x : listproduct) {
	        	d_updatestock.actualizarStock(x);
			}
	        txtbuscar.requestFocus();
	        dispose();
	        frm_compra frmv=new frm_compra();
	        frmv.setVisible(true);
	  }
	  else{
		  return;
	  }
   }         
}//GEN-LAST:event_btnGrabarActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        aP.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        bP.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frm_compra().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaProductos;
    private javax.swing.JButton brnAgregar;
    private javax.swing.JButton btnBuscarProveedor;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtotal;
    private javax.swing.JTextField txtsubtotal;
    private javax.swing.JTextField txtigv;
    private javax.swing.JLabel jblFecha;
    private javax.swing.JPanel jpFactura;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtcelular;
    private JTextField txtnumventa;
    private JComboBox comboBox;
    private JComboBox cmbidcompro;
    private JButton btnEliminar;
    private JPanel panel;
    private JLabel lblRegistrarVentas;
    private JComboBox cmbempleado;
    // End of variables declaration//GEN-END:variables

    private double total(double cantidad, double pvunt) {
        totalProd = cantidad * pvunt;
        return totalProd;
    }

    private void totalFacturado() {
        double suma=0; 
        double IVA=0; 
        DecimalFormat dt = new DecimalFormat("#.##");
        for (int i = 0; i < TablaProductos.getRowCount(); i++) {
            suma = suma + Double.parseDouble(String.valueOf(TablaProductos.getValueAt(i, 4)));             
        }
        
        txtsubtotal.setText(""+dt.format(suma));
        txtigv.setEditable(false);
        IVA = suma * 0.18;
        double totalFacturado = suma + IVA;
        
        txtigv.setText(""+dt.format(IVA));
        txtotal.setEditable(false);
        txtotal.setText(""+dt.format(totalFacturado));
    }
    private String generarFactura() {
    	String factura="";
        String sqlnumfac;
        String cadena="";    	            
            try {
            	Connection cnn = BD.getConnection();
                sqlnumfac = "select max(numcompro) from compras";
                Statement st = cnn.createStatement();
                ResultSet rs = st.executeQuery(sqlnumfac);
                DecimalFormat df = new DecimalFormat("0000");
                int nro;               
                while(rs.next()){
                	cadena=rs.getString("max(numcompro)");               
                    nro=Integer.parseInt(cadena)+1;
                    factura=df.format(nro);
                }
            } catch (SQLException e) {
            }
            return factura;
    }
}

package Presentacion;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import Datos.BD;
import Datos.d_catalogo;
import Logica.c_catalogo;

public class buscarArticulo extends javax.swing.JFrame {
       DefaultTableModel modeloTabla;
       private TableRowSorter trsfiltro;
//       Connection cnn = BD.getConnection();  
       BD cnn;
       PreparedStatement ps = null;
    public buscarArticulo() {
        modeloTabla=new DefaultTableModel(null,getColumnas());
        Filas();
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel3.setBorder(new TitledBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Lista de Articulos", TitledBorder.LEADING, TitledBorder.TOP, null, null), "Lista de Articulos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        jPanel3.setBounds(0, 46, 810, 510);
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane1.addPropertyChangeListener(new PropertyChangeListener() {
        	public void propertyChange(PropertyChangeEvent arg0) {
        	}
        });
        jScrollPane1.setBounds(4, 59, 802, 445);
        tableArticulo = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBounds(0, 0, 825, 35);
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBounds(246, 0, 274, 35);

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
        jPanel4.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tableArticulo.setModel(modeloTabla);
        jScrollPane1.setViewportView(tableArticulo);
        if (tableArticulo.getColumnModel().getColumnCount() > 0) {
        	tableArticulo.getColumnModel().getColumn(0).setHeaderValue("Codigo");
        	tableArticulo.getColumnModel().getColumn(1).setHeaderValue("Descripcion");
        	tableArticulo.getColumnModel().getColumn(2).setHeaderValue("Marca");
        	tableArticulo.getColumnModel().getColumn(3).setHeaderValue("Stock");
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
        btncerrarventana = new javax.swing.JButton();
        btncerrarventana.setBounds(701, 11, 105, 37);
        jPanel3.add(btncerrarventana);
        btncerrarventana.setIcon(new ImageIcon(buscarArticulo.class.getResource("/img/cancel2.png")));
        btncerrarventana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarventanaActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setForeground(new java.awt.Color(0, 51, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consulta de Art\u00EDculos");
        jPanel1.add(jLabel1);

        jPanel4.add(jPanel1);
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 815, GroupLayout.PREFERRED_SIZE)
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
        String  columna[]=new String[]{"Codigo","Descripcion","Marca","Stock"};
        return columna;
    }
    private void Filas(){
    try{
        for(c_catalogo a : d_catalogo.mostrarArticulosConsulta()){
            String Datos[]={a.getCodarticulo(),a.getDescripcion(),a.getCodfam(),a.getStockactual()};
            modeloTabla.addRow(Datos);
        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERROR: "+e.getMessage());
        }
    }      
    public void filtro() {
    	trsfiltro.setRowFilter(RowFilter.regexFilter(txtbuscarPorTeclado.getText(), 1));
    	} 

    private void btncerrarventanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarventanaActionPerformed
        dispose();
    }//GEN-LAST:event_btncerrarventanaActionPerformed

    private void jPanel4ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel4ComponentAdded
        setLocationRelativeTo(null);
    }//GEN-LAST:event_jPanel4ComponentAdded
    private javax.swing.JButton btncerrarventana;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableArticulo;
    private JTextField txtbuscarPorTeclado;
}

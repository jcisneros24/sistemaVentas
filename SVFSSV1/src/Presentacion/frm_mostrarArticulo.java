package Presentacion;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import Datos.BD;
import Datos.d_articulos;
import Logica.c_articulos;
import javax.swing.ImageIcon;

public class frm_mostrarArticulo extends javax.swing.JFrame {	
       DefaultTableModel modeloTabla;
       private TableRowSorter trsfiltro;
       Connection cnn = BD.getConnection();  
       PreparedStatement ps = null;
       public static String send;
    public frm_mostrarArticulo() {
        modeloTabla=new DefaultTableModel(null,getColumnas());      
        Filas();
        initComponents();       
        tableArticulo.addMouseListener(new MouseAdapter() {
        	public void mousePressed(MouseEvent Mouse_evt) {
        	JTable table =(JTable) Mouse_evt.getSource();
        	Point point = Mouse_evt.getPoint();
        	int row = table.rowAtPoint(point);
        	if (Mouse_evt.getClickCount() == 2) {
        		send=(tableArticulo.getValueAt(tableArticulo.getSelectedRow(), 0)).toString();
        	}
        	}
        	});
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel3.setBorder(new TitledBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Lista de Articulos", TitledBorder.LEADING, TitledBorder.TOP, null, null), "Lista de Articulos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        jPanel3.setBounds(10, 90, 810, 340);
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane1.addPropertyChangeListener(new PropertyChangeListener() {
        	public void propertyChange(PropertyChangeEvent arg0) {
        	}
        });
        jScrollPane1.setBounds(4, 19, 802, 328);
        tableArticulo = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBounds(0, 0, 1260, 35);
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBounds(308, 0, 243, 35);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.addContainerListener(new java.awt.event.ContainerAdapter() {

        });
        jPanel4.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tableArticulo.setModel(modeloTabla);
        tableArticulo.addKeyListener(new java.awt.event.KeyAdapter() {
            
        });
        jScrollPane1.setViewportView(tableArticulo);
        if (tableArticulo.getColumnModel().getColumnCount() > 0) {
        	tableArticulo.getColumnModel().getColumn(0).setHeaderValue("Codigo");
        	tableArticulo.getColumnModel().getColumn(1).setHeaderValue("Descripcion");
        	tableArticulo.getColumnModel().getColumn(2).setHeaderValue("Familia");

        }

        jPanel4.add(jPanel3);
        jPanel3.setLayout(null);
        jPanel3.add(jScrollPane1);

        jPanel1.setBackground(new Color(102, 205, 170));
        jPanel1.setForeground(new java.awt.Color(0, 51, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Articulos Buscados");
        jPanel1.add(jLabel1);

        jPanel4.add(jPanel1);
        
        btnNewButton = new JButton("");
        btnNewButton.setIcon(new ImageIcon(frm_mostrarArticulo.class.getResource("/img/cancel2.png")));
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        	}
        });
        btnNewButton.setBounds(755, 40, 60, 40);
        jPanel4.add(btnNewButton);
        txtbuscar = new JTextField();
        txtbuscar.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyTyped(KeyEvent e) {
        		
        		txtbuscar.addKeyListener(new KeyAdapter() {
        			public void keyReleased(final KeyEvent e) {
        			String cadena = (txtbuscar.getText()).toUpperCase();
        			txtbuscar.setText(cadena);
        			repaint();
        			filtro();	
        			}
        			});
        			trsfiltro = new TableRowSorter(tableArticulo.getModel());
        			tableArticulo.setRowSorter(trsfiltro);
        	}
        });
        txtbuscar.setBounds(389, 49, 216, 20);
        jPanel4.add(txtbuscar);
        txtbuscar.setColumns(10);
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 824, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );
        
        JLabel lblBuscarArticulos = new JLabel("Buscar Articulos:");
        lblBuscarArticulos.setBounds(280, 52, 138, 14);
        jPanel4.add(lblBuscarArticulos);
        getContentPane().setLayout(groupLayout);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private String[] getColumnas(){
        String  columna[]=new String[]{"Codigo","Descripcion","Familia"};
        return columna;
    }
        
    private void Filas(){
    try{
        for(c_articulos a : d_articulos.mostrarArticulosConsulta()){
            String Datos[]={a.getCodarticulo(),a.getDescripcion(),a.getCodfam()};
            modeloTabla.addRow(Datos);
        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERROR: "+e.getMessage());
        }

    }   
public void filtro() {
trsfiltro.setRowFilter(RowFilter.regexFilter(txtbuscar.getText(), 1));
}
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableArticulo;
    private JButton btnNewButton;
    private JTextField txtbuscar;
}


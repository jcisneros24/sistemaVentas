package Presentacion;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.TitledBorder;
public class frm_login extends JFrame {
	private JPasswordField txtpass;
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					frm_login frame = new frm_login();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm_login() {
		setUndecorated(true);
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
			}
		});
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 700, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new TitledBorder(null, "Acceso al Sistema", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(238, 69, 452, 187);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCargo = new JLabel("Usuario:");
		lblCargo.setBounds(42, 38, 114, 20);
		panel.add(lblCargo);
		
		final JComboBox cmbcargo = new JComboBox();
		cmbcargo.setBounds(130, 35, 300, 30);
		panel.add(cmbcargo);
		cmbcargo.setModel(new DefaultComboBoxModel(new String[] {"SELECCIONA","ADMINISTRADOR", "CAJERO", "ALMACENERO"}));
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(32, 84, 124, 20);
		panel.add(lblPassword);
		
		txtpass = new JPasswordField();
		txtpass.setBounds(130, 81, 300, 30);
		panel.add(txtpass);
		
		JButton btnAcceder = new JButton("");
		btnAcceder.setBounds(165, 123, 70, 45);
		panel.add(btnAcceder);
		btnAcceder.setIcon(new ImageIcon(frm_login.class.getResource("/img/check.png")));
		
		JButton btnCancelar = new JButton("");
		btnCancelar.setBounds(257, 122, 70, 45);
		panel.add(btnCancelar);
		btnCancelar.setIcon(new ImageIcon(frm_login.class.getResource("/img/no.png")));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(70, 130, 180));
		panel_1.setBounds(0, 0, 700, 63);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblAccesoAlSistema = new JLabel("...::: SISTEMA DE VENTAS - SVFSS  v1.0 :::...");
		lblAccesoAlSistema.setBounds(125, 11, 489, 41);
		lblAccesoAlSistema.setForeground(new Color(255, 255, 255));
		panel_1.add(lblAccesoAlSistema);
		lblAccesoAlSistema.setBackground(new Color(204, 204, 204));
		lblAccesoAlSistema.setFont(new Font("Times New Roman", Font.BOLD, 24));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(70, 130, 180));
		panel_2.setBounds(0, 267, 700, 33);
		contentPane.add(panel_2);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(frm_login.class.getResource("/img/login.png")));
		label.setBounds(32, 69, 196, 187);
		contentPane.add(label);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnAcceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				String passAdmin="12345";
				String passCajero="1234";
				String passAlmacen="123";
				String pass=new String(txtpass.getPassword());
				String	user = cmbcargo.getSelectedItem().toString();
				switch( user) {
				 case "ADMINISTRADOR":
					 if(pass.equals(passAdmin)){
					 dispose();
	                    JOptionPane.showMessageDialog(null, "Bienvenido\n"
	                    + "Has ingresado satisfactoriamente al CONTROL ADMINISTRATIVO",   "Mensaje de bienvenida",
	                    JOptionPane.INFORMATION_MESSAGE);
	                    frm_menuCAD frmadmin=new frm_menuCAD();
	                    frmadmin.setVisible(true);	
					 }else{
						 JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
		                 + "Por favor ingrese un usuario y/o contraseña correctos", "Acceso denegado",
		                 JOptionPane.ERROR_MESSAGE);
						 txtpass.requestFocus();
					 		}
				      break;
				      
				 case "CAJERO":
					 if(pass.equals(passCajero)){
					 dispose();
	                    JOptionPane.showMessageDialog(null, "Bienvenido\n"
	                    + "Has ingresado satisfactoriamente al CONTROL DE VENTAS",   "Mensaje de bienvenida",
	                    JOptionPane.INFORMATION_MESSAGE);
	                    frm_menuCVE frmcaja=new frm_menuCVE();
	                    frmcaja.setVisible(true);
					 }else{
						 JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
				                 + "Por favor ingrese un usuario y/o contraseña correctos", "Acceso denegado",
				                 JOptionPane.ERROR_MESSAGE);
								 txtpass.requestFocus(); 
					 		}
				      break;
				 case "ALMACENERO":
					 if(pass.equals(passAlmacen)){
					 dispose();
	                    JOptionPane.showMessageDialog(null, "Bienvenido\n"
	                    + "Has ingresado satisfactoriamente al CONTROL DE ALMACÉN",   "Mensaje de bienvenida",
	                    JOptionPane.INFORMATION_MESSAGE);
	                    frm_menuCAL frmalmacen=new frm_menuCAL();
	                    frmalmacen.setVisible(true);
					 }else{
						 JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
				                 + "Por favor ingrese un usuario y/o contraseña correctos", "Acceso denegado",
				                 JOptionPane.ERROR_MESSAGE);
								 txtpass.requestFocus(); 
					 		}
				      break;
				 default:
					 JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
			                 + "Por favor ingrese un usuario y/o contraseña correctos", "Acceso denegado",
			                 JOptionPane.ERROR_MESSAGE);
							 txtpass.requestFocus();
				      break;
				 }
			}
		});
	}
}

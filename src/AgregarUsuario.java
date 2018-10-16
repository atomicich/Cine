import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.Choice;

public class AgregarUsuario extends JFrame {

	private JPanel contentPane;
	private Cine cine;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;


	/**
	 * Create the frame.
	 */
	public AgregarUsuario(Cine cin) {
		cine=cin;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de Usuario:");
		lblNombreDeUsuario.setBounds(10, 26, 108, 14);
		contentPane.add(lblNombreDeUsuario);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(10, 51, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(10, 76, 87, 14);
		contentPane.add(lblContrasea);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 101, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblDomicilio = new JLabel("Domicilio:");
		lblDomicilio.setBounds(10, 126, 46, 14);
		contentPane.add(lblDomicilio);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(10, 151, 46, 14);
		contentPane.add(lblDni);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento:");
		lblFechaDeNacimiento.setBounds(10, 176, 108, 14);
		contentPane.add(lblFechaDeNacimiento);
		
		textField = new JTextField();
		textField.setBounds(128, 23, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(128, 48, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(128, 73, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(128, 98, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(128, 123, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(128, 148, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(128, 173, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblDdmmaaaa = new JLabel("DD/MM/AAAA");
		lblDdmmaaaa.setBounds(229, 176, 77, 14);
		contentPane.add(lblDdmmaaaa);
		
		JButton btnCrearAdministrador = new JButton("Crear Administrador");
		btnCrearAdministrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cine.buscarUsuario(textField.getText())==null){
					cine.agregarUsuario(textField.getText(),textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText(),Integer.parseInt(textField_5.getText()),textField_6.getText(),2);
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textField_6.setText("");
					JOptionPane.showMessageDialog(null, "Administrador creado exitosamente");
				}else
					JOptionPane.showMessageDialog(null, "Usuario ya existente");	
			}
		});
		btnCrearAdministrador.setBounds(296, 22, 134, 23);
		contentPane.add(btnCrearAdministrador);
		
		JButton btnCrearVendedor = new JButton("Crear Vendedor");
		btnCrearVendedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cine.buscarUsuario(textField.getText())==null){
					cine.agregarUsuario(textField.getText(),textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText(),Integer.parseInt(textField_5.getText()),textField_6.getText(),3);
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textField_6.setText("");
					JOptionPane.showMessageDialog(null, "Vendedor creado exitosamente");

				}else
					JOptionPane.showMessageDialog(null, "Usuario ya existente");
			}
		});
		btnCrearVendedor.setBounds(296, 122, 134, 23);
		contentPane.add(btnCrearVendedor);
		
		JButton btnCrearOperador = new JButton("Crear Operador");
		btnCrearOperador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cine.buscarUsuario(textField.getText())==null){
					cine.agregarUsuario(textField.getText(),textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText(),Integer.parseInt(textField_5.getText()),textField_6.getText(),1);
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textField_6.setText("");
					JOptionPane.showMessageDialog(null, "Operador creado exitosamente");
				}else
					JOptionPane.showMessageDialog(null, "Usuario ya existente");
			}
		});
		btnCrearOperador.setBounds(296, 72, 134, 23);
		contentPane.add(btnCrearOperador);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(315, 227, 89, 23);
		contentPane.add(btnCancelar);
	}
}

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

public class AgregarSala extends JFrame {

	private JPanel contentPane;
	private Cine cine;
	private JTextField textField;
	private JTextField textField_1;
	private Establecimiento establecimiento;
	private JTextField textField_2;
	private JTextField textField_3;

	
	/**
	 * Create the frame.
	 */
	public AgregarSala(Cine cin) {
		cine=cin;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEstablecimiento = new JLabel("Establecimiento:");
		lblEstablecimiento.setBounds(54, 27, 94, 14);
		contentPane.add(lblEstablecimiento);
		
		textField = new JTextField();
		textField.setBounds(158, 24, 135, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSala = new JLabel("Nombre Sala:");
		lblSala.setBounds(54, 94, 83, 14);
		contentPane.add(lblSala);
		lblSala.setVisible(false);
		
		textField_1 = new JTextField();
		textField_1.setBounds(158, 91, 135, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setVisible(false);
		
		JLabel lblCantidadColumnas = new JLabel("Cantidad Columnas:");
		lblCantidadColumnas.setBounds(28, 141, 109, 14);
		contentPane.add(lblCantidadColumnas);
		lblCantidadColumnas.setVisible(false);
		
		textField_2 = new JTextField();
		textField_2.setBounds(129, 138, 53, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setVisible(false);
		
		JLabel lblCantidadFilas = new JLabel("Cantidad Filas:");
		lblCantidadFilas.setBounds(192, 141, 95, 14);
		contentPane.add(lblCantidadFilas);
		lblCantidadFilas.setVisible(false);
		
		textField_3 = new JTextField();
		textField_3.setBounds(273, 138, 58, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		textField_3.setVisible(false);
		
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cine.agregarSala(Integer.parseInt(textField.getText()), textField_1.getText())){
					cine.generarAsientos(Integer.parseInt(textField.getText()),textField_1.getText(),Integer.parseInt(textField_3.getText()) ,Integer.parseInt(textField_2.getText()));
					JOptionPane.showMessageDialog(null, "Sala se agrego exitosamente");
					lblSala.setVisible(false);
					textField_1.setVisible(false);
					btnAgregar.setVisible(false);
					lblCantidadColumnas.setVisible(false);
					lblCantidadFilas.setVisible(false);
					textField_3.setVisible(false);
					textField_2.setVisible(false);
					textField.setEnabled(true);
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					
				}else
					JOptionPane.showMessageDialog(null, "La sala ya existe");
				
			}
		});
		btnAgregar.setBounds(94, 202, 89, 23);
		contentPane.add(btnAgregar);
		btnAgregar.setVisible(false);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(263, 202, 89, 23);
		contentPane.add(btnCancelar);
		
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				establecimiento = cine.buscarEstablecimiento(Integer.parseInt(textField.getText()));
				if(establecimiento!=null){
					lblSala.setVisible(true);
					textField_1.setVisible(true);
					btnAgregar.setVisible(true);
					textField.setEnabled(false);
					lblCantidadColumnas.setVisible(true);
					lblCantidadFilas.setVisible(true);
					textField_3.setVisible(true);
					textField_2.setVisible(true);
				}else
					JOptionPane.showMessageDialog(null, "No existe establecimiento");
			}
		});
		btnBuscar.setBounds(316, 23, 89, 23);
		contentPane.add(btnBuscar);
		

	
	}

}

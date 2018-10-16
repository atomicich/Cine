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

public class AgregarAsiento extends JFrame {

	private JPanel contentPane;
	private Cine cine;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private Establecimiento establecimiento;

	/**
	 * Create the frame.
	 */
	public AgregarAsiento(Cine cin) {
		cine = cin;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEstablecimiento = new JLabel("Establecimiento:");
		lblEstablecimiento.setBounds(41, 11, 95, 14);
		contentPane.add(lblEstablecimiento);
		
		JLabel lblSala = new JLabel("Sala:");
		lblSala.setBounds(41, 57, 46, 14);
		contentPane.add(lblSala);
		lblSala.setVisible(false);
		
		JLabel lblColumna = new JLabel("Columna:");
		lblColumna.setBounds(41, 109, 46, 14);
		contentPane.add(lblColumna);
		lblColumna.setVisible(false);
		
		JLabel lblFila = new JLabel("Fila:");
		lblFila.setBounds(220, 109, 46, 14);
		contentPane.add(lblFila);
		lblFila.setVisible(false);
		
		textField = new JTextField();
		textField.setBounds(127, 8, 139, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(127, 57, 139, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setVisible(false);
		
		textField_2 = new JTextField();
		textField_2.setBounds(97, 106, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setVisible(false);
		
		textField_3 = new JTextField();
		textField_3.setBounds(244, 106, 89, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		textField_3.setVisible(false);
		
		JButton btnBuscar_1 = new JButton("Buscar");
		btnBuscar_1.setVisible(false);

		btnBuscar_1.setBounds(286, 53, 89, 23);
		contentPane.add(btnBuscar_1);

		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(establecimiento.agregarAsiento(textField_1.getText(),(textField.getText()).charAt(0), Integer.parseInt(textField_3.getText()))){
					lblColumna.setVisible(false);
					lblFila.setVisible(false);
					textField_2.setVisible(false);
					textField_3.setVisible(false);
					btnAgregar.setVisible(false);
					textField_1.setEnabled(true);
					textField.setEnabled(true);
					lblSala.setVisible(false);
					textField_1.setVisible(false);
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					btnBuscar_1.setVisible(false);
					JOptionPane.showMessageDialog(null, "El asiento se agrego exitosamente");
				}else
					JOptionPane.showMessageDialog(null, "El asiento ya existe");
			}
		});
		btnAgregar.setBounds(91, 194, 89, 23);
		contentPane.add(btnAgregar);
		btnAgregar.setVisible(false);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(244, 194, 89, 23);
		contentPane.add(btnCancelar);
		

		
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				establecimiento = cine.buscarEstablecimiento(Integer.parseInt(textField.getText()));
				if(establecimiento!=null){
					btnBuscar_1.setVisible(true);
					textField_1.setVisible(true);
					lblSala.setVisible(true);
					textField.setEnabled(false);
				}else
					JOptionPane.showMessageDialog(null, "No existe establecimiento");
			}
		});
		
		
		btnBuscar.setBounds(286, 7, 89, 23);
		contentPane.add(btnBuscar);
		btnBuscar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(establecimiento.buscarSala(textField_1.getText())!=null){
					lblColumna.setVisible(true);
					lblFila.setVisible(true);
					textField_2.setVisible(true);
					textField_3.setVisible(true);
					btnAgregar.setVisible(true);
					textField_1.setEnabled(false);
				}else
					JOptionPane.showMessageDialog(null, "No existe Sala");
			}
		});

	}

}

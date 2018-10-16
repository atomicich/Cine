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

public class ModificarEstablecimiento extends JFrame {

	private JPanel contentPane;
	private JTextField cuit;
	private JTextField nombre;
	private JTextField domicilio;
	private Cine cine;
	private Establecimiento establecimiento;

	/**
	 * Create the frame.
	 */
	public ModificarEstablecimiento(Cine cin) {
		cine=cin;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCuit = new JLabel("CUIT:");
		lblCuit.setBounds(69, 24, 46, 14);
		contentPane.add(lblCuit);
		
		cuit = new JTextField();
		cuit.setBounds(125, 21, 150, 20);
		contentPane.add(cuit);
		cuit.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(69, 82, 46, 14);
		contentPane.add(lblNombre);
		lblNombre.setVisible(false);
		
		JLabel lblDomicilio = new JLabel("Domicilio:");
		lblDomicilio.setBounds(69, 142, 46, 14);
		contentPane.add(lblDomicilio);
		lblDomicilio.setVisible(false);
		
		nombre = new JTextField();
		nombre.setBounds(125, 79, 150, 20);
		contentPane.add(nombre);
		nombre.setColumns(10);
		nombre.setVisible(false);
		
		domicilio = new JTextField();
		domicilio.setBounds(125, 139, 150, 20);
		contentPane.add(domicilio);
		domicilio.setColumns(10);
		domicilio.setVisible(false);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cine.modificarEstablecimiento(Integer.parseInt(cuit.getText()), nombre.getText(), domicilio.getText());
				lblNombre.setVisible(false);
				lblDomicilio.setVisible(false);
				nombre.setVisible(false);
				domicilio.setVisible(false);
				cuit.setEnabled(true);
				nombre.setText("");
				domicilio.setText("");
				cuit.setText("");
				JOptionPane.showMessageDialog(null, "El Establecimiento fue modificado con exito");
			}
		});
		btnModificar.setBounds(69, 206, 89, 23);
		contentPane.add(btnModificar);
		btnModificar.setVisible(false);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(248, 206, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				establecimiento = cine.buscarEstablecimiento(Integer.parseInt(cuit.getText()));
				if(establecimiento!=null){
					lblNombre.setVisible(true);
					lblDomicilio.setVisible(true);
					nombre.setVisible(true);
					domicilio.setVisible(true);
					btnModificar.setVisible(true);
					cuit.setEnabled(false);
					nombre.setText(establecimiento.getNombre());
					domicilio.setText(establecimiento.getDomicilio());
				}else
					JOptionPane.showMessageDialog(null, "El establecimiento no existe");
			}
		});
		btnBuscar.setBounds(297, 20, 89, 23);
		contentPane.add(btnBuscar);
		
	
	}
}

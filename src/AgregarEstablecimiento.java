import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Label;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgregarEstablecimiento extends JFrame {

	private JPanel contentPane;
	private Cine cine;
	private JTextField nroCuit;
	private JTextField nombre;
	private JTextField domi;

	/**
	 * Create the frame.
	 */
	public AgregarEstablecimiento(Cine cin) {
		cine=cin;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nroCuit = new JTextField();
		nroCuit.setBounds(187, 35, 86, 20);
		contentPane.add(nroCuit);
		nroCuit.setColumns(10);
		
		Label cuit = new Label("CUIT:");
		cuit.setBounds(102, 35, 62, 22);
		contentPane.add(cuit);
		
		Label NombreEstablecimiento = new Label("Nombre:");
		NombreEstablecimiento.setBounds(102, 84, 62, 22);
		contentPane.add(NombreEstablecimiento);
		
		Label domicilio = new Label("Domicilio:");
		domicilio.setBounds(102, 144, 62, 22);
		contentPane.add(domicilio);
		
		nombre = new JTextField();
		nombre.setBounds(187, 84, 86, 20);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		domi = new JTextField();
		domi.setBounds(187, 144, 86, 20);
		contentPane.add(domi);
		domi.setColumns(10);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cine.buscarEstablecimiento(Integer.parseInt(nroCuit.getText()))==null){
					cine.agregarEstablecimiento(Integer.parseInt(nroCuit.getText()),nombre.getText(),domi.getText());
					nombre.setText("");
					domi.setText("");
					nroCuit.setText("");
					JOptionPane.showMessageDialog(null, "El Establecimiento fue agregado con exito");
					
				}else
					JOptionPane.showMessageDialog(null, "El Establecimiento ya existe");
			}
		});
		btnAgregar.setBounds(73, 214, 91, 23);
		contentPane.add(btnAgregar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(233, 214, 91, 23);
		contentPane.add(btnCancelar);
	}

}

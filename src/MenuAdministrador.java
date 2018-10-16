import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuAdministrador extends JFrame {

	private JPanel contentPane;
	private Cine cine;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public MenuAdministrador(Cine cin) {
		cine=cin;
		setTitle("MENU ADMINISTRADOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Establecimientos = new JButton("Establecimiento");
		Establecimientos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuEstablecimiento app = new MenuEstablecimiento(cine);
				app.setVisible(true);
			}
		});
		Establecimientos.setBounds(167, 42, 140, 23);
		contentPane.add(Establecimientos);
		
		JButton btnNewButton_1 = new JButton("Sala");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuSala app2 = new MenuSala(cine);
				app2.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(167, 96, 140, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Asientos");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuAsientos app3 = new MenuAsientos(cine);
				app3.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(167, 152, 140, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Gestion usuarios");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuUsuario app = new MenuUsuario(cine);
				app.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(167, 204, 140, 23);
		contentPane.add(btnNewButton_3);
	}

}

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuSala extends JFrame {

	private JPanel contentPane;
	private Cine cine;

	/**
	 * Create the frame.
	 */
	public MenuSala(Cine cin) {
		cine = cin;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAgregarSala = new JButton("Agregar Sala");
		btnAgregarSala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AgregarSala app = new AgregarSala(cine);
				app.setVisible(true);
			}
		});
		btnAgregarSala.setBounds(90, 63, 233, 23);
		contentPane.add(btnAgregarSala);
		
		JButton btnEliminarSala = new JButton("Eliminar Sala");
		btnEliminarSala.setBounds(90, 131, 233, 23);
		contentPane.add(btnEliminarSala);
	}
	
	

}

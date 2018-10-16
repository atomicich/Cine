import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuUsuario extends JFrame {

	private JPanel contentPane;
	private Cine cine;


	/**
	 * Create the frame.
	 */
	public MenuUsuario(Cine cin) {
		cine=cin;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAgregarUsuario = new JButton("Agregar Usuario");
		btnAgregarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AgregarUsuario app = new AgregarUsuario(cine);
				app.setVisible(true);
			}
		});
		btnAgregarUsuario.setBounds(92, 36, 228, 23);
		contentPane.add(btnAgregarUsuario);
		
		JButton btnNewButton = new JButton("Modificar Usuario");
		btnNewButton.setBounds(92, 105, 228, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Eliminar Usuario");
		btnNewButton_1.setBounds(92, 177, 228, 23);
		contentPane.add(btnNewButton_1);
	}

}

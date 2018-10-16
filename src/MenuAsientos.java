import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuAsientos extends JFrame {

	private JPanel contentPane;
	private Cine cine;


	/**
	 * Create the frame.
	 */
	public MenuAsientos(Cine cin) {
		cine = cin;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Agregar Asiento");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AgregarAsiento app = new AgregarAsiento(cine);
				app.setVisible(true);
			}
		});
		btnNewButton.setBounds(95, 43, 248, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Modificar Asiento");
		btnNewButton_1.setBounds(95, 123, 248, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Eliminar Asiento");
		btnNewButton_2.setBounds(95, 195, 248, 23);
		contentPane.add(btnNewButton_2);
	}

}

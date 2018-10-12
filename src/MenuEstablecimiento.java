import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuEstablecimiento extends JFrame {

	private JPanel contentPane;
	private Cine cine;


	/**
	 * Create the frame.
	 */
	public MenuEstablecimiento(Cine cin) {
		cine=cin;
		setTitle("Menu Establecimiento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton AgregarEstablecimiento = new JButton("Agregar Establecimiento");
		AgregarEstablecimiento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AgregarEstablecimiento app = new AgregarEstablecimiento(cine);
				app.setVisible(true);
			}
		});
		AgregarEstablecimiento.setBounds(133, 43, 190, 23);
		contentPane.add(AgregarEstablecimiento);
		
		JButton ModEstablecimiento = new JButton("Modificar Establecimiento");
		ModEstablecimiento.setBounds(133, 124, 190, 23);
		contentPane.add(ModEstablecimiento);
		
		JButton EliminEstablecimiento = new JButton("Eliminar Establecimiento");
		EliminEstablecimiento.setBounds(133, 198, 190, 23);
		contentPane.add(EliminEstablecimiento);
	}
}

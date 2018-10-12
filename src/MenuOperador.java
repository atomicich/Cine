import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuOperador extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Cine cine;

	/**
	 * Create the frame.
	 */
	public MenuOperador(Cine cin) {
		
		cine=cin;
		setTitle("OPERADOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPeliculas = new JButton("PELICULAS");
		btnPeliculas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPeliculas app = new MenuPeliculas();
				app.setVisible(true);
			}
		});
		btnPeliculas.setBounds(158, 55, 128, 36);
		contentPane.add(btnPeliculas);
		
		JButton btnEstablecimientos = new JButton("ESTABLECIMIENTOS");
		btnEstablecimientos.setBounds(158, 141, 128, 36);
		contentPane.add(btnEstablecimientos);
		btnEstablecimientos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuEstablecimiento app = new MenuEstablecimiento(cine);
				app.setVisible(true);
			}
		});
	}

}

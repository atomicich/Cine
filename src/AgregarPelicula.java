import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.ScrollPane;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgregarPelicula extends JFrame {

	private JPanel contentPane;
	private JTextField codigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarPelicula frame = new AgregarPelicula();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AgregarPelicula() {
		setTitle("AGREGAR PELICULA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		codigo = new JTextField();
		codigo.setBounds(191, 56, 116, 20);
		contentPane.add(codigo);
		codigo.setColumns(10);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(89, 107, 242, 100);
		contentPane.add(scrollPane);
		
		Button button = new Button("AGREGAR");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setBounds(261, 241, 82, 22);
		contentPane.add(button);
	}
}

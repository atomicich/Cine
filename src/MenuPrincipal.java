import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GraphicsConfiguration;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPasswordField;

public class MenuPrincipal extends JFrame {

	protected static final GraphicsConfiguration OPERADOR = null;
	private JPanel contentPane;
	private JTextField usuario;
	private JPasswordField passwordField;
	private Cine cine;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		
		cine= new Cine();
		
		setForeground(Color.RED);
		setTitle("MENU");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = DefaultComponentFactory.getInstance().createLabel("USUARIO:");
		lblUsuario.setBounds(67, 48, 92, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = DefaultComponentFactory.getInstance().createLabel("CONTRASE\u00D1A:");
		lblContrasea.setBounds(67, 141, 92, 14);
		contentPane.add(lblContrasea);
		
		usuario = new JTextField();
		usuario.setBounds(169, 45, 114, 20);
		contentPane.add(usuario);
		usuario.setColumns(10);
		
		JButton btnNewButton = new JButton("INGRESAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//int a;
				//a=cine.();
				MenuOperador app = new MenuOperador(cine) ;
				app.setVisible(true);
			}
		});
		btnNewButton.setBounds(68, 215, 114, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CANCELAR");
		btnNewButton_1.setBounds(259, 215, 114, 23);
		contentPane.add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(169, 138, 114, 20);
		contentPane.add(passwordField);
	}
}

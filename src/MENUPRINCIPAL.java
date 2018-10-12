import java.awt.EventQueue;
import java.awt.GraphicsConfiguration;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Label;

public class MENUPRINCIPAL extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static final GraphicsConfiguration OPERADOR = null;
	private JPanel contentPane;
	private JTextField usuario;
	private Cine cine;
	private JTextField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MENUPRINCIPAL frame = new MENUPRINCIPAL();
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
	public MENUPRINCIPAL() {
		
		cine= new Cine();
		
		setForeground(Color.RED);
		setTitle("MENU");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		usuario = new JTextField();
		usuario.setBounds(169, 45, 114, 20);
		contentPane.add(usuario);
		usuario.setColumns(10);
		
		JButton btnNewButton = new JButton("INGRESAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=cine.loguear(usuario.getText(),passwordField.getText());
				switch(a){
					case 1:
						MenuOperador app = new MenuOperador(cine) ;
						app.setVisible(true);
						break;
					case 2:
					MenuAdministrador app1 = new MenuAdministrador(cine);
						app1.setVisible(true);
						break;
					case 0:
						JOptionPane.showMessageDialog(null, "Usuario Incorrecto");
				}
			}
		});
		btnNewButton.setBounds(68, 215, 114, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CANCELAR");
		btnNewButton_1.setBounds(259, 215, 114, 23);
		contentPane.add(btnNewButton_1);
		
		Label label = new Label("Usuario:");
		label.setBounds(101, 45, 62, 22);
		contentPane.add(label);
		
		Label label_1 = new Label("Contrase\u00F1a:");
		label_1.setBounds(79, 138, 84, 22);
		contentPane.add(label_1);
		
		passwordField = new JTextField();
		passwordField.setBounds(169, 140, 114, 20);
		contentPane.add(passwordField);
		passwordField.setColumns(10);
	}
}

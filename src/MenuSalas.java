import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextField;
import java.awt.ScrollPane;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuSalas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuSalas frame = new MenuSalas();
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
	public MenuSalas() {
		setTitle("SALAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSalas = DefaultComponentFactory.getInstance().createLabel("SALAS:");
		lblSalas.setBounds(53, 61, 67, 14);
		contentPane.add(lblSalas);
		
		textField = new JTextField();
		textField.setBounds(170, 55, 151, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(53, 94, 291, 100);
		contentPane.add(scrollPane);
		
		Button button = new Button("CONFIRMAR");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuFunciones app = new MenuFunciones();
				app.setVisible(true);
			}
		});
		button.setBounds(53, 229, 70, 22);
		contentPane.add(button);
		
		Button button_1 = new Button("CANCELAR");
		button_1.setBounds(274, 229, 70, 22);
		contentPane.add(button_1);
	}
}

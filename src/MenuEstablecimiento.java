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
import javax.swing.JButton;

public class MenuEstablecimiento extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuEstablecimiento frame = new MenuEstablecimiento();
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
	public MenuEstablecimiento() {
		setTitle("ESTABLECIMIENTOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEstablecimientos = DefaultComponentFactory.getInstance().createLabel("ESTABLECIMIENTOS:");
		lblEstablecimientos.setBounds(58, 40, 112, 14);
		contentPane.add(lblEstablecimientos);
		
		textField = new JTextField();
		textField.setBounds(181, 37, 173, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(58, 80, 296, 100);
		contentPane.add(scrollPane);
		
		Button button = new Button("CONFIRMAR");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuSalas app = new MenuSalas();
				app.setVisible(true);
			}
		});
		button.setBounds(70, 220, 70, 22);
		contentPane.add(button);
		
		Button button_1 = new Button("CANCELAR");
		button_1.setBounds(272, 220, 70, 22);
		contentPane.add(button_1);
		
		JButton btnNewButton = new JButton("buscar");
		btnNewButton.setBounds(364, 36, 68, 18);
		contentPane.add(btnNewButton);
	}
}

package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class AdicionarFuncionarioView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdicionarFuncionarioView frame = new AdicionarFuncionarioView();
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
	public AdicionarFuncionarioView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 421, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel LOGIN = new JLabel("login");
		LOGIN.setForeground(Color.RED);
		LOGIN.setFont(new Font("Arial", Font.BOLD, 29));
		LOGIN.setBounds(30, 21, 70, 37);
		contentPane.add(LOGIN);
		
		textField = new JTextField();
		textField.setBounds(30, 81, 319, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(261, 207, 134, 30);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(30, 157, 294, 20);
		contentPane.add(passwordField);
		
		JLabel fundo1 = new JLabel("");
		fundo1.setBounds(0, 0, 434, 261);
		fundo1.setIcon(new ImageIcon(LoginView.class.getResource("/fundoFuncionario.jpg")));
		contentPane.add(fundo1);
		

	}
}

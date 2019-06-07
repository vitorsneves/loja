//Janela que busca itens no estoque

package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class BuscarView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscarView frame = new BuscarView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public BuscarView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 625);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(84, 71, 574, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton buscarBtn = new JButton("Buscar");
		buscarBtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		buscarBtn.setBounds(688, 71, 91, 30);
		contentPane.add(buscarBtn);
		
		JLabel fundo02 = new JLabel("");
		fundo02.setBounds(0, 32, 818, 523);
		fundo02.setIcon(new ImageIcon(LoginView.class.getResource("/fundoEscuro.png")));
		contentPane.add(fundo02);
		
		JLabel fundo = new JLabel("");
		fundo.setBounds(-143, -17, 1095, 617);
		fundo.setIcon(new ImageIcon(LoginView.class.getResource("/estoqueFundo.jpg")));
		contentPane.add(fundo);
		
		setResizable(false);
	}
}

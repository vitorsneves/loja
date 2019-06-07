package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipalView extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipalView frame = new MenuPrincipalView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public MenuPrincipalView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 30, 1280, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 60));
		lblNewLabel.setBounds(544, 59, 189, 109);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Nova compra");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 30));
		btnNewButton.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/dinheiro.png")));
		btnNewButton.setBounds(156, 202, 415, 82);
		contentPane.add(btnNewButton);
		
		JButton btnAdicionarCliente = new JButton("Adicionar cliente");
		btnAdicionarCliente.setHorizontalAlignment(SwingConstants.LEFT);
		btnAdicionarCliente.setFont(new Font("Arial", Font.PLAIN, 30));
		btnAdicionarCliente.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/cliente.png")));
		btnAdicionarCliente.setBounds(156, 377, 415, 82);
		contentPane.add(btnAdicionarCliente);
		btnAdicionarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CriarClienteView clienteView = new CriarClienteView();
				clienteView.setMenuPrincipal(getThis());
				clienteView.setVisible(true); 
				setEnabled(false);
				
			}
		});
		JButton btnNewButton_1 = new JButton("Procurar em estoque");
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 30));
		btnNewButton_1.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/estoque.png")));
		btnNewButton_1.setBounds(156, 552, 415, 82);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Estat\u00EDsticas");
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 30));
		btnNewButton_2.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/estatisticas.png")));
		btnNewButton_2.setBounds(705, 202, 415, 82);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Op\u00E7\u00F5es adicionais");
		btnNewButton_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_3.setFont(new Font("Arial", Font.PLAIN, 30));
		btnNewButton_3.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/chave.png")));
		btnNewButton_3.setBounds(705, 377, 415, 82);
		contentPane.add(btnNewButton_3);
		
		JLabel fundoEscuro = new JLabel("");
		fundoEscuro.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/fundoEscuro.png")));
		fundoEscuro.setBounds(32, 38, 1158, 693);
		contentPane.add(fundoEscuro);
		
		JLabel fundo = new JLabel("");
		fundo.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/fundoMenu.jpg")));
		fundo.setBounds(0, 0, 1920, 1080);
		contentPane.add(fundo);
		
		setResizable(false);
		
	}
	
	public MenuPrincipalView getThis() {
		return this;
	}
}

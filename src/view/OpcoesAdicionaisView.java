package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class OpcoesAdicionaisView extends JFrame {

	private JPanel contentPane;
	private JButton btnMudarSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpcoesAdicionaisView frame = new OpcoesAdicionaisView();
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
	public OpcoesAdicionaisView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 30, 1280, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//t�tulo "menu" no topo da p�gina
		JLabel menu = new JLabel("MENU");
		menu.setForeground(Color.WHITE);
		menu.setFont(new Font("Arial", Font.BOLD, 60));
		menu.setBounds(544, 59, 189, 109);
		contentPane.add(menu);
		
		//bot�o "gerentes"
		JButton btnGerentes = new JButton("Gerentes");
		btnGerentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnGerentes.setHorizontalAlignment(SwingConstants.LEFT);
		btnGerentes.setFont(new Font("Arial", Font.PLAIN, 30));
		btnGerentes.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/gerente.png")));
		btnGerentes.setBounds(156, 202, 415, 82);
		contentPane.add(btnGerentes);
		
		//bot�o funcion�rios
		JButton btnFuncionarios = new JButton("Funcion\u00E1rios");
		btnFuncionarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFuncionarios.setHorizontalAlignment(SwingConstants.LEFT);
		btnFuncionarios.setFont(new Font("Arial", Font.PLAIN, 30));
		btnFuncionarios.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/funcionarios.png")));
		btnFuncionarios.setBounds(156, 401, 415, 82);
		contentPane.add(btnFuncionarios);
		
		//bot�o estoque
		JButton btnEstoque = new JButton("Estoque");
		btnEstoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});		
		btnEstoque.setHorizontalAlignment(SwingConstants.LEFT);
		btnEstoque.setFont(new Font("Arial", Font.PLAIN, 30));
		btnEstoque.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/estoque02.png")));
		btnEstoque.setBounds(705, 202, 415, 82);
		contentPane.add(btnEstoque);
		
		//bot�o alterar senha
		btnMudarSenha = new JButton("Alterar senha");
		btnMudarSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMudarSenha.setHorizontalAlignment(SwingConstants.LEFT);
		btnMudarSenha.setFont(new Font("Arial", Font.PLAIN, 30));
		btnMudarSenha.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/adminSenha.png")));
		btnMudarSenha.setBounds(705, 401, 415, 82);
		contentPane.add(btnMudarSenha);
		
		JLabel fundoEscuro = new JLabel("");
		fundoEscuro.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/fundoEscuro.png")));
		fundoEscuro.setBounds(32, 38, 1158, 595);
		contentPane.add(fundoEscuro);
		
		JLabel fundo = new JLabel("");
		fundo.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/fundoMenu.jpg")));
		fundo.setBounds(0, 0, 1920, 1080);
		contentPane.add(fundo);
		
		setResizable(false);
	}

}

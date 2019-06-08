package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.AdicionarFuncionariosController;
import controller.LoginController;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JPasswordField;

public class AdicionarFuncionariosView extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private FuncionariosView janelaFuncionarios;
	private AdicionarFuncionariosController funcionariosControlador;
	private JTextField textCPF;
	private JTextField textTelefone;
	private JTextField textEmail;
	private JTextField textLogin;
	private JPasswordField textSenha;
	private JPasswordField TextConfirmarSenha;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdicionarFuncionariosView frame = new AdicionarFuncionariosView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AdicionarFuncionariosView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 50, 411, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		funcionariosControlador = new AdicionarFuncionariosController(this);
		
		JLabel titulo01 = new JLabel("Adicionar novo");
		titulo01.setForeground(Color.WHITE);
		titulo01.setFont(new Font("Arial", Font.BOLD, 30));
		titulo01.setBounds(152, 25, 221, 35);
		contentPane.add(titulo01);
		
		JLabel titulo02 = new JLabel("funcionario");
		titulo02.setForeground(Color.WHITE);
		titulo02.setFont(new Font("Arial", Font.BOLD, 30));
		titulo02.setBounds(152, 70, 221, 35);
		contentPane.add(titulo02);
		
		JLabel nome = new JLabel("Nome *");
		nome.setForeground(Color.WHITE);
		nome.setFont(new Font("Arial", Font.BOLD, 20));
		nome.setBounds(10, 119, 82, 35);
		contentPane.add(nome);
		
		textNome = new JTextField();
		textNome.setBounds(11, 149, 362, 29);
		textNome.setFont(new Font("Arial", Font.PLAIN, 13));
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel cpf = new JLabel("CPF *");
		cpf.setForeground(Color.WHITE);
		cpf.setFont(new Font("Arial", Font.BOLD, 20));
		cpf.setBounds(10, 178, 82, 35);
		contentPane.add(cpf);
		
		textCPF = new JTextField();
		textCPF.setFont(new Font("Arial", Font.PLAIN, 13));
		textCPF.setColumns(10);
		textCPF.setBounds(11, 208, 362, 29);
		contentPane.add(textCPF);
		
		JLabel telefone = new JLabel("(DDD) Telefone *");
		telefone.setForeground(Color.WHITE);
		telefone.setFont(new Font("Arial", Font.BOLD, 20));
		telefone.setBounds(10, 247, 235, 35);
		contentPane.add(telefone);
		
		textTelefone = new JTextField();
		textTelefone.setFont(new Font("Arial", Font.PLAIN, 13));
		textTelefone.setColumns(10);
		textTelefone.setBounds(10, 279, 362, 29);
		contentPane.add(textTelefone);
		
		JLabel email = new JLabel("E-mail *");
		email.setForeground(Color.WHITE);
		email.setFont(new Font("Arial", Font.BOLD, 20));
		email.setBounds(10, 318, 82, 35);
		contentPane.add(email);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Arial", Font.PLAIN, 13));
		textEmail.setColumns(10);
		textEmail.setBounds(10, 348, 362, 29);
		contentPane.add(textEmail);
		
		JLabel label = new JLabel("Login *");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Arial", Font.BOLD, 20));
		label.setBounds(10, 387, 82, 35);
		contentPane.add(label);
		
		textLogin = new JTextField();
		textLogin.setFont(new Font("Arial", Font.PLAIN, 13));
		textLogin.setColumns(10);
		textLogin.setBounds(10, 418, 362, 29);
		contentPane.add(textLogin);
		
		JLabel label_1 = new JLabel("Senha *");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Arial", Font.BOLD, 20));
		label_1.setBounds(10, 457, 82, 35);
		contentPane.add(label_1);
		
		textSenha = new JPasswordField();
		textSenha.setBounds(10, 492, 363, 29);
		contentPane.add(textSenha);
		
		JLabel label_2 = new JLabel("Confirmar senha *");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Arial", Font.BOLD, 20));
		label_2.setBounds(10, 520, 202, 35);
		contentPane.add(label_2);
		
		TextConfirmarSenha = new JPasswordField();
		TextConfirmarSenha.setBounds(10, 552, 363, 29);
		contentPane.add(TextConfirmarSenha);
		
		JLabel label_a = new JLabel("Os campos com * são obrigatórios");
		label_a.setForeground(Color.WHITE);
		label_a.setFont(new Font("Arial", Font.BOLD, 11));
		label_a.setBounds(184, 582, 202, 23);
		contentPane.add(label_a);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(25, -25, 158, 112);
		contentPane.add(label_3);
				
				JButton btnNewButton_1 = new JButton("Confirmar");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						funcionariosControlador.adicionarFuncionario();
					}
				});
				btnNewButton_1.setBounds(284, 610, 102, 23);
				contentPane.add(btnNewButton_1);
				
				JButton btnVoltar = new JButton("Voltar");
				btnVoltar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
						janelaFuncionarios.setVisible(true);
					}
				});
				btnVoltar.setBounds(185, 610, 89, 23);
				contentPane.add(btnVoltar);
		
				JLabel fundo = new JLabel("");
				fundo.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/Users-Administrator-icon.png")));
				fundo.setBounds(35, 25, 89, 74);
				contentPane.add(fundo);
		
		JLabel Fundo = new JLabel("");
		Fundo.setBounds(0, 0, 395, 649);
		Fundo.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/adicionarFuncionario.png")));
		contentPane.add(Fundo);
		
	}
	
	public void setJanenelaFuncionarios(FuncionariosView janela) {
		janelaFuncionarios = janela;
	}
	
	public AdicionarFuncionariosView getThis() {
		return this;
	}
	
	public JTextField getTextNome() {
		return textNome;
	}
}

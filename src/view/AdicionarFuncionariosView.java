package view;

import java.awt.BorderLayout;
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

public class AdicionarFuncionariosView extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private FuncionariosView janelaFuncionarios;
	private AdicionarFuncionariosController funcionariosControlador;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public AdicionarFuncionariosView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 50, 411, 645);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		funcionariosControlador = new AdicionarFuncionariosController(this);
		
		JLabel LabelNome = new JLabel("Nome do novo funcionário");
		LabelNome.setBounds(10, 105, 160, 14);
		contentPane.add(LabelNome);
		
		JLabel lblAdicionarUmNovo = new JLabel("Adicionar um novo funcion\u00E1rio");
		lblAdicionarUmNovo.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblAdicionarUmNovo.setBounds(28, 17, 401, 102);
		contentPane.add(lblAdicionarUmNovo);
		
		textNome = new JTextField();
		textNome.setBounds(10, 129, 310, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JButton btnVoltar = new JButton("voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				janelaFuncionarios.setVisible(true);
			}
		});
		btnVoltar.setBounds(171, 424, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnNewButton_1 = new JButton("Confirmar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcionariosControlador.adicionarFuncionario();
			}
		});
		btnNewButton_1.setBounds(270, 424, 102, 23);
		contentPane.add(btnNewButton_1);
		

		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(10, 159, 46, 13);
		contentPane.add(lblCpf);
		
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

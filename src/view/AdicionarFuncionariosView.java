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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		funcionariosControlador = new AdicionarFuncionariosController(this);
		
		JLabel lblNewLabel = new JLabel("Nome do novo funcion\u00E1rio");
		lblNewLabel.setBounds(21, 25, 160, 14);
		contentPane.add(lblNewLabel);
		
		textNome = new JTextField();
		textNome.setBounds(10, 52, 310, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JButton btnVoltar = new JButton("voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				janelaFuncionarios.setVisible(true);
			}
		});
		btnVoltar.setBounds(10, 214, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnNewButton_1 = new JButton("Confirmar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcionariosControlador.adicionarFuncionario();
			}
		});
		btnNewButton_1.setBounds(310, 214, 102, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel fundo = new JLabel("");
		fundo.setBounds(-47, 0, 481, 261);
		fundo.setIcon(new ImageIcon(LoginView.class.getResource("/fundoEscuro.png")));
		contentPane.add(fundo);
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

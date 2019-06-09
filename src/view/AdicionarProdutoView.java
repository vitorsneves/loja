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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class AdicionarProdutoView extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textFabricante;
	private JTextField textTamanho;
	private JTextField textTipo;
	private JTextField textField_4;
	private JTextField textField_5;
	private EstoqueView estoqueView;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdicionarProdutoView frame = new AdicionarProdutoView();
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
	public AdicionarProdutoView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 50, 411, 761);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nome = new JLabel("Nome *");
		nome.setForeground(Color.WHITE);
		nome.setFont(new Font("Arial", Font.BOLD, 20));
		nome.setBounds(10, 119, 82, 35);
		contentPane.add(nome);
		
		textNome = new JTextField();
		textNome.setBounds(10, 153, 377, 35);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel Fabricante = new JLabel("Fabricante *");
		Fabricante.setForeground(Color.WHITE);
		Fabricante.setFont(new Font("Arial", Font.BOLD, 20));
		Fabricante.setBounds(10, 193, 147, 35);
		contentPane.add(Fabricante);

		
		JLabel Tamanho = new JLabel("Tamanho *");
		Tamanho.setForeground(Color.WHITE);
		Tamanho.setFont(new Font("Arial", Font.BOLD, 20));
		Tamanho.setBounds(10, 260, 235, 35);
		contentPane.add(Tamanho);
		

		
		JLabel Tipo = new JLabel("Tipo *");
		Tipo.setForeground(Color.WHITE);
		Tipo.setFont(new Font("Arial", Font.BOLD, 20));
		Tipo.setBounds(10, 329, 82, 35);
		contentPane.add(Tipo);
		

		
		JLabel Quantidade = new JLabel("Login *");
		Quantidade.setForeground(Color.WHITE);
		Quantidade.setFont(new Font("Arial", Font.BOLD, 20));
		Quantidade.setBounds(10, 400, 82, 35);
		contentPane.add(Quantidade);
		
		JLabel Preco = new JLabel("Preço *");
		Preco.setForeground(Color.WHITE);
		Preco.setFont(new Font("Arial", Font.BOLD, 20));
		Preco.setBounds(10, 474, 82, 35);
		contentPane.add(Preco);
		
		textFabricante = new JTextField();
		textFabricante.setColumns(10);
		textFabricante.setBounds(10, 227, 377, 35);
		contentPane.add(textFabricante);
		
		textTamanho = new JTextField();
		textTamanho.setColumns(10);
		textTamanho.setBounds(10, 290, 377, 35);
		contentPane.add(textTamanho);
		
		textTipo = new JTextField();
		textTipo.setColumns(10);
		textTipo.setBounds(10, 358, 377, 35);
		contentPane.add(textTipo);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(10, 429, 377, 35);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(10, 508, 377, 35);
		contentPane.add(textField_5);
		
		JLabel lblAdicionarNovo = new JLabel("Adicionar novo");
		lblAdicionarNovo.setBounds(142, 10, 221, 68);
		lblAdicionarNovo.setForeground(Color.WHITE);
		lblAdicionarNovo.setFont(new Font("Arial", Font.BOLD, 30));
		contentPane.add(lblAdicionarNovo);
		
		JLabel lblProduto = new JLabel("produto");
		lblProduto.setHorizontalAlignment(SwingConstants.CENTER);
		lblProduto .setBounds(142, 63, 221, 44);
		lblProduto .setForeground(Color.WHITE);
		lblProduto.setFont(new Font("Arial", Font.BOLD, 30));
		contentPane.add(lblProduto);
		
		JLabel label_a = new JLabel("Os campos com * são obrigatórios");
		label_a.setForeground(Color.WHITE);
		label_a.setFont(new Font("Arial", Font.BOLD, 11));
		label_a.setBounds(185, 633, 202, 23);
		contentPane.add(label_a);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				dispose();
				estoqueView.setVisible(true);
				estoqueView.getOpcoesAdicionais().toFront();
				estoqueView.toFront();
			}
		});
		
		JLabel label = new JLabel("Pre\u00E7o *");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Arial", Font.BOLD, 20));
		label.setBounds(10, 553, 82, 35);
		contentPane.add(label);
		btnVoltar.setBounds(186, 677, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnNewButton_1 = new JButton("Confirmar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//gerenteControlador.adicionarGerente();
			}
		});
		btnNewButton_1.setBounds(285, 677, 102, 23);
		contentPane.add(btnNewButton_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(10, 588, 377, 35);
		contentPane.add(textField_6);
		
		
		JLabel Fundo = new JLabel("");
		Fundo.setBounds(0, 0, 397, 714);
		Fundo.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/FundoAdicionarProduto.jpg")));
		contentPane.add(Fundo);
		
	}
	
	public void setEstoqueView(EstoqueView opcoes) {
		this.estoqueView = opcoes;
	}
}

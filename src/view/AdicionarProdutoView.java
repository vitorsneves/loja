package view;

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
	private JTextField textPreco;
	private EstoqueView estoqueView;

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

	public AdicionarProdutoView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 50, 925, 676);
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
		textNome.setBounds(10, 153, 891, 35);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel Fabricante = new JLabel("Fabricante *");
		Fabricante.setForeground(Color.WHITE);
		Fabricante.setFont(new Font("Arial", Font.BOLD, 20));
		Fabricante.setBounds(10, 193, 147, 35);
		contentPane.add(Fabricante);
		
		textFabricante = new JTextField();
		textFabricante.setColumns(10);
		textFabricante.setBounds(10, 227, 891, 35);
		contentPane.add(textFabricante);
		
		JLabel Tamanho = new JLabel("Tamanho *");
		Tamanho.setForeground(Color.WHITE);
		Tamanho.setFont(new Font("Arial", Font.BOLD, 20));
		Tamanho.setBounds(10, 260, 235, 35);
		contentPane.add(Tamanho);
		
		textTamanho = new JTextField();
		textTamanho.setColumns(10);
		textTamanho.setBounds(10, 290, 891, 35);
		contentPane.add(textTamanho);
		
		JLabel Tipo = new JLabel("Tipo *");
		Tipo.setForeground(Color.WHITE);
		Tipo.setFont(new Font("Arial", Font.BOLD, 20));
		Tipo.setBounds(10, 329, 82, 35);
		contentPane.add(Tipo);
		
		textTipo = new JTextField();
		textTipo.setColumns(10);
		textTipo.setBounds(10, 361, 891, 35);
		contentPane.add(textTipo);
		
		JLabel Quantidade = new JLabel("Quantidade*");
		Quantidade.setForeground(Color.WHITE);
		Quantidade.setFont(new Font("Arial", Font.BOLD, 20));
		Quantidade.setBounds(10, 400, 147, 35);
		contentPane.add(Quantidade);
		
		JTextField textQuantidade = new JTextField();
		textQuantidade.setColumns(10);
		textQuantidade.setBounds(10, 429, 891, 35);
		contentPane.add(textQuantidade);
		
		JLabel Preco = new JLabel("Preço *");
		Preco.setForeground(Color.WHITE);
		Preco.setFont(new Font("Arial", Font.BOLD, 20));
		Preco.setBounds(10, 474, 82, 35);
		contentPane.add(Preco);
		
		textPreco = new JTextField();
		textPreco.setColumns(10);
		textPreco.setBounds(10, 508, 891, 35);
		contentPane.add(textPreco);
		
		JLabel lblAdicionarNovo = new JLabel("Adicionar novo produto");
		lblAdicionarNovo.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdicionarNovo.setBounds(0, 10, 901, 68);
		lblAdicionarNovo.setForeground(Color.WHITE);
		lblAdicionarNovo.setFont(new Font("Arial", Font.BOLD, 30));
		contentPane.add(lblAdicionarNovo);
		
		JLabel label_a = new JLabel("Os campos com * são obrigatórios");
		label_a.setForeground(Color.WHITE);
		label_a.setFont(new Font("Arial", Font.BOLD, 11));
		label_a.setBounds(699, 569, 202, 23);
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
		btnVoltar.setBounds(687, 609, 102, 23);
		contentPane.add(btnVoltar);
		
		JButton btnNewButton_1 = new JButton("Confirmar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//gerenteControlador.adicionarGerente();
			}
		});
		btnNewButton_1.setBounds(799, 609, 102, 23);
		contentPane.add(btnNewButton_1);
		
		
		JLabel Fundo = new JLabel("");
		Fundo.setBounds(0, 0, 931, 646);
		Fundo.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/FundoAdicionarProduto.jpg")));
		contentPane.add(Fundo);
		
	}
	
	public void setEstoqueView(EstoqueView opcoes) {
		this.estoqueView = opcoes;
	}
}

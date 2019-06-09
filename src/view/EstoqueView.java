package view;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class EstoqueView extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private OpcoesAdicionaisView opcoesAdicionais;
	private JTextField textCodigo;
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EstoqueView frame = new EstoqueView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public EstoqueView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1009, 712);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblControleDeEstoque = new JLabel("Controle de Estoque");
		lblControleDeEstoque.setHorizontalAlignment(SwingConstants.CENTER);
		lblControleDeEstoque.setForeground(Color.WHITE);
		lblControleDeEstoque.setFont(new Font("Arial", Font.PLAIN, 40));
		lblControleDeEstoque.setBounds(65, 10, 902, 59);
		contentPane.add(lblControleDeEstoque);
		
		JLabel Nome = new JLabel("Nome do produto");
		Nome.setFont(new Font("Arial", Font.PLAIN, 14));
		Nome.setForeground(Color.WHITE);
		Nome.setBounds(84, 73, 120, 23);
		contentPane.add(Nome);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setForeground(Color.WHITE);
		lblCodigo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCodigo.setBounds(696, 75, 73, 19);
		contentPane.add(lblCodigo);
		
		textNome = new JTextField();
		textNome.setBounds(84, 96, 602, 30);
		textNome.setColumns(10);
		contentPane.add(textNome);
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(84, 612, 131, 40);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				opcoesAdicionais.setEnabled(true);
				opcoesAdicionais.toFront();
			}
		});
		btnVoltar.setFont(new Font("Arial", Font.PLAIN, 20));
		btnVoltar.setIcon(new ImageIcon(OpcoesAdicionaisView.class.getResource("/voltar32.png")));
		contentPane.add(btnVoltar);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(696, 96, 73, 30);
		textCodigo.setColumns(10);
		contentPane.add(textCodigo);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.setBounds(779, 96, 164, 30);
		btnBuscar.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/lupa32.png")));
		btnBuscar.setFont(new Font("Arial", Font.PLAIN, 20));
		contentPane.add(btnBuscar);
		
		JButton btnCadastrarProduto = new JButton("Novo produto");
		btnCadastrarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdicionarProdutoView view = new AdicionarProdutoView();
				view.setEstoqueView(getThis());
				getThis().setVisible(false);
				view.setVisible(true);
				opcoesAdicionais.toFront();
				view.toFront();
			}
		});
		btnCadastrarProduto.setBounds(416, 612, 198, 40);
		btnCadastrarProduto.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/AddProduto.png")));
		btnCadastrarProduto.setHorizontalAlignment(SwingConstants.LEFT);
		btnCadastrarProduto.setFont(new Font("Arial", Font.PLAIN, 20));
		contentPane.add(btnCadastrarProduto);
		
		JButton btnExibirTodos = new JButton("Exibir tudo");
		btnExibirTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExibirTodos.setFont(new Font("Arial", Font.PLAIN, 20));
		btnExibirTodos.setBounds(767, 612, 176, 40);
		btnExibirTodos.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/mostrarTudo.png")));
		contentPane.add(btnExibirTodos);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setHorizontalAlignment(SwingConstants.LEFT);
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditarQuantidadeEmEstoqueView view = new EditarQuantidadeEmEstoqueView();
				view.setEstoqueView(getThis());
				getThis().setVisible(false);
				view.setVisible(true);
				opcoesAdicionais.toFront();
				view.toFront();
				
			}
		});
		btnEditar.setFont(new Font("Arial", Font.PLAIN, 20));
		btnEditar.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/EditarProduto.png")));
		btnEditar.setBounds(624, 612, 131, 40);
		contentPane.add(btnEditar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(84, 136, 859, 454);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(LoginView.class.getResource("/fundoEscuro.png")));
		label.setBounds(193, 10, 613, 40);
		contentPane.add(label);
		
		JLabel fundo02 = new JLabel("");
		fundo02.setBounds(22, 48, 945, 614);
		fundo02.setIcon(new ImageIcon(LoginView.class.getResource("/fundoEscuro.png")));
		contentPane.add(fundo02);
		

		JLabel fundo = new JLabel("");
		fundo.setIcon(new ImageIcon(LoginView.class.getResource("/fundoestoque667.jpg")));
		fundo.setBounds(0, -11, 995, 733);
		contentPane.add(fundo);

		setResizable(false);
	}

	public EstoqueView getThis() {
		return this;
	}
	

	public void setOpcoesAdicionais(OpcoesAdicionaisView opcoes) {
		this.opcoesAdicionais = opcoes;
	}
	
	public OpcoesAdicionaisView getOpcoesAdicionais() {
		return opcoesAdicionais;
	}
}


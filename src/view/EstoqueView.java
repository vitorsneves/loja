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

public class EstoqueView extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private OpcoesAdicionaisView opcoesAdicionais;
	private JTextField textCodigo;

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
		setBounds(100, 100, 879, 625);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblControleDeEstoque = new JLabel("Controle de Estoque");
		lblControleDeEstoque.setHorizontalAlignment(SwingConstants.CENTER);
		lblControleDeEstoque.setForeground(Color.WHITE);
		lblControleDeEstoque.setFont(new Font("Arial", Font.PLAIN, 40));
		lblControleDeEstoque.setBounds(146, 0, 569, 59);
		contentPane.add(lblControleDeEstoque);
		
		JLabel Nome = new JLabel("Nome do produto");
		Nome.setFont(new Font("Arial", Font.PLAIN, 14));
		Nome.setForeground(Color.WHITE);
		Nome.setBounds(84, 48, 120, 23);
		contentPane.add(Nome);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setForeground(Color.WHITE);
		lblCodigo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCodigo.setBounds(602, 52, 73, 19);
		contentPane.add(lblCodigo);
		
		textNome = new JTextField();
		textNome.setBounds(84, 71, 508, 30);
		textNome.setColumns(10);
		contentPane.add(textNome);
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(84, 495, 91, 40);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				opcoesAdicionais.setEnabled(true);
				opcoesAdicionais.toFront();
			}
		});
		btnSair.setFont(new Font("Arial", Font.PLAIN, 20));
		contentPane.add(btnSair);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(602, 71, 61, 30);
		textCodigo.setColumns(10);
		contentPane.add(textCodigo);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(673, 71, 106, 30);
		btnBuscar.setFont(new Font("Arial", Font.PLAIN, 20));
		contentPane.add(btnBuscar);
		
		JButton btnAdicionarProduto = new JButton("Adicionar Produto");
		btnAdicionarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdicionarProdutoView view = new AdicionarProdutoView();
				view.setEstoqueView(getThis());
				getThis().setVisible(false);
				view.setVisible(true);
				opcoesAdicionais.toFront();
				view.toFront();
			}
		});
		btnAdicionarProduto.setBounds(443, 495, 193, 40);
		btnAdicionarProduto.setHorizontalAlignment(SwingConstants.LEFT);
		btnAdicionarProduto.setFont(new Font("Arial", Font.PLAIN, 20));
		contentPane.add(btnAdicionarProduto);
		
		JButton btnExibirTodos = new JButton("Exibir tudo");
		btnExibirTodos.setFont(new Font("Arial", Font.PLAIN, 20));
		btnExibirTodos.setBounds(646, 495, 133, 40);
		contentPane.add(btnExibirTodos);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(LoginView.class.getResource("/fundoEscuro.png")));
		label.setBounds(102, -11, 613, 59);
		contentPane.add(label);
		
		JLabel fundo02 = new JLabel("");
		fundo02.setBounds(10, 48, 818, 523);
		fundo02.setIcon(new ImageIcon(LoginView.class.getResource("/fundoEscuro.png")));
		contentPane.add(fundo02);
		
		setResizable(false);
	}

	public EstoqueView getThis() {
		return this;
	}
	
	public void setOpcoesAdicionais(OpcoesAdicionaisView janela) {
		this.opcoesAdicionais = janela;
	}

	public OpcoesAdicionaisView getOpcoesAdicionais() {
		return opcoesAdicionais;
	}

}


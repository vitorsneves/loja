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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PagamentoFinalView extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textCpfCadastrado;
	private FormaDePagamentoView janelaFormaDePagamento;
	private double conta;
	private JLabel precoTotal;
	boolean selecionada = false; //isso daqui serve pra ver se a check box tá marcada
	private double precoDescCliente;//preço com desconto de 3% caso o cliente seja cadastrado

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PagamentoFinalView frame = new PagamentoFinalView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PagamentoFinalView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 890, 605);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblParaProseguir = new JLabel("Itens que est\u00E3o sendo comprados:");
		lblParaProseguir.setForeground(Color.WHITE);
		lblParaProseguir.setFont(new Font("Arial", Font.BOLD, 16));
		lblParaProseguir.setBounds(72, 52, 282, 34);
		contentPane.add(lblParaProseguir);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(54, 97, 754, 302);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Finalizar\r\n compra");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				janelaFormaDePagamento.dispose();
				janelaFormaDePagamento.getJanelaCarrinho().dispose();
				janelaFormaDePagamento.getJanelaCarrinho().getJanelaBuscar().dispose();
				janelaFormaDePagamento.getJanelaCarrinho().getJanelaBuscar().getJanelaMenu().toFront();
				janelaFormaDePagamento.getJanelaCarrinho().getJanelaBuscar().getJanelaMenu().setEnabled(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(656, 475, 152, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				janelaFormaDePagamento.dispose();
				janelaFormaDePagamento.getJanelaCarrinho().dispose();
				janelaFormaDePagamento.getJanelaCarrinho().getJanelaBuscar().dispose();
				janelaFormaDePagamento.getJanelaCarrinho().getJanelaBuscar().getJanelaMenu().toFront();
				janelaFormaDePagamento.getJanelaCarrinho().getJanelaBuscar().getJanelaMenu().setEnabled(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(484, 475, 152, 34);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Confirmar cfp");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_2.setBounds(294, 480, 107, 28);
		contentPane.add(btnNewButton_2);
		
		textCpfCadastrado = new JTextField();
		textCpfCadastrado.setBounds(54, 480, 230, 28);
		contentPane.add(textCpfCadastrado);
		textCpfCadastrado.setColumns(10);
		
		JCheckBox chckbxClienteCadastrado = new JCheckBox("Cliente cadastrado");
		chckbxClienteCadastrado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!selecionada) {
					selecionada = true;
					setPrecoTotal(precoDescCliente);
				}
				else {
					selecionada = false;
					setPrecoTotal(conta);
				}
			}
		});
		chckbxClienteCadastrado.setForeground(Color.WHITE);
		chckbxClienteCadastrado.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxClienteCadastrado.setBounds(54, 421, 179, 28);
		chckbxClienteCadastrado.setContentAreaFilled(false);
		contentPane.add(chckbxClienteCadastrado);
		
		JLabel lblNumero = new JLabel("Total a ser pago:");
		lblNumero.setForeground(Color.WHITE);
		lblNumero.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNumero.setBounds(557, 427, 135, 17);
		contentPane.add(lblNumero);
		
		precoTotal = new JLabel("RS 10,40");
		precoTotal.setForeground(Color.WHITE);
		precoTotal.setFont(new Font("Arial", Font.BOLD, 20));
		precoTotal.setBounds(675, 419, 102, 28);
		contentPane.add(precoTotal);
		
		JLabel lblAoMarcarEssa = new JLabel("Ao marcar essa op\u00E7\u00E3o, digite o cpf no campo inferior:");
		lblAoMarcarEssa.setForeground(Color.WHITE);
		lblAoMarcarEssa.setFont(new Font("Arial", Font.PLAIN, 12));
		lblAoMarcarEssa.setBounds(54, 446, 335, 28);
		contentPane.add(lblAoMarcarEssa);
		
		JLabel fundoEscuro = new JLabel("");
		fundoEscuro.setBounds(-17, 25, 853, 503);
		fundoEscuro.setIcon(new ImageIcon(LoginView.class.getResource("/fundoEscuro.png")));
		contentPane.add(fundoEscuro);
		
		JLabel fundo = new JLabel("");
		fundo.setIcon(new ImageIcon(LoginView.class.getResource("/cartaoCredito.jpg")));
		fundo.setBounds(-151, -282, 1175, 864);
		contentPane.add(fundo);
		
		//ESSA PARTE DO CONSTRUTOR CALCULA A CONTA A SER PAGA
		conta = janelaFormaDePagamento.getJanelaCarrinho().getControlador().getHelper().precosCarrinho();
				
		//DESCONTO DE 5% APLICADO CASO O CLIENTE DECIDA PAGAR EM DINHEIRO
		if(janelaFormaDePagamento.getDinheiroRadioButton().isSelected()) {
			conta =  conta * 0.97;
		}
		
		//AJUSTA O LABEL PREÇOFINAL PELA PRIMEIRA VEZ
		setPrecoTotal(conta);
		
		//PREÇO COM DESCONTO DE CLIENTE CADASTRADO
		precoDescCliente = conta * 0.97;
	}

	public FormaDePagamentoView getJanelaFormaDePagamento() {
		return janelaFormaDePagamento;
	}

	public void setJanelaFormaDePagamento(FormaDePagamentoView janelaFormaDePagamento) {
		this.janelaFormaDePagamento = janelaFormaDePagamento;
	}

	public double getConta() {
		return conta;
	}

	public void setConta(double conta) {
		this.conta = conta;
	}

	public double getPrecoTotal() {
		return Double.parseDouble(precoTotal.getText());
	}

	public void setPrecoTotal(double conta) {
		this.precoTotal.setText(Double.toString(conta));
	}

}

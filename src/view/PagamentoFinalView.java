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

public class PagamentoFinalView extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textCpfCadastrado;
	private FormaDePagamentoView janelaFormaDePagamento;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
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
		
		JLabel precoTotal = new JLabel("RS 10,50");
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
	}

	public FormaDePagamentoView getJanelaFormaDePagamento() {
		return janelaFormaDePagamento;
	}

	public void setJanelaFormaDePagamento(FormaDePagamentoView janelaFormaDePagamento) {
		this.janelaFormaDePagamento = janelaFormaDePagamento;
	}
}

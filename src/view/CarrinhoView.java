package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;

public class CarrinhoView extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textCodigoProduto;
	private BuscarView janelaBuscar;
	private JTextField textQtdComprada;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarrinhoView frame = new CarrinhoView();
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
	public CarrinhoView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 936, 563);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 105, 861, 335);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		textCodigoProduto = new JTextField();
		textCodigoProduto.setBounds(31, 34, 542, 27);
		contentPane.add(textCodigoProduto);
		textCodigoProduto.setColumns(10);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(775, 34, 117, 27);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Adicionar produto no carrinho", "Remover produto do carrinho"}));
		comboBox.setBounds(30, 72, 228, 20);
		contentPane.add(comboBox);
		
		JButton btnNewButton_1 = new JButton("Cancelar compra");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				janelaBuscar.setEnabled(true);
				janelaBuscar.getJanelaMenu().toFront();
				janelaBuscar.toFront();
				janelaBuscar.getBtnSair().setEnabled(true);
				janelaBuscar.getBtnNovaCompra().setEnabled(true);
			}
		});
		btnNewButton_1.setBounds(31, 469, 206, 36);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Proseguir para m\u00E9todo de pagamento");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormaDePagamentoView janelaFormaDePagamento = new FormaDePagamentoView();
				janelaFormaDePagamento.setJanelaCarrinho(getThis());
				getThis().setVisible(false);
				janelaFormaDePagamento.setVisible(true);
				janelaBuscar.setEnabled(true);
				janelaBuscar.setVisible(false);
				janelaBuscar.getJanelaMenu().toFront();
				janelaFormaDePagamento.toFront();
			}
		});
		btnNewButton_2.setBounds(639, 469, 253, 36);
		contentPane.add(btnNewButton_2);
		
		textQtdComprada = new JTextField();
		textQtdComprada.setBounds(583, 34, 182, 27);
		contentPane.add(textQtdComprada);
		textQtdComprada.setColumns(10);
		
		JLabel lblCdigoDoProduto = new JLabel("C\u00F3digo do produto");
		lblCdigoDoProduto.setBounds(31, 11, 127, 14);
		contentPane.add(lblCdigoDoProduto);
		
		JLabel lblQuantidade = new JLabel("Quantidade ");
		lblQuantidade.setBounds(583, 11, 117, 14);
		contentPane.add(lblQuantidade);
	}

	public BuscarView getJanelaBuscar() {
		return janelaBuscar;
	}

	public void setJanelaBuscar(BuscarView janelaBuscar) {
		this.janelaBuscar = janelaBuscar;
	}
	
	public CarrinhoView getThis() {
		return this;
	}

	public JTextField getTextCodigoProduto() {
		return textCodigoProduto;
	}

	public JTextField getTextQtdComprada() {
		return textQtdComprada;
	}
}

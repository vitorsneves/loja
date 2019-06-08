//Janela que busca itens no estoque

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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.BuscarController;
import java.awt.Color;

public class BuscarView extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private MenuPrincipalView janelaMenu;
	private JTable tableProdutos;
	private BuscarController buscarController = new BuscarController(this);
	private JTextField textCodigo;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscarView frame = new BuscarView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public BuscarView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 625);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(84, 490, 91, 30);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				janelaMenu.setEnabled(true);
				janelaMenu.toFront();
			}
		});
		
		textCodigo = new JTextField();
		textCodigo.setBounds(602, 71, 61, 30);
		contentPane.add(textCodigo);
		textCodigo.setColumns(10);
		contentPane.add(btnSair);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarController.preencherResultados();
			}
		});
		btnBuscar.setBounds(688, 71, 91, 30);
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		contentPane.add(btnBuscar);
		btnBuscar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			buscarController.preencherResultados();
		}
	});
		
		JButton btnExibirTodos = new JButton("Exibir tudo");
		btnExibirTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarController.preencherTudo();
			}
		});
		btnExibirTodos.setBounds(688, 494, 91, 30);
		contentPane.add(btnExibirTodos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(84, 135, 695, 344);
		contentPane.add(scrollPane);
		
		tableProdutos = new JTable();
		tableProdutos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00F3digo", "Nome", "Fabricante", "Tamanho", "Tipo", "Quantidade", "Pre\u00E7o"
			}
		));
		scrollPane.setViewportView(tableProdutos);
		
		JLabel fundo02 = new JLabel("");
		fundo02.setBounds(0, 32, 818, 523);
		fundo02.setIcon(new ImageIcon(LoginView.class.getResource("/fundoEscuro.png")));
		contentPane.add(fundo02);
		
		JLabel fundo = new JLabel("");
		fundo.setBounds(-143, -17, 1095, 617);
		fundo.setIcon(new ImageIcon(LoginView.class.getResource("/estoqueFundo.jpg")));
		contentPane.add(fundo);
		
		setResizable(false);
		
		//preenche todas a colunas
		buscarController.preencherTudo();
	}

	public void setJanelaMenu(MenuPrincipalView janelaMenu) {
		this.janelaMenu = janelaMenu;
	}
	
	public JTable getTableProdutos() {
		return tableProdutos;
	}

	public JTextField getTextCodigo() {
		return textCodigo;
	}

	public void setTableProdutos(JTable tableProdutos) {
		this.tableProdutos = tableProdutos;
	}

	public JTextField getTextNome() {
		return textNome;
	}

	public BuscarView getThis() {
		return this;
	}
}

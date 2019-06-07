//Janela que busca itens no estoque

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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import javax.swing.table.DefaultTableModel;

public class BuscarView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private MenuPrincipalView janelaMenu;
	private JTable tableProdutos;

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
		
		textField = new JTextField();
		textField.setBounds(84, 71, 574, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(84, 490, 91, 30);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				janelaMenu.setEnabled(true);
				janelaMenu.toFront();
			}
		});
		contentPane.add(btnSair);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(688, 71, 91, 30);
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		contentPane.add(btnBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(84, 135, 695, 344);
		contentPane.add(scrollPane);
		
		tableProdutos = new JTable();
		tableProdutos.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"Nome", "Pre\u00E7o", "Marca", "Cor", "Tamanho"
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
	}

	public void setJanelaMenu(MenuPrincipalView janelaMenu) {
		this.janelaMenu = janelaMenu;
	}
	
	public JTable getTableProdutos() {
		return tableProdutos;
	}

	public void setTableProdutos(JTable tableProdutos) {
		this.tableProdutos = tableProdutos;
	}

	public BuscarView getThis() {
		return this;
	}
}

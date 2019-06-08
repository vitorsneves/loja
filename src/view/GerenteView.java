package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class GerenteView extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private OpcoesAdicionaisView opcoesAdicionais;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GerenteView frame = new GerenteView();
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
	public GerenteView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1130, 682);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 70, 1062, 469);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		scrollPane.setColumnHeaderView(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(29, 10, 899, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setHorizontalAlignment(SwingConstants.LEFT);
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.setFont(new Font("Arial", Font.PLAIN, 20));
		btnBuscar.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/lupa32.png")));
		btnBuscar.setBounds(938, 10, 153, 37);
		contentPane.add(btnBuscar);
		
		//Botão adicionar
		JButton button = new JButton("Adicionar");
		button.setHorizontalAlignment(SwingConstants.LEFT);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AdicionarGerenteView view = new AdicionarGerenteView();
				view.setGerenteView(getThis());
				getThis().setVisible(false);
				view.setVisible(true);
				opcoesAdicionais.toFront();
				view.toFront();
			}
		});
		button.setFont(new Font("Arial", Font.PLAIN, 20));
		button.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/addGerente32.png")));
		button.setBounds(918, 586, 173, 37);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Remover");
		button_1.setHorizontalAlignment(SwingConstants.LEFT);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setFont(new Font("Arial", Font.PLAIN, 20));
		button_1.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/removerGerente32.png")));
		button_1.setBounds(731, 586, 177, 37);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Editar");
		button_2.setHorizontalAlignment(SwingConstants.LEFT);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setFont(new Font("Arial", Font.PLAIN, 20));
		button_2.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/engrenagem32.png")));
		button_2.setBounds(568, 586, 153, 37);
		contentPane.add(button_2);
		
		//Botão Voltar
		JButton button_3 = new JButton("Voltar");
		button_3.setHorizontalAlignment(SwingConstants.LEFT);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				opcoesAdicionais.setEnabled(true);
				getThis().dispose();

			}
		});
		button_3.setFont(new Font("Arial", Font.PLAIN, 20));
		button_3.setIcon(new ImageIcon(OpcoesAdicionaisView.class.getResource("/voltar32.png")));
		button_3.setBounds(29, 586, 153, 37);
		contentPane.add(button_3);
		
	}

	public GerenteView getThis() {
		return this;
	}
	
	public void setOpcoesAdicionais(OpcoesAdicionaisView opcoes) {
		this.opcoesAdicionais = opcoes;
	}
	
	public OpcoesAdicionaisView getOpcoesAdicionais() {
		return opcoesAdicionais;
	}
	
}

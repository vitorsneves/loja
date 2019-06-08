package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.setBounds(938, 10, 153, 37);
		contentPane.add(btnBuscar);
		
		//Botão adicionar
		JButton button = new JButton("Adicionar");
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
		button.setBounds(938, 586, 153, 37);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Remover");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(755, 586, 153, 37);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Editar");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(568, 586, 153, 37);
		contentPane.add(button_2);
		
		//Botão Voltar
		JButton button_3 = new JButton("Voltar");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				opcoesAdicionais.setEnabled(true);
				getThis().dispose();

			}
		});
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

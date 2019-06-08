package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.FuncionarioController;

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;

public class FuncionariosView extends JFrame {

	private JPanel contentPane;
	private JTextField textBusca;
	private OpcoesAdicionaisView opcoesAdicionais;
	private JTable tableFuncionarios;
	JComboBox criterioDeBusca;
	FuncionarioController funcionarioController = new FuncionarioController(this);

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FuncionariosView frame = new FuncionariosView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FuncionariosView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1130, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		criterioDeBusca = new JComboBox();
		criterioDeBusca.setFont(new Font("Arial", Font.PLAIN, 14));
		criterioDeBusca.setModel(new DefaultComboBoxModel(new String[] {"Nome do gerente", "Cpf do gerente"}));
		criterioDeBusca.setBounds(29, 19, 137, 23);
		contentPane.add(criterioDeBusca);
		
		textBusca = new JTextField();
		textBusca.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
				textBusca.setBounds(29, 53, 894, 37);
				
						contentPane.add(textBusca);
						textBusca.setColumns(10);
		
		//bot�o BUSCAR
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setHorizontalAlignment(SwingConstants.LEFT);
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.setFont(new Font("Arial", Font.PLAIN, 20));
		btnBuscar.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/lupa32.png")));
		btnBuscar.setBounds(938, 53, 153, 37);
		contentPane.add(btnBuscar);
		
		JScrollPane scrollGerentes = new JScrollPane();
		scrollGerentes.setBounds(29, 127, 1062, 469);
		contentPane.add(scrollGerentes);
		
		tableFuncionarios = new JTable();
		scrollGerentes.setViewportView(tableFuncionarios);
		
		//bot�o adicionar
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdicionarFuncionariosView view = new AdicionarFuncionariosView();
				view.setJanenelaFuncionarios(getThis());
				getThis().setVisible(false);
				view.setVisible(true);
				opcoesAdicionais.toFront();
				view.toFront();
				
			}
		});
		btnAdicionar.setFont(new Font("Arial", Font.PLAIN, 20));
		btnAdicionar.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/addGerente32.png")));
		btnAdicionar.setBounds(918, 633, 173, 37);
		contentPane.add(btnAdicionar);
		
		//bot�o remover
		JButton btnRemover = new JButton("Remover");
		btnRemover.setFont(new Font("Arial", Font.PLAIN, 20));
		btnRemover.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/removerGerente32.png")));
		btnRemover.setBounds(731, 633, 177, 37);
		contentPane.add(btnRemover);
		
		//Bot�o voltar
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcoesAdicionais.setEnabled(true);
				getThis().dispose();
			}
		});
		
		//bot�o editar
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Arial", Font.PLAIN, 20));
		btnEditar.setFont(new Font("Arial", Font.PLAIN, 20));
		btnEditar.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/engrenagem32.png")));
		btnEditar.setBounds(570, 633, 153, 37);
		contentPane.add(btnEditar);
		btnVoltar.setFont(new Font("Arial", Font.PLAIN, 20));
		btnVoltar.setIcon(new ImageIcon(OpcoesAdicionaisView.class.getResource("/voltar32.png")));
		btnVoltar.setBounds(24, 633, 153, 37);

		contentPane.add(btnVoltar);
		
		funcionarioController.preencherTudo();

	}
	
	public void setOpcoesAdicionais(OpcoesAdicionaisView opcoes) {
		this.opcoesAdicionais = opcoes;
	}
	
	public OpcoesAdicionaisView getOpcoesAdicionais () {
		return opcoesAdicionais;
	}
	
	public JComboBox getCriterioDeBusca() {
		return criterioDeBusca;
	}
	
	public JTable getTableFuncionarios() {
		return tableFuncionarios;
	}
	
	public JTextField getTextBusca() {
		return textBusca;
	}

	public FuncionariosView getThis() {
		return this;
	}
}
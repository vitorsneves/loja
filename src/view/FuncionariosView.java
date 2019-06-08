package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FuncionariosView extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textBuscarCPF;
	private OpcoesAdicionaisView opcoesAdicionais;

	
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 127, 1062, 469);
		contentPane.add(scrollPane);
		
		//botão BUSCAR
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setHorizontalAlignment(SwingConstants.LEFT);
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.setFont(new Font("Arial", Font.PLAIN, 20));
		btnBuscar.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/lupa32.png")));
		btnBuscar.setBounds(938, 50, 153, 37);
		contentPane.add(btnBuscar);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(29, 20, 129, 33);
		lblNome.setFont(new Font("Arial", Font.PLAIN, 20));
		contentPane.add(lblNome);
		
		textField_1 = new JTextField();
		textField_1.setBounds(29, 53, 694, 37);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(733, 20, 103, 33);
		lblCpf.setFont(new Font("Arial", Font.PLAIN, 20));
		contentPane.add(lblCpf);
		
		textBuscarCPF = new JTextField();
		textBuscarCPF.setBounds(733, 53, 195, 37);
		contentPane.add(textBuscarCPF);
		textBuscarCPF.setColumns(10);
		
		//botão adicionar
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
		
		//botão remover
		JButton btnRemover = new JButton("Remover");
		btnRemover.setFont(new Font("Arial", Font.PLAIN, 20));
		btnRemover.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/removerGerente32.png")));
		btnRemover.setBounds(731, 633, 177, 37);
		contentPane.add(btnRemover);
		
		//Botão voltar
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				opcoesAdicionais.setEnabled(true);
				getThis().dispose();
			}
		});
		btnVoltar.setFont(new Font("Arial", Font.PLAIN, 20));
		btnVoltar.setIcon(new ImageIcon(OpcoesAdicionaisView.class.getResource("/voltar32.png")));
		btnVoltar.setBounds(24, 633, 153, 37);

		contentPane.add(btnVoltar);
		
		//botão editar
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Arial", Font.PLAIN, 20));
		btnEditar.setFont(new Font("Arial", Font.PLAIN, 20));
		btnEditar.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/engrenagem32.png")));
		btnEditar.setBounds(570, 633, 153, 37);
		contentPane.add(btnEditar);
	}
	
	public void setOpcoesAdicionais(OpcoesAdicionaisView opcoes) {
		this.opcoesAdicionais = opcoes;
	}
	
	public OpcoesAdicionaisView getOpcoesAdicionais () {
		return opcoesAdicionais;
	}
	
	public FuncionariosView getThis() {
		return this;
	}
}
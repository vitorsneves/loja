package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FuncionariosView extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
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
		setBounds(100, 100, 646, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(520, 23, 89, 23);
		contentPane.add(btnBuscar);
		
		textField_1 = new JTextField();
		textField_1.setBounds(22, 24, 465, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
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
		btnAdicionar.setBounds(520, 287, 89, 23);
		contentPane.add(btnAdicionar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(410, 287, 89, 23);
		contentPane.add(btnRemover);
		
		//Botão voltar
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				opcoesAdicionais.setEnabled(true);
				getThis().dispose();
			}
		});
		btnVoltar.setBounds(22, 287, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(300, 287, 89, 23);
		contentPane.add(btnEditar);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(22, 58, 587, 218);
		contentPane.add(textArea);
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

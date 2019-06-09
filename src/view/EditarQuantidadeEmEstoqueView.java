package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditarQuantidadeEmEstoqueView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private EditarQuantidadeEmEstoqueView janelaEditarQuantidade;
	private EstoqueView estoqueView;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditarQuantidadeEmEstoqueView frame = new EditarQuantidadeEmEstoqueView();
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
	public EditarQuantidadeEmEstoqueView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 326);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCdigo = new JLabel("Código");
		lblCdigo.setFont(new Font("Arial", Font.BOLD, 20));
		lblCdigo.setBounds(24, 43, 95, 48);
		contentPane.add(lblCdigo);
		
		JLabel lblQuantidadeASer = new JLabel("Quantidade");
		lblQuantidadeASer.setFont(new Font("Arial", Font.BOLD, 20));
		lblQuantidadeASer.setBounds(24, 130, 332, 41);
		contentPane.add(lblQuantidadeASer);
		
		textField = new JTextField();
		textField.setBounds(24, 94, 379, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(24, 161, 379, 26);
		contentPane.add(textField_1);
		
		JButton btnVoltar = new JButton("Cancelar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				estoqueView.setVisible(true);
				estoqueView.getOpcoesAdicionais().toFront();
				estoqueView.toFront();
			}
		});
		btnVoltar.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/cancelar.png")));
		btnVoltar.setFont(new Font("Arial", Font.BOLD, 13));
		btnVoltar.setBounds(109, 240, 135, 33);
		contentPane.add(btnVoltar);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConfirmar.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/confirmar.png")));
		btnConfirmar.setBounds(254, 240, 147, 33);
		btnConfirmar.setFont(new Font("Arial", Font.BOLD, 13));
		contentPane.add(btnConfirmar);
		
		JLabel label = new JLabel("");
		label.setBounds(-365, -133, 800, 562);
		label.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/fundoEditarEstoque.png")));
		contentPane.add(label);
		
		
		
	}


	public void setEstoqueView(EstoqueView this1) {
		this.estoqueView = this1;
		
	}
	
}

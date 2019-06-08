package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JToggleButton;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class FormaDePagamentoView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormaDePagamentoView frame = new FormaDePagamentoView();
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
	public FormaDePagamentoView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 341, 226);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscolhaAForma = new JLabel("Escolha a forma de pagamento:");
		lblEscolhaAForma.setForeground(Color.WHITE);
		lblEscolhaAForma.setFont(new Font("Arial", Font.BOLD, 18));
		lblEscolhaAForma.setBounds(25, 16, 285, 26);
		contentPane.add(lblEscolhaAForma);
		
		JRadioButton dinheiroRadioButton = new JRadioButton("Dinheiro");
		dinheiroRadioButton.setFont(new Font("Arial", Font.PLAIN, 14));
		dinheiroRadioButton.setForeground(Color.WHITE);
		dinheiroRadioButton.setBounds(41, 104, 109, 23);
		dinheiroRadioButton.setContentAreaFilled(false);
		contentPane.add(dinheiroRadioButton);
		
		JRadioButton cartaoRadioButton = new JRadioButton("Cart\u00E3o de cr\u00E9dito");
		cartaoRadioButton.setForeground(Color.WHITE);
		cartaoRadioButton.setFont(new Font("Arial", Font.PLAIN, 14));
		cartaoRadioButton.setBounds(41, 63, 139, 23);
		cartaoRadioButton.setContentAreaFilled(false);
		contentPane.add(cartaoRadioButton);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setBounds(181, 138, 119, 23);
		contentPane.add(btnNewButton);
		
		JLabel fundoEscuro = new JLabel("");
		fundoEscuro.setBounds(-35, 11, 350, 165);
		fundoEscuro.setIcon(new ImageIcon(LoginView.class.getResource("/fundoEscuro.png")));
		contentPane.add(fundoEscuro);
		
		JLabel fundoDeDinheiro = new JLabel("");
		fundoDeDinheiro.setBounds(0, 0, 333, 195);
		fundoDeDinheiro.setIcon(new ImageIcon(LoginView.class.getResource("/fundoDeDinheiro.jpg")));
		contentPane.add(fundoDeDinheiro);
	}
}

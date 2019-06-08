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

public class CarrinhoView extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private BuscarView janelaBuscar;

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
		setBounds(100, 100, 991, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 90, 911, 402);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		textField = new JTextField();
		textField.setBounds(31, 52, 784, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(825, 52, 117, 27);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Adicionar produto no carrinho", "Remover produto do carrinho"}));
		comboBox.setBounds(31, 21, 228, 20);
		contentPane.add(comboBox);
		
		JButton btnNewButton_1 = new JButton("Cancelar compra");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				janelaBuscar.setEnabled(true);
				janelaBuscar.toFront();
			}
		});
		btnNewButton_1.setBounds(29, 503, 206, 36);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Proseguir para m\u00E9todo de pagamento");
		btnNewButton_2.setBounds(689, 503, 253, 36);
		contentPane.add(btnNewButton_2);
	}

	public BuscarView getJanelaBuscar() {
		return janelaBuscar;
	}

	public void setJanelaBuscar(BuscarView janelaBuscar) {
		this.janelaBuscar = janelaBuscar;
	}
	
}

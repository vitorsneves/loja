package view;


import java.awt.EventQueue;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipalView extends JFrame {

	private JPanel contentPane;
	JButton BtnOpcoesAdicionais;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipalView frame = new MenuPrincipalView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public MenuPrincipalView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 30, 1280, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo = new JLabel("MENU");
		titulo.setForeground(Color.WHITE);
		titulo.setFont(new Font("Arial", Font.BOLD, 60));
		titulo.setBounds(544, 59, 189, 109);
		contentPane.add(titulo);
		
		JButton btnNovaCompra = new JButton("Nova compra");
		btnNovaCompra.setHorizontalAlignment(SwingConstants.LEFT);
		btnNovaCompra.setFont(new Font("Arial", Font.PLAIN, 30));
		btnNovaCompra.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/dinheiro.png")));
		btnNovaCompra.setBounds(156, 202, 415, 82);
		contentPane.add(btnNovaCompra);
		
		JButton btnAdicionarCliente = new JButton("Adicionar cliente");
		btnAdicionarCliente.setHorizontalAlignment(SwingConstants.LEFT);
		btnAdicionarCliente.setFont(new Font("Arial", Font.PLAIN, 30));
		btnAdicionarCliente.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/cliente.png")));
		btnAdicionarCliente.setBounds(156, 377, 415, 82);
		btnAdicionarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CriarClienteView clienteView = new CriarClienteView();
				clienteView.setMenuPrincipal(getThis());
				clienteView.setVisible(true); 
				setEnabled(false);
			}
		});
		contentPane.add(btnAdicionarCliente);

		JButton btnBuscarEstoque = new JButton("Procurar em estoque");
		btnBuscarEstoque.setHorizontalAlignment(SwingConstants.LEFT);
		btnBuscarEstoque.setFont(new Font("Arial", Font.PLAIN, 30));
		btnBuscarEstoque.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/estoque.png")));
		btnBuscarEstoque.setBounds(156, 552, 415, 82);
		contentPane.add(btnBuscarEstoque);
		
		JButton btnEstatisticas = new JButton("Estat\u00EDsticas");
		btnEstatisticas.setHorizontalAlignment(SwingConstants.LEFT);
		btnEstatisticas.setFont(new Font("Arial", Font.PLAIN, 30));
		btnEstatisticas.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/estatisticas.png")));
		btnEstatisticas.setBounds(705, 202, 415, 82);
		contentPane.add(btnEstatisticas);
		
		BtnOpcoesAdicionais = new JButton("Op\u00E7\u00F5es adicionais");
		BtnOpcoesAdicionais.setHorizontalAlignment(SwingConstants.LEFT);
		BtnOpcoesAdicionais.setFont(new Font("Arial", Font.PLAIN, 30));
		BtnOpcoesAdicionais.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/chave.png")));
		BtnOpcoesAdicionais.setBounds(705, 377, 415, 82);
		contentPane.add(BtnOpcoesAdicionais);
		BtnOpcoesAdicionais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getThis().dispose();
				OpcoesAdicionaisView opav = new OpcoesAdicionaisView();
				opav.setVisible(true);
			}
		});
		
		JLabel fundoEscuro = new JLabel("");
		fundoEscuro.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/fundoEscuro.png")));
		fundoEscuro.setBounds(32, 38, 1158, 693);
		contentPane.add(fundoEscuro);
		
		JLabel fundo = new JLabel("");
		fundo.setIcon(new ImageIcon(MenuPrincipalView.class.getResource("/fundoMenu.jpg")));
		fundo.setBounds(0, 0, 1920, 1080);
		contentPane.add(fundo);
		
		setResizable(false);
		
	}
	

	public void definirUsuario(int definirUsuario, MenuPrincipalView menu) {
		if(definirUsuario == 1) {
			menu.setVisible(true);
		}
		else if(definirUsuario == 3) {
			menu.setVisible(true);
			menu.getBtnOpcoesAdicionais().setEnabled(false);
		}
	}
	
	public JButton getBtnOpcoesAdicionais() {
		return BtnOpcoesAdicionais;
	}
	
	public MenuPrincipalView getThis() {
		return this;
	}
}

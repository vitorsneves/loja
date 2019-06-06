package controller;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dao.ClienteDao;
import dao.ConexaoDao;
import model.Cliente;
import view.CriarClienteView;

public class ClienteController {

	private CriarClienteView view;

	public ClienteController(CriarClienteView view) {
		this.view = view;
	}

	public void salvarCliente(){
		String nome = view.getTextNome().getText();
		String cpf = view.getTextCpf().getText();
		String telefone = view.getTextTelefone().getText();
		String email = view.getTextEmail().getText();
		Cliente cliente = new Cliente(nome, cpf, telefone, email);
		Connection conexao;
		try {
			conexao = new ConexaoDao().getConnection();
			ClienteDao clienteController = new ClienteDao(conexao);
			clienteController.addCliente(cliente);
			JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

}


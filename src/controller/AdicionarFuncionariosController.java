package controller;

import java.sql.Connection;

import javax.swing.JOptionPane;

import dao.AdicionarFuncionarioDao;
import dao.ConexaoDao;
import model.Funcionario;
import view.AdicionarFuncionariosView;

public class AdicionarFuncionariosController {
	
	private AdicionarFuncionariosView janelaAddFuncionarios;
	
	public AdicionarFuncionariosController(AdicionarFuncionariosView janela) {
		janelaAddFuncionarios = janela;
	}
	
	public void adicionarFuncionario() {
		String nome = janelaAddFuncionarios.getTextNome().getText();
		String cpf = janelaAddFuncionarios.getTextCpf().getText();
		String telefone = janelaAddFuncionarios.getTextTelefone().getText();
		String email = janelaAddFuncionarios.getTextEmail().getText();
		String login = janelaAddFuncionarios.getTextLogin().getText();
		String senha = janelaAddFuncionarios.getTextSenha().getText();
		Usuario usuario = new Usuario(login, senha);
		
		Funcionario funcionario = new Funcionario(nome, cpf, telefone, email, usuario);
		Connection conexao;
		try {
			conexao = new ConexaoDao().getConnection();
			AdicionarFuncionarioDao funcionariosDao = new AdicionarFuncionarioDao(conexao);
			funcionariosDao.addFuncionario(funcionario);
			JOptionPane.showMessageDialog(null, "Funcionário adicionado com sucesso", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

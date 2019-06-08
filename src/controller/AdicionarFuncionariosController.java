package controller;

import java.sql.Connection;

import javax.swing.JOptionPane;

import dao.AdicionarFuncionarioDao;
import dao.ConexaoDao;
import model.Funcionario;
import model.Usuario;
import view.AdicionarFuncionariosView;

public class AdicionarFuncionariosController {
	
	private AdicionarFuncionariosView janelaAddFuncionarios;
	
	public AdicionarFuncionariosController(AdicionarFuncionariosView janela) {
		janelaAddFuncionarios = janela;
	}
	
	public boolean adicionarFuncionario() {
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
			AdicionarFuncionarioDao funcionarioDao = new AdicionarFuncionarioDao(conexao);
			funcionarioDao.addFuncionario(funcionario);
			JOptionPane.showMessageDialog(null, "Funcionário adicionado com sucesso", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
}

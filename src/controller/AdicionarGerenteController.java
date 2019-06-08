package controller;

import java.sql.Connection;

import javax.swing.JOptionPane;

import dao.AdicionarGerenteDao;
import dao.ConexaoDao;
import model.Funcionario;
import view.AdicionarGerenteView;

public class AdicionarGerenteController {

	private AdicionarGerenteView janelaAddGerente;
	
	public AdicionarGerenteController(AdicionarGerenteView janela) {
		janelaAddGerente = janela;
	}
	
	public void adicionarGerente() {
		String nome = janelaAddGerente.getTextNome().getText();
		String cpf = janelaAddGerente.getTextCpf().getText();
		String telefone = janelaAddGerente.getTextTelefone().getText();
		String email = janelaAddGerente.getTextEmail().getText();
		String login = janelaAddGerente.getTextLogin().getText();
		String senha = janelaAddGerente.getTextSenha().getText();
		Usuario usuario = new Usuario(login, senha);
		
		Funcionario gerente = new Funcionario(nome, cpf, telefone, email, usuario);
		Connection conexao;
		try {
			conexao = new ConexaoDao().getConnection();
			AdicionarGerenteDao gerentesDao = new AdicionarGerenteDao(conexao);
			gerentesDao.addGerente(gerente);
			JOptionPane.showMessageDialog(null, "Funcionário adicionado com sucesso", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
		} catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}

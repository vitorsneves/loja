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
		//
		//
		
		Funcionario funcionario = new Funcionario(nome, null, null, null, null);
		Connection conexao;
		try {
			conexao = new ConexaoDao().getConnection();
			AdicionarFuncionarioDao funcionariosDao = new AdicionarFuncionarioDao(conexao);
			funcionariosDao.addFuncionario(funcionario);
			JOptionPane.showMessageDialog(null, "Funcionário adicionado com sucesso");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

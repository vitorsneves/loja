package controller;

import java.sql.Connection;
import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;

import controllerHelper.FuncionariosHelper;
import dao.BuscarDao;
import dao.ConexaoDao;
import dao.FuncionariosDao;
import model.Funcionario;
import model.Produto;
import view.FuncionariosView;

public class FuncionarioController {
	
	private FuncionariosView janelaFuncionarios;
	private FuncionariosHelper helper;
	
	public FuncionarioController(FuncionariosView janela) {
		janelaFuncionarios = janela;
		helper = new FuncionariosHelper(janela);
	}
	//MÉTODOS DE BUSCA
	//método chamado ao abrir FuncionariosView ou apertar o botão exibir tudo
	//preenche a tabela com todos os funcionarios
	public void preencherTudo() {
		Connection conexao;
		try {
			conexao = new ConexaoDao().getConnection();
			FuncionariosDao funcionariosDao = new FuncionariosDao(conexao);
			ArrayList<Funcionario> funcionarios = funcionariosDao.exibirFuncionarios();
			helper.preencher(funcionarios);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//método chamado ao apertar buscar, exibe resultados da busca
	public void preencherResultados() {
		Connection conexao;
		try {
			conexao = new ConexaoDao().getConnection();
			FuncionariosDao funcionariosDao = new FuncionariosDao(conexao);
			ArrayList<Funcionario> funcionarios = funcionariosDao.buscarFuncionario(janelaFuncionarios.getCriterioDeBusca().getSelectedIndex(),
					janelaFuncionarios.getTextBusca().getText());
			helper.preencher(funcionarios);
		} 
		catch(SQLSyntaxErrorException e) {
			helper.apagarTabela();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	//FIM MÉTODOS DE BUSCA
}
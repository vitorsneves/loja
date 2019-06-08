package controller;

import java.sql.Connection;
import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;

import controllerHelper.GerentesHelper;
import dao.BuscarDao;
import dao.ConexaoDao;
import dao.FuncionariosDao;
import dao.GerenteDao;
import model.Funcionario;
import model.Gerente;
import view.GerenteView;

public class GerenteController {
	
	private GerenteView janelaGerentes;
	private GerentesHelper helper;
	
	public GerenteController(GerenteView janela) {
		janelaGerentes = janela;
		helper = new GerentesHelper(janela);
	}

	public void preencherGerentes() {
		Connection conexao;
		try {
			conexao = new ConexaoDao().getConnection();
			GerenteDao gerenteDao = new GerenteDao(conexao);
			ArrayList<Gerente> gerentes = gerenteDao.exibirGerentes();
			helper.preencher(gerentes);
		} 
		catch(SQLSyntaxErrorException e) {
			helper.apagarTabela();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
} 
	public void preencherResultados() {
		Connection conexao;
		try {
			conexao = new ConexaoDao().getConnection();
			GerenteDao gerenteDao = new GerenteDao(conexao);
			ArrayList<Gerente> gerentes = gerenteDao.buscarGerente(janelaGerentes.getCriterioDeBusca().getSelectedIndex(),
					janelaGerentes.getTextBusca().getText());
			helper.preencher(gerentes);
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

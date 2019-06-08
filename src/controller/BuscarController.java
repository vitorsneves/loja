package controller;

import java.sql.Connection;
import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;

import controllerHelper.BuscarHelper;
import dao.BuscarDao;
import dao.ConexaoDao;
import model.Produto;
import view.BuscarView;

public class BuscarController {
	
	private BuscarView janelaBuscar;
	private BuscarHelper helper;
	
	public BuscarController(BuscarView janelaBuscar) {
		this.janelaBuscar = janelaBuscar;
		helper = new BuscarHelper(janelaBuscar);
	}
	
	//metodo chamado quando a janela de busca é aberta ou quando é necessário exibir todos os produtos
	//tabela será preenchida com todos os produtos
	public void preencherTudo() {
		Connection conexao;
		try {
			conexao = new ConexaoDao().getConnection();
			BuscarDao buscarDao = new BuscarDao(conexao);
			ArrayList<Produto> produtos = buscarDao.exibirProdutos();
			helper.preencher(produtos);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//método chamado quando o botão busca é apertado
	//tabela será preenchida com os resultados da pesquisa
public void preencherResultados() {
		Connection conexao;
		try {
			conexao = new ConexaoDao().getConnection();
			BuscarDao buscarDao = new BuscarDao(conexao);
			ArrayList<Produto> produtos = buscarDao.buscarProduto(janelaBuscar.getTextNome().getText(),
					Integer.parseInt(janelaBuscar.getTextCodigo().getText()));
			helper.preencher(produtos);
		} 
		catch(SQLSyntaxErrorException e) {
			helper.apagarTabela();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	} 
}

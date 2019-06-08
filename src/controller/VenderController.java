package controller;

import java.sql.Connection;
import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;

import controllerHelper.BuscarHelper;
import dao.BuscarDao;
import dao.ConexaoDao;
import model.Produto;
import view.BuscarView;

public class VenderController {
	
	// modificar de acordo com a janela de venda
	private VenderView janelaVender;
	private VenderHelper helper;
	
	public BuscarController(BuscarView janelaBuscar) {
		this.janelaBuscar = janelaBuscar;
		helper = new VenderHelper(janelaBuscar);
	}
	
	public void preencherVenda() {
		Connection conexao;
		try {
			conexao = new ConexaoDao().getConnection();
			VenderDao buscarDao = new VenderDao(conexao);
			ArrayList<Produto> produtos = VenderDao.pegarProduto();
			helper.preencher(produtos);
		} catch(Exception e) {
			e.printStackTrace();
		}

	} 

}

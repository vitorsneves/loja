package controller;

import java.sql.Connection;
import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;

import controllerHelper.ClientesHelper;
import dao.BuscarClientesDao;
import dao.BuscarDao;
import dao.ConexaoDao;
import model.Cliente;
import model.Produto;
import view.BuscarClientesView;

public class BuscarClientesController {
	
	private BuscarClientesView janelaBuscarClientes;
	private ClientesHelper helper;
	
	public BuscarClientesController(BuscarClientesView janela) {
		this.janelaBuscarClientes = janela;
	}
	
	//M�TODOS DE BUSCA
	//esse m�todo � chamado para exibir todos os clientes armazenados no banco
	public void preencherClientes() {
		Connection conexao;
		try {
			conexao = new ConexaoDao().getConnection();
			BuscarClientesDao buscarClientesDao = new BuscarClientesDao(conexao);
			ArrayList<Cliente> clientes = buscarClientesDao.exibirClientes();
			helper.preencher(clientes);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//esse m�todo � chamado quando o bot�o pesquisar � apertado
	//o objetivo aqui � exibir o resultado da busca na tabela
	public void preencherResultados() {
		Connection conexao;
		try {
			conexao = new ConexaoDao().getConnection();
			BuscarClientesDao buscarDao = new BuscarClientesDao(conexao);
			ArrayList<Cliente> clientes = buscarDao.buscarClientes(janelaBuscarClientes.getComboBox().getSelectedIndex(), janelaBuscarClientes.getTextBusca().getText());
			helper.preencher(clientes);
		} 
		catch(SQLSyntaxErrorException e) {
			helper.apagarTabela();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	//FIM DOS M�TODOS DE BUSCA
	
}

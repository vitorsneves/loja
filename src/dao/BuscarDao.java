package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
import model.Gerente;
=======
import model.Funcionario;
>>>>>>> 84df7a64fbf18715910b92038d9b23359ea56c8c
import model.Produto;

public class BuscarDao {
	private final Connection connection;

	public BuscarDao(Connection connection) {
		this.connection = connection;
	}
	//métodos de busca de produtos
	public ArrayList<Produto> exibirProdutos() throws SQLException {
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		String sql = "select * from produtos";
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet resultado = statement.executeQuery();
		while (resultado.next()) {
			Produto produto = new Produto();
			produto.setCodigo(resultado.getInt(1));
			produto.setNome(resultado.getString(2));
			produto.setFabricante(resultado.getString(3));
			produto.setTamanho(resultado.getString(4));
			produto.setTipo(resultado.getString(5));
			produto.setQuantidade(resultado.getInt(6));
			produto.setPreco(resultado.getDouble(7));

			produtos.add(produto);
		}
		return produtos;
	}

	public ArrayList<Produto> buscarProduto(int criterioDeBusca, String informacaoDigitada) throws SQLException {
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		String sql;
		if (criterioDeBusca == 0) {
			sql = "select * from produtos where nome like '%" + informacaoDigitada + "%'";
		} else {
			int codigo = Integer.parseInt(informacaoDigitada);
			sql = "select * from produtos where codigo =" + codigo + "";
		}
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet resultado = statement.executeQuery();
		while (resultado.next()) {
			Produto produto = new Produto();
			produto.setCodigo(resultado.getInt(1));
			produto.setNome(resultado.getString(2));
			produto.setFabricante(resultado.getString(3));
			produto.setTamanho(resultado.getString(4));
			produto.setTipo(resultado.getString(5));
			produto.setQuantidade(resultado.getInt(6));
			produto.setPreco(resultado.getDouble(7));

			produtos.add(produto);

		}

		return produtos;
	}

	public ArrayList<Gerente> buscarGerente(int criterioDeBusca, String informacaoDigitada) throws SQLException {
		ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
		String sql;
		if (criterioDeBusca == 0) {
			sql = "select * from gerente where nome like '%" + informacaoDigitada + "%'";
		} else {
			sql = "select * from produtos where cpf =" + informacaoDigitada + "";
		}
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet resultado = statement.executeQuery();
		while (resultado.next()) {
			Gerente gerente= new Gerente();
			gerente.setNome(resultado.getString(1));
			gerente.setCpf(resultado.getString(2));
			gerente.setTelefone(resultado.getString(3));
			gerente.setEmail(resultado.getString(4));
			gerente.setSalario(resultado.getDouble(7));

			gerentes.add(gerente);

		}

		return gerentes;
	}
	//fim dos métodos de busca de produtos
}

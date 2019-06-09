package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Produto;

public class VenderDao {

	private final Connection connection;	
	
	public VenderDao(Connection connection) {
		this.connection = connection;	
	}
	
	public Produto pegarProduto(int codigoProduto, int qtdComprada) throws SQLException {
		
			String sql =  "select * from produtos where codigo ="+codigoProduto+"";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet resultado = statement.executeQuery();
		while(resultado.next()) {
			Produto produto = new Produto();
			produto.setCodigo(resultado.getInt(1));
			produto.setNome(resultado.getString(2));
			produto.setFabricante(resultado.getString(3));
			produto.setTamanho(resultado.getString(4));
			produto.setTipo(resultado.getString(5));
			produto.setQuantidade(qtdComprada);
			produto.setPreco(qtdComprada * resultado.getDouble(7));
			return produto;			
		}
		return null;
			
	}
	
	public void atualizarBanco(int codigoProduto, int qtdComprada) throws SQLException {		
			String sql =  "update produtos set quantidade = quantidade - "+qtdComprada+"where codigo ="+codigoProduto+"";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.execute();
			
	}
}

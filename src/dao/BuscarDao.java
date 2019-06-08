package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Produto;

public class BuscarDao {
	private final Connection connection;	
	
	public BuscarDao(Connection connection) {
		this.connection = connection;	
	}
	
	public ArrayList<Produto> buscarTudo() throws SQLException {
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		String sql = "select * from produtos";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.execute();
		ResultSet resultado = statement.getResultSet();
		while(resultado.next()) {
			Produto produto = new Produto();
			produto.setCodigo(resultado.getInt(1));
			produto.setNome(resultado.getString(2));
			produto.setFabricante(resultado.getString(3));
			produto.setTamanho(resultado.getString(4));
			produto.setTipo(resultado.getString(5));
			produto.setQuantidade(resultado.getInt(6));
			produto.setPreco(resultado.getDouble(7));
		}
		return produtos;
	}
}

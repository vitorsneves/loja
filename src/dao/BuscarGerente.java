package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Gerente;

public class BuscarGerente {
	private final Connection connection;

	public GerenteDao(Connection connection) {
		this.connection = connection;
	}

public class GerenteDao {
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
}

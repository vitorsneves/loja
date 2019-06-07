package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Funcionario;

public class AdicionarFuncionarioDao {
	private Funcionario funcionario;
	private Connection connection;
	
	public AdicionarFuncionarioDao(Connection conexao) {
		this.connection = conexao;
	}
	
	public void addFuncionario (Funcionario funcionario) throws SQLException {
		String sql = "insert into Funcionario(nome, cpf, telefone, email, login, senha) values (?, ?, ?, ?, ?, ?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, funcionario.getNome());
		statement.setString(2, null);
		statement.setString(3, null);
		statement.setString(4, null);
		statement.setString(5, null);
		statement.setString(5, null);
		statement.execute();
		connection.close();
	}
}

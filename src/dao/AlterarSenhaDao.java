package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class AlterarSenhaDao {
	private final Connection connection;
	
	public AlterarSenhaDao(Connection connection) {
		this.connection = connection;	
	}

	public void mudarSenhaNoBanco(String senha) throws SQLException {
		String sql = "update admin set senha = ? where login = 'eletrica'";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, senha);
		statement.execute();
		JOptionPane.showMessageDialog(null, "Senha alterada com sucesso");
	}
	
}

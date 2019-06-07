package controller;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dao.AlterarSenhaDao;
import dao.ClienteDao;
import dao.ConexaoDao;
import view.AlterarSenhaView;

public class AlterarSenhaController {
	private AlterarSenhaView AlterarView;
	
	public AlterarSenhaController (AlterarSenhaView AlterarView) {
		this.AlterarView = AlterarView;
	}
	
	public void mudarSenha() {
		String senha01 = AlterarView.getTextSenha01().getText();
		String senha02 = AlterarView.getTextSenha02().getText();
		try {
			if(senha01 == senha02) {
				Connection conexao;
				conexao = new ConexaoDao().getConnection();
				AlterarSenhaDao senhaDao = new AlterarSenhaDao(conexao);
				senhaDao.mudarSenhaNoBanco(senha01);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

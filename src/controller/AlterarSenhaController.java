package controller;

import java.sql.Connection;
import javax.swing.JOptionPane;
import dao.AlterarSenhaDao;
import dao.ConexaoDao;
import view.AlterarSenhaView;

public class AlterarSenhaController {
	private AlterarSenhaView alterarView;
	
	public AlterarSenhaController (AlterarSenhaView alterarView) {
		this.alterarView = alterarView;
	}
	
	public boolean mudarSenha() {
		String senha01 = alterarView.getTextSenha01().getText();
		String senha02 = alterarView.getTextSenha02().getText();
		try {
			if(senha01.equals(senha02)) {
				Connection conexao;
				conexao = new ConexaoDao().getConnection();
				AlterarSenhaDao senhaDao = new AlterarSenhaDao(conexao);
				senhaDao.mudarSenhaNoBanco(senha01);
				alterarView.dispose();
				return true;
			}
			else {
				return false;
			}
		
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Senhas diferentes");
			e.printStackTrace();
			return false;			
		}
			
	}
}

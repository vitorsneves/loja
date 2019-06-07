package controller;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dao.ConexaoDao;
import dao.UsuarioDao;
import model.Usuario;
import view.LoginView;
import view.MenuPrincipalView;


public class LoginController {
	private LoginView view;
	
	public LoginController(LoginView view) {
		this.view = view;
	}
	
	public void autenticar() {
		String usuario = view.getTextUsuario().getText();
		String senha = view.getTextSenha().getText();
		Usuario usuarioAutenticar = new Usuario(usuario,senha);
		
		try{
		Connection conexao = new ConexaoDao().getConnection();
		UsuarioDao usuarioDao = new UsuarioDao(conexao);
		int resultado = usuarioDao.autenticarUsuario(usuarioAutenticar);
		if(resultado == 1 || resultado == 2 || resultado == 3) {
			MenuPrincipalView menu = new MenuPrincipalView();
			if(resultado == 1) {
				menu.setDefinirUsuario(1);
			}
			else if(resultado == 2) {
				menu.setDefinirUsuario(2);
			}
			else if(resultado == 3) {
				menu.setDefinirUsuario(3);
			}
			menu.setVisible(true);
			view.dispose(); //verificar
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos");
		}
		}catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
}
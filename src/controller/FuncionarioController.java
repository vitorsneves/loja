package controller;

import controllerHelper.FuncionariosHelper;
import view.FuncionariosView;

public class FuncionarioController {
	
	private FuncionariosView janelaFuncionarios;
	private FuncionariosHelper helper;
	
	public FuncionarioController(FuncionariosView janela) {
		janelaFuncionarios = janela;
		helper = new FuncionarioHelper(janela);
	}
	
	
}

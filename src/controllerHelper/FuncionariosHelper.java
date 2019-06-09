package controllerHelper;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import view.FuncionariosView; 

import model.Funcionario;

	
public class FuncionariosHelper {
	
	private FuncionariosView janelaFuncionarios;
	
	public FuncionariosHelper(FuncionariosView janela) {
		this.janelaFuncionarios = janela;
	}
	
	//MÉTODOS DE BUSCA
	public void preencher(ArrayList<Funcionario> funcionarios) {

		janelaFuncionarios.getTableModel().setNumRows(0);
		for(Funcionario funcionario : funcionarios) {
			janelaFuncionarios.getTableModel().addRow(new Object[] {
					funcionario.getNome(),
	                funcionario.getCpf(),
	                funcionario.getEmail(),
	                funcionario.getTelefone(),
	                funcionario.getSalario(),
			});
		}
	}
	
	public void apagarTabela() {
		janelaFuncionarios.getTableModel().setNumRows(0);
	}
	//FIM DOS MÉTODOS DE BUSCA
	
	//MÉTODO DE REMOÇÃO
	public void removerFuncionario(int linha) {
		janelaFuncionarios.getTableModel().removeRow(linha);
	}
}

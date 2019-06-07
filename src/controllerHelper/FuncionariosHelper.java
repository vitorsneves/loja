package controllerHelper;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import view.FuncionariosView; 
import model.Funcionario;
import 
	
public class FuncionariosHelper {
	
	private FuncionariosView janelaFuncionarios;
	
	public FuncionariosHelper(FuncionariosView janela) {
		this.janelaFuncionarios = janela;
	}
	
	public void preencher(ArrayList<Funcionario> funcionarios) {
		DefaultTableModel tableModel = (DefaultTableModel) janelaFuncionarios.getTableFuncionarios().getModel();
		tableModel.setNumRows(0);
		for(Funcionario funcionario : funcionarios) {
			tableModel.addRow(new Object[] {
					funcionario.getNome();
					funcionario.getCpf();
					funcionario.getTelefone();
			});
		}
	}
}

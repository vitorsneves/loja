package controllerHelper;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import model.Gerente;
import view.GerenteView;
	
public class GerentesHelper {
	
	private GerenteView janelaGerentes;
	
	public GerentesHelper(GerenteView janela) {
		this.janelaGerentes = janela;
	}
	
	//MÉTODOS DE BUSCA
	public void preencher(ArrayList<Gerente> gerentes) {

		janelaGerentes.getTableModel().setNumRows(0);
		for(Gerente gerente : gerentes) {
			janelaGerentes.getTableModel().addRow(new Object[] {
					gerente.getNome(),
	                gerente.getCpf(),
	                gerente.getEmail(),
	                gerente.getTelefone(),
	                gerente.getSalario(),
			});
		}
	}
	
	public void apagarTabela() {
		janelaGerentes.getTableModel().setNumRows(0);
	}
	//FIM DOS MÉTODOS DE BUSCA
	
	//MÉTODO DE REMOÇÃO
	public void removerGerente(int linha) {
		janelaGerentes.getTableModel().removeRow(linha);
	}
}

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
	
	public void preencher(ArrayList<Gerente> gerentes) {
		DefaultTableModel tableModel = (DefaultTableModel) janelaGerentes.getTableGerentes().getModel();
		tableModel.setNumRows(0);
		for(Gerente gerente : gerentes) {
			tableModel.addRow(new Object[] {
				
			});
		}
	}
	
	public void apagarTabela() {
		DefaultTableModel tableModel = (DefaultTableModel) janelaGerentes.getTableGerentes().getModel();
		tableModel.setNumRows(0);
	}
}

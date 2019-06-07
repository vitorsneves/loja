package controllerHelper;

import view.BuscarView;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class BuscarHelper {
	
	private BuscarView janelaBuscar;
	
	public BuscarHelper(BuscarView janelaBuscar) {
		this.janelaBuscar = janelaBuscar;
	}
	
	public void preencher(ArrayList<produto> produtos) {
		DefaultTableModel tableModel = (DefaultTableModel) janelaBuscar.getTableProdutos().getModel();
		tableModel.setNumRows(0);
		for(Produto produto : produtos) {
			tableModel.addRow(new Object[] {
					
			});
		}
	}
}

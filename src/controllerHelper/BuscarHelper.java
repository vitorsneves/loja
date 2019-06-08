package controllerHelper;

import view.BuscarView;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import model.Produto;

public class BuscarHelper {
	
	private BuscarView janelaBuscar;
	
	public BuscarHelper(BuscarView janelaBuscar) {
		this.janelaBuscar = janelaBuscar;
	}
	
	public void preencher(ArrayList<Produto> produtos) {
		DefaultTableModel tableModel = (DefaultTableModel) janelaBuscar.getTableProdutos().getModel();
		tableModel.setNumRows(0);
		for(Produto produto : produtos) {
			tableModel.addRow(new Object[] {
				produto.getCodigo(),
                produto.getNome(),
                produto.getFabricante(),
                produto.getTamanho(),
                produto.getTipo(),
                produto.getQuantidade(),
                produto.getPreco(),
			});
		}
		
	}
	
	public void apagarTabela() {
		DefaultTableModel tableModel = (DefaultTableModel) janelaBuscar.getTableProdutos().getModel();
		tableModel.setNumRows(0);
	}
}

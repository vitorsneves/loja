package controllerHelper;

import view.BuscarView;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import model.Produto;

public class VenderHelper {
	
	private DefaultTableModel tableModel;
	private BuscarView janelaBuscar;
	
	public VenderHelper(VenderView janelaVender) {
		this.janelaVender = janelaVender;
		tableModel = (DefaultTableModel) janelaBuscar.getTableProdutos().getModel();
		tableModel.setNumRows(0);
		
	}
	
	public void adicionarNaVenda(Produto produto) {
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
	
	
	public void apagarTabela() {
		DefaultTableModel tableModel = (DefaultTableModel) janelaBuscar.getTableProdutos().getModel();
		tableModel.setNumRows(0);
	}
}

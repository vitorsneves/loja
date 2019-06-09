package controllerHelper;

import view.BuscarView;
import view.CarrinhoView;

import javax.swing.table.DefaultTableModel;

import model.Produto;

public class VenderHelper {
	
	private DefaultTableModel tableModel;
	private CarrinhoView janelaVender;
	
	public VenderHelper(CarrinhoView janelaVender) {
		this.janelaVender = janelaVender;
		tableModel = (DefaultTableModel) janelaVender.getTabelaCarrinho().getModel();
		tableModel.setNumRows(0);
	}
	
	public void adicionarNaVenda(Produto produto) {
		
		janelaVender.novaLinha();

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
	
	public void removerNaVenda(int codigoProduto, int qtd) {
		int posicao = 0;
		int quantidade = 0;
		boolean encontrou = false;
		
		for(int i = 0; i < janelaVender.getLinhas(); i++) {
			String valor = (String) janelaVender.getTabelaCarrinho().getValueAt(i, 0);
			if(codigoProduto == Integer.parseInt(valor)) {
				encontrou = true;
				posicao = i;
				quantidade = Integer.parseInt((String) janelaVender.getTabelaCarrinho().getValueAt(posicao, 5));
			}
		}
		
		if(encontrou) {
			if(qtd >= quantidade) {
				tableModel.removeRow(posicao);
				janelaVender.tirarLinha();
				
			}
			else {
				tableModel.setValueAt(quantidade - qtd, posicao, 5);
			}
		}
	}
	
}

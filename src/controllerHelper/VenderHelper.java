package controllerHelper;

import view.BuscarView;
import view.CarrinhoView;

import javax.swing.table.DefaultTableModel;

import model.Produto;

public class VenderHelper {
	
	private CarrinhoView janelaVender;
	
	public VenderHelper(CarrinhoView janelaVender) {
		this.janelaVender = janelaVender;
	}
	
	public void adicionarNaVenda(Produto produto) {
		janelaVender.novaLinha();

		janelaVender.getTableModel().addRow(new Object[] {
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
			int valor =(int) janelaVender.getTabelaCarrinho().getValueAt(i, 0);
			if(codigoProduto == valor) {
				encontrou = true;
				posicao = i;
				quantidade =(int) janelaVender.getTabelaCarrinho().getValueAt(posicao, 5);
			}
		}
		
		if(encontrou) {
			if(qtd >= quantidade) {
				janelaVender.getTableModel().removeRow(posicao);
				janelaVender.tirarLinha();
				
			}
			else {
				double preco = 0;
				for(int i = 0; i < janelaVender.getLinhas(); i++) {
					int valor =(int) janelaVender.getTabelaCarrinho().getValueAt(i, 0);
					if(codigoProduto == valor) {
						double novoValor =(double) janelaVender.getTabelaCarrinho().getValueAt(i, 6);
						preco = (novoValor / quantidade*1.0);
					}
					
				}
			
				janelaVender.getTableModel().setValueAt(quantidade - qtd, posicao, 5);
				janelaVender.getTableModel().setValueAt(preco * (quantidade - qtd), posicao, 6);
			}
		}
	}
	
}

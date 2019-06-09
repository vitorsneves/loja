package controllerHelper;

import view.BuscarView;
import view.CarrinhoView;
import view.QtdCarrinhoView;

import javax.swing.table.DefaultTableModel;

import model.Produto;

public class VenderHelper {
	
	private CarrinhoView janelaVender;
	private BuscarView janelaBuscar;
	
	public VenderHelper(CarrinhoView janelaVender) {
		this.janelaVender = janelaVender;
	}
	
	public VenderHelper(BuscarView janelaBuscar, CarrinhoView janelaVender) {
		this.janelaBuscar = janelaBuscar;
		this.janelaVender = janelaVender;
	}
	
	//MÉTODOS QUE PREENCHEM TABELA NO BUSCAR CÓDIGO
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
	//FIM DOS MÉTODOS QUE PREENCHEM TABELA NO BUSCAR CÓDIGO
	
	//MÉTODO QUE PREENCHE A TABELA AO SELECIONAR
	public void transferir(int quantidade, int linha) {
		Produto produto = new Produto();
		produto.setCodigo((int)janelaBuscar.getTableModel().getValueAt(linha, 0));
        produto.setNome((String)janelaBuscar.getTableModel().getValueAt(linha, 1));
        produto.setFabricante((String)janelaBuscar.getTableModel().getValueAt(linha, 2));
        produto.setTamanho((String)janelaBuscar.getTableModel().getValueAt(linha, 3));
        produto.setTipo((String)janelaBuscar.getTableModel().getValueAt(linha, 4));
        produto.setQuantidade(quantidade);
        produto.setPreco(quantidade * (double)janelaBuscar.getTableModel().getValueAt(linha, 6));
		
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
}

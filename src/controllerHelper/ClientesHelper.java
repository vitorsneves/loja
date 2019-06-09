//esse método preenche a tabela de BuscarClientesView

package controllerHelper;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import model.Cliente;
import view.BuscarClientesView;

public class ClientesHelper {
	
	private BuscarClientesView janelaBuscarClientes;
	
	public ClientesHelper(BuscarClientesView janela) {
		janelaBuscarClientes = janela;
	}
	
	public void preencher(ArrayList<Cliente> clientes) {
		DefaultTableModel tableModel = (DefaultTableModel) janelaBuscarClientes.getTabelaClientes().getModel();
		tableModel.setNumRows(0);
		for(Cliente cliente : clientes) {
			tableModel.addRow(new Object[] {
					cliente.getNome(),
					cliente.getCpf(),
					cliente.getTelefone(),
					cliente.getEmail(),
			});
		}
	}
	
	public void apagarTabela() {
		DefaultTableModel tableModel = (DefaultTableModel) janelaBuscarClientes.getTabelaClientes().getModel();
		tableModel.setNumRows(0);
	}
}

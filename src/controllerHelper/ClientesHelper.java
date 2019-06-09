//esse método preenche a tabela de BuscarClientesView

package controllerHelper;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import model.Funcionario;
import view.BuscarClientesView;

public class ClientesHelper {
	
	private BuscarClientesView janelaBuscarClientes;
	
	public ClientesHelper(BuscarClientesView janela) {
		janelaBuscarClientes = janela;
	}
	
	public void preencher(ArrayList<Clientes> clientes) {
		DefaultTableModel tableModel = (DefaultTableModel) janelaBuscarClientes.get;
		tableModel.setNumRows(0);
		for(Funcionario funcionario : funcionarios) {
			tableModel.addRow(new Object[] {
					funcionario.getNome(),
	                funcionario.getCpf(),
	                funcionario.getEmail(),
	                funcionario.getTelefone(),
	                funcionario.getSalario(),
			});
		}
	}
}

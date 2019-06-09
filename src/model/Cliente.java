package model;

public class Cliente extends Pessoa {
	private double gastoTotal;
	
	public Cliente() {
		super();
	}
	
	public Cliente(String nome, String cpf, String telefone, String email) {
		super(nome,cpf,telefone,email);
	}

	public double getTotalGasto() {
		return gastoTotal;
	}

	public void setTotalGasto(double totalGasto) {
		this.gastoTotal = totalGasto;
	}


}

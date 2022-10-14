
public class ContaEspecial extends Conta{
	private String dependente;
	
	public ContaEspecial() {
	}
	
	public ContaEspecial(int numero, String correntista, String dependente) {
		super(numero, correntista);
		this.dependente = dependente;
	}	
	
	public ContaEspecial(String correntista, double saldo, String dependente) {
		super(correntista, saldo);
		this.dependente = dependente;
	}
	
	public double CalculaJuros(int qtdDias, double juros) {
		double saldo_final = getSaldo() * qtdDias * (juros/2);
		return saldo_final;
	}

}

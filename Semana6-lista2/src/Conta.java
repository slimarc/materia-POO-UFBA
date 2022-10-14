
public class Conta {
	private int cod;
	private int numero;
	private String correntista;
	private double saldo;
	
	public Conta() {
		
	}
	
	public Conta(int numero, String correntista) {
		this.numero = numero;
		this.correntista = correntista;
	}
	
	public Conta(String correntista, double saldo) {
		this.correntista = correntista;
		this.saldo = saldo;
	}
	
	public void setCod(int cod) {
		this.cod = cod;
	}
	
	public int getCod() {
		return cod;
	}
	
	public void setNumero(int numero) {
		this.numero=numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}
	
	public String getCorrentista() {
		return correntista;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double CalculaJuros(int qtdDias, double juros) {
		double saldo_final = saldo * qtdDias * juros;
		return saldo_final;		
	}
	
}

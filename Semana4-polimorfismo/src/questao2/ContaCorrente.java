package questao2;

public class ContaCorrente {
	protected int numConta;
	protected double saldo;
	private double taxaSaque = 0.05;
	
	public ContaCorrente() {
		
	}
	
	public ContaCorrente(int numConta, double saldo) {
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public void imprimeDados() {
		System.out.println("======DADOS DA CONTA======");
		System.out.println("Numero da conta: "+this.numConta);
		System.out.println("Saldo da conta: "+this.saldo);
	}
	
	public double Deposito(double valorDeposito) {
		if(valorDeposito<=0) {
			System.out.println("O valor de deposito tem que ser maior que 0");
		}else {
			saldo += valorDeposito;
			System.out.println("======DEPOSITO=======");
			System.out.println("Valor depositado foi de: "+ (valorDeposito));
		}
		return saldo;
	}
	
	public double Saque(double valorSaque) {
		if(valorSaque<=0) {
			System.out.println("O valor de saque tem que ser maior que 0");
		}else {
			saldo -= valorSaque+(valorSaque*taxaSaque);
			System.out.println("======SAQUE=======");
			System.out.println("Valor sacado foi: "+ (valorSaque));
			System.out.println("Taxa de saque: "+(valorSaque*taxaSaque));
		}
		return saldo;
	}	
	
	public double getNovoSaldo() {
		System.out.println("Saldo da conta: "+ this.saldo);
		return saldo;
	}
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	
}

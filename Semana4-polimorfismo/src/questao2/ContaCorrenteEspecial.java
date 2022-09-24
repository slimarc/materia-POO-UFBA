package questao2;

public class ContaCorrenteEspecial extends ContaCorrente {
	private double taxaSaque = 0.01;
	
	public ContaCorrenteEspecial(int numConta, double saldo) {
		super(numConta, saldo);
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
		return super.saldo;
	}	
	

}

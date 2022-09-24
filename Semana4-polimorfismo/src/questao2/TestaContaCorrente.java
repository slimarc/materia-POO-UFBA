package questao2;

public class TestaContaCorrente {
	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente(12478, 500);
		ContaCorrenteEspecial conta2 = new ContaCorrenteEspecial(47417, 500);
		
		System.out.println("============CONTA CORRENTE==========");
		
		conta1.imprimeDados();
		
		conta1.Deposito(300);
		conta1.getNovoSaldo();
		
		conta1.Saque(100);
		conta1.getNovoSaldo();
		
		System.out.println("============CONTA CORRENTE ESPECIAL==========");
		
		conta2.imprimeDados();
		
		conta2.Deposito(800);
		conta2.getNovoSaldo();
		
		conta2.Saque(1000);
		conta2.getNovoSaldo();
		
	}
}

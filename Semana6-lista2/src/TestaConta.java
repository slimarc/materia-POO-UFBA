import java.util.Scanner;

public class TestaConta {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Conta conta1 = new Conta(1, "Ricardo");
		
		String correntista = teclado.nextLine();
		double saldo = teclado.nextDouble();
		
		Conta conta2 = new Conta(correntista, saldo);
		
		Conta conta3 = new Conta();
		
		conta3.setCod(213);
		conta3.setNumero(1244);
		conta3.setCorrentista("Gilberto");
		conta3.setSaldo(570.0);
	
		
		
		System.out.println(conta1.getNumero() + " - " + conta1.getCorrentista());
		System.out.println(conta2.getCorrentista() + " - " + conta2.getSaldo());
		System.out.println(conta3.getCod() + " - " + conta3.getNumero()  + " - " + conta3.getCorrentista() + " - "
							+ conta3.getSaldo() + " - " + conta3.CalculaJuros(3, 9.50));
		
	}
	
	
}

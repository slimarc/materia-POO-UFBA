
import java.util.Scanner;

public class questao2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa calcula o "
							+ "produto de três inteiros");
		
		int x; int y; int z; int result;
		
		System.out.println("Insira o primeiro inteiro: ");
		x = teclado.nextInt();
		System.out.println("Insira o segundo inteiro: ");
		y = teclado.nextInt();
		System.out.println("Insira o terceiro inteiro: ");
		z = teclado.nextInt();
		
		result = x * y * z;
		
		System.out.println("O produto é: "+ result);
		
		
	}

}

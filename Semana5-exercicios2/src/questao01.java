import java.util.Scanner;


public class questao01 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
			System.out.println("Este programa verifica se dois números são primos.");
			System.out.println("Insira o valor de x: ");
			int x = teclado.nextInt();
			System.out.println("Insira o valor de y: ");
			int y = teclado.nextInt();
			
			if(x>=y) {
				int div = x/y;
				int resto = x%y;
				if(resto == 0) {
					System.out.println("Os numeros são primos!");
					System.out.println("O resultado da divisão é: " + div);
					System.out.println("O resto é: " + resto);
				}else {
					System.out.println("Os numeros não são primos!");
					System.out.println("O resultado da divisão é: " + div);
					System.out.println("O resto é: " + resto);
				}
			}else {
				System.out.println("O valor de x precisa ser maior que o valor de y");
			}
				
		
	}
}


import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x = teclado.nextInt();
		int y = teclado.nextInt();
		int resto = x%y;
		
		if(resto == 0) {
			System.out.println("São primos");
		}else {
			System.out.println("Não são primos");
		}

	}

}

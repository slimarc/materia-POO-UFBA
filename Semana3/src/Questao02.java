import java.util.Scanner;

public class Questao02 {
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira o sexo 'm' para masculino e 'f' para feminino: ");
		String sexo = teclado.nextLine();
		System.out.println("Insira a altura: ");
		double altura = teclado.nextFloat();
		
		switch(sexo) {
				case "m":							
					double peso_masc = (72.7 * altura) - 58;
					System.out.printf("O peso ideal seria: %.2f KG", peso_masc);
					break;
				case "f":
					double peso_fem = (62.1 * altura) - 44.7;
					System.out.printf("O peso ideal seria: %.2f KG", peso_fem);
					break;
				default:
					System.out.println("Insira opção válida.");
		}
		
		teclado.close();
	}
}

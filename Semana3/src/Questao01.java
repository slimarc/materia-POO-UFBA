import java.util.Scanner;

public class Questao01 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira o valor do salário: ");
		float salario = teclado.nextFloat();
		
		if(salario<500) {
			salario += (salario * 0.15);
		}else if(salario>=500 && salario<=1000) {
			salario += (salario * 0.1);
		}else {
			salario += (salario * 0.5);
		} 

		
		System.out.printf("O salario reajustado é: RS %.2f" , salario);
		
		teclado.close();
	} 
}
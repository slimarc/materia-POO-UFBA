import java.util.Scanner;

public class Questao04 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		while(true) {
				System.out.println("=== [ BEM VINDO AO VEGANVEGAN ] === ");
				System.out.println("-------PRATO INDIVIDUAL R$ 25.00------");
				System.out.println("1 - Cadastre seu pedido.");
				System.out.println("0 - Sair do programa.");
				int opcao = teclado.nextInt();
				double valorPrato = 25.00;
				
				switch(opcao) {
						case 1:
								System.out.println("\n---------QUAL DIA É HOJE?--------");
								System.out.println("1 - Segunda");
								System.out.println("2 - Terça");
								System.out.println("3 - Quarta");
								System.out.println("4 - Quinta");
								System.out.println("5 - Demais");
								int dia= teclado.nextInt();
								
								if(dia>=1 && dia<=5) {
									System.out.println("Insira a quantidade de pratos: ");
									int qtd = teclado.nextInt();
									if(dia == 1 || dia == 3) {
										System.out.println("Nas segundas e quartas oferecemos 20% de desconto ;)");
										double total = qtd * (valorPrato - (valorPrato * 0.2));
										System.out.printf("O valor total foi de: R$%.2f\n", total);
									}else if(dia == 2) {
										System.out.println("Nas terças oferecemos 25% de desconto ;)");
										double total = qtd * (valorPrato - (valorPrato * 0.25));
										System.out.printf("O valor total foi de: R$%.2f\n", total);
									}else if(dia == 4) {
										System.out.println("Nas quintas oferecemos 15% de desconto ;)");
										double total = qtd * (valorPrato - (valorPrato * 0.15));
										System.out.printf("O valor total foi de: %.2f\n", total);
									}else {
										System.out.println("Nas sextas, sábados e domingos oferecemos 5% de desconto ;)");
										double total = qtd * (valorPrato - (valorPrato * 0.05));
										System.out.printf("O valor total foi de: %.2f\n", total);
									}
								}else {
									System.out.println("Insira uma opção válida.\n");
				
								}
								break;				
						default:
							System.out.println("Programa encerrado. Até logo.\n");
							break;
				}
				
		}
	
	}
}		


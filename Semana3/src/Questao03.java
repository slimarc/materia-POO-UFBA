import java.util.Scanner;

public class Questao03 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("------MENU------");
		System.out.println("1 - Iniciar programa de calculo de nota");
		System.out.println("0 - Sair do programa.");
		int opcao = teclado.nextInt();		
		
		switch(opcao) {
				case 1:
					double media = 0;
					double soma = 0;
					
					for(int i=0; i<3; i++) {
						System.out.println("Insira a nota " + (i+1));
						double nota = teclado.nextDouble(); 
						if(nota>0 && nota<=10) {
							if(i==0) {
								nota *= 2;
								soma += nota;
							}else if(i==1) {
								nota *= 3;
								soma += nota;
							}else{
								nota *=5;
								soma += nota;
							}	
						}else {
							System.out.println("A nota tem que ser entre 0 e 10");
						}
					}
					media = soma / 10;
					if(media>0 && media<=2.9) {
						System.out.printf("A media do aluno foi: %.2f%n", media);
						System.out.println("Aluno reprovado");
					}else if(media>=3 && media<=4.9){
						System.out.printf("A media do aluno foi: %.2f%n", media);
						System.out.println("Aluno de recuperação");
					}else {
						System.out.printf("A media do aluno foi: %.2f%n", media);
						System.out.println("Aluno aprovado");
					}	
					break;
				default:
					System.out.println("Programa encerrado. Até logo.");
		}
		
		teclado.close();
	}
}
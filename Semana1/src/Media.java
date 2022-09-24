import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		/*
		float numero1, numero2;
		
		numero1 = Float.parseFloat(args[0]);
		numero2 = Float.parseFloat(args[1]);
		float media = (numero1+numero2)/2;
		System.out.println("Media = "+String.valueOf(media));
		*/
		
		Scanner teclado = new Scanner(System.in);
		
		int c=7;
		int d= c++;
		int f=++c;
		float soma = 0;
		for(int i=0; i<args.length; i++) {
			soma = soma + Float.parseFloat(args[i]);
		}
		float resultado = soma/args.length;
		System.out.println(resultado);
		
		float [] notas = new float[10];
		
		notas[0] = (float) 3.5;
		for (int i=0; i<notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		boolean verifica = true;
		int testa =10;
		while (verifica==true) {
			testa++;
			System.out.println(testa);
			if(testa==20) {
				System.out.println("saindo");
				verifica=false;
			}
		}
		
		
		int [] valores = {5, 3, 8, 3, 9 ,2};
		
		
		
		teclado.close();
		
	}

}

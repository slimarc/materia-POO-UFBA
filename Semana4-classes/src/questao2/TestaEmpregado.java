package questao2;

public class TestaEmpregado {
	public static void main(String[] args) {
		Empregado empregado1 = new Empregado("Teste nome", "Sobrenome teste");
		Empregado empregado2 = new Empregado("Teste nome 2", "Sobrenome teste 2");
		
		empregado1.setSalario(3800);
		empregado2.setSalario(4500);
		
		System.out.println("==================SALARIOS MENSAIS=================");
		System.out.println("Empregado 1: "+empregado1.getSalario());
		System.out.println("Empregado 2: "+empregado2.getSalario());
		
		System.out.println("==================SALARIOS ANUAIS==================");
		System.out.printf("Empregado 1: %2.2f%n",empregado1.getSalario()*12);
		System.out.printf("Empregado 2: %2.2f%n",empregado2.getSalario()*12);
		
		empregado1.setSalario(3800*1.1);
		empregado2.setSalario(4500*1.1);
		
		System.out.println("=============SALARIOS ANUAIS COM AUMENTO===========");
		System.out.printf("Empregado 1: %2.2f%n",empregado1.getSalario()*12);
		System.out.printf("Empregado 2: %2.2f",empregado2.getSalario()*12);
	}
	
}

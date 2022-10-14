package questao13;
//
//class Documento {
//	public int qtdLinhas;
//	public String nome;
//	public int qtdParagrafos;
//	public double margemDireita;
//	public double margemEsquerda;
//	public String path;
//
//	public Documento() {
//	}
//
//
//	public Documento(int qtdLinhas, String nome, int qtdParagrafos, double margemDireita, double margemEsquerda,String path) {
//		this.qtdLinhas = qtdLinhas;
//		this.nome = nome;
//		this.qtdParagrafos = qtdParagrafos;
//		this.margemDireita = margemDireita;
//		this.margemEsquerda = margemEsquerda;
//		this.path = path;
//	}
//
//	public void setQtdLinhas(int qtdLinhas) {
//		this.qtdLinhas = qtdLinhas;
//	}
//
//
//
//class Teste{
//	public static void main(String[] args) {
//		Documento document = new Documento(780, "Contrato", 15, 1.5, 1.5, "/documents/contrato");
//		
//		document.setQtdLinhas(77);
//		
//		
//	}
//

class Number {
  int i;
}

public class Documento {
  public static void main(String[] args) {
    Number n1 = new Number();
    Number n2 = new Number();
    n1.i = 9;
    n2.i = 47;
    System.out.println("1: n1.i: " + n1.i +
    ", n2.i: " + n2.i);
    n1 = n2;
    System.out.println("2: n1.i: " + n1.i +
    ", n2.i: " + n2.i);
    n1.i = 27;
    System.out.println("3: n1.i: " + n1.i +
    ", n2.i: " + n2.i);
  }
} ///


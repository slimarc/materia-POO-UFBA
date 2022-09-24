package questao1;

public class Loja {
	public static void main(String[] args) {
		Produtos produto = new Produtos("Teclado que pisca", 87.0);
		Livros livro = new Livros("Titulo do livro", 300.0, "Nome do autor");
		CDs cd = new CDs("Nome do cd", 27.0, 11);
		DVDs dvd = new DVDs("Nome do dvd", 59.0, "120 min");
		
		
		System.out.println(produto.toString());
		System.out.println(livro.toString());
		System.out.println(cd.toString());
		System.out.println(dvd.toString());
		
	}
}

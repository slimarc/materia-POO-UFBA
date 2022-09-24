package questao1;
public class Livros extends Produtos{
	private String autor;
	
	public Livros(String nome, double preco, String autor) {
		super(nome, preco);
		this.autor = autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public String toString() {
		return super.toString() + " - " + "Autor do livro: " + autor;
	}
}

package questao1;

public class Produtos {
	private String nome;
	private double preco;

	
	public Produtos(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String toString() {
		return "O nome do produto é: "+ nome + " - " + "O preco do produto é: "+ preco;
	}
}

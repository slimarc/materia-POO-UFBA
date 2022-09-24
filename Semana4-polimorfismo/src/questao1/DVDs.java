package questao1;
public class DVDs extends Produtos{
	private String duracao;
	
	public DVDs(String nome, double preco, String duracao) {
		super(nome, preco);
		this.duracao = duracao;
	}
	
	public void setDVDs(String duracao) {
		this.duracao = duracao;
	}
	
	public String getDVDs() {
		return duracao;
	}
	
	public String toString() {
		return super.toString() + " - " + "Duracao: " + duracao;
	}
}

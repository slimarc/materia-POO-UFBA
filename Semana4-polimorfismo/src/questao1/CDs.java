package questao1;
public class CDs extends Produtos{
	private int numFaixas;
	
	
	public CDs(String nome, double preco, int numFaixas) {
		super(nome, preco);
		this.numFaixas = numFaixas;
	}
	
	public void setNumFaixas(int numFaixas) {
		this.numFaixas = numFaixas;
	}
	
	public int getNumFaixas() {
		return numFaixas;
	}
	
	public String toString() {
		return super.toString() + " - " + "Numero de faixas: " + numFaixas;
	}
}

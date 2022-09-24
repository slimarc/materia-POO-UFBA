package questao1;

public class Fatura {
	private String num;
	private String descricao;
	private int qtdItem;
	private double preco;
	
	public Fatura() {
	}
	
	public Fatura(String num, String descricao, int qtdItem, double preco) {
		this.num = num;
		this.descricao = descricao;
		this.qtdItem = qtdItem;
		this.preco = preco;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtdItem() {
		return qtdItem;
	}

	public void setQtdItem(int qtdItem) {
		this.qtdItem = qtdItem;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if(preco<0) {
			preco = 0.0;
		}
		this.preco = preco;
	}
	
	public double getFaturaTotal() {
		double total = 0;
		if(qtdItem>0 && preco>0) {
			total = qtdItem * preco;
			if(total<0){
				total = 0;
			}
		}
		return total;
	}
	
	
}

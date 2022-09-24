package questao1;

public class TestaFatura {
	public static void main(String[] args) {
		Fatura produto1 = new Fatura();
		
		produto1.setDescricao("Teclado que pisca");
		produto1.setNum("A124");
		produto1.setPreco(79.90);
		produto1.setQtdItem(2);
	
		
		System.out.println("=========FATURA TOTAL===========");
		System.out.println("Código do produto: "+produto1.getNum());
		System.out.println("Descrição do produto: "+ produto1.getDescricao());
		System.out.println("Preço do produto: "+produto1.getPreco());
		System.out.println("================================");
		System.out.println("Quantidade no carrinho: "+produto1.getQtdItem());
		System.out.println("O peço final foi: "+produto1.getFaturaTotal());
		
	}
}

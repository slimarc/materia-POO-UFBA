
public class Tecnico extends Funcionario{
	private int anos;
	
	public Tecnico(int codigo, String nome, double salario, String dataContratacao, int anos) {
		super(codigo, nome, salario, dataContratacao);
		this.anos = anos;
	}
	
	public int getAnos() {
		return anos;
	}

	public void setAnos(int anos) {
		this.anos = anos;
	}
	
	
}

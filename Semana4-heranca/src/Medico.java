
public class Medico extends Tecnico{
	private String especialidade;
	private int crm;
	
	public Medico(int codigo, String nome, double salario, String dataContratacao, int anos, String especialidade,int crm) {
		super(codigo, nome, salario, dataContratacao, anos);
		this.especialidade = especialidade;
		this.crm = crm;
	}
	
	public Medico() {
	}

	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public int getCrm() {
		return crm;
	}
	public void setCrm(int crm) {
		this.crm = crm;
	}
	
	
	
}

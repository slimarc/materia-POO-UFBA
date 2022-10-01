
class Funcionario {
	private int codigo;
	private String nome;
	private double salario;
	private String dataContratacao;
	
	public Funcionario() {
		
	}
	
	public Funcionario(int codigo, String nome, double salario, String dataContratacao) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.salario = salario;
		this.dataContratacao = dataContratacao;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDataContratacao() {
		return dataContratacao;
	}
	public void setDataContratacao(String dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	
	
	
}

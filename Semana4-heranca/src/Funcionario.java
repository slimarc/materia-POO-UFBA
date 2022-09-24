import java.sql.Date;

class Funcionario {
	private int codigo;
	private String nome;
	private double salario;
	private Date dataContratacao;
	
	public Funcionario() {
		
	}
	
	public Funcionario(int codigo, String nome, double salario, Date dataContratacao) {
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
	public Date getDataContratacao() {
		return dataContratacao;
	}
	public void setDataContratacao(Date dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	
	
	
}

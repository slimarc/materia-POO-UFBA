
public class Aluno extends Pessoa{
	private int matricula;
	private double [] nota = {};
	
	
	
	public Aluno(String nome, int matricula, double [] nota) {
		super(nome);
		this.matricula = matricula;
		this.nota = nota;
	}
	

	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public double[] getNota() {
		return nota;
	}
	
	public void setNota(double[] nota) {
		this.nota = nota;
	}
	
	public double calculaMediaAluno() {
		double soma = 0;
		for(int i=0; i<2; i++) {
			soma += nota[i];
		}
		double media = soma/2;
		return media; 
	}
}


public class TurmaGraduacao extends Turma implements IGeral{
	int limite;
	int qtde;
	Aluno[] alunos = new Aluno[qtde];	
	Pessoa professor;
	
	public TurmaGraduacao(int limite, int qtde, Aluno[] alunos, Pessoa professor) {
		this.limite = limite;
		this.qtde = qtde;
		this.alunos = alunos;
		this.professor = professor;
	}

	public int getLimite() {
		return limite;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) throws ClasseCheia{
		if (this.qtde>this.limite) {
			ClasseCheia ex = new ClasseCheia("Turma cheia! Capacidade maxima de 30 alunos");
			throw ex;
		}
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	public Pessoa getProfessor() {
		return professor;
	}

	public void setProfessor(Pessoa professor) {
		this.professor = professor;
	}
	
	
	public double calculaMediaTurma(){
		double soma = 0;
		for(int i=0; i<=alunos.length; i++) {
			soma += alunos[i].calculaMediaAluno();
		}
		double mediaTurma = soma/alunos.length;
		return mediaTurma;
	}
	
	public boolean getIndiceAprovado() {
		for(int i=0; i<=alunos.length; i++) {
			if (alunos[i].calculaMediaAluno() >= 7) {
				return true;
			}	
		}
		return false;
	}

}

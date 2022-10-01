//Crie uma classe para representar uma pessoa, com os atributos privados de nome, ano de
//nascimento e altura. Crie os métodos públicos necessários para sets e gets e também um
//método para imprimir todos dados de uma pessoa. Crie um método para calcular a idade
//da pessoa.

package questao1;

import java.util.Date;

public class Pessoa {
	private String nome;
	private int anoNasc;
	private double altura;
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, int anoNasc, double altura) {
		this.nome = nome;
		this.anoNasc = anoNasc;
		this.altura = altura;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getAnoNasc() {
		return anoNasc;
	}
	
	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int calculaIdade() {
		int idade = 2022 - anoNasc;
		return idade;
	}
	
	public void imprimeDados() {
		System.out.println("===========DADOS===========");
		System.out.println("Nome: "+ this.nome + "\nAno de nascimento: " + this.anoNasc + "\nAltura: " + this.altura);
		System.out.println("===========IDADE===========");
		System.out.println("Idade: " + calculaIdade());
	}
	
	
	
}

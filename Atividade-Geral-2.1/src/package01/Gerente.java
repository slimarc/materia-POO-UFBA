package package01;

public class Gerente extends Funcionario{

    public Gerente(String nome, String matricula, double salario_base) {
        super(nome, matricula, salario_base);
    }

    @Override
    public double calculaSalario() {
        double salario_final;
        salario_final = salario_base * 2; 
        return salario_final;
    }
    
}

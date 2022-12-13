package package01;

public class Vendedor extends Funcionario{
    private double comissao;
    
    public Vendedor(String nome, String matricula, double salario_base, double comissao) {
        super(nome, matricula, salario_base);
        this.comissao = comissao;
    }

    @Override
    public double calculaSalario() {
        double salario_total;
        salario_total = salario_base + comissao;
        return salario_total;
    }
    
}

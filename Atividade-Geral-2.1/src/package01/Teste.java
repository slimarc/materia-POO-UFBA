package package01;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args){
        Gerente gerente = new Gerente("Alberto", "12457", 3500);
        Assistente assistente = new Assistente("Julio", "45784", 2700);
        Vendedor vendedor = new Vendedor("Mario", "3254", 1900, 500);
        
        List funcionarios = new ArrayList();
        
        funcionarios.add(gerente);
        funcionarios.add(assistente);
        funcionarios.add(vendedor);
        
        System.out.println("=========FOLHA SALARIAL=========\n");
        double folha_salarial = 0;

        for(int i=0; i<funcionarios.size(); i++){
            double salario = ((Funcionario) funcionarios.get(i)).calculaSalario();
            folha_salarial += salario;
            System.out.println("Nome: "+ ((Funcionario) funcionarios.get(i)).getNome());
            System.out.println("Matrícula: "+ ((Funcionario) funcionarios.get(i)).getMatricula());
            System.out.printf("Salário/mês: R$ %.2f\n", salario);
            System.out.println("--------------------------------");
        }
        System.out.printf("\nTotal: R$ %.2f", folha_salarial);
    }
}

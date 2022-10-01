import java.util.Scanner;

public class TestaMedico {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Medico medico =  new Medico();
		
		System.out.println("========FORMULÁRIO========");
		System.out.println("\nInsira dos dados do funcionário: ");
		
		
		medico.getCodigo();
		
		
		
		
		System.out.println("============DADOS FUNCIONÁRIO================");
		System.out.println("Cod func: " + medico.getCodigo() + "\nNome func: " + medico.getNome()
							+ "\nSalário: " + medico.getSalario() + "\nData de contratação: " + medico.getDataContratacao()
							+ "\nTempo de profissão: " + medico.getAnos() + "\nEspecialidade: " + medico.getEspecialidade()
							+ "\nCRM: " + medico.getCrm());
		
	}

}

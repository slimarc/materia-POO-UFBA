import java.util.Scanner;

public class TestaMedico {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Medico medico =  new Medico();

		medico.setCodigo(1323);
		medico.setNome("Ricardo");
		medico.setSalario(27.871);
		medico.setDataContratacao("12/08/2015");
		medico.setAnos(12);
		medico.setCrm(1541);
		medico.setEspecialidade("Otorrino");	

		System.out.println("============DADOS FUNCIONÁRIO================");
		System.out.println("Cod func: " + medico.getCodigo() + "\nNome func: " + medico.getNome()
							+ "\nSalário: " + medico.getSalario() + "\nData de contratação: " + medico.getDataContratacao()
							+ "\nTempo de profissão: " + medico.getAnos() + "\nEspecialidade: " + medico.getEspecialidade()
							+ "\nCRM: " + medico.getCrm());
		
	
	}

}

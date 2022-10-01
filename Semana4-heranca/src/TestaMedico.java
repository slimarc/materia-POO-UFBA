
public class TestaMedico {
	public static void main(String[] args) {
		Medico medico =  new Medico(1248, "Ricardo", 27.587, "16/08/2013", 12, "Otorrinolaringologista", 4574);
		
		System.out.println("============DADOS FUNCIONÁRIO================");
		System.out.println("Cod func: " + medico.getCodigo() + "\nNome func: " + medico.getNome()
							+ "\nSalário: " + medico.getSalario() + "\nData de contratação: " + medico.getDataContratacao()
							+ "\nTempo de profissão: " + medico.getAnos() + "\nEspecialidade: " + medico.getEspecialidade()
							+ "\nCRM: " + medico.getCrm());
		
	}

}

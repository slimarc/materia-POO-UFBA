package package01;

public class DiaDosNamorados extends CartaoWeb {

    public DiaDosNamorados(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Para: "+ destinatario);
        System.out.println("Feliz dia dos namorados! Eu te amo S2");
    }
    
}

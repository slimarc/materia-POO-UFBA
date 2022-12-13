package package01;

public class Aniversario extends CartaoWeb {

    public Aniversario(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Para: "+ destinatario);
        System.out.println("Feliz aniversário! Muita paz, saúde e felicidades.");
    }
    
}

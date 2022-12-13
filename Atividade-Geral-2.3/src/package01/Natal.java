package package01;

public class Natal extends CartaoWeb{

    public Natal(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Para: "+ destinatario);
        System.out.println("Feliz natal! hohoho");
    }
    
}

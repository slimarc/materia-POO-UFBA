package package01;

import java.util.LinkedList;

public class Teste {
    public static void main(String[] args){
        DiaDosNamorados dia_dos_namorados = new DiaDosNamorados("Sabrina");
        Natal natal = new Natal("Marcos");
        Aniversario aniversario = new Aniversario("Paula");

        LinkedList messages = new LinkedList<>();
        messages.add(dia_dos_namorados);
        messages.add(natal);
        messages.add(aniversario);

        for(int i =0; i<messages.size(); i++){
            System.out.println("\n=================================");
            ((CartaoWeb) messages.get(i)).showMessage();
            System.out.println("=================================\n");
        }

    }
}

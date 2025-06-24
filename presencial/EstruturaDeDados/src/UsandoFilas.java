import java.util.LinkedList;

public class UsandoFilas {
    public static void main(String[] args) {
        LinkedList< String > fila = new LinkedList<>();

        fila.add("Erechim");
        fila.add("Passo Fundo");
        fila.add("Sertão");

        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());


    }
}

import java.util.ArrayList;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Arrays;

public class UsandoForEach {
    public static void main(String[] args) {
        String [] cidades = {"Erechim", "Getúlio Vargas", "Estação", "Passo Fundo", "Sertão"};
        System.out.println("Array:");
        for (String item : cidades) {
            System.out.println(item);
        }
        System.out.println();

        System.out.println("Lista:");
        ArrayList < String > lista = new ArrayList<>(Arrays.asList(cidades));
        for (String item : lista) {
            System.out.println(item);
        }
        System.out.println();

        System.out.println("Fila:");
        LinkedList< String > fila = new LinkedList<>(Arrays.asList(cidades));
        for (String item : fila) {
            System.out.println(item);
        }
        System.out.println();

        System.out.println("Pilha:");
        Stack < String > pilha = new Stack<>();
        pilha.addAll(lista);
        for (String item : pilha) {
            System.out.println(item);
        }
        System.out.println();


    }
}

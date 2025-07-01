import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Exercicio4 {
    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> listaImpares = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            lista.add(leitor.nextInt());
        }

        for (int i = lista.size() - 1; i >= 0; i--) {
            int num = lista.get(i);
            if (num % 2 != 0) {
                listaImpares.add(num);
                lista.remove(i);
            }
        }

        System.out.println("\nLista impares");
        for (int i : listaImpares) {
            System.out.println(i);
        }

    }
}

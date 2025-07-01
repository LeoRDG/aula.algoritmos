import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {
    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            lista.add(leitor.nextInt());
        }
    }
}

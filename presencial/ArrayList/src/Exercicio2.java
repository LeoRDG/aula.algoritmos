import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {
    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        
        for (int i = 0; i < 30; i++) {
            lista.add(leitor.nextInt());
        }

        System.out.print("Indíces com números impares: ");
        for (int i = 0; i < lista.size(); i++) {
            int num = lista.get(i);
            if (num % 2 != 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }
}

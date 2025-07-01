import java.util.Scanner;
import java.util.Stack;

public class Ex5 {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        int numero = leitor.nextInt();

        while (numero / 2 > 0) {
            pilha.push(numero % 2);
            numero /= 2;
        }

        String bin = numero == 0 ? "0" : "1";
        while (!pilha.isEmpty()) {
            bin += pilha.pop();
        }
        System.out.println(bin);
    }
}

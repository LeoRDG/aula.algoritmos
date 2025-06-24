import java.util.Stack;
import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        Stack<Integer> numeros = new Stack<>();
        Scanner leitor = new Scanner(System.in);

        int num = leitor.nextInt();
        for (int i = 1; i < num; i++) {
            int item = leitor.nextInt();
            if (item == 0) {
                numeros.pop();
            } else {
                numeros.push(item);
            }
        }

        int soma = 0;
        while (!numeros.empty()) {
            soma += numeros.pop();
        }
        System.out.println(soma);
    }
}

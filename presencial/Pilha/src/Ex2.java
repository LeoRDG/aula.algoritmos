import java.util.Scanner;
import java.util.Stack;

public class Ex2 {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        Stack<Integer> pilhaPar = new Stack<>();
        Stack<Integer> pilhaImpar = new Stack<>();

        for (int i = 0; i < 30; i++) {
            pilha.push(leitor.nextInt());
        }

        while (!pilha.isEmpty()){
            int num = pilha.pop();
            if (num % 2 == 0){
                pilhaPar.push(num);
            } else {
                pilhaImpar.push(num);
            }
        }
    }
}

import java.util.Scanner;
import java.util.Stack;

public class Ex1 {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        for (int i = 0; i < 20; i++) {
            pilha.push(leitor.nextInt());
        }

        while (!pilha.isEmpty()){
            System.out.println(pilha.pop());
        }

    }
}

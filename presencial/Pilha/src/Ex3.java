import java.util.Scanner;
import java.util.Stack;

public class Ex3 {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        Stack<Integer> pilhaParNegativo = new Stack<>();
        Stack<Integer> pilhaImparPositivo = new Stack<>();

        for (int i = 0; i < 25; i++) {
            pilha.push(leitor.nextInt());
        }

        while (!pilha.isEmpty()){
            int num = pilha.pop();
            if (num % 2 == 0 && num < 0){
                pilhaParNegativo.push(num);
            } else if (num % 2 == 1) {
                pilhaImparPositivo.push(num);
            }
        }

        System.out.println("Par e negativo");
        for (int i : pilhaParNegativo) {
            System.out.println(i);
        }
        System.out.println("Impar e positivo");
        for (int i : pilhaImparPositivo) {
            System.out.println(i);
        }

    }
}

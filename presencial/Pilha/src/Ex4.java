import java.util.Scanner;
import java.util.Stack;

public class Ex4 {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        Stack<Character> pilha = new Stack<>();

        String string = leitor.next();

        for (char i : string.toCharArray()){
            pilha.push(i);
        }

        String novaString = "";

        while(!pilha.isEmpty()) {
            novaString += pilha.pop();
        }

        System.out.println(novaString);
    }
}

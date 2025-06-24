import java.util.Stack;

public class UsandoPilhas {
    public static void main(String[] args) {
        Stack< String > pilha = new Stack<>();

        pilha.push("Erechim");
        pilha.push("Passo Fundo");
        pilha.push("Sertão");
        pilha.push("Getúlio Vargas");
        pilha.push("Estação");

        while (!pilha.empty()) {
            System.out.println(pilha.pop());
        }

//        System.out.println(pilha.peek());
//        System.out.println(pilha.pop());
//        System.out.println(pilha.pop());
//        System.out.println(pilha.pop());
//        System.out.println(pilha.pop());
//        System.out.println(pilha.pop());
    }
}

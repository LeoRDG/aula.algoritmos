import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        double valor;
        Scanner leitor = new Scanner(System.in);

        while ((valor = leitor.nextDouble()) != 0){
            System.out.println(1.0 / valor);
        }
    }
}

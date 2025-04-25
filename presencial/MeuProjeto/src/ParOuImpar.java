import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int valor = leitor.nextInt();
        int resto = valor % 2;

        if (resto == 0) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número é impar");
        }
    }
}

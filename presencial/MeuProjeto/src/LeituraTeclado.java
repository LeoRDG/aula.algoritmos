import java.util.Scanner;

public class LeituraTeclado {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("\nDigite o primeiro valor: ");
        int valor1 = leitor.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = leitor.nextInt();
        int soma = valor1 + valor2;

        System.out.println("A soma foi: " + (valor1 + valor2));
        System.out.println("Programa encerrado.");
        System.out.println(" ");

    }
}

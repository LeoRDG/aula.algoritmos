import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("\nDigite a quantidade de carnes (kg): ");
        double quantidade = leitor.nextDouble();

        System.out.print("Digite o valor pago: ");
        double valor = leitor.nextDouble();

        double valorKilo = valor / quantidade;

        System.out.println("O valor pelo kilo da carne é de R$" + valorKilo);

        System.out.println();
    }
}

//15

package src;
import java.util.Scanner;

public class Vanicleia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual a area total do apartamento (m²): ");
        double area = leitor.nextDouble();

        System.out.print("Qual o preço da lata de tinta (R$): ");
        double preco = leitor.nextDouble();

        System.out.print("Qual o rendimento da lata de tinta (m²): ");
        double rendimento = leitor.nextDouble();

        int latas = (int) Math.ceil(area / rendimento);
        double precoTotal = latas * preco;

        System.out.println("Ela precisará de " + latas + " latas e gastará " + precoTotal + "R$\n");
    }
}

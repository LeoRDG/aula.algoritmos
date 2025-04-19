//19

package src;
import java.util.Scanner;

public class BisextoSimples {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = leitor.nextInt();

        if (ano % 4 == 0) {
            System.out.println("O ano " + ano + " é bisexto");
        } else {
            System.out.println("O ano " + ano + " não é bisexto");
        }
    }
}

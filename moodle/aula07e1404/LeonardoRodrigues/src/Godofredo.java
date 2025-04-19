//16

package src;
import java.util.Scanner;

public class Godofredo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual o N de pessoas ajudadas: ");
        int numeroPessoas = leitor.nextInt();

        int dias = 10;

        long totalCorrente = (long)( numeroPessoas * ( Math.pow( numeroPessoas, dias ) - 1 ) ) / ( numeroPessoas - 1 );
        System.out.println("Um total de " + totalCorrente + " pessoas serão ajudadas");
    }
}

//22

package src;
import java.util.Scanner;

public class ABCD {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite quatro valores inteiros: ");

        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        int d = leitor.nextInt();

        if (( b > c ) && ( d > a ) && (( c + d ) > ( a + b )) && ( c > 0 ) && ( d > 0 ) && ( a % 2 == 0 )) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores não aceitos\n");
        }
    }
}

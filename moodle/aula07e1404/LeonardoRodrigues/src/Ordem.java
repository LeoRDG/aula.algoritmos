//26

package src;
import java.util.Scanner;

public class Ordem {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite tres valores inteiros: ");

        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();

        int primeiro, segundo, terceiro;

        if (a < b) {
            if      ( b < c ) { primeiro = a; segundo = b; terceiro = c; } // a b c
            else if ( c < a ) { primeiro = c; segundo = a; terceiro = b; } // c a b
            else              { primeiro = a; segundo = c; terceiro = b; } // a c b
        }
        else {
            if      ( c > a ) { primeiro = b; segundo = a; terceiro = c; } // b a c
            else if ( c > b ) { primeiro = b; segundo = c; terceiro = a; } // b c a
            else              { primeiro = c; segundo = b; terceiro = a; } // c b a
        }

        System.out.println( primeiro + " " + segundo +  " " + terceiro );
    }
}

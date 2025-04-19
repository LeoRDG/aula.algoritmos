//27

package src;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite tres valores inteiros: ");

        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();

        int terceiro, segundo, primeiro;

        if (a < b) {
            if      ( b < c ) {terceiro = a; segundo = b; primeiro = c;} // a b c
            else if ( c < a ) {terceiro = c; segundo = a; primeiro = b;} // c a b
            else              {terceiro = a; segundo = c; primeiro = b;} // a c b
        }
        else {
            if      ( c > a ) {terceiro = b; segundo = a; primeiro = c;} // b a c
            else if ( c > b ) {terceiro = b; segundo = c; primeiro = a;} // b c a
            else              {terceiro = c; segundo = b; primeiro = a;} // c b a
        }

        a = primeiro;
        b = segundo;
        c = terceiro;

        if ( a >= ( b + c ) ) {
            System.out.println("não é um triângulo");
        } else {
            double teste = a - ( Math.sqrt ( Math.pow( b, 2 ) + Math.pow( c, 2 ) ) );

            if (teste < 0){
                System.out.println("é 𝑢𝑚 𝑡𝑟𝑖â𝑛𝑔𝑢𝑙𝑜 𝑎𝑐𝑢𝑡â𝑛𝑔𝑢𝑙𝑜");
            } else if (teste > 0) {
                System.out.println("é 𝑢𝑚 𝑡𝑟𝑖â𝑛𝑔𝑢𝑙𝑜 obstusângulo");
            } else {
                System.out.println("é 𝑢𝑚 𝑡𝑟𝑖â𝑛𝑔𝑢𝑙𝑜 retângulo");
            }
        }
    }
}

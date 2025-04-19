//25

package src;

import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite dois valores reais: ");
        double x = leitor.nextDouble();
        double y = leitor.nextDouble();

        if ( x > 0 ) {
            if ( y > 0 ) {
                System.out.println("1º Quadrante");
            } else if ( y < 0 ) {
                System.out.println("4º Quadrante");
            } else {
                System.out.println("Eixo x");
            }

        } else if ( x < 0 ) {
            if ( y > 0 ) {
                System.out.println("2º Quadrante");
            } else if ( y < 0 ) {
                System.out.println("3º Quadrante");
            } else {
                System.out.println("eixo x");
            }

        } else {
            if ( y == 0 ) {
                System.out.println("origem");
            } else {
                System.out.println("eixo Y");
            }
        }
    }
}

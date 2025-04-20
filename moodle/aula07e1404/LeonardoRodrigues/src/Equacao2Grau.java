//23

import java.util.Scanner;

public class Equacao2Grau {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite tres valores reais: ");

        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        double c = leitor.nextDouble();

        // Se o valor de A for zero
        if ( a == 0 ) {
            System.out.println("Não é uma equação do 2º grau\n");
            System.exit(0);
        }

        // Se o valor de B ou C for zero
        if ( c == 0 || b == 0 ) {
            System.out.println("Equação Incompleta");
        } else {
            System.out.println("Equação Completa");
        }

        double delta = Math.pow( b, 2 ) - 4 * a * c;
        System.out.println("delta = " + delta + '\n');

        // Se o delta for zero
        if ( delta == 0 ) {
            System.out.println("Ha uma raiz real para a equacao");
            double raiz = -b / ( 2 * a );
            System.out.println("raiz = " + raiz);

        // Se o delta for positivo
        } else if (delta > 0){
            System.out.println("Ha duas raízes reais para a equacao");
            double raiz1 = ( -b + Math.sqrt( delta ) ) / ( 2 * a );
            double raiz2 = ( -b - Math.sqrt( delta ) ) / ( 2 * a );

            System.out.println("raiz1 = " + raiz1);
            System.out.println("raiz2 = " + raiz2);

        // Se o delta for negativo
        } else {
            System.out.println("Nao ha raízes reais para a equacao\n");
        }
    }
}

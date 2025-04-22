import java.util.Scanner;

public class E25 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite dois valores reais: ");
        double x = leitor.nextDouble();
        double y = leitor.nextDouble();

        String resultado = "eixo X";

        if ( x > 0 ) {
            if      ( y > 0 ) { resultado = "1º Quadrante"; }
            else if ( y < 0 ) { resultado = "4º Quadrante"; }

        } else if ( x < 0 ) {
            if      ( y > 0 ) { resultado = "2º Quadrante"; }
            else if ( y < 0 ) { resultado = "3º Quadrante"; }

        } else {
            resultado = (y == 0) ? "origem" : "eixo Y";
        }

        System.out.println(resultado);
    }
}

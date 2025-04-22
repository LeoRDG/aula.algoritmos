import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        System.out.println("_____________________________________________________________________________");
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a distancia (km): ");
        double distanciaTotal = leitor.nextDouble();

        System.out.print("Digite a velocidade média (km/h): ");
        double velocidade = leitor.nextDouble();

        System.out.print("Digite o tempo percorrido (min): ");
        double tempoPercorrido = leitor.nextDouble()/60;

        double tempoTotal          = distanciaTotal  / velocidade;
        double distanciaPercorrida = tempoPercorrido * velocidade;
        double distanciaRestante   = distanciaTotal  - distanciaPercorrida;
        double tempoRestante       = tempoTotal      - tempoPercorrido;

        System.out.println("Já foram percorridos "      + distanciaPercorrida +
                           "km e ainda restam "         + distanciaRestante   +
                           "km a serem percorridos em " + tempoRestante       +
                           "h, totalizando "            + tempoTotal          + "h");

        System.out.println("_____________________________________________________________________________\n");
    }
}

//14

import java.util.Scanner;

public class AlturaPredio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double alturaTeodolito = 1.7;

        System.out.print("Qual a distância entre o teodolito e o prédio (metros): ");
        double distancia = leitor.nextDouble();

        System.out.print("Qual o angulo observado (graus): ");
        double angulo = Math.toRadians(leitor.nextDouble());

        double hipotenusa = distancia / Math.cos( angulo );
        double alturaPredio = Math.sqrt( Math.pow( hipotenusa, 2 ) - Math.pow( distancia, 2 )) + alturaTeodolito;

        System.out.println("A altura do prédio é: " + alturaPredio);
    }
}

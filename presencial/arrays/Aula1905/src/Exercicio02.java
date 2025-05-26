package src;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        final int TAMANHO = 4;

        double [][] matriz = new double[TAMANHO][3];

//        double[] numeros1 = new double[TAMANHO];
//        double[] numeros2 = new double[TAMANHO];
          double[] numerosResultado = new double[TAMANHO];


        for (int i = 0; i < TAMANHO; i++){
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = leitor.nextDouble();
            }
            matriz[i][2] = matriz[i][0] * matriz[i][1];
            numerosResultado[i] = matriz[i][0] * matriz[i][1];

//            System.out.println( i + "º elementos dos dos veitores");
//            numeros1[i] = leitor.nextDouble();
//            numeros2[i] = leitor.nextDouble();
//            numerosResultado[i] = numeros1[i] * numeros2[i];
        }

        for (double[] i : matriz) {
            System.out.printf("%-5.1f * %-5.1f %-5.1f\n", i[0], i[1], i[2]);
        }

        for (double i : numerosResultado){
            System.out.printf("%-5.1f\n", i);
        }

    }
}


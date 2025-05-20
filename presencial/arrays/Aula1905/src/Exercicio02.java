package src;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double[] numeros1 = new double[10];
        double[] numeros2 = new double[10];
        double[] numerosResultado = new double[10];


        for (int i = 0; i < numeros1.length; i++){
            numeros1[i] = Math.random()*100; //leitor.nextDouble();
            numeros2[i] = Math.random()*100; //leitor.nextDouble();
            numerosResultado[i] = numeros1[i] * numeros2[i];
        }

        for (int i = 0; i < numeros1.length; i++){
            System.out.printf("%-5.1f * %-5.1f %-5.1f\n", numeros1[i], numeros2[i], numerosResultado[i]);
        }

    }
}


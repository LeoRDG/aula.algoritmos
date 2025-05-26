package src;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double[] numeros = new double[100];

        for (int i =0; i<numeros.length; i++){
            numeros[i] = leitor.nextDouble();//Math.random()*100;
        }

        for (double num : numeros) {
            System.out.printf("Quadrado de %4.1f é: %-7.1f\n", num, Math.pow(num, 2));
            System.out.printf("Cubo de %4.1f é: %-7.1f\n\n", num, Math.pow(num, 3));
        }
    }
}

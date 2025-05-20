package src;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetorA = new int[6];

        for (int i = 0; i < vetorA.length; i ++) {
            vetorA[i] = leitor.nextInt();
        }

        int soma = vetorA[0] + vetorA[1] +vetorA[2];

                System.out.println("b) Soma A[0] A[1] e A[5]: ");

    }
}


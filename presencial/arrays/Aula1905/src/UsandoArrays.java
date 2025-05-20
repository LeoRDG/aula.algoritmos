package src;

import java.util.Scanner;

public class UsandoArrays {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[10];

        for(int i=0; i < vetor.length; i++){
            System.out.print("Digite o elemento " + i + " do array: ");
            vetor[i] = leitor.nextInt();
        }
        int soma = 0;
        for (int i : vetor) {
            soma += i;
        }

        System.out.println("Soma dos elementos: " + soma);
        System.out.println("Média dos elementos: " + (double) soma/vetor.length);
    }
}

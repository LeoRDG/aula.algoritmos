//Ler 100 numeros entre 1 e 10 e contar quantos tem em cada valor no intervalo 1 e 10

package src;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[10];
        int[] contagem = new int[10];

        for (int i = 0; i < contagem.length; i++) {
            contagem[i] = 0;
        }

        for(int i = 0; i < numeros.length; i++) {
            int num = leitor.nextInt();
            numeros[i] = num;
            contagem[num-1] += 1;
        }

        for (int i = 0; i < contagem.length; i++) {
            System.out.println(i+1 + ": " + contagem[i]);
        }
    }
}


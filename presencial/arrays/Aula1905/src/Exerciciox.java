// Na megasena sao sempre sorteados 6 numeros. Alfredo aposta 1 cartao com 7 dezenas.
// Faça um programa que conte o numero de acertos de Alfredo

package src;

import java.util.Scanner;

public class Exerciciox {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] numerosSorteados = new int[6];
        int[] numerosCartao = new int[7];

        System.out.println("Digite os números da MegaSena: ");
        for (int i = 0; i < numerosSorteados.length; i++) {
            numerosSorteados[i] = leitor.nextInt();
        }

        System.out.println("Digite os números do cartão de Alfredo: ");
        for (int i = 0; i < numerosCartao.length; i++) {
            numerosCartao[i] = leitor.nextInt();
        }

        int acertos = 0;
        for (int numC : numerosCartao) {
            for (int numS : numerosSorteados){
                if (numC == numS) {
                    acertos++;
                    break;
                }
            }
        }

        System.out.println(acertos + " acertos");
    }
}


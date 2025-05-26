//Ler 10 inteiros e salvar em um array, infomar se há duplicatas no array

package src;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[10];

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = leitor.nextInt();
        }

        int i, j;
        for(i = 0; i < numeros.length-1; i++) {
            for(j = i+1; j < numeros.length; j ++) {
                if (numeros[i] == numeros[j]){
                    break;
                }
            }
            if (j < numeros.length){
                break;
            }
        }

        if (i < numeros.length - 1) {
            System.out.println("Há duplicatas");
        }else{
            System.out.println("Não há duplicatas");
        }
    }
}


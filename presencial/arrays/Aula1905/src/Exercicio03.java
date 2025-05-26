package src;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite o número " + i);
            numeros[i] =  leitor.nextInt();
//            numeros[i] = (int) Math.floor(Math.random()*10); // leitor.nextInt();
        }

        System.out.println("Digite o número para verificar: ");
        int numVerificar = leitor.nextInt();

        boolean presente = false;
        int i;
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] == numVerificar) {
                presente = true;
                break;
            }
        }

        if (i < numeros.length) {
            System.out.println("Número " + numeros[i] + " presente no indice " + i);
        }
        else {
            System.out.println("Número não presente");
        }

        if (presente) {
            System.out.println("Número " + numeros[i] + " presente no indice " + i);
        } else {
            System.out.println("Número não presente");
        }

    }
}

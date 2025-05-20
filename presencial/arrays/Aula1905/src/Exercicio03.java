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
        for (int num : numeros) {
            if (num == numVerificar) {
                presente = true;
            }
        }

        if (presente) {
            System.out.println("Número presente");
        } else {
            System.out.println("Número não presente");
        }

    }
}


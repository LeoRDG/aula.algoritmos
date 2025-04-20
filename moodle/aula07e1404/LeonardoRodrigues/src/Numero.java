//28

import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = leitor.nextInt();

        String resultado = "O número é ";

        boolean positivo = num > 0;
        boolean par = num % 2 == 0;

        if ( num == 0 ) {
            resultado += "zero";
        } else {
            resultado += positivo ? "positivo" : "negativo";
            resultado += par ? " e par" : " e impar";
        }

        System.out.println(resultado);
    }
}

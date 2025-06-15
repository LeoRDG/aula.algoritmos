/*
Em Java, implemente um método com a seguinte assinatura:
public static void imprimirLinhaDecor(int quantidade, char caractere)
O método deve:
● Imprimir uma linha com o caractere informado, repetido pela quantidade informada.
● Exemplo: imprimirLinhaDecor(5, '*') deve imprimir *****
* */

public class Exercicio6 {
    public static void main(String[] args) {
        imprimirLinhaDecor(15, '*');
    }

    public static void imprimirLinhaDecor(int quantidade, char caractere) {
        String string = "" + caractere;

        System.out.println( string.repeat(quantidade) );
    }

}




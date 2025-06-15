/*
Em Java, implemente um método com a seguinte assinatura:
public static boolean ehPar(int numero)
O método deve:
● Retornar true se o número for par.
● Retornar false se o número for ímpar.
● Exemplos: ehPar(4) deve retornar true.
ehPar(7) deve retornar false.
* */

public class Exercicio5 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(ehPar(i));
        }
    }

    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

}




/*
Em Java, implemente um método com a seguinte assinatura:
public static String numeroPorExtenso(int numero)
O método deve:
● Retornar o número por extenso (ex: 1 → "um", 2 → "dois", ..., 20 → "vinte").
● Retornar "inválido" se o número for menor que 1 ou maior que 20.
* */

public class Exercicio1 {
    static String[] numeros = {"um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez",
            "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove", "vinte"};

    public static void main(String[] args) {
        System.out.println(numeroPorExtenso(15));
    }

    public static String numeroPorExtenso(int numero) {
        if (numero > 20 || numero < 1) {
            return "Inválido";
        }
        return numeros[numero - 1];
    }

}




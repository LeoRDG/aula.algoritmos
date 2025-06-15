/*
Em Java, implemente um método com a seguinte assinatura:
public static String numeroPorExtenso(int numero)
O método deve:
● Retornar o número por extenso para valores entre 1 e 99. (Ex.: 21 → "vinte e um", 42 →
"quarenta e dois")
● Retornar a string "inválido" caso o número seja menor que 1 ou maior que 99.
* */

public class Exercicio2 {
    static String[] numeros = {"um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez",
            "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};

    static String[] dezenas = {"vinte", "trinta", "quarenta", "cinquenta",
            "sessenta", "setenta", "oitenta", "noventa"};

    public static void main(String[] args) {
        System.out.println(numeroPorExtenso(2));
        System.out.println(numeroPorExtenso(52));
        System.out.println(numeroPorExtenso(12));
        System.out.println(numeroPorExtenso(99));
    }

    public static String numeroPorExtenso(int numero) {
        if (numero > 99 || numero < 1) {
            return "Inválido";
        }

        if (numero >= 20) {
            if (numero % 10 == 0) {
                return dezenas[numero/10-2];
            }
            return dezenas[numero/10-2] + " e " + numeroPorExtenso(numero - numero/10*10);
        }

        return numeros[numero - 1];
    }

}




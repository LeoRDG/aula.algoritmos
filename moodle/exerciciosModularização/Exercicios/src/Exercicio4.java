/*
Em Java, implemente um método com a seguinte assinatura:
public static String numeroPorExtenso(int numero)
O método deve:
● Retornar o número por extenso para valores entre 1 e 99.999. (Exemplo: 12345 → "doze mil
trezentos e quarenta e cinco").
● Retornar a string "inválido" caso o número seja menor que 1 ou maior que 99.999.
* */

public class Exercicio4 {
    static String[] numeros = {"um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez",
            "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};

    static String[] dezenas = {"vinte", "trinta", "quarenta", "cinquenta",
            "sessenta", "setenta", "oitenta", "noventa"};

    static String[] centenas = {"cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos",
            "setecentos", "oitocentos", "novecentos"};

    public static void main(String[] args) {
        System.out.println( numeroPorExtenso(12000) );
        System.out.println( numeroPorExtenso(10001) );
        System.out.println( numeroPorExtenso(90307) );
        System.out.println( numeroPorExtenso(22400) );
        System.out.println( numeroPorExtenso(39010) );
        System.out.println( numeroPorExtenso(99999) );
        System.out.println( numeroPorExtenso(10100) );
        System.out.println( numeroPorExtenso(10111) );
    }

    public static String numeroPorExtenso(int numero) {
        if (numero > 99999 || numero < 1) {
            return "Inválido";
        }

        if (numero >= 1000) {
            int mil = numero / 1000;
            int cen = numero - mil * 1000;

            if (numero % 1000 == 0) {
                return numeroPorExtenso(mil) + " mil";
            }

            if (cen % 100 == 0 || cen < 100)
                return numeroPorExtenso(mil) + " mil e " + numeroPorExtenso(cen);

            return numeroPorExtenso(mil) + " mil " + numeroPorExtenso(cen);
        }

        if (numero >= 100) {
            if (numero == 100) {
                return "cem";
            }

            if (numero % 100 == 0) {
                return centenas[numero / 100 - 1];
            }
            return centenas[numero / 100 - 1] + " e " + numeroPorExtenso(numero - numero / 100 * 100);
        }

        if (numero >= 20) {
            if (numero % 10 == 0) {
                return dezenas[numero / 10 - 2];
            }
            return dezenas[numero / 10 - 2] + " e " + numeroPorExtenso(numero - numero / 10 * 10);
        }

        return numeros[numero - 1];
    }

}




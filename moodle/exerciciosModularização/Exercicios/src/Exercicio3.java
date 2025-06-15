/*
Em Java, implemente um método com a seguinte assinatura:
public static String numeroPorExtenso(int numero)
O método deve:
● Retornar o número por extenso para valores entre 1 e 999. (Exemplo: 305 → "trezentos e
cinco", 720 → "setecentos e vinte").
● Retornar a string "inválido" caso o número seja menor que 1 ou maior que 999
* */

public class Exercicio3 {
    static String[] numeros = {"um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez",
            "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};

    static String[] dezenas = {"vinte", "trinta", "quarenta", "cinquenta",
            "sessenta", "setenta", "oitenta", "noventa"};

    static String[] centenas = {"cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seicentos",
            "setecentos", "oitocentos", "novecentos"};

    public static void main(String[] args) {
        System.out.println((numeroPorExtenso(199)));
        System.out.println((numeroPorExtenso(401)));
        System.out.println((numeroPorExtenso(212)));
        System.out.println((numeroPorExtenso(740)));
        System.out.println((numeroPorExtenso(800)));
    }

    public static String numeroPorExtenso(int numero) {
        if (numero > 999 || numero < 1) {
            return "Inválido";
        }

        if (numero >= 100){
            if (numero % 100 == 0) {
                return centenas[numero/100-1];
            }
            return centenas[numero/100-1] + " e " + numeroPorExtenso(numero - numero/100*100);
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




import java.lang.reflect.Array;
import java.util.Arrays;

public class Busca {
    public static void main(String[] args) {
        System.out.println(BuscaBinaria(nomes_ord, 0, nomes_ord.length, "Leandro"));
        Arrays.sort(nomes);
        System.out.println(Arrays.binarySearch(nomes, "Leandro"));
    }

    static String[] nomes = {"Ana", "João", "Clara", "Miguel", "Laura", "Pedro", "Sofia", "Lucas", "Beatriz",
            "Rafael", "Mariana", "Gabriel", "Helena", "Felipe", "Camila", "Daniel", "Isabela", "Guilherme", "Letícia",
            "Bruno", "Amanda", "Thiago", "Vitória", "Henrique", "Júlia", "Vinícius", "Elisa", "Rodrigo", "Manuela",
            "Eduardo", "Yasmin", "André", "Bianca", "Samuel", "Nicole", "Caio", "Gabriela", "Leandro", "Alice", "Diego"};

    static String[] nomes_ord = {"Alice", "Amanda", "Ana", "André", "Beatriz", "Bianca", "Bruno", "Caio",
            "Camila", "Clara", "Daniel", "Diego", "Eduardo", "Elisa", "Felipe", "Gabriel", "Gabriela",
            "Guilherme", "Helena", "Henrique", "Isabela", "Júlia", "João", "Laura", "Leandro", "Letícia",
            "Lucas", "Manuela", "Mariana", "Miguel", "Nicole", "Pedro", "Rafael", "Rodrigo", "Samuel", "Sofia",
            "Thiago", "Vinícius", "Vitória", "Yasmin"};

    public static int BuscaLinear(String[] conjunto, String chave){
        int i=0;
        while( i < conjunto.length && !chave.equals(conjunto[i])) {
            i++;
        }
        if (i == conjunto.length) {
            return -1;
        } else {
            return i;
        }
    }

    public static int BuscaBinaria(String[] conjunto, int inicio, int fim, String chave){
        int pivo = (inicio + fim) / 2;
        int comp = conjunto[pivo].compareTo(chave);

        if (inicio > fim) {
            return -1;
        }

        if (comp == 0) {
            return pivo;
        } else if (comp < 0) {
            return BuscaBinaria(conjunto, pivo + 1, fim, chave);
        } else {
            return BuscaBinaria(conjunto, inicio, pivo - 1, chave);
        }


    }

}


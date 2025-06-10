// Função recursiva que calcula a mult de 2 numeros inteiros

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println(mult_rec(7, 4));
        System.out.println(mult_it(7, 4));
    }

    public static int mult_it(int a, int b){
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }

    public static int mult_rec(int a, int b){
        if (b > 0){
            return a + mult_rec(a, b-1);
        } else {
            return 0;
        }
    }

}

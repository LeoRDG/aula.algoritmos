//Funcçao recursiva para calcular a divisao inteira de 2 numeros naturais

public class Exercicio02 {
    public static void main(String[] args) {
        System.out.println(div2(3, 5));
        System.out.println(div2(5, 3));
        System.out.println(div2(0, 5));
        System.out.println(div2(9, 3));
        System.out.println(div2(9, 0));
    }

    public static int div2(int a, int b){
        if (a < b) {
            return 0; }
        return 1 + div2(a - b, b);
    }
}

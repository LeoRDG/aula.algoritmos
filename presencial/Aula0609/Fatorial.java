public class Fatorial {
    public static void main(String[] args) {
        System.out.println(fatorial_it(9));
        System.out.println(fatorial_rec(9));

        System.out.println(potencia_it(2, 5));
        System.out.println(potencia_rec(2, 5));
    }

    public static int fatorial_it(int n){
        int result = 1;
        for (int i = n; i > 1; i--) {
//            System.out.println("Result: " + result + " x " + i);
            result *= i;
        }
        return result;
    }

    public static int fatorial_rec(int n){
//        System.out.println("Invocando fatorial para " + n);
        if (n > 1){
            int result = fatorial_rec(n-1);
            return n * result;
        } else {
            return 1;
        }

    }

    public static int potencia_it(int base, int expoente){
        int result = 1;
        for (int i = expoente; i > 0; i--){
            result = base* result;
        }
        return result;
    }

    public static int potencia_rec(int base, int expoente){
        if (expoente > 0) {
            return base * potencia_rec(base, expoente-1);
        } else {
            return 1;
        }
    }

}

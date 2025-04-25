public class Logaritmos {
    public static void main(String[] args) {
        System.out.println(Math.log10( 100 ));
        System.out.println(Math.log10( 1_000_000 ));
        System.out.println(Math.log10( 2 ));
        System.out.println(Math.log10( 3 ));

        System.out.println(Math.log( 2 ));
        System.out.println(Math.log( 10 ));
        System.out.println(Math.log( Math.E ));

        System.out.println(Math.log10( 1024 )/Math.log10( 2 ));
        System.out.println(Math.log10( 243 )/Math.log10( 3 ));

        System.out.println(Math.log( 1024 )/Math.log( 2 ));
        System.out.println(Math.log( 243 )/Math.log( 3 ));

        System.out.println(Math.toRadians(180));
    }
}

import java.util.Scanner;

public class E30 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Nota do trabalho de laboratório: ");
        double notaLab = Math.min( 10, leitor.nextDouble() );
        notaLab = Math.max( 0, notaLab );

        System.out.print("Nota da avaliação semestral: ");
        double notaSem = Math.min( 10, leitor.nextDouble() );
        notaSem = Math.max( 0, notaSem );

        System.out.print("Nota do exame final: ");
        double notaFin = Math.min( 10, leitor.nextDouble() );
        notaFin = Math.max( 0, notaFin );

        int pesoLab = 2; int pesoSem = 3; int pesoFin = 5;

        double notaTotal = (( notaLab * pesoLab ) + ( notaSem * pesoSem ) + ( notaFin * pesoFin )) /
                            ( pesoLab + pesoSem + pesoFin );

        String resultado = "A média ponderada é " + notaTotal + ". Conceito final: ";
        
        if ( notaTotal >= 9) {
            resultado += "A";
        } else if ( notaTotal >= 7.5 ) {
            resultado += "B";
        } else if ( notaTotal >= 5 ) {
            resultado += "C";
        } else if ( notaTotal >= 3 ) {
            resultado += "D";
        } else {
            resultado += "E";
        }

        System.out.println(resultado);
    }
}

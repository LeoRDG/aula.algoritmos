package src;

import java.util.Arrays;
import java.util.Scanner;

public class DiarioNotas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] alunos = new String[5];
        double[][] notas = new double[5][3];


        for (int aluno = 0; aluno < alunos.length; aluno++) {
            System.out.print("Nome do aluno " + aluno + ": ");
            alunos[aluno] = leitor.nextLine();
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas do estudante " + alunos[i]);

            for (int nota = 0; nota < notas[i].length; nota++) {
                System.out.print("*** nota " + nota + ": ");
                notas[i][nota] = leitor.nextDouble();
            }
        }

        //  CALCULO DA MEDIA POR ESTUDANTES
        double[] medias_alunos = new double[5];
        for (int aluno = 0; aluno < notas.length; aluno++) {
            double media = 0;
            for (int nota = 0; nota < notas[aluno].length; nota++) {
                media += notas[aluno][nota];
            }
            media = media / notas[aluno].length;
            medias_alunos[aluno] = media;
        }

        // CALCULO DA MEDIA POR NOTAS
        double[] media_avaliacao = new double[3];

        for (int nota = 0; nota < media_avaliacao.length; nota++) {
            double media = 0;
            for (double[] doubles : notas) {
                media += doubles[nota];
            }
            media = media / alunos.length;
            media_avaliacao[nota] = media;
        }

        String notas_string = "";
        for (int i = 0; i < notas[0].length; i++){
            notas_string += String.format("Nota %2d\t|", i);
        }

        System.out.printf("%-20s\t|%s %s\n", "Nome do aluno", notas_string,"Média");
        System.out.println("_______________________________________________________________________");
        for (int i = 0; i < alunos.length; i++){
            String aluno = alunos[i];
            String notas_aluno = "";
            double media_aluno = medias_alunos[i];

            for (double nota : notas[i]){
                notas_aluno += String.format("%7.1f\t|", nota);
            }

            System.out.printf("%-20s\t|%s %7.1f\n", aluno, notas_aluno, media_aluno);

        }
        System.out.println("_______________________________________________________________________");

        double media_medias = 0;
        for (double i : media_avaliacao){
            media_medias += i;
        }
        media_medias /= media_avaliacao.length;

        String medias_notas = String.format("%-20s\t|", "MÉDIAS");
        for (double i : media_avaliacao){
            medias_notas += String.format("%7.1f\t|", i);
        }
        medias_notas += String.format("%7.1f", media_medias);

        System.out.print(medias_notas+"\n");
    }
}

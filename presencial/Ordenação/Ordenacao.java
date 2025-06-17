public class Ordenacao {
    public static void main(String[] args) {
        int[] vetor = {47, 13, 1, 85, 24, 36, 5, 2};

//        BubbleSort(vetor);
//        InsertionSort(vetor);
//        SelectionSort(vetor);
        MergeSort(vetor, 0, vetor.length);
        for (int i : vetor) {
            System.out.print(i + ", ");
        }
    }

    public static void BubbleSort(int[] vetor) {
        int troca;

        for (int i = 0; i < vetor.length - 1; i++) {
            boolean fezTroca = false;
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    fezTroca = true;
                    troca = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = troca;
                }
            }
            if (!fezTroca) {
                break;
            }
        }
    }

    public static void InsertionSort(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int valor = vetor[i];

            int j = i -1;

            while ( j >= 0 && vetor[j] > valor) {
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = valor;
        }
    }

    public static void SelectionSort(int[] vetor) {
        for (int i = 0; i < vetor.length-1; i++) {
            int indiceMinimo = i;
            for (int j = i+1; j < vetor.length; j++) {
                if (vetor[j] < vetor[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int troca = vetor[indiceMinimo];
            vetor[indiceMinimo] = vetor[i];
            vetor[i] = troca;
        }
    }

    public static void MergeSort(int[] vetor, int inicio, int fim) {
        if ( inicio < fim ) {
            int meio = (inicio + fim) / 2;
            MergeSort(vetor, inicio, meio);
            MergeSort(vetor, meio+1, fim);
            merge( vetor, inicio, meio, fim);
        }
    }

    public static void merge(int[] vetor, int inicio, int meio, int fim) {
        int [] metade1 = new int[ meio - inicio + 1 ];
        int [] metade2 = new int[ fim - meio ];

        for (int i = 0; i < metade1.length; i++) {
            metade1[i] = vetor[inicio + i];
        }
        for (int i = 0; i < metade2.length; i++) {
            metade2[i] = vetor[meio + 1 + i];
        }

        int i = 0, j = 0, k = inicio;

        while (i < metade1.length && j < metade2.length) {
            if (metade1[i] <= metade2[j]) {
                vetor[k] = metade1[i++];
            } else {
                vetor[k] = metade2[j++];
            }
            k++;
        }

        while ( i < metade1.length ) {
            vetor[k] = metade1[i];
            k++;
            i++;
        }
        while ( j < metade2.length ) {
            vetor[k] = metade2[j];
            k++;
            j++;
        }
    }

    public static void QuickSort(int[] vetor) {

    }
}

package Matrix;

import java.util.Scanner;

public class desafio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] valoresInformados = new int[4][4];
        int[] valoresIguais = new int[4];

        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                System.out.println("Informe o " + (y + 1) + "º valor: ");
                valoresInformados[x][y] = sc.nextInt();
                if (valoresInformados[x][y] == valoresInformados[x][y]) {
                    valoresIguais[x] = valoresInformados[x][y];
                }
            }
        }
        for (int x = 0; x < 4; x++) {
            System.out.println("Os valores repitidos são: " + valoresIguais[x]);
        }
    }
}

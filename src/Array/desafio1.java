package Array;

import java.util.Scanner;
import java.util.Arrays;

public class desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numerosInformados = new double[10];
        double media = 0;
        double totalNumeros = 0;

        for (int x = 0; x < 10; x++) {
            System.out.println("Digite o " + (x + 1) + " º valor: ");
            numerosInformados[x] = sc.nextInt();
            totalNumeros = totalNumeros + numerosInformados[x];

        }
        media = totalNumeros / 10;
        Arrays.sort(numerosInformados);

        System.out.println("A média dos valores é: " + media);
        System.out.println("O segundo maior numero é: " + numerosInformados[8]);
        System.out.println("O terceiro menor numero é: " + numerosInformados[2]);
    }
}

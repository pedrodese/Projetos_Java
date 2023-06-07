package Array;

import java.util.Scanner;
import java.util.Arrays;

public class desafio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numerosInformados = new int[5];

        for(int x=0;x<5;x++){
            System.out.println("Digite o " + (x+1) + "º valor: ");
            numerosInformados[x] = sc.nextInt();
        }
        Arrays.sort(numerosInformados);
        for(int x=0;x<5;x++){
            System.out.println(numerosInformados[x]);
        }

    }
}

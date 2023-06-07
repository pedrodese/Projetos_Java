package Array;

import java.util.Scanner;

public class desafio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valoresInformados = new int[10];

        for(int x=0;x<10;x++){
            System.out.println("Digite o " + (x+1) + "º valor: ");
            valoresInformados[x] = sc.nextInt();
        }
        for(int x=9; x > -1; x--){
            System.out.println(valoresInformados[x]);
        }
    }
}

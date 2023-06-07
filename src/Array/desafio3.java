package Array;

import java.util.Scanner;

public class desafio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] primeirosValores = new double[5];
        double[] segundosValores = new double[5];
        double[] somaVetores = new double[5];

        for (int x = 0; x < 5; x++) {
            System.out.println("Informe o " + (x + 1) + "º valor do primeiro Array: ");
            primeirosValores[x] = sc.nextDouble();


            System.out.println("Informe o " + (x + 1) + "º valor do segundo Array: ");
            segundosValores[x] = sc.nextDouble();

            somaVetores[x] = primeirosValores[x] + segundosValores[x];
        }
        for(int x=0;x<5;x++){
            System.out.println(primeirosValores[x] + " + " + segundosValores[x] + " = " + somaVetores[x]);
        }
    }
}

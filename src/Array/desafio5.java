package Array;

import java.util.Scanner;

public class desafio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] nota1 = new double[5];
        int[] peso1 = new int[5];

        double[] nota2 = new double[5];
        int[] peso2 = new int[5];

        double[] nota3 = new double[5];
        int[] peso3 = new int[5];

        double[] mediaPonderada = new double[5];

        for (int x = 0; x < 5; x++) {
            System.out.println("Escreva a 1º nota do " + (x + 1) + "º aluno: ");
            nota1[x] = sc.nextDouble();

            System.out.println("Digite o peso da 1º nota do " + (x + 1) + "º aluno:");
            peso1[x] = sc.nextInt();
        }
        for(int x=0;x<5;x++){
            System.out.println("Digite a 2º nota do " + (x+1) + "º aluno: ");
            nota2[x] = sc.nextDouble();

            System.out.println("Digite o peso da 2º nota do " + (x+1) + "º aluno");
            peso2[x] = sc.nextInt();
        }
        for(int x=0;x<5;x++){
            System.out.println("Digite a 3º nota do " + (x+1) + "º aluno: ");
            nota3[x] = sc.nextInt();

            System.out.println("Digite o peso da 3º nota do " + (x+1) + "º aluno: ");
            peso3[x] = sc.nextInt();
        }
        for(int x=0;x<5;x++){
            mediaPonderada[x] = nota1[x] * peso1[x] + nota2[x] * peso2[x] + nota3[x] * peso3[x] / (peso1[x] + peso2[x] + peso3[x]);
        }
        for(int x=0;x<5;x++){
            System.out.println("A média do " + (x+1) + "º aluno: " + mediaPonderada[x]);
        }
    }
}

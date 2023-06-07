package Matrix;

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] notasAlunos = new double[5][3];
        double[] somaNotas = new double[5];
        double[] mediaAlunos = new double[5];


        for(int x=0;x<5;x++){
            for(int y=0;y<3;y++){
                System.out.println("Digite a " + (y+1) + "º nota do " + (x+1) + "º aluno: ");
                notasAlunos[x][y] = sc.nextDouble();

                somaNotas[x] = somaNotas[x] + notasAlunos[x][y];

            }
        }
        for(int x=0;x<5;x++){
            mediaAlunos[x] = somaNotas[x] / 3;
        }
        for(int x=0;x<5;x++){
            System.out.println("A média do " + (x+1) + "º aluno é: " + mediaAlunos[x]);
        }

    }
}

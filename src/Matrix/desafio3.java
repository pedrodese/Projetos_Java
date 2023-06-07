package Matrix;

import java.util.Scanner;

public class desafio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] faturamentoSemestral = new double[6][3];
        double[] somaFaturamento = new double[6];

        for(int x=0;x<6;x++){
            for(int y=0;y<3;y++){
                System.out.println("Insira o " + (y+1) + "º Faturamento do " + (x+1) + " º Mês: ");
                faturamentoSemestral[x][y] = sc.nextDouble();
                somaFaturamento[x] = somaFaturamento[x] + faturamentoSemestral[x][y];
            }
        }
        for(int x=0;x<6;x++){
                System.out.println(" O faturamento total do " + (x+1) + "º Mês: " + somaFaturamento[x]);
        }
    }
}

package Matrix;

import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] valores = new int[4][5];
        int[] somaLinhas = new int[4];
        int somaTudo = 0;

        for(int x=0;x<4;x++){
            for(int y=0;y<5;y++){
                System.out.println("Digite o " + (y+1) + "º valor da " + (x+1) + "º Matriz: ");
                valores[x][y] = sc.nextInt();

                somaLinhas[x] = somaLinhas[x] + valores[x][y];
                somaTudo = somaTudo + valores[x][y];

            }
        }
        for(int x=0;x<4;x++){
            System.out.println("A soma da " + (x+1) + "º linha: " + somaLinhas[x]);
        }
            System.out.println("A soma de todos os valores é: " + somaTudo);
    }
}

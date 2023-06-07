package Matrix;

import java.util.Scanner;

public class desafio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrizOriginal = new int[5][5];
        int[][] matrizAlterada = new int[5][5];

        for(int x=0;x<5;x++){
            for(int y=0;y<5;y++){
                System.out.println("Insira o " + (y+1) + "º valor: ");
                matrizOriginal[x][y] = sc.nextInt();
            }
        }
        for(int x=0;x<5;x++){
            for(int y=0;y<5;y++){
                System.out.println("Matriz Original: ");
                System.out.println(matrizOriginal[x][y]);
            }
        }
        System.out.println("\n");

        for(int x=0;x<5;x++){
            for(int y=0;y<5;y++){
                matrizAlterada[x][y] = matrizOriginal[x][y] * 2;
                System.out.println("Matriz alterada: ");
                System.out.println(matrizAlterada[x][y]);
            }
        }

    }
}

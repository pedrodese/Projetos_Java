package Matrix;

import java.util.Scanner;

public class desafio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][2];

        for(int x=0;x<3;x++){
            for(int y=0;y<2;y++){
                System.out.println("Informe os valores da Matriz: ");
                matriz[x][y] = sc.nextInt();
            }
        }
        System.out.println("Matriz Original: ");
        for(int x=0;x<3;x++){
            for(int y=0;y<2;y++){
                System.out.println(matriz[x][y]);
            }
        }
        System.out.println("Matriz transposta: ");
        for(int x=0;x<2;x++){
            for(int y=0;y<3;y++){
                System.out.println(matriz[y][x]);
            }
        }
    }
}

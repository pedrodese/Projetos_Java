package Matrix;

import java.util.Scanner;

public class desafio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] valoresInformados = new int[4][4];
        int[][] valoresInformados2 = new int[4][4];
        int contador = 0;
        int[][] iguais = new int[4][4];

        for(int x=0;x<4;x++){
            for(int y=0;y<4;y++){
                System.out.println("Informe o " + (y+1) + "º valor da Primeira Matriz: ");
                valoresInformados[x][y] = sc.nextInt();
            }

            for(int z=0;z<4;z++){
                System.out.println("Informe o " + (z+1) + "º valor da Segunda Matriz: ");
                valoresInformados2[x][z] = sc.nextInt();
            }
        }

        for(int x=0;x<4;x++)
        {
            for(int y=0;y<4;y++)
            {
                for(int z=0;z<4;z++)
                {
                    for(int i=0;i<4;i++)
                    {
                        if(valoresInformados[x][y] == valoresInformados[z][i]){
                            contador++;
                            break;
                        }

                    }
                }
            }
        }

        System.out.println("A quantidade de elementos iguais é de: " + contador);
    }
}

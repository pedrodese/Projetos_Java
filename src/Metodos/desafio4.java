package Metodos;

import java.util.Scanner;

public class desafio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[3];

        for (int x = 0; x < 3; x++) {
            valores[x] = insereNumero();
        }
            calculaNumeros(valores);
    }

    public static int insereNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        return sc.nextInt();
    }

    public static void calculaNumeros(int[] valores) {
        int maiorValor;

        if(valores[0] > valores[1] && valores[0] > valores[2]){
            maiorValor = valores[0];
            System.out.println("O maior valor é: " + maiorValor);
        }
        else if(valores[1] > valores[0] && valores[1] > valores[2]){
            maiorValor = valores[1];
            System.out.println("O maior valor é: " + maiorValor);
        }
        else if(valores[2] > valores[0] && valores[2] > valores[1]){
            maiorValor = valores[2];
            System.out.println("O maior valor é: " + maiorValor);
        }
    }
}

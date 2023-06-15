package Metodos;

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mostraIdade(recebeAnoAniversario());

    }

    public static int recebeAnoAniversario() {
        Scanner sc = new Scanner(System.in);

        int anoNasc;

        System.out.println("Digite o ano de seu nascimento: ");
         anoNasc = sc.nextInt();

         return anoNasc;
    }
    public static void mostraIdade(int idadeAtual){
        idadeAtual = idadeAtual - 2021;
        System.out.println("Sua idade é: " + idadeAtual);
    }



}

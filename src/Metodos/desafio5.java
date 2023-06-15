package Metodos;

import java.util.Scanner;

public class desafio5 {
    public static void main(String[] args) {

        validacaoValores(recebeValores());

    }

    public static int recebeValores() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");

        return sc.nextInt();
    }

    public static void validacaoValores(int valorInformado) {
        if (valorInformado > 0){
            System.out.println("Esse número é positivo.");
        }
        else if(valorInformado < 0){
            System.out.println("Esse número é negativo.");
        }
        else{
            System.out.println("Esse número é zero.");
        }
    }
}

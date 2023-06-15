package Metodos;

import java.util.Scanner;

public class desafio6 {
    public static void main(String[] args) {

    }
    public static int recebeValores(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        return sc.nextInt();

    }
    public static void validacaoValores(int numeroInformado){
        boolean verificacao = false;

        if(numeroInformado < 0){
            System.out.println("Digite um valor maior que zero");
        }
        else if(numeroInformado == 1){
            System.out.println("Esse numero não é primo.");
        }
        else if(numeroInformado % 2 != 0 || numeroInformado == 2){
            verificacao = true;
            System.out.println("Esse numero é primo.");
        }
        else{
            System.out.println("Esse número não é primo.");
        }
    }


}

package If_else_if_else;

import java.util.Scanner;

public class desafio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int diaSemana;

        System.out.println("Digite o número que você deseja consultar o dia da semana: ");
        diaSemana = scan.nextInt();

        if(diaSemana == 1){
            System.out.println("O dia que você consultou é Domingo.");
        }
        else if(diaSemana == 2){
            System.out.println("O dia que você consultou é Segunda-Feira.");
        }
        else if(diaSemana == 3){
            System.out.println("O dia que você consultou é Terça-Feira.");
        }
        else if(diaSemana == 4){
            System.out.println("O dia que você consultou é Quarta-Feira.");
        }
        else if(diaSemana == 5){
            System.out.println("O dia que você consultou é Quinta-Feira.");
        }
        else if(diaSemana == 6){
            System.out.println("O dia que você consultou é Sexta-Feira - Sextou ARROMBADO.");
        }
        else if(diaSemana == 7){
            System.out.println("O dia que você consultou é Sábado.");
        }
        else{
            System.out.println("Valor inválido.");
        }


    }
}

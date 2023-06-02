package Scan_Print;

import java.util.Scanner;

public class desafio4 {
    public static void main(String[] args) {

        String nome;
        int idade;


        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o seu nome?: ");
        nome = scan.nextLine();

        System.out.println("Qual a sua idade?: ");
        idade = scan.nextInt();

        System.out.println("Qual a sua altura?: ");
        double altura = scan.nextDouble();

        System.out.println("O seu nome é " + nome + " você tem " + idade + " anos e tem " + altura + " metros de altura.");
    }
}

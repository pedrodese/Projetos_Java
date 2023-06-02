package Scan_Print;

import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();

        System.out.println("Seu nome é " + nome + " e você tem  " + idade + " anos de idade.");
    }
}

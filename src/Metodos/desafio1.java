package Metodos;

import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;

        System.out.println("Qual o seu nome?: ");
        nome = sc.nextLine();

        System.out.println("Qual a sua idade?: ");
        idade = sc.nextInt();

        RecebeInformacoes(nome,idade);
    }
    public static void RecebeInformacoes(String nome, int idade){
        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
    }

}

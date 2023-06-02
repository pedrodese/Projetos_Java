package If_else_if_else;

import java.util.Scanner;

public class desafio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade;

        System.out.println("Qual a sua idade?: ");
        idade = scan.nextInt();

        if(idade < 18 || idade >= 0){
            System.out.println("Você ainda é uma criança.");
        }
        else if(idade <= 29){
            System.out.println("Você é uma pessoa Jovem.");
        }
        else if(idade <= 59){
            System.out.println("Você é uma pessoa Adulta.");
        }
        else if(idade > 60){
            System.out.println("Você é um idoso.");
        }
    }
}

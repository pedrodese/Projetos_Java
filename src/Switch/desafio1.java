package Switch;

import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 7.");
        int diaSemana = scan.nextInt();

        switch (diaSemana) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda-Feira");
            case 3 -> System.out.println("Terça-Feira");
            case 4 -> System.out.println("Quarta-Feira");
            case 5 -> System.out.println("Quinta-Feira");
            case 6 -> System.out.println("Sexta-Feira");
            case 7 -> System.out.println("Sabado");
        }
    }
}

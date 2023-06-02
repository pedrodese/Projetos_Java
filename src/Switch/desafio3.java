package Switch;

import java.util.Scanner;

public class desafio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int mesSelecionado;

        System.out.println("Digite um numero de 1 a 12: ");
        mesSelecionado = scan.nextInt();

        switch (mesSelecionado) {
            case 1 ->  System.out.println("O mês que você selecionou é Janeiro.");
            case 2 -> System.out.println("O mês que você selecionou é Fevereiro.");
            case 3 -> System.out.println("O mês que você selecionou é Março.");
            case 4 -> System.out.println("O mês que você selecionou é Abril.");
            case 5 -> System.out.println("O mês que você selecionou é Maio.");
            case 6 ->  System.out.println("O mês que você selecionou é Junho.");
            case 7 ->  System.out.println("O mês que você selecionou é Julho.");
            case 8 -> System.out.println("O mês que você selecionou é Agosto.");
            case 9 -> System.out.println("O mês que você selecionou é Setembro.");
            case 10 -> System.out.println("O mês que você selecionou é Outubro.");
            case 11 -> System.out.println("O mês que você selecionou é Novembro.");
            case 12 -> System.out.println("O mês que você selecionou é Dezembro.");
            default -> System.out.println("Acabou o Mundo.");
        }
    }
}

package Switch;

import java.util.Scanner;

public class desafio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valorConversao;

        System.out.println("Insira sua medida em metros para realizar a conversão: ");
        valorConversao = scan.nextDouble();

        System.out.println("As unidades disponiveis para conversão");
        System.out.println("Centimetros [1]");
        System.out.println("Polegadas [2]");
        System.out.println("Pés [3]");
        System.out.println("Quilometros [4]");
        int opcaoSelecionada = scan.nextInt();


        switch (opcaoSelecionada) {
            case 1 -> {
                double centimetros;
                centimetros = valorConversao * 100;
                System.out.println("O valor convertido em Centimetros é: " + centimetros);
            }
            case 2 -> {
                double polegadas;
                polegadas = valorConversao * 39.37;
                System.out.println("O valor convertido em polegadas é " + polegadas);
            }
            case 3 -> {
                double pes;
                pes = valorConversao * 3.281;
                System.out.println("O valor convertido em Pés é " + pes);
            }
            case 4 -> {
                double quilometros;
                quilometros = valorConversao * 1000;
                System.out.println("O valor convertido em Quilometro é " + quilometros);
            }


        }
    }
}

package Switch;

import java.util.Scanner;

public class desafio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pesquisa;
        do {
            System.out.println("Insira o primeiro valor: ");
            double primeiroValor = scan.nextDouble();

            System.out.println("Insira o segundo valor: ");
            double segundoValor = scan.nextDouble();

            System.out.println("Agora selecione a operação desejada: ");
            System.out.println("Soma [1]");
            System.out.println("Subtração [2]");
            System.out.println("Multiplicação [3]");
            System.out.println("Divisão [4]");
            int opcaoSelecionada = scan.nextInt();

            switch (opcaoSelecionada) {
                case 1 -> {
                    double soma = primeiroValor + segundoValor;
                    System.out.println("A soma dos dois valores é: " + soma);
                }
                case 2 -> {
                    double subtracao = primeiroValor - segundoValor;
                    System.out.println("A subtração dos dois valores é: " + subtracao);
                }
                case 3 -> {
                    double multiplicacao = primeiroValor * segundoValor;
                    System.out.println("A multiplicação dos dois valores é: " + multiplicacao);
                }
                case 4 -> {
                    if (segundoValor == 0) {
                        System.out.println("O programa não permite divisões por zero.");
                    } else {
                        double divisao = primeiroValor / segundoValor;
                        System.out.println("A divisão dos dois valores é: " + divisao);
                    }
                }
            }

            System.out.println("Deseja realizar outra pesquisa?: (1) para sim (2) para não.");
            pesquisa = scan.nextInt();
        } while (pesquisa == 1);

    }
}

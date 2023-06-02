package While;

import java.text.DecimalFormat;
import java.util.Scanner;

public class desafio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma;
        double subtracao;
        double divisao;
        double multiplicacao;
        int loop;

        do{
            System.out.println("Informe o primeiro numero: ");
            double primeiroNumero = sc.nextInt();

            System.out.println("Informe o segundo numero: ");
            double segundoNumero = sc.nextInt();

            System.out.println("Agora selecione a operação desejada");
            System.out.println("Soma [1]");
            System.out.println("Subtração [2]");
            System.out.println("Divisão [3]");
            System.out.println("Multiplicação [4]");
            int operacaoSelecionada = sc.nextInt();

            switch (operacaoSelecionada) {
                case 1 -> {
                    soma = primeiroNumero + segundoNumero;
                    System.out.println("A soma dos dois valores é: " + soma);
                }
                case 2 -> {
                    subtracao = primeiroNumero - segundoNumero;
                    System.out.println("A subtração dos dois valores é: " + subtracao);
                }
                case 3 -> {
                    if (segundoNumero == 0) {
                        System.out.println("A calculadora não aceita divisões por zero.");
                    } else {
                        divisao = primeiroNumero / segundoNumero;
                        DecimalFormat df = new DecimalFormat("0.00");
                        df.format(divisao);
                        System.out.println("A divisão dos dois valores é: " + divisao);
                    }
                }
                case 4 -> {
                    multiplicacao = primeiroNumero * segundoNumero;
                    DecimalFormat df = new DecimalFormat("0.00");
                    df.format(multiplicacao);
                    System.out.println("A multiplicação dos dois valores é: " + multiplicacao);
                }
                default -> System.out.println("Informe apenas uma operação que esteja cadastrada.");
            }
            System.out.println("Você deseja realizar outro calculo? (1) para sim (2) para não");
            loop = sc.nextInt();

        } while(loop == 1);

    }
}

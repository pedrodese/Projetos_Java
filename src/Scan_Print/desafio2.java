package Scan_Print;

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int soma = 0;
        int subtracao = 0;
        int divisao = 0;
        int multiplicacao = 0;

        System.out.println("Digite o primeiro valor: ");
        int primeiroValor = scan.nextInt();

        System.out.println("Digite o segundo valor: ");
        int segundoValor = scan.nextInt();

        soma = primeiroValor + segundoValor;
        subtracao = primeiroValor - segundoValor;
        if(segundoValor == 0)
        {
            System.out.println("O programa não aceita divisoes por zero.");
        }
        else
        {
            divisao = primeiroValor / segundoValor;
        }
        multiplicacao = primeiroValor * segundoValor;

            System.out.println("A soma dos dois valores é: " + soma);
            System.out.println("A subtração dos dois valores é: " + subtracao);
            System.out.println("A divisão dos dois valores é: " + divisao);
            System.out.println("A multiplicação dos dois valores é: " + multiplicacao);
    }

}

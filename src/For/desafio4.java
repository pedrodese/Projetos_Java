package For;

import java.util.Scanner;

public class desafio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double  primeiroValor;
        double segundoValor = 0;
        double soma = 0;
        double media;
        double totalValores = 0;

        System.out.println("Insira o primeiro valor: ");
        primeiroValor = scan.nextDouble();

        System.out.println("Insira o segundo valor: ");
        segundoValor = scan.nextDouble();

        for(double i = primeiroValor + 1; i < segundoValor; i++ ){
            soma = soma + i;
            totalValores++;
        }
            media = soma / totalValores;

        System.out.println("A soma do intervalo dos valores é: " + (soma));
        System.out.println("A média do intervalo dos valores é: " + (media));

    }
}

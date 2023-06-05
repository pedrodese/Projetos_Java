package While;

import java.util.Scanner;

public class desafio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double primeiroValor;
        double segundoValor;

        System.out.println("Digite o primeiro valor: ");
        primeiroValor = sc.nextDouble();

        System.out.println("Digite o segundo valor: ");
        segundoValor = sc.nextDouble();

        double resultado = primeiroValor + segundoValor;

        double resultadoUsuario;
        do {
            System.out.println("Digite a soma dos dois valores: ");
            resultadoUsuario = sc.nextDouble();

            if (resultadoUsuario != resultado) {
                System.out.println("Você errou, Tente Novamente: ");
            } else {
                System.out.println("Você acertou!!!");
            }
        } while (resultadoUsuario != resultado);
    }
}

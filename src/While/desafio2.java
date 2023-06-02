package While;

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int resultado;
        int resposta = 0;
        int contador = 0;

        System.out.println("Digite o primeiro valor inteiro: ");
        int primeiroNumero = sc.nextInt();

        System.out.println("Digite o segundo valor inteiro: ");
        int segundoNumero = sc.nextInt();

        resultado = primeiroNumero * segundoNumero;

        do{
            System.out.println("Digite o resultado da multiplicação de " + primeiroNumero + " x " + segundoNumero);
            resposta = sc.nextInt();
            System.out.println("Você errou, tente novamente: ");
            contador++;
            if(resposta == resultado){
                System.out.println("Você acertou!!!");
                System.out.println("Você acertou depois de: " + contador + " tentativas");
            }
        }while(resposta != resultado);
    }
}

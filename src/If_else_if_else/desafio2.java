package If_else_if_else;

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double somaTodasNotas;
        double media;

        System.out.println("Digite a sua primeira nota: ");
        nota1 = scan.nextDouble();

        System.out.println("Digite a sua segunda nota: ");
        nota2 = scan.nextDouble();

        System.out.println("Digite a sua terceira nota: ");
        nota3 = scan.nextDouble();

        somaTodasNotas = nota1 + nota2 + nota3;

        media = somaTodasNotas / 3;

        if(media >= 7){
            System.out.println("Você está aprovado.");
        }
        else if(media >= 5 || media <= 6){
            System.out.println("Você está em recuperação.");
        }
        else{
            System.out.println("Você está reprovado.");
        }
    }
}

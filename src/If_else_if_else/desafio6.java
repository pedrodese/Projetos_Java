package If_else_if_else;

import java.util.Scanner;

public class desafio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // isósceles dois lados iguais.
        //equilatero todos os lados iguais.
        // escalenos todso os lados diferentes

        double primeiraMedida;
        double segundaMedida;
        double terceiraMedida;

        System.out.println("Digite a primeira medida: ");
        primeiraMedida = scan.nextDouble();

        System.out.println("Digite a segunda medida: ");
        segundaMedida = scan.nextDouble();

        System.out.println("Digite a terceira medida: ");
        terceiraMedida = scan.nextDouble();


        if(primeiraMedida == segundaMedida && segundaMedida == terceiraMedida){
            System.out.println("Com as medidas que você inseriu podemos fazer um triangulo equilátero.");
        }
        else if(primeiraMedida != segundaMedida && segundaMedida != terceiraMedida){
            System.out.println("Com as medidas que você inseriu podemos fazer um triangulo escaleno.");
        }
        else{
            System.out.println("Com as medidas que você inseriu podemos fazer um triangulo isósceles.");
        }

    }
}

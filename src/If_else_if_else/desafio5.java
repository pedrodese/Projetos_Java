package If_else_if_else;

import java.util.Scanner;

public class desafio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double peso;
        double altura;
        double imc;

        System.out.println("Qual o seu peso?: ");
        peso = scan.nextDouble();

        System.out.println("Qual a sua altura?: ");
        altura = scan.nextDouble();

        imc = peso / (altura * altura);

        if(imc < 18.5){
            System.out.println("Você está abaixo do peso.");
        }
        else if(imc < 24.9){
            System.out.println("O seu peso está ideal para você.");
        }
        else if(imc < 29.9){
            System.out.println("Você está com sobrepeso.");
        }
        else{
            System.out.println("Você é um obeso de merda.");
        }

    }
}

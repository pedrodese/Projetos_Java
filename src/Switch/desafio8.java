package Switch;

import java.util.Scanner;

public class desafio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o seu salario bruto mensal: ");
        double salarioBruto = scan.nextInt();

        if(salarioBruto <= 1903.98){
            System.out.println("Você está isento do imposto de renda.");
        }
        else if(salarioBruto >= 1903.99 && salarioBruto < 2826.65){
            double imposto1 = salarioBruto - (salarioBruto * 0.075);
            System.out.println("O seu sálario descontando o imposto de renda é: " + imposto1);
        }
        else if(salarioBruto >= 2826.66 && salarioBruto <= 3751.05){
            double imposto2 = salarioBruto - (salarioBruto * 0.15);
            System.out.println("O seu sálario descontando o imposto de renda é: " + imposto2);
        }
        else if(salarioBruto >= 3751.06 && salarioBruto <= 4664.28){
            double imposto3 = salarioBruto - (salarioBruto * 0.225);
            System.out.println("O seu sálario descontando o imposto de renda é: " + imposto3);
        }
        else{
            double imposto4 = salarioBruto - (salarioBruto * 0.275);
            System.out.println("O seu sálario descontando o imposto de renda é: " + imposto4);
        }
    }
}

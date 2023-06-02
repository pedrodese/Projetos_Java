package If_else_if_else;

import java.util.Scanner;

public class desafio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double salarioHora;
        double salarioTotal;
        double horasTrabalhadas;
        double horasExtras;
        double salarioHoraExtra;

        System.out.println("Qual o seu salário por hora?: ");
        salarioHora = scan.nextDouble();

        System.out.println("Quantas horas você trabalhou ao todo neste mês?: ");
        horasTrabalhadas = scan.nextInt();

        salarioTotal = salarioHora * 160;

        if(horasTrabalhadas > 160){
            salarioHoraExtra = ((horasTrabalhadas - 160) * salarioHora) * 1.50;
            System.out.println("O seu sálario total com horas extras é de: " + (salarioHoraExtra + salarioTotal));
        }
        else{
            salarioTotal = salarioHora * horasTrabalhadas;
            System.out.println("O seu sálario total sem horas extras é de: " + salarioTotal);
        }


    }
}

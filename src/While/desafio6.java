package While;

import java.text.DecimalFormat;
import java.util.Scanner;

public class desafio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int loop;
        double peso;
        double altura;
        double imc;
        String imcArredondado;

        DecimalFormat df = new DecimalFormat("0.00");

        do {
            System.out.println("Qual o seu peso?: ");
            peso = sc.nextDouble();

            System.out.println("Qual a sua altura?: ");
            altura = sc.nextDouble();

            imc = peso / (altura * altura);
            imcArredondado = df.format(imc);

            System.out.println("O seu imc é: " + imcArredondado);

            System.out.println("Deseja realizar outra consulta?: [1] para SIM [2] para NÃO.");
            loop = sc.nextInt();

        } while (loop == 1);
    }
}

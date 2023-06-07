package Array;

import java.util.Scanner;
import java.util.Arrays;

public class desafio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] temperaturas = new double[12];
        double totalTemperaturas = 0;
        double mediaTemperaturas = 0;

        for(int x=0;x<12;x++){
            System.out.println("Informe a " + (x+1) + "º temperatura do " + (x+1) + " mês: ");
            temperaturas[x] = sc.nextDouble();
            totalTemperaturas = totalTemperaturas + temperaturas[x];
        }
        mediaTemperaturas = totalTemperaturas / 12;
        Arrays.sort(temperaturas);
        System.out.println("A maior temperatura do ano foi: " + temperaturas[11]);
        System.out.println("A menor temperatura do ano foi: " + temperaturas[0]);
        System.out.println("A media das temperaturas do ano foi: " + mediaTemperaturas);
    }
}

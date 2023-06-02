package Scan_Print;

import java.util.Scanner;
public class desafio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nroInformado;

        System.out.println("Informe um numero real para arredondar-lo");
        nroInformado = scan.nextDouble();

        System.out.println(Math.floor(nroInformado));

    }
}

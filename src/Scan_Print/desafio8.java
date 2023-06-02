package Scan_Print;

import java.util.Scanner;

public class desafio8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String palavra;
        int contadorCaracteres;

        System.out.println("Digite a palavra que você deseja saber os números de caracteres: ");
        palavra = scan.nextLine();

        contadorCaracteres = palavra.length();

        System.out.println("A quantidade de caracteres é de: " + contadorCaracteres + " caracteres.");
    }
}

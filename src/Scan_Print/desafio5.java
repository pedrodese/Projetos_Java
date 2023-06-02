package Scan_Print;

import java.util.Scanner;

public class desafio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroInformado;

        System.out.println("Digite o número que você deseja ver a tabuada: ");
        numeroInformado = scan.nextInt();

        System.out.println(numeroInformado + "  X " + " 1 " + " = " + numeroInformado * 1);
        System.out.println(numeroInformado + "  X " + " 2 " + " = " + numeroInformado * 2);
        System.out.println(numeroInformado + "  X " + " 3 " + " = " + numeroInformado * 3);
        System.out.println(numeroInformado + "  X " + " 4 " + " = " + numeroInformado * 4);
        System.out.println(numeroInformado + "  X " + " 5 " + " = " + numeroInformado * 5);
        System.out.println(numeroInformado + "  X " + " 6 " + " = " + numeroInformado * 6);
        System.out.println(numeroInformado + "  X " + " 7 " + " = " + numeroInformado * 7);
        System.out.println(numeroInformado + "  X " + " 8 " + " = " + numeroInformado * 8);
        System.out.println(numeroInformado + "  X " + " 9 " + " = " + numeroInformado * 9);
        System.out.println(numeroInformado + "  X " + " 10 " + " = " + numeroInformado * 10);
    }
}

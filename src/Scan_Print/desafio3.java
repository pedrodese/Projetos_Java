package Scan_Print;

import java.util.Scanner;
public class desafio3 {
    public static void main(String[] args) {

        int valor;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        valor = scan.nextInt();

        if(valor % 2 == 0){
            System.out.println("O valor é par.");
        }
        else{
            System.out.println("O valor é impar.");
        }

    }
}

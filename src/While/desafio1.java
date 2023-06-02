package While;

import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        int nroInformado;
        do {
            System.out.println("Digite um numero inteiro: ");
            nroInformado = sc.nextInt();
            if (nroInformado == 0) {
                System.out.println("Digite um numero válido.");
            }
            else if(nroInformado > 0){
                contador++;
            }
        } while(nroInformado % 2 == 1);

        System.out.println("Você digitou: " + contador + " vezes.");

    }
}

package For;

import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeros = 0;
        int somaPares = 0;
        int somaImpares = 0;
        int somaTodos = 0;

        for(int i=0;i<5;i++) {
            System.out.println("Insira o " + (i + 1) + "º Valor:");
            numeros = scan.nextInt();

            if (numeros % 2 == 0) {
                somaPares = somaPares + numeros;
            }
            if(numeros % 2 == 1){
                somaImpares = somaImpares + numeros;
            }
            else{
                somaTodos = somaPares + somaImpares;
            }
        }
        System.out.println("A soma dos numeros pares é: " + somaPares);
        System.out.println("A soma dos numeros impares é: " + somaImpares);
        System.out.println("A soma de todos os numeros é: " + somaTodos);

    }
}

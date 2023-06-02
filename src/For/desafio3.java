package For;

import java.util.Scanner;

public class desafio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numeroUsuario;
        double restoDivisao = 0;
        double quociente = 0;

        System.out.println("Digite um número inteiro de 1 a 9: ");
        numeroUsuario = scan.nextInt();

        for(int numeros = 0; numeros < 20; numeros++){
            if (numeros == 0){
                System.out.println("Não é possivel fazer uma divisão por zero.");
            }
            else{
                quociente = numeroUsuario / numeros;
                restoDivisao = numeroUsuario % numeros;

                System.out.println((numeroUsuario) + " / " + numeros + " = " + (quociente));
                System.out.println("O resto da divisão é: " + restoDivisao);

            }
        }

    }
}

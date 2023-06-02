package For;

import java.util.Scanner;

public class desafio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {
            if (isPrimo(i)) {
                System.out.println(i + " é primo");
            }
        }
    }

    // Verifica se um número é primo
    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
        }
    }



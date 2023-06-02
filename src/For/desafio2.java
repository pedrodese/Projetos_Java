package For;

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            String palavra;

        System.out.println("Insira a sua palavra: ");
        palavra = scan.nextLine();

        char[] palavraArray = palavra.toCharArray();

            for(char contador: palavraArray){
                System.out.println(contador);
        }
            System.out.println("A sua palavra tem " + palavra.length() + " caracteres.");
    }
}

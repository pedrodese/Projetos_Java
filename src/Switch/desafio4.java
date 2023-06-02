package Switch;

import java.util.Arrays;
import java.util.Scanner;

public class desafio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean caracterEspecial = true;
        String letraInformada;
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        char[] consoantes = {'b', 'c', 'd', 'f','g', 'j', 'k', 'l', 'm', 'n', 'p','q', 'r', 's','t','v','w','x', 'z'};


        System.out.println("Informe uma letra: ");
        letraInformada = scan.nextLine();
        letraInformada = letraInformada.toLowerCase();

        char[] letraInformada1 = letraInformada.toCharArray();


        for(int x=0; x < vogais.length; x++){

            if(letraInformada1[0]== vogais[x])
            {
                caracterEspecial = false;
                System.out.println("Essa letra é uma vogal.");
            }

        }
        for(int x=0; x < consoantes.length;x++){

            if(letraInformada1[0] == consoantes[x]){
                caracterEspecial = false;
                System.out.println("Essa letra é uma consoante.");
            }
        }
            if(caracterEspecial){
                System.out.println("Isso é um caracter especial.");
            }


    }
}

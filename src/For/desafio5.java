package For;

import java.util.Scanner;

public class desafio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean caracterEspecial = true;
        String fraseInformada;
        int totaisVogais = 0;
        int totaisConsoantes = 0;
        int totalEspaco = 0;
        int contadorCaracter = 0;
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        char[] consoantes = {'b', 'c', 'd', 'f','g', 'j', 'k', 'l', 'm', 'n', 'p','q', 'r', 's','t','v','w','x', 'z'};


        System.out.println("Informe uma frase: ");
        fraseInformada = sc.nextLine();
        fraseInformada = fraseInformada.toLowerCase();

        char[] frase = fraseInformada.toCharArray();

        //FOR para vogais
        for(char letra: frase){

            caracterEspecial = true;

            for (char vogal : vogais){
                if (letra == vogal) {
                    totaisVogais++;
                    caracterEspecial = false;
                    break;
                }
            }

            for (char consoante : consoantes) {
                if (letra == consoante) {
                    totaisConsoantes++;
                    caracterEspecial = false;
                    break;

                }
            }

            if(letra == ' '){
                totalEspaco++;
            }
            else if(caracterEspecial){
                contadorCaracter++;
            }
        }

                System.out.println("A frase possui: " + totaisVogais + " vogais.");
                System.out.println("A frase possui: " + totaisConsoantes + " consoantes.");
                System.out.println("A frase possui: " + totalEspaco + " espaços.");
                System.out.println("A frase possui: " + contadorCaracter + " caracteres especiais.");

    }
}

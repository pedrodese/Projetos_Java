package Switch;

import java.util.Scanner;

public class desafio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int candidatoSelecionado;

        System.out.println("Os candidatos disponiveis são: ");
        System.out.println("Roberto [1]");
        System.out.println("Thiago [2]");
        System.out.println("Pedro [3] ");
        System.out.println("Gian [4] ");
        System.out.println("Aécio pau nelas [5]");
        System.out.println("Selecione o seu candidato: ");
        candidatoSelecionado = scan.nextInt();

        switch (candidatoSelecionado){
            case 1 -> {
                System.out.println("Roberto Ellmer - PT");
            }
            case 2 -> {
                System.out.println("Thiago Luiz da Silva Gon - PSOL");
            }
            case 3 -> {
                System.out.println("Pedro Henrique - NOVO");
            }
            case 4 -> {
                System.out.println("Gian Carlos Pereira - PMDB");
            }
            case 5 -> {
                System.out.println("Aécio pau nelas - POPO");
            }
            default -> System.out.println("Selecione um candidato válido.");

        }


    }
}

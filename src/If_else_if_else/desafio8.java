package If_else_if_else;

import java.util.Scanner;

public class desafio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nomeFilme;
        int classificacaoIndicativa;
        double duracaoFilme;

        System.out.println("Qual o nome do filme que você deseja classificar?: ");
        nomeFilme = scan.nextLine();

        System.out.println("Qual a idade indicada para assistir esse filme: (se for de classificação livre: Digitar 0.)");
        classificacaoIndicativa = scan.nextInt();

        System.out.println("Qual a duração deste filme?:  ");
        duracaoFilme = scan.nextDouble();

        if(duracaoFilme < 60 && classificacaoIndicativa == 0){
            System.out.println("O filme que você classificou entra na categoria infantil.");
        }
        else if(duracaoFilme < 120 && classificacaoIndicativa >= 10 || classificacaoIndicativa <= 14){
            System.out.println("O filme que você classificou entra na categoria Adolescente.");
        }
        else if(duracaoFilme > 120 && classificacaoIndicativa  >= 18){
            System.out.println("O filme que você classificou entra na categoria Adulto.");
        }
        else{
            System.out.println("O filme que você classificou não é recomendado pelo nosso software. ");
        }
    }
}

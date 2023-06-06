package While;

import java.util.Scanner;

public class desafio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop;
        String nomes;
        String nomesMenorSalario = "";
        int totalPessoasParticipantes = 0;

        double idadeTodos;
        double idadeTodosReal = 0;
        double mediaIdadeTodos = 0;

        double filhoTodos;
        double  filhoTodosReal = 0;

        double salarioTodos;
        double salarioTodosReal = 0;
        double maiorSalario = 0;

        double mediaSalarioTodos;
        double mediaFilhos;



        do{
            System.out.println("Qual o seu nome?: ");
            nomes = sc.next();
            totalPessoasParticipantes++;

            System.out.println("Qual a sua idade?: ");
            idadeTodos = sc.nextDouble();
            idadeTodosReal = idadeTodosReal + idadeTodos;

            System.out.println("Quantos filhos você tem?: ");
            filhoTodos = sc.nextDouble();
            filhoTodosReal = filhoTodosReal + filhoTodos;

            System.out.println("Qual o seu sálario?: ");
            salarioTodos = sc.nextDouble();
            salarioTodosReal = salarioTodosReal + salarioTodos;

            if(salarioTodos > maiorSalario){
                maiorSalario = salarioTodos;
            }
            if(salarioTodos < 1000){
                nomesMenorSalario = nomesMenorSalario.concat(nomes + ",");
            }


            System.out.println("Existe outra pessoa para participar da pesquisa?: [1] para sim [2] para não.");
            loop = sc.nextInt();



        }while(loop == 1);

        mediaSalarioTodos = salarioTodosReal / totalPessoasParticipantes;
        mediaFilhos = filhoTodosReal / totalPessoasParticipantes;
        mediaIdadeTodos = idadeTodosReal / totalPessoasParticipantes;

        System.out.println("A média salarial de todos os habitantes é: " + mediaSalarioTodos);
        System.out.println("A média de filhos da cidade é: " + mediaFilhos);
        System.out.println("O maior sálario é: " + maiorSalario);
        System.out.println("As pessoas que tem o sálario menor do que R$1000" + nomesMenorSalario);
        System.out.println("A média de idade de todos os Habitantes é: " + mediaIdadeTodos);


    }
}

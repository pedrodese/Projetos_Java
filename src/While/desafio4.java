package While;

import java.util.Scanner;

public class desafio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       double idadeTodos;
       double genero;
       double salarioTodos;

       double salarioFeminino = 0.0;
       double salarioMasculino = 0.0;
       double mediaSalarioFeminino = 0.0;
       double mediaSalarioMasculino = 0.0;

       int totalPessoasFeminino = 0;
       int totalPessoasMasculino = 0;

       double idadeFeminino = 0;
       double idadeMasculino = 0;
       double mediaIdadeFeminino = 0;
       double mediaIdadeMasculino = 0;

       double maiorSalario = 0.0;
       double menorSalario = 0.0;
       String continuar;

       do{
           System.out.println("Qual sua idade?: ");
           idadeTodos = sc.nextInt();

           System.out.println("Qual o seu sálario?: ");
           salarioTodos = sc.nextDouble();
           if(salarioTodos > maiorSalario){
               maiorSalario = salarioTodos;
           }
           if(totalPessoasFeminino == 0 && totalPessoasMasculino == 0){
               menorSalario = salarioTodos;
           }
           else if(salarioTodos < menorSalario){
               menorSalario = salarioTodos;
           }

           System.out.println("Qual o seu genero?: (1) para Feminino. (2) para Masculino.");
           genero = sc.nextInt();
           if(genero == 1){

               totalPessoasFeminino++;
               salarioFeminino = salarioFeminino + salarioTodos;
               mediaSalarioFeminino = totalPessoasFeminino / salarioFeminino;
               idadeFeminino = idadeFeminino + idadeTodos;
               mediaIdadeFeminino = totalPessoasFeminino / idadeFeminino;

           }
           else if (genero == 2){

               totalPessoasMasculino++;
               salarioMasculino = salarioMasculino + salarioTodos;
               mediaSalarioMasculino = totalPessoasMasculino / salarioMasculino;
               idadeMasculino = idadeMasculino + idadeTodos;
               mediaIdadeFeminino = totalPessoasMasculino / idadeMasculino;

           }
           System.out.println("Deseja continuar?: Digite CONTINUAR.");
           continuar = sc.next();
           continuar.toUpperCase();
       } while(continuar.equals("CONTINUAR"));

       double mediaIdadeTodos = idadeTodos / (totalPessoasFeminino + totalPessoasMasculino);
       double mediaSalarioTodos = salarioTodos / (salarioMasculino + salarioFeminino);
        System.out.println("A media de idades é: " + mediaIdadeTodos);
        System.out.println("A média de idade das pessoas do genero feminino é: " + mediaIdadeFeminino);
        System.out.println("A média de idade das pessoas do genero masculino é: " + mediaIdadeMasculino);
        System.out.println("A média salarial de todos é: " + mediaSalarioTodos);
        System.out.println("A média salarial das pessoas do genero feminino é: " + mediaSalarioFeminino);
        System.out.println("A média salarial das pessoas do genero masculino é: " + mediaSalarioMasculino);
        System.out.println("O maior salario é: " + maiorSalario);
        System.out.println("O menor salario é: " + menorSalario);

    }
}


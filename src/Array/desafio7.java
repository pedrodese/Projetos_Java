package Array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class desafio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notasAlunos = new double[5];
        int totalAlunos = 0;
        double mediaTurma = 0;
        int acimaDaMedia = 0;

        for(int i=0;i<5;i++){
            System.out.println("Digite a nota do " + (i+1) + "º aluno: ");
            notasAlunos[i] = sc.nextDouble();
            mediaTurma = mediaTurma + notasAlunos[i];

            if(notasAlunos[i] > 7){
                acimaDaMedia++;
            }
        }
        mediaTurma = mediaTurma / 5;
        System.out.println("A média da turma é: " + mediaTurma);
        System.out.println("A quantidade de alunos que ficaram acima de média 7 são: " + acimaDaMedia);

    }
}

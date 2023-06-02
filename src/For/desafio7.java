package For;

import java.util.Scanner;

public class desafio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double []notasMat = new double[4];
        double []notasHis = new double[4];
        double []notasPor = new double[4];
        double []notasGeo = new double[4];

        double []pesoMat = new double[4];
        double []pesoHis = new double[4];
        double []pesoPor = new double[4];
        double []pesoGeo = new double[4];

        double mediaMat = 0;
        double mediaHis = 0;
        double mediaPor = 0;
        double mediaGeo = 0;

        for(int i=0;i<4;i++){
            System.out.println("Insira a " + (i+1) + "º nota de Matemática: ");
            notasMat[i] = sc.nextDouble();

            System.out.println("Insira o peso da " + (i+1) + "º nota de Matematica: ");
            pesoMat[i] = sc.nextDouble();

            mediaMat = (notasMat[0] * pesoMat[0] + notasMat[1] * pesoMat[1] + notasMat[2] * pesoMat[2] + notasMat[3] * pesoMat[3]) / (pesoMat[0] + pesoMat[1] + pesoMat[2] + pesoMat[3]);

        }
        for(int i=0;i<4;i++){
            System.out.println("Insira a " + (i+1) + "º nota de Historia: ");
            notasHis[i] = sc.nextDouble();

            System.out.println("Insira o peso da " + (i+1) + "º nota de Historia: ");
            pesoMat[i] = sc.nextDouble();

            mediaHis = (notasHis[0] * pesoHis[0] + notasHis[1] * pesoHis[1] + notasHis[2] * pesoHis[2] + notasHis[3] * pesoHis[3]) / (pesoHis[0] + pesoHis[1] + pesoHis[2] + pesoHis[3]);
        }
        for(int i=0;i<4;i++){
            System.out.println("Insira a nota da " + (i+1) + "º nota Português: ");
            notasPor[i] = sc.nextDouble();

            System.out.println("Insira o peso da " + (i+1) + "º nota de Português: ");
            pesoPor[i] = sc.nextDouble();

            mediaPor = (notasPor[0] * pesoPor[0] + notasPor[1] * pesoPor[1] + notasPor[2] * pesoPor[2] + notasPor[3] * pesoPor[3]) / (pesoPor[0] + pesoPor[1] + pesoPor[2] + pesoPor[3]);

        }
        for(int i=0;i<4;i++){
            System.out.println("Insira a nota da " + (i+1) + "º nota Geografia: ");
            notasGeo[i] = sc.nextDouble();

            System.out.println("Insira o peso da " + (i+1) + "º nota de Geografia: ");
            pesoGeo[i] = sc.nextDouble();

            mediaPor = (notasGeo[0] * pesoGeo[0] + notasGeo[1] * pesoGeo[1] + notasGeo[2] * pesoGeo[2] + notasGeo[3] * pesoGeo[3]) / (pesoGeo[0] + pesoGeo[1] + pesoGeo[2] + pesoGeo[3]);

        }
        System.out.println("\n");
        System.out.println("Notas de matematica");
        for(int i=0;i<4;i++) {

            System.out.println((i + 1) + "º Nota de Matematica: " + notasMat[i]);
        }
        System.out.println("\n");
        System.out.println("Notas de Historia");
        for(int i=0;i<4;i++) {

            System.out.println((i + 1) + "º Nota de Historia: " + notasHis[i]);
        }
        System.out.println("\n");
        System.out.println("Notas de Português");
        for(int i=0;i<4;i++) {

            System.out.println((i + 1) + "º Nota de Português: " + notasPor[i]);
        }
        System.out.println("\n");
        System.out.println("Notas de Geografia");
        for(int i=0;i<4;i++) {

            System.out.println((i + 1) + "º Nota de Geografia: " + notasMat[i]);
        }
        System.out.println("\n");
        System.out.println("Media total de Matematica: " + mediaMat);
        System.out.println("Media total de Historia: " + mediaMat);
        System.out.println("Media total de Português: " + mediaMat);
        System.out.println("Media total de Geografia: " + mediaMat);




    }
}

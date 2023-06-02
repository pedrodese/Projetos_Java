package Switch;

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {

        //CIRCULO Area = pi * raio ao quadrado.
        //QUADRADO Area = base * altura.
        //RETANGULO Area = base * altura.
        //TRIANGULO Area = base * altura / 2



        Scanner scan = new Scanner(System.in);

        double areaCirculo;
        double areaQuadrado;
        double areaRetangulo;
        double areaTriangulo;

        System.out.println("Neste software iremos realizar o calculo de area da figura que você selecionar.");
        System.out.println("As opções são: ");
        System.out.println("CIRCULO [1]");
        System.out.println("QUADRADO [2]");
        System.out.println("RETANGULO [3]");
        System.out.println("TRIANGULO [4]");
        System.out.println("Escolha uma das opções acima: ");
        int figuraSelecionada = scan.nextInt();


        switch (figuraSelecionada) {
            case 1 -> {
                System.out.println("Qual o raio de seu circulo?: ");
                double raioCirculo = scan.nextDouble();

                areaCirculo = raioCirculo * 3.14;
                System.out.println("A area do seu circulo é: " + areaCirculo);
            }
            case 2 -> {
                System.out.println("Qual a base de seu quadrado?: ");
                double baseQuadrado = scan.nextDouble();
                System.out.println("Qual a altura do seu quadrado?: ");
                double alturaQuadrado = scan.nextDouble();

                areaQuadrado = baseQuadrado * alturaQuadrado;
                System.out.println("A área de seu quadrado é: " + areaQuadrado);
            }
            case 3 -> {
                System.out.println("Qual a medida da base de seu retangulo?: ");
                double baseRetangulo = scan.nextDouble();
                System.out.println("Qual a medida da altura do seu retangulo?: ");
                double alturaRetangulo = scan.nextDouble();

                areaRetangulo = baseRetangulo * alturaRetangulo;
                System.out.println("A área de seu retangulo é: " + areaRetangulo);
            }
            case 4 -> {
                System.out.println("Qual a medida da base do seu triangulo?: ");
                double baseTriangulo = scan.nextDouble();
                System.out.println("Qual a medida da altura do seu triangulo?: ");
                double alturaTriangulo = scan.nextDouble();

                areaTriangulo = baseTriangulo * alturaTriangulo / 2;
                System.out.println("A área do seu triangulo é: " + areaTriangulo);
            }

        }

    }
}

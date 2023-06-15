package Metodos;

import java.util.Scanner;

public class desafio7 {
    public static void main(String[] args) {
        int[] numerosInformados = new int[3];

        for(int x=0;x<3;x++){
            numerosInformados[x] = insereNumeros();
        }
        calculaTriangulo(numerosInformados);
    }
    public static int insereNumeros(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        return sc.nextInt();
    }
    public static void calculaTriangulo(int[] numerosInformados){
        if(numerosInformados[0] == numerosInformados[1] && numerosInformados[1] == numerosInformados[2]){
            System.out.println("Com estes valores você tem um triangulo equilátero.");
        }
        else if(numerosInformados[0] != numerosInformados[1] && numerosInformados[1] != numerosInformados[2]){
            System.out.println("Com estes valores você tem um triangulo escaleno.");
        }
        else{
            System.out.println("Com estes valores você tem um triangulo isosceles");
        }
    }

}

package Metodos;

import java.util.Scanner;

public class desafio3 {
    public static void main(String[] args) {
        recebeValorCalculo(recebeValorCompra());
    }
    public static double recebeValorCompra(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor total da compra: ");
        return sc.nextDouble();
    }
    public static void recebeValorCalculo(double valorCompra){
        if(valorCompra <= 100){
            System.out.println("O valor permanecerá o mesmo.");
        }
        else if(valorCompra <= 200){
            double valorComDesconto;
            valorComDesconto = valorCompra - (valorCompra * 0.20);
            System.out.println("O valor da sua compra com desconto é de: " + valorComDesconto);
        }
        else{
            valorCompra = valorCompra - (valorCompra * 0.30);
            System.out.println("O valor da sua compra com desconto é de: " + valorCompra);
        }
    }



}

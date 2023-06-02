package Scan_Print;

import java.util.Scanner;

public class desafio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double temperaturaCelsius;
        double temperaturaFahrenheit;
        double temperaturaKelvin;

        System.out.println("Informe a temperatura em graus Celsius: ");
        temperaturaCelsius = scan.nextDouble();

        temperaturaFahrenheit = (9 * temperaturaCelsius + 160) / 5;
        temperaturaKelvin = temperaturaCelsius + 273.15;

        System.out.println("A temperatura informada em Celsius é: " + temperaturaCelsius);
        System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);
        System.out.println("A temperatura em Kelvin é: " + temperaturaKelvin);
    }
}

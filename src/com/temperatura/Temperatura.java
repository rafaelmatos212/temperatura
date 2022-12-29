package com.temperatura;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args){
        double C, F, K, Ra, Re;
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a temperatura: ");

        C = s.nextDouble();
        F = C * 1.8 + 32;
        K = C + 273.15;
        Ra = C * 1.8 + 32 + 459.67;
        Re = C * 0.8;

        System.out.println("Celsius: " + C);
        System.out.println("Fahrenheit: " + F);
        System.out.println("Kelvin: " + K);
        System.out.println("Rankine: " + Ra);
        System.out.println("Réaumur: " + Re);
    }
}

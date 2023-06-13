/*
Hacer una función que calcule el área de un cuadrado. Al llamarla debe devolver el área del cuadrado.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Registre la longitud del lado del cuadrado (en Centrímetros): ");
        double lado = leer.nextDouble();
        System.out.println("El área del cuadrado es: " + calcularArea(lado));
    }

    static double calcularArea(double l){
        //return l * l;
        return Math.pow(l, 2);

    }
}
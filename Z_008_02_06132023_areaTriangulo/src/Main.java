/*
Hacer una función que calcule el área de un triángulo. Al llamarla debe devolver el área del triángulo.
b*a / 2
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Registre la longitud de la base del triángulo (en Centrímetros): ");
        double base = leer.nextDouble();
        System.out.println("Registre la longitud de la altura del triángulo (en Centrímetros): ");
        double altura = leer.nextDouble();
        System.out.println("El área del triangulo es: " + calcularArea(base, altura));
    }

    static double calcularArea(double b, double a){
        return (b * a) /2;
    }
}
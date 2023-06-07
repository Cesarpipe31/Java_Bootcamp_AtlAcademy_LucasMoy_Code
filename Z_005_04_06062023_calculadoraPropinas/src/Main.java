import java.util.Scanner;

/*
4) Calculadora de propinas:
Pídele al usuario que ingrese el total de la cuenta en un restaurante.
Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).

 */
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Registre el total de la cuenta en un restaurante: ");
        double totalCuenta = leer.nextDouble();
        System.out.println("Registre porcentaje de propina que desea dejar: ");
        double porcentajePropina = leer.nextDouble();
        double totalaPagar = totalCuenta + (totalCuenta * porcentajePropina / 100);
        System.out.println("El total a pagar, incluyento la propina de " + porcentajePropina + "% es de: " + totalaPagar);
    }
}
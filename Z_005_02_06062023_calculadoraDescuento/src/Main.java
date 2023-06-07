import java.util.Scanner;

/*
3) Calculadora de descuento:
Pídele al usuario que ingrese el precio original de un producto.
Pídele al usuario que ingrese el porcentaje de descuento.
Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
Muestra el precio final al usuario.
 */
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Registre el precio original de un producto: ");
        double precio = leer.nextDouble();
        System.out.println("Registre el porcentaje de descuento: ");
        double descuento = leer.nextDouble();
        double precioFinal = precio - (precio * descuento / 100);
        System.out.println("El precio final del producto es: " + precioFinal);
    }
}
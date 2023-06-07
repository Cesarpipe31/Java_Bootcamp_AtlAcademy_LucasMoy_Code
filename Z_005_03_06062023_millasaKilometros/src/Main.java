import java.util.Scanner;

/*
2) Conversor de millas a kilómetros:
Pídele al usuario que ingrese una distancia en millas.
Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
Muestra la distancia en kilómetros al usuario.
 */
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Registre la distancia en millas: ");
        double distanciaMillas = leer.nextDouble();
        double distanciaKilometros = distanciaMillas * 1.60934;
        System.out.println("La distancia en kilometros es: " + distanciaKilometros);
    }
}
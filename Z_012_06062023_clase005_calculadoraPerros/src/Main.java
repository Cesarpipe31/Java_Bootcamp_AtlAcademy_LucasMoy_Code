import java.util.Scanner;

/*
1) Calculadora de edad de perros:
Pídele al usuario que ingrese la edad de su perro.
Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro)
*/

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba la edad de su perro: ");
        int edadPerro = leer.nextInt();
        int edadSimulada = edadPerro * 7;
        System.out.println("La edad de su perro, que es " + edadPerro + " años, equivale a " + edadSimulada + " de un humano.");
        }

}
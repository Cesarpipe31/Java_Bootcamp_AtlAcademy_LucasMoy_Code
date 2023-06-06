import java.util.Scanner;

/*
5) Juego de adivinar el número:
Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
 */
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero = (int) (Math.random() * 9 + 1);
        int numeroRegistrado = 0;
        do {
            System.out.println("Registre un número entero entre 1 a 10: ");
            numeroRegistrado = leer.nextInt();
            if (numero == numeroRegistrado){
                System.out.println("Adivinaste!!!.  El número " + numero + " es igual al número que has registrado: " + numeroRegistrado);
            }
        }while(numero != numeroRegistrado);
    }
}
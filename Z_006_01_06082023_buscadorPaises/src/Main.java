import java.awt.*;
import java.net.URI;
import java.util.Scanner;

/*
1)	Arma un buscador de países con Google Maps.
Primero, pidele al usuario que ingrese un país (Ej: Colombia).
Después muestra en consola la concatenación de:
“https://www.google.com/maps/search/” + pais
Entonces, cuando hagas click en el link que aparece en consola, te abrirá esa ubicación.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Escribe el nombre del país a buscar en Google Maps: ");
        String pais = leer.nextLine();
        Desktop d = Desktop.getDesktop();
        d.browse(new URI("https://www.google.com/maps/search/" + pais));
    }
}
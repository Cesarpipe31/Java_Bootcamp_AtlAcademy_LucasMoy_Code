import java.awt.*;
import java.net.URI;
import java.util.Scanner;

/*
2)	Arma un buscador de tweets para Twitter.com. Es bastante similar al anterior.
Pídele al usuario que ingrese el nombre de una celebridad (de una sola palabra), por ejemplo: “Messi”.
Después muestra en consola la concatenación de:
“https://twitter.com/search?q=” + palabra
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("\nPara buscar una persona tendría que colocar %20 por Ejemplo: César%20Augusto%20Delgado%20Alvarado ");
        System.out.println("Escribe la celebridad a buscar en Twitter: ");
        String celebridad = leer.nextLine();
        Desktop d = Desktop.getDesktop();
        d.browse(new URI("https://twitter.com/search?q=" + celebridad));
    }
}
import java.awt.*;
import java.net.URI;
import java.util.Scanner;

/*
3)	Arma un programa que permita llamar a una persona por Whatsapp. Es similar al anterior.
Pídele al usuario que ingrese un número de telefono sin espacios, por ejemplo: 5493541539405
Después muestra en consola la concatenación de:
“https://api.whatsapp.com/send?phone=” + telefono
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Escribe el número celular para llamar por WhatsApp: ");
        String numero = leer.nextLine();
        Desktop d = Desktop.getDesktop();
        d.browse(new URI("https://api.whatsapp.com/send?phone=" + numero));
    }
}
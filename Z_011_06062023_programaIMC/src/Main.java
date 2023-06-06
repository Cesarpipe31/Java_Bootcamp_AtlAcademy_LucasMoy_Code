import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe el peso de la persona (en kilogramos): ");
        double peso = leer.nextDouble();
        System.out.println("Escirbe la altura de la persona (en metros):" );
        double altura = leer.nextDouble();

        double imc = peso / (Math.pow(altura,2));

        if (imc < 18.5){
            System.out.println("Su IMC está en un nivel bajo");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Su IMC está en un nivel normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Su IMC está en un nivel de sobrepeso");
        }else if (imc >= 30) {
            System.out.println("Su IMC está en un nivel obeso");
    }
}
    }
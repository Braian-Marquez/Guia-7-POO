package Ejercicio08;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cadena frase = new Cadena();
        System.out.println("Ingrese una frase");
        frase.setFrase(read.next());
        frase.setLongitud(frase.getFrase().length());
        frase.mostrarVocales();
        frase.invertirFrase();
        System.out.println("Ingrese una letra");
        String letra = (read.next());
        frase.vecesRepetida(letra);
        System.out.println("Ingrese una frase nuevamente: ");
        String frase2 = read.next();
        frase.compararLongitud(frase2);
        System.out.println("Ingrese una frase nuevamente: ");
        String frase3 = read.next();
        frase.unirFrase(frase3);
        System.out.println("");
        System.out.println("Ingrese un caracter");
        String caracter = read.next();
        frase.reemplazar(caracter);
        System.out.println("Ingresar una letra");
        String letra2 = read.next();
        frase.contiene(letra2);

    }

}

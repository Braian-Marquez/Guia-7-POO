package Ejercicio06;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cafetera cafe = new Cafetera();
        cafe.setCapacidadMaxima(2000);
        cafe.llenarCafetera();
        System.out.println("Ingresar el tamaño de la taza");
        double tamaño = read.nextDouble();
        cafe.servirTaza(tamaño);
        cafe.vaciarCafetera();
        System.out.println("Ingresar la cantidad de cafe que desea agregar");
        double agregar = read.nextDouble();
        cafe.agregarCafe(agregar);
    }

}

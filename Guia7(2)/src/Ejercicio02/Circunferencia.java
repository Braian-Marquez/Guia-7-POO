package Ejercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Circunferencia {

    private double radio;

    public Circunferencia() {

    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void cargarCircunferencia() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("");
        System.out.println("ingresar el radio de la circunferencia");
        radio = leer.nextDouble();
    }

    public void area() {
        System.out.println("");
        System.out.printf("El area del circulo es %.2f\n", (Math.PI * Math.pow(radio, 2)));
    }

    public void perimetro() {
        System.out.println("");
        System.out.printf("El area del circulo es %.2f\n", (2 * Math.PI * (radio)));
    }
}

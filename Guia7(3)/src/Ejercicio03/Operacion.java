package Ejercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Operacion {

    private double n1;
    private double n2;

    public Operacion() {

    }

    public Operacion(double n1, double n2) {

    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public void crearOperacion() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingresar primer numero para operar");
        n1 = leer.nextDouble();
        System.out.println("Ingresar segundo numero para operar");
        n2 = leer.nextDouble();

    }

    public double suma() {
        return (n1 + n2);
    }

    public double resta() {
        return (n1 - n2);
    }

    public double multiplicar() {
        if (n1 == 0 || n2 == 0) {
            System.out.println("Error multiplicando por 0");
            return 0;
        } else {
            return (n1 * n2);
        }
    }

    public double dividir() {
        if (n1 == 0 || n2 == 0) {
            System.out.println("Error dividiendo por 0");
            return 0;
        } else {
            return (n1 / n2);
        }
    }

}

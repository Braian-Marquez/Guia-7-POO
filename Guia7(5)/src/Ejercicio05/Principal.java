package Ejercicio05;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cuenta cuenta = new Cuenta();
        cuenta.crearCuenta();

        System.out.println("Ingresar saldo Adicional");
        cuenta.ingresar(read.nextDouble());
        System.out.println("");
        System.out.println("Ingresar saldo a retirar");
        cuenta.retirar(read.nextDouble());
        cuenta.extraccionRapida();
        cuenta.consultarSaldo();
        cuenta.consultarDatos();

    }

}

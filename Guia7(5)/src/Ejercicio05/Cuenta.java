package Ejercicio05;

import java.util.Locale;
import java.util.Scanner;

public class Cuenta {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    private int numeroCuenta;
    private long DNI;
    private double saldoActual;

    public Cuenta() {

    }

    public Cuenta(int numeroCuenta, long DNI, double saldoActual) {

    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void crearCuenta() {

        System.out.println("Ingrese numero de cuenta");
        numeroCuenta = leer.nextInt();
        System.out.println("Ingrese el DNI");
        DNI = leer.nextLong();
        System.out.println("Ingrese el saldo actual");
        saldoActual = leer.nextDouble();
    }

    public void ingresar(double ingreso) {

        this.saldoActual += ingreso;

    }

    public void retirar(double retiro) {
        if (saldoActual >= retiro) {
            saldoActual -= retiro;
        } else {
            saldoActual = 0;

        }
    }

    public void extraccionRapida() {
        System.out.println("Extraccion rapida");
        System.out.println("Ingrese dinero a retirar ");
        double ext = leer.nextDouble();
        while (ext > saldoActual * 0.2) {
            System.out.printf("Error saque menos del 20%%");
            ext = leer.nextDouble();
        }
        saldoActual -= ext;
    }

    public void consultarSaldo() {
        System.out.println("El saldo actual es:  "+ saldoActual+"$");

    }

    public void consultarDatos() {
        System.out.printf("El numero de cuentas es %d\n",numeroCuenta);
        System.out.printf("El DNI es %d\n", DNI);
    }
}
/*Realizar una clase llamada Cuenta (bancaria) que debe tener como m??nimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
??? Constructor por defecto y constructor con DNI, saldo, n??mero de cuenta e inter??s.
??? Agregar los m??todos getters y setters correspondientes
??? Metodo para crear un objeto Cuenta, pidi??ndole los datos al usuario.
??? M??todo ingresar(double ingreso): el m??todo recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
??? M??todo retirar(double retiro): el m??todo recibe una cantidad de dinero a retirar y
se la restar?? al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondr?? el saldo actual en 0.
??? M??todo extraccionRapida(): le permitir?? sacar solo un 20% de su saldo. Validar
que el usuario no saque m??s del 20%.
??? M??todo consultarSaldo(): permitir?? consultar el saldo disponible en la cuenta.
??? M??todo consultarDatos(): permitir?? mostrar todos los datos de la cuenta*/

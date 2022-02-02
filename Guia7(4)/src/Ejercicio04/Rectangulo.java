package Ejercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo() {

    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese la base del rectangulo");
        base = leer.nextInt();
        
        System.out.println("ingrese la altura del rectangulo");
        altura = leer.nextInt();

    }
    public void perimetro(){
        System.out.printf("El perimetro del rectangulo es: %d\n",(base+altura)*2);
    }
    public void superficie(){
        System.out.printf("La superficie del rectangulo es: %d\n",(base*altura));
    }
    public void dibujarRectangulo(){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

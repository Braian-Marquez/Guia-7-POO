package Ejercicio10;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        double[] arreglo1 = new double[50];
        double[] arreglo2;
        // matriz1
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i] = (double) Math.round(((Math.random() * 20) + 1) * 100) / 100;
        }

        System.out.println("Arreglo N° 1 cargado con aleatorios");
        System.out.println(Arrays.toString(arreglo1));

        System.out.println("Arreglo 1 ordenado :");
        Arrays.sort(arreglo1);
        System.out.println(Arrays.toString(arreglo1));

        //array2
        arreglo2 = Arrays.copyOfRange(arreglo1, 0, 20);
        System.out.println("Arreglo 2 combinado :");
        Arrays.fill(arreglo2, 10, 20, 0.5);
        System.out.println(Arrays.toString(arreglo2));
    }

}

/*Realizar un programa en Java donde se creen dos arreglos: el primero ser� un arreglo
A de 50 n�meros reales, y el segundo B, un arreglo de 20 n�meros, tambi�n reales. El
programa deber� inicializar el arreglo A con n�meros aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 n�meros ordenados al arreglo B de 20 elementos, y rellenar los 10 �ltimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.*/

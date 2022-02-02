package Ejercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Libro {

    private int isbn;
    private String titulo;
    private String autor;
    private int numeroDePag;
    // constructor vacio

    public Libro() {

    }

    // constructor parametrizado
    public Libro(int isbn, String titulo, String autor, int npag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePag = npag;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNpag() {
        return numeroDePag;
    }

    public void setNpag(int npag) {
        this.numeroDePag = npag;
    }

    public void cargarLibro() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese codigo ISBN");
        this.isbn = leer.nextInt();
        System.out.println("Ingresar titulo");
        this.titulo = leer.next();
        System.out.println("Ingrese autor");
        this.autor = leer.next();
        System.out.println("Ingresar numero de paginas");
        this.numeroDePag = leer.nextInt();
    }

    public void mostrarLibro() {
        System.out.println("");
        System.out.printf("El codigo ISBN del libro es: %d\n", isbn);
        System.out.printf("El titulo del libro es: %s\n", titulo);
        System.out.printf("El autor del libro es: %s\n", autor);
        System.out.printf("El numero de pagina del libro es: %d\n", numeroDePag);

    }
}

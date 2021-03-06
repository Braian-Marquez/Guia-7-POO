package Ejercicio07;

import java.util.Locale;
import java.util.Scanner;

public class Persona {

    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearPersona(int num) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.printf("Ingresar el nombre de la persona %s\n ",num);
        nombre = read.next();
        System.out.printf("Ingresar edad de la persona : %d\n ",num);
        edad = read.nextInt();
        System.out.printf("Ingresar sexo de la persona %s\n ",num);

        sexo = read.next().toUpperCase();

        while (!(sexo.equals("H") || sexo.equals("M")  || sexo.equals("O"))) {
            System.out.println("Error ingresar un caracter correcto");
            sexo = read.next();

        }
        System.out.println("Ingresar peso de la persona  ");
        peso = read.nextDouble();
        System.out.println("Ingresar altura de la persona");
        altura = read.nextDouble();
    }

    public int calcularImc() {
        double Imc = peso / (Math.pow(altura, 2));
        if (Imc < 20) {
            
            return -1;
        }
        else if (Imc > 20 && Imc < 25) {
           
            return 0;
        }
        else if (Imc > 25) {
            
            return 1;
        }
        else{
            return 0;
        }
    }

    public boolean mayorDeEdad() {
        return this.edad >= 18;
        }
    }

/*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea a??adir alg??n
otro atributo, puede hacerlo. Los m??todos que se implementar??n son:
??? Un constructor por defecto.
??? Un constructor con todos los atributos como par??metro.
??? M??todos getters y setters de cada atributo.
??? Metodo crearPersona(): el m??todo crear persona, le pide los valores de los atributos
al usuario y despu??s se le asignan a sus respectivos atributos para llenar el objeto
Persona. Adem??s, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deber?? mostrar un mensaje
??? M??todo calcularIMC(): calculara si la persona est?? en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta f??rmula da por resultado un valor menor que 20, significa
que la persona est?? por debajo de su peso ideal y la funci??n devuelve un -1. Si la
f??rmula da por resultado un n??mero entre 20 y 25 (incluidos), significa que la persona
est?? en su peso ideal y la funci??n devuelve un 0. Finalmente, si el resultado de la
f??rmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
funci??n devuelve un 1.
??? M??todo esMayorDeEdad(): indica si la persona es mayor de edad. La funci??n
devuelve un booleano.
A continuaci??n, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuaci??n, llamaremos todos
los m??todos para cada objeto, deber?? comprobar si la persona est?? en su peso ideal,
tiene sobrepeso o est?? por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por ??ltimo, guardaremos los resultados de los m??todos calcularIMC y esMayorDeEdad
en distintas variables, para despu??s en el main, calcular un porcentaje de esas 4
personas cuantas est??n por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y tambi??n calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.*/

package Ejercicio08;

public class Cadena {

    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void mostrarVocales() {
        int contV = 0;
        for (int i = 0; i < this.longitud; i++) {
            if (frase.toLowerCase().charAt(i) == 'a' || frase.toLowerCase().charAt(i) == 'e' || frase.toLowerCase().charAt(i) == 'i' || frase.toLowerCase().charAt(i) == 'o' || frase.toLowerCase().charAt(i) == 'u') {
                contV++;
            }

        }
        System.out.println("La frase tiene " + contV + " VOCALES");
    }

    public void invertirFrase() {
        String nuevaFrase = "";
        for (int i = longitud - 1; i >= 0; i--) {

            nuevaFrase = nuevaFrase + frase.charAt(i);
        }
        System.out.printf("La frase invertida es %s \n", nuevaFrase);
    }

    public void vecesRepetida(String letra) {
        int contCaracter = 0;
        for (int i = 0; i < this.longitud; i++) {
            if (frase.substring(i, i + 1).equalsIgnoreCase(letra)) {
                contCaracter++;
            }

        }
        System.out.println("La letra ingresada se repitio " + contCaracter + " Veces");
    }

    public void compararLongitud(String frase2) {
        if (frase.length() == frase2.length()) {
            System.out.println("Ambas frases tienen la misma longitud");
        } else {
            System.out.println("Las frases tienen diferente longitud ");
        }
    }

    public void unirFrase(String frase3) {
        System.out.println("La frase concatenada es:");
        System.out.print(frase +" "+ frase3);
    }

    public void reemplazar(String caracter) {
        String remplazo;
        remplazo = this.frase.replace("a", caracter);
        System.out.printf("La frase con el caracter %s da como resultado %s \n", caracter, remplazo);
    }

    public void contiene(String letra2) {

        if (this.frase.contains(letra2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}

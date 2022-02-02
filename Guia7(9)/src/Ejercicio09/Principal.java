package Ejercicio09;

public class Principal {

    public static void main(String[] args) {
        Matematica calculos = new Matematica();
        calculos.setNum1((int) (Math.random() * 20));
        calculos.setNum2((int) (Math.random() * 20));
        calculos.devolverMayor();
        calculos.calcularPotencia();
        calculos.calcularRaiz();
    }

}

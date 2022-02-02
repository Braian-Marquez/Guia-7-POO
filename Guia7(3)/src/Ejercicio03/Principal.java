package Ejercicio03;

public class Principal {

    public static void main(String[] args) {
        Operacion op = new Operacion();
        op.crearOperacion();
        System.out.printf("El resultado de la suma de %f + %f es %f ", op.getN1(), op.getN2(), op.suma());
        System.out.printf("El resultado de la resta de %f - %f es %f ", op.getN1(), op.getN2(), op.resta());
        System.out.printf("El resultado de la multiplicacion de %f * %f es %f ", op.getN1(), op.getN2(), op.multiplicar());
        System.out.printf("El resultado de la division de %f / %f es %f ", op.getN1(), op.getN2(), op.dividir());

    }

}

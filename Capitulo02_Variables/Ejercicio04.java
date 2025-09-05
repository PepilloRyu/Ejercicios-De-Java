/*
 * Ejercicio 4
 * Realiza un conversor de euros a pesos. La cantidad en euros que se quiere
 * convertir deberá estar almacenada en una variable.
*/

public class Ejercicio04
{
    public static void main(String[] args) 
    {
        double euro = 21.88;
        System.out.println("||||||| CONVERSOR DE EUROS A PESOS |||||||");
        System.out.println("Valor del euro : " + euro);
        int cantidadEuros = 10;
        double total = euro * cantidadEuros;
        System.out.println("El total es : " + total);
    }
}
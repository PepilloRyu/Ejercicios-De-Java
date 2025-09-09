/*
 * Ejercicio 2
 * Realiza un conversor de euros a pesos. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
*/
import java.util.Scanner;

public class Ejercicio02
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del euro actual");
        double valorEuro = entrada.nextDouble();
        System.out.println("¿Cuántos euros desea cambiar?");
        int cantidadEuros = entrada.nextInt();

        double cantidadPesos = cantidadEuros * valorEuro;

        System.out.println("La cantidad de " + cantidadEuros +"a pesos es : " + cantidadPesos );
    }
}
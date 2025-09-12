/*
 * Ejercicio 3
 * Realiza un conversor de pesos a euros. La cantidad de pesos que se quiere
 * convertir debe ser introducida por teclado.
*/
import java.util.Scanner;

public class Ejercicio03
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del euro : ");
        double valorEuro = entrada.nextDouble();

        System.out.println("Ingrese la cantidad de pesos : ");
        int cantidadPesos = entrada.nextInt();

        double cantidadEuros = cantidadPesos / valorEuro;

        System.out.println("\n--- Resumen de la conversión ---");
        System.out.printf("Tipo de cambio: 1 euro = %.2f pesos%n", valorEuro);
        System.out.printf("Cantidad a convertir: %d pesos%n", cantidadPesos);
        System.out.printf("Total recibido: %.2f euros%n", cantidadEuros);
    }
}
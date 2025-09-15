/*
 * Ejercicio 7
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible.
*/

import java.util.Scanner;
public class Ejercicio07
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el precio : ");
        double precio = entrada.nextDouble();
        double baseImponible = 0.16;

        double total = (precio * baseImponible) + precio;

        System.out.println("---FACTURA---");
        System.out.println("Precio : ----------------- $" + precio);
        System.out.printf("Base imponible (IVA) :---- $%.2f\n", baseImponible);
        System.out.printf("Total  : ----------------- $%.2f ", total);
    }
}
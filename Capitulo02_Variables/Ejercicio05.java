/*
 * Ejercicio 5
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible (precio sin IVA). La base imponible estará almacenada en una
 * variable
*/

public class Ejercicio05
{
    public static void main(String[] args) 
    {
        double iva = 0.16;
        double cantidadPagar = 100.0;
        double cantidadDePrecioPorIVA = cantidadPagar * iva;
        double total = cantidadPagar + cantidadDePrecioPorIVA;

        System.out.println("---------------------");
        System.out.println("|||||| FACTURA ||||||");
        System.out.println("---------------------");
        System.out.printf("%-25s %.2f%n", "Base Imponible (sin IVA):", cantidadPagar);
        System.out.println("Cantodad a pagar (con IVA) : "+ total);
    }
}   
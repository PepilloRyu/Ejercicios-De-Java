/*
 * Ejercicio 5
 * Escribe un programa que calcule el área de un rectángulo.
*/
import java.util.Scanner;
public class Ejercicio05
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("----CALCULADORA DE AREA DE UN RECTANGULO---");

        double altura;
        do 
        {
            System.out.println("Ingrese la altura del rectangulo: ");
            altura = entrada.nextDouble();
            if (altura <= 0) 
            {
                System.out.println("ERROR : La altura debe ser mayor que 0");
            }
        }while(altura <= 0);
        System.out.printf("La altura regustrada es de %.2f\n", altura);

        double base;
        do
        {
            System.out.println("\nIngrese la base : \n");
            base = entrada.nextDouble();
            if (base <= 0) 
            {
                System.out.println("La base debe ser mayor que 0");
            }
        }while(base <= 0);
        System.out.printf("La base regustrada es de %.2f", base);

        double areaRectangulo = base * altura;

        System.out.printf("La area del rectangulo es de : %.2f\n", areaRectangulo);
    }
}
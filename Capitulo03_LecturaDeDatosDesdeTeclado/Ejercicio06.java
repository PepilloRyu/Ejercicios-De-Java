/*
 * Ejercicio 6
 * Escribe un programa que calcule el área de un triángulo
*/
import java.util.Scanner;
public class Ejercicio06
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        double base;
        double altura;

        System.out.println("---- CALCULADORA DE ÁREA DE UN TRIÁNGULO ----");
        do 
        { 
            System.out.println("Ingrese la base del triangulo : ");
            base = entrada.nextDouble();
            if (base <= 0)
            {
                System.out.println("Ingrese una entrada mayor a 0");
            }
        }while(base <=  0);

        do 
        { 
            System.out.println("Ingrese la altura del triangulo : ");
            altura = entrada.nextDouble();
            if (altura <= 0)
            {
                System.out.println("Ingrese una entrada mayor a 0");
            }
        }while(altura <=  0);
        double areaTriangulo = (base * altura) / 2;

        System.out.println("La area del triangulo es : " + areaTriangulo);
    }
}
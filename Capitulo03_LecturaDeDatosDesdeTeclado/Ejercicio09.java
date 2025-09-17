/*
 * Ejercicio 9
 * Escribe un programa que calcule el volumen de un cono según la fórmula 
 * V = 1/3 π r**2 h
 * 
*/
import static java.lang.StrictMath.pow;
import java.util.Scanner;

public class Ejercicio09
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);  

        System.out.println("\n________________________________");
        System.out.println("Calculador de volumen de un cono");
        System.out.println("________________________________");

        double radio;
        do
        {
            System.out.println("Ingrese el radio : ");
            radio = entrada.nextDouble();
            if (radio <= 0) 
            {
                System.out.println("Ingrese un número mayor que 0");
            }
        }while(radio <= 0);

        double altura;

        do
        { 
            System.out.println("Ingrese la atura : ");
            altura = entrada.nextDouble();
            if (altura <= 0) 
            {
                System.out.println("Ingrese un número mayor que 0");
            }
        } while (altura <= 0);

        double volumen;
        volumen = (1.0/3.0) *(Math.PI) * (pow(radio,2)) * (altura);
        
        System.out.printf("El volumen del cono es de : %.3f", volumen);
    }
}
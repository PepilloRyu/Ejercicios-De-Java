/*
 * Ejercicio 4
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 */
import java.util.Scanner;
public class Ejercicio04
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer número : ");
        double numUno = entrada.nextDouble();

        System.out.println("Ingrese el segundo número : ");
        double numDos = entrada.nextDouble();

        double suma = numUno + numDos;
        double resta = numUno - numDos;
        double multiplicación = numUno * numDos;
      
        System.out.println("----RESULTADOS----");
        System.out.printf("Suma ->  %.2f + %.2f = %.2f \n", numUno, numDos, suma);
        System.out.printf("Resta ->  %.2f - %.2f = %.2f\n", numUno, numDos, resta);
        System.out.printf("Multiplicación ->  %.2f * %.2f = %.2f\n", numUno, numDos, multiplicación);
        
        if (numDos == 0) 
        {  
            System.out.println("El segundo número debe ser diferente de 0");
        }
        else
        {
            double division = numUno / numDos;
            System.out.printf("División ->  %.2f / %.2f = %.2f\n", numUno, numDos, division);
        }
    }
}
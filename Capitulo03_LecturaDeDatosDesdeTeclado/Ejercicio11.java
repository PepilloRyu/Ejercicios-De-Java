/*
 * Ejercicio 11
 * Realiza un conversor de Kb a Mb.
*/
import java.util.Scanner;
public class Ejercicio11
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("_______________________");
        System.out.println("|Calculadora de Kb a Mb|");
        System.out.println("-----------------------");
        
        int Kb;
        do
        {
            System.out.println("Ingrese los Kb :");
            Kb = entrada.nextInt();
            if(Kb <= 0)
            {
                System.out.println("Ingrese una entrada mayor a 0");
            }
        }while(Kb <= 0);

        double Mb = (long) Kb / 1024.0;

        System.out.println("---Resultado---");
        System.out.printf("%d Kb equivalen a %.2f Mb", Kb, Mb );
    }
}
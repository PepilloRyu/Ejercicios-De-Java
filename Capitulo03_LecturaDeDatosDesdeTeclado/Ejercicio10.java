/*
 * Ejercicio 10
 * Realiza un conversor de Mb a Kb.
 * Mb -> 1024 Kb
 * Kb -> 1024 Bytes
*/
import java.util.Scanner;
public class Ejercicio10
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("_______________________");
        System.out.println("|Calculadora de Mk a Kb|");
        System.out.println("-----------------------");

        int Mb;
        do
        {
        System.out.println("Ingrese los Mb : ");
        Mb = entrada.nextInt();
        if(Mb <= 0)
        {
            System.out.println("Ingrese una entrada mayor a 0");
        }
        }while(Mb <= 0);

        long Kb = (long) Mb * 1024;

        System.out.println("---Resultado---");
        System.out.printf("%d Mb equivalen a %d Kb", Mb, Kb);
    }
}
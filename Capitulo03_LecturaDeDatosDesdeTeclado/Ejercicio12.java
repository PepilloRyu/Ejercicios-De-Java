/*
 * Ejercicio 12
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 * segundo examen un 60%.
 * Ejemplo 1:
 * Introduce la nota del primer examen: 7
 * ¿Qué nota quieres sacar en el trimestre? 8.5
 * Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen.
 * Ejemplo 2:
 * Introduce la nota del primer examen: 8
 * ¿Qué nota quieres sacar en el trimestre? 7
 * Para tener un 7 en el trimestre necesitas sacar un 6.33 en el segundo examen.
 */
import java.util.Scanner;
public class Ejercicio12
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        double primerNota ;
        do
        {
        System.out.println("Introduce tu primer nota dele examen : ");
        primerNota = entrada.nextDouble();

        if (primerNota < 0 || primerNota > 10)
        {
            System.out.println("Ingrese una nota válida entre 0-10");
        }
        }while(primerNota <= 0 || primerNota > 10);


        double notaDeseada;
        do
        {
        System.out.println("¿Qué nota quieres sacar en el trimestre?");
        notaDeseada = entrada.nextDouble();
        if (notaDeseada < 0 || notaDeseada > 10)
        {
            System.out.println("Ingrese una nota valida entre 0-10");
        }
        }while(notaDeseada < 0 || notaDeseada > 10);

        double notaPrimero = primerNota * 0.40;
        double notaSegundo = notaDeseada * 0.60;

        System.out.printf("\n1er nota : %.2f\n" , notaPrimero);
        System.out.printf("2da nota : %.2f" , notaSegundo);

        double notaNecesaria = (notaDeseada - (primerNota * 0.40)) / 0.60;

        System.out.printf("\nPara tener %.2f, necesitas un %.2f en el segundo examen.%n",notaDeseada, notaNecesaria);
    }
}
/*
 * Ejercicio 4
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
 * la hora.
 * Ejemplo 1:
 * Por favor, introduzca el número de horas trabajadas durante la semana: 36
 * El sueldo semanal que le corresponde es de 432 euros
 * Ejemplo 2:
 * Por favor, introduzca el número de horas trabajadas durante la semana: 40
 * El sueldo semanal que le corresponde es de 480 euros
 * Ejemplo 3:
 * Por favor, introduzca el número de horas trabajadas durante la semana: 55
 * El sueldo semanal que le corresponde es de 720 euros
*/
import java.util.Scanner;
public class Ejercicio04
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        int horasOrdinarias = 40;
        double tarifaOrdinaria = 12.0;
        double tarifaExtra = 16.0;     
        
        int horasTrabajadas;
        
        do
        {
            System.out.print("Introduzca el numero de horas trabajadas durante la semana: ");
            horasTrabajadas = entrada.nextInt();
            
            if (horasTrabajadas < 0)
            {
                System.out.println("Las horas trabajadas no pueden ser negativas.\n");
            }
        }while(horasTrabajadas < 0);
        
        double salarioTotal;
        
        if (horasTrabajadas <= horasOrdinarias)
        {
            salarioTotal = horasTrabajadas * tarifaOrdinaria;
        } 
        else 
        {
            int horasExtras = horasTrabajadas - horasOrdinarias;
            salarioTotal = (horasOrdinarias * tarifaOrdinaria) + (horasExtras * tarifaExtra);
        }
        
        System.out.printf("El sueldo semanal que le corresponde es de %.0f euros%n", salarioTotal);
        
        if (horasTrabajadas > horasOrdinarias)
        {
            System.out.println("\n--- Resumen ---");
            System.out.printf("Horas ordinarias (%d h) x %.0f €/h = %.0f €%n",horasOrdinarias, tarifaOrdinaria, horasOrdinarias * tarifaOrdinaria);
            System.out.printf("Horas extras (%d h) x %.0f €/h = %.0f €%n",(horasTrabajadas - horasOrdinarias), tarifaExtra, 
                             (horasTrabajadas - horasOrdinarias) * tarifaExtra);
        }
    }
}
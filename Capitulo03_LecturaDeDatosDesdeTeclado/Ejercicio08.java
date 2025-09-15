/*
 * Ejercicio 8
 * Escribe un programa que calcule el salario semanal de un empleado en base a
 * las horas trabajadas, a razón de 12 euros la hora.
*/
import java.util.Scanner;
public class Ejercicio08
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cuantas horas laboro : ");
        int horasLaboradas = entrada.nextInt();

        double salarioPorHora = 12;

        double salario = horasLaboradas * salarioPorHora;

        System.out.println("Ingrese cuantos dias trabajo a la semanada : ");
        int diasTrabajadosLaaSemana = entrada.nextInt();

        double totalSemana = salario * diasTrabajadosLaaSemana;

        System.out.println("---RESUMEN---");
        System.out.println("Horas laboradas : _______________ "+ horasLaboradas);
        System.out.println("Salario por hora : ______________ "+ salarioPorHora);
        System.out.println("Salario por dia : _______________ "+ salario);
        System.out.println("Dias trabajados a la semana : ___ " + diasTrabajadosLaaSemana);
        System.out.println("---------------------------------------");
        System.out.println("Total : ________________________ " + totalSemana);
    }
}
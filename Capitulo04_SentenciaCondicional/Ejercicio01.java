/*
 * Ejercicio 1
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
*/

import java.util.Scanner;
public class Ejercicio01 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("--- HORARIO DE PRIMERA HORA ---");
        System.out.println("1. Lunes");
        System.out.println("2. Martes");
        System.out.println("3. Miércoles");
        System.out.println("4. Jueves");
        System.out.println("5. Viernes");
        System.out.print("Seleccione un día (1-5): ");
        
        int dia = entrada.nextInt();
        
        // Switch expression moderna y concisa
        String asignatura = switch (dia) {
            case 1 -> "Programación";
            case 2 -> "Sistemas Informáticos";
            case 3 -> "Base de Datos";
            case 4 -> "Teoria de la Computación";
            case 5 -> "Estructura de datos";
            default -> "No hay clases.";
        };
        
        System.out.println("\n--- RESULTADO ---");
        System.out.println("Este día a primera hora toca: " + asignatura);
    }
}

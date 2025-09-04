/*
 * Ejercicio 4
 * Escribe un programa que muestre tu horario de clase.  
*/

public class Ejercicio04 {
    public static void main(String[] args) {
        
        // Imprimir el encabezado de la tabla
        System.out.println("MI HORARIO DE CLASE");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("%-8s %-15s %-15s %-15s %-15s %-15s%n", "HORA", "LUNES", "MARTES", "MIÉRCOLES", "JUEVES", "VIERNES");
        System.out.println("-----------------------------------------------------------------------------------");
        
        // Imprimir las filas de cada hora
        System.out.printf("%-8s %-15s %-15s %-15s %-15s %-15s%n", 
                          "8:15", "Programación", "Sistemas", "Programación", "Sistemas", "Programación");
        System.out.printf("%-8s %-15s %-15s %-15s %-15s %-15s%n", 
                          "9:15", "Programación", "Sistemas", "Programación", "Sistemas", "Programación");
        System.out.printf("%-8s %-15s %-15s %-15s %-15s %-15s%n", 
                          "10:15", "Fol", "Fol", "Fol", "Fol", "Sistemas");
        System.out.printf("%-8s %-15s %-15s %-15s %-15s %-15s%n", 
                          "11:45", "Sistemas", "Programación", "Sistemas", "Programación", "Sistemas");
        System.out.printf("%-8s %-15s %-15s %-15s %-15s %-15s%n", 
                          "12:45", "Sistemas", "Programación", "Sistemas", "Programación", "Sistemas");
        System.out.printf("%-8s %-15s %-15s %-15s %-15s %-15s%n", 
                          "13:45", "BBDD", "L. Marcas", "BBDD", "L. Marcas", "BBDD");
        
        System.out.println("-----------------------------------------------------------------------------------");
    }
}
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
                          "8:30", "DSD", "REDES", "REDES", "DSD", "REDES");
        System.out.printf("%-8s %-15s %-15s %-15s %-15s %-15s%n", 
                          "10:30", "WEB", "ADS", "WEB", "WEB", "DSD");
        System.out.printf("%-8s %-15s %-15s %-15s %-15s %-15s%n", 
                          "12:00", "ADS", "AVANZ", "AVANZ", "ADS", "AVANZ");    
        System.out.println("-----------------------------------------------------------------------------------");
    }

}

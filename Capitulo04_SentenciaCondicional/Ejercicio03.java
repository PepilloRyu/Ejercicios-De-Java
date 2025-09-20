/*
 * Ejercicio 3
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspon-
 * diente nombre del día de la semana.
*/
import java.util.Scanner;
public class Ejercicio03
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);    
        
        int dia;

        do
        {
            System.out.println("Ingrese el numero del dia de la semana (1-7): ");
            dia = entrada.nextInt();
            if(dia <= 0 || dia > 7)
            {
                System.out.println("Ingrese un numero valido");
            }
        } while (dia <=0 || dia > 7);
        
        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
        }
    }
}
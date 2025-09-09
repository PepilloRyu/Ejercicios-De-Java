/*
 * Ejercicio 1
 * Realiza un programa que pida dos números y que luego muestre el resultado
 * de su multiplicación
*/

import java.util.Scanner;
public class Ejercicio01
{
    public static void main(String[] args) 
    {
        System.out.println("Ingrese un numero : "); 
        Scanner entrada = new Scanner(System.in);    
        int numeroUno = entrada.nextInt();

        System.out.println("Ingrese otro numero : "); 
        int numeroDos = entrada.nextInt();

        int resultado = numeroUno * numeroDos;

        System.out.print("El resultado de la operación es :");
        System.out.println("" + numeroUno + "*" + numeroDos + "=" + resultado);
    }
}
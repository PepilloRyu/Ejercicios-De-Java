/*
 *  Ejercicio 3
 * Escribe un programa que muestre por pantalla 10 palabras en inglés junto a su
 * correspondiente traducción al castellano. Las palabras deben estar distribuidas
 * en dos columnas y alineadas a la izquierda.
 * Ejemplo:
 * computer ordenador
 * student alumno\a
 * cat gato
 * penguin pingüino
 * machine máquina
 * nature naturaleza
 * light luz
 * green verde
 * book libro
 * pyramid pirámid
*/

public class Ejercicio03
{
    public static void main(String[] args) 
    {
        System.out.printf("%-15s %s%n","Computer","Ordenador");    
        System.out.printf("%-15s %s%n","Student","Alumno");
        System.out.printf("%-15s %s%n","Cat","Gato");
        System.out.printf("%-15s %s%n","Penguin","Pingüino");
        System.out.printf("%-15s %s%n","Machine","Maquina");
        System.out.printf("%-15s %s%n","Nature","Naturaleza");
        System.out.printf("%-15s %s%n","Light","Luz");
        System.out.printf("%-15s %s%n","Green","Verde");
        System.out.printf("%-15s %s%n","Book","Libro");
        System.out.printf("%-15s %s%n","Pyramid","Pirámide");
    }
}
/*
%s -> significa que va a sustituir una cadena. 
%n -> es un salto de línea.
*/

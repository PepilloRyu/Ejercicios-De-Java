/*
 * Ejercicio 7
 * Escribe un programa que declare 5 variables de tipo char. A continuación, crea
 * otra variable como cadena de caracteres y asígnale como valor la concatena-
 * ción de las anteriores 5 variables. Por último, muestra la cadena de caracteres
 * por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?
*/

public class Ejercicio07
{
    public static void main(String[] args)
    {
        char var1 = 'a';
        char var2 = 'b';
        char var3 = 'c';
        char var4 = 'd';
        char var5 = 'e';
        String cadena = "" + var1 + var2 + var3 + var4 + var5;
        System.out.printf("Cadena : " + cadena);
    }
}
    /*
    * Ejercicio 2
    * Realiza un programa que pida una hora por teclado y que muestre luego buenos
    * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
    * 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
    * horas, los minutos no se deben introducir por teclado
    */
    import java.util.Scanner;
    public class Ejercicio02
    {
        public static void main(String[] args) 
        {
            Scanner entrada = new Scanner(System.in);

            int hora;
            do
            {
                System.out.println("Ingres la hora en formato 24hrs: ");
                hora = entrada.nextInt();
                if(hora <= 0 || hora > 24)
                {
                    System.out.println("Ingrese una entrada valida");
                }
            }while(hora <= 0 || hora > 24);

            if (hora >= 6 && hora <= 12) 
            {
                System.out.println("Buenos dias");
            }
            else if (hora >= 13 && hora <= 20) 
            {
                System.out.println("Buenos tardes");
            }
            else
            {
                System.out.println("Buenos noches");
            }
        }
    }
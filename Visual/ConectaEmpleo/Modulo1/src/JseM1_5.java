import java.util.Scanner;
import java.util.Random;

/** ---Comentario de Documentacion---
 * @Programa: "Conecta Empleo"
 * @author: Ribas Carlos
 * @version 1.0.0
 * @see: 
 */

/* ---Comentario de bloque---
 * Se trata de utilizando Random, se generen números aleatorios 
 * tantas veces como otro número aleatorio indique. Este número 
 * aleatorio hará de variable contadora de un bucle for.
 * Se aconseja limitar el número aleatorio de la variable contador a un 
 * valor que sea mayor que cero y menor que 20 (aproximadamente).
 * Los números aleatorios en cada iteración deben estar 
 * comprendidos en el rango de 18 a 65.
 * Poner todo el código en la función main
 */
public class JseM1_5{
    public static void main(String[] arg){
        int random1,random2,i;

        Random aleatorio = new Random();

        random1 = aleatorio.nextInt(20);
        random2 = 18 + aleatorio.nextInt(65);

       //System.out.println("1° numero random entre 0 al 20: " + random1);
       //System.out.println("2° numero random entre 18 al 65: " + random2); 
       
        for (i = 0; i < random1; i++) {
            System.out.println(random2);
        }
        System.out.println("Se repite "+random1+", el número:"+random2+".");
    }
}
import java.util.Scanner;

/** ---Comentario de Documentacion---
 * @Programa: "Conecta Empleo"
 * @author: Ribas Carlos
 * @version 1.0.0
 * @see: file:///C:/Users/ribas/Documents/Cursos/Programaci%C3%B3n/JAVA/Conecta%20Empleo/M%C3%93DULO%201.%20INTRODUCCI%C3%93N%20A%20JAVA%20(JSE)/4.JSE_M1_Tipos%20datos%20relacion.pdf
 */

/* ---Comentario de bloque---
 *  Crear una clase con función main, en la que se pida introducir por teclado:
 * • Dos enteros.
 * • Un float.
 * • Dos String.
 * A continuación:
 * • Se suman los tres número y se muestran en pantalla.
 * • Se visualiza el entero mayor.
 * • Se visualiza el resultado de la división del float con el resto de la división de los dos enteros.
 * • Se visualiza la concatenación de las dos cadenas leídas.
 *
 * Para saber los atajos de intellij Ctrl+j
 */
public class JseM1_4{
    public static void main(String[] arg){
       
        int entero1,entero2,resto2;
        float real1,resultado1,resultado2;
        String cadena1,cadena2;

        System.out.println("Ingrese a continuacion los 3 numeros");
        System.out.print("Ingrese un numero entero: ");
        Scanner teclado = new Scanner(System.in);
        entero1 = teclado.nextInt();
        System.out.print("Ingrese un numero entero: ");
        entero2 = teclado.nextInt();
        System.out.print("Ingrese un numero real: ");
        real1 = teclado.nextFloat();
        teclado.nextLine();
        System.out.print("Ingrese su nombre y apellido: ");
        cadena1 = teclado.nextLine();
        System.out.print("Ingrese nombre del modulo que esta realizando: ");
        cadena2 = teclado.nextLine();
        
        resultado1 = entero1 + entero2 + real1;
        System.out.println("El resultado de la suma de los 3 numeros es: "+ resultado1);
        if (entero1 > entero2) {
            System.out.println("El mayor de los enteros es: "+ entero1);
            resultado2 = entero1 / entero2;
            resto2 = entero1 % entero2;            
         } else {
            System.out.println("El mayor de los enteros es: "+ entero2);
            resultado2 = entero1 / entero2;
            resto2 = entero1 % entero2;
        }
        System.out.println("El resultado de la division es: "+resultado2);
        System.out.println(" y su resto es: "+ resto2);
        System.out.println("******************************************");
        System.out.println("Hola "+ cadena1 +", ud acaba de finalizar la practica de "+ cadena2);
        System.out.println("esperamos que siga aprendiendo!");
    }
}
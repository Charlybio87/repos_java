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
public class TipoDatos {
    public static void main(String[] arg){
        int entero1,entero2;
        float real1;
        String palabra1,palabra2;

        System.out.print("Teclea tu edad: "); //Teclear número y almacenarlo en variable
        Scanner teclado = new Scanner(System.in);
        entero1 = teclado.nextInt();            //Declarar una referencia para cadenas de caracteres
        System.out.print("Teclea tu nombre: ");//Teclear una cadena de caracteres
                                               //Hay que recoger el CR (fin de línea) pulsado para introducir número
        teclado.nextLine();
        palabra1 = teclado.nextLine();
        System.out.print("Teclea tu apellido: ");
        palabra2 = teclado.nextLine();

        System.out.println("Que año es!? ");
        Scanner teclado1 = new Scanner(System.in);
        entero2 = teclado1.nextInt();

        System.out.print("¡¡ ");
        String palabra3 = "hola mundo !!";
        System.out.println(palabra3);

        System.out.println("hola "+palabra1 +" "+ palabra2+" tu edad es de "+entero1+" años.");

        for (int i = 0; i < 3; i++) {
            System.out.println("Gracias!!");
        }
        int i = 0;
        while (i <3){
            System.out.println("Hola "+ palabra1+" "+palabra2);
            i++;
        }
    }
}

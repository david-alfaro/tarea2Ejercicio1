package alfaroviquez.david.iu;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Clase de interfaz de usuario
 * En esta clase se define
 * lo que se mostrara al usuario en consola
 *
 * @author David Alfaro Viquez
 * @version 1.0
 * @since 22/10/2020
 */
public class IU {

    PrintStream output = new PrintStream(System.out);
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    /**
     * Metodo para imprimir el menu en consola
     */
    public void mostrarMenu(){
        output.println("Escoja una opcion: ");
        output.println("1. Registrar empleado");
        output.println("2. Registrar computadora");
        output.println("3. Asignar computadora");
        output.println("4. Listar empleados");
        output.println("5. Listar computadoras");
        output.println("6. Salir");
    }

    /**
     * Metodo para leer un numero entero que ingrese el usuario en pantalla
     * @return retorna la opcion que escogio el usuario
     */
    public int leerOpcion(){
        output.println("Su opcion--->");
        return input.nextInt();
    }

    /**
     * Metodo para leer el texto que el usuario ingrese en consola
     * @return retorna una linea de texto
     */
    public String leerTexto(){
        return input.next();
    }

    /**
     * Funcion para imprimir un mensaje en consola
     * @param msg es el mensaje que se va a imprimir en consola
     */
    public void imprimirMensaje(String msg){
        output.println(msg);
    }
}

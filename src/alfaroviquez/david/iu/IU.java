package alfaroviquez.david.iu;

import java.io.PrintStream;
import java.util.Scanner;

public class IU {

    PrintStream output = new PrintStream(System.out);
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void mostrarMenu(){
        output.println("Escoja una opcion: ");
        output.println("1. Registrar empleado");
        output.println("2. Registrar computadora");
        output.println("3. Asignar computadora");
        output.println("4. Listar empleados");
        output.println("5. Listar computadoras");
        output.println("6. Salir");
    }

    public int leerOpcion(){
        output.println("Su opcion--->");
        return input.nextInt();
    }
    public String leerTexto(){
        return input.next();
    }

    public void imprimirMensaje(String msg){
        output.println(msg);
    }
}

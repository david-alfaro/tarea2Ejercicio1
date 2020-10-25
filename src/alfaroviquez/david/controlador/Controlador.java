package alfaroviquez.david.controlador;

import alfaroviquez.david.bl.entidades.Computadora;
import alfaroviquez.david.bl.entidades.Empleado;
import alfaroviquez.david.bl.logica.Gestor;
import alfaroviquez.david.iu.IU;
import java.util.ArrayList;

/**
 * Clase controlador
 *
 * @author David Alfaro Viquez
 * @version 1.0
 * @since 22/10/2020
 */

public class Controlador {
    Gestor gestor = new Gestor();
    IU iu = new IU();

    /**
     * Metodo para ejecutar el programa en el main
     */
    public void ejecutarPrograma() {
        int opcion = 0;
        do {
            iu.mostrarMenu();
            opcion = iu.leerOpcion();
            procesarOpcion(opcion);
        } while (opcion != 6);


    }

    /**
     * Metodo para procesar la opcion que escogio el usuario
     * La opcion se procesa en un switch-case
     *
     * @param opcion de menu escogida por el usuario
     */

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                registrarEmpleado();
                break;
            case 2:
                registrarComputadora();
                break;
            case 3:
                asignarEquipo();
                break;
            case 4:
                listarEmpleados();
                break;
            case 5:
                listarComputadoras();
                break;
            case 6:
                break;
            default:
                iu.imprimirMensaje("Opcion no valida");
        }
    }

    /**
     * Metodo para registrar empleado
     * Utiliza el gestor para crear el empleado
     * Mediante la clase interfaz se le pregunta al usuario los parametros y se le pasa estos parametros al constructor
     */
    private void registrarEmpleado() {
        iu.imprimirMensaje("Registrar empleado--->");
        iu.imprimirMensaje("Nombre: ");
        String nombreEmpleado = iu.leerTexto();
        iu.imprimirMensaje("Cedula: ");
        String cedula = iu.leerTexto();
        iu.imprimirMensaje("Departamento: ");
        String departamento = iu.leerTexto();
        gestor.crearEmpleado(nombreEmpleado, cedula, departamento);
        iu.imprimirMensaje("Empleado registrado con exito!");

    }
    /**
     * Metodo para registrar una computadora
     * Utiliza el gestor para crear el empleado
     * Mediante la clase interfaz se le pregunta al usuario los parametros y se le pasa estos parametros al constructor
     */
    private void registrarComputadora() {
        iu.imprimirMensaje("Registrar computadora--->");
        iu.imprimirMensaje("Numero de Serie: ");
        String serie = iu.leerTexto();
        iu.imprimirMensaje("Marca del equipo: ");
        String marca = iu.leerTexto();
        gestor.crearComputadora(serie, marca);
    }

    /**
     * Metodo para poder asignar un equipo a un empleado
     * Usando la interfaz se le pregunta al usuario por los parametros para buscar un empleado por su cedula y buscar una computadora por su numero de serie
     */

    private void asignarEquipo() {
        iu.imprimirMensaje("Asignar equipo a empleado--> ");
        iu.imprimirMensaje("Cedula del empleado: ");
        String cedula = iu.leerTexto();
        Empleado empleado =  gestor.buscarEmpleado(cedula);
        iu.imprimirMensaje("Numero de serie del equipo: ");
        String numeroSerie = iu.leerTexto();
        Computadora computadora = gestor.buscarComputadora(numeroSerie);
        gestor.asignarComputadora(computadora,empleado);
        iu.imprimirMensaje("Computadora "+computadora.getSerie()+" asiganada al empleado "+empleado.getNombre());


    }

    /**
     * Metodo para listar empleados
     */

    private void listarEmpleados(){
        ArrayList<Empleado> listaEmpleados;
        listaEmpleados = gestor.listarEmpleados();
        for(int i=0; i<listaEmpleados.size();i++){
            iu.imprimirMensaje(listaEmpleados.toString());
        }
    }

    /**
     * Metodo para listar computadoras
     */
    private void listarComputadoras(){
        ArrayList<Computadora> listaCompus;
        listaCompus = gestor.listarComputadoras();
        for(int i=0;i<listaCompus.size();i++){
            iu.imprimirMensaje(listaCompus.toString());
        }
    }

}

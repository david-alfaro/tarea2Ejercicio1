package alfaroviquez.david.bl.logica;

import alfaroviquez.david.bl.entidades.Computadora;
import alfaroviquez.david.bl.entidades.Empleado;
import java.util.ArrayList;

/**
 * Clase gestor
 * En esta clase se define la logica del programa
 *
 * @author David Alfaro Viquez
 * @version 1.0
 * @since 22/10/2020
 */

public class Gestor {

    ArrayList<Computadora> computadoras;
    ArrayList<Empleado> empleados;


    public Gestor(){
        this.computadoras=new ArrayList<>();
        this.empleados=new ArrayList<>();
    }

    /**
     * Metodo para crear un empleado
     *
     * @param nombre del empleado
     * @param cedula del empleado
     * @param departamento en el que trabaja
     */

    public void crearEmpleado(String nombre, String cedula, String departamento){
        Empleado nuevoEmpleado = new Empleado(nombre,cedula,departamento);
        empleados.add(nuevoEmpleado);
    }

    /**
     * Metodo para crear una instancia Computadora
     *
     * @param serie de la computadora
     * @param marca de la computadora
     */
    public void crearComputadora(String serie, String marca){
        Computadora nuevaCompu = new Computadora();
        nuevaCompu.setMarca(marca);
        nuevaCompu.setSerie(serie);
        computadoras.add(nuevaCompu);
    }

    /**
     * Metodo para asignar una computadora a un empleado
     *
     * @param compu instacia de computadora
     * @param empleado instancia de empleado
     */
    public void asignarComputadora(Computadora compu, Empleado empleado){
        compu.setResponsable(empleado);
    }

    /**
     * Funcion para listar las computadoras creadas
     * @return el arraylist de computadoras
     */
    public ArrayList<Computadora> listarComputadoras(){
        return this.computadoras;
    }

    /**
     * Funcion para listar empleados
     * @return retorna un arraylist de empleados
     */
    public ArrayList<Empleado> listarEmpleados(){
        return this.empleados;
    }

    /**
     * Funcion para realizar la busqueda de empleado medianta la cedula
     *
     * @param cedula del empleado
     * @return una instancia de empleado que coincide con el parametro de cedula que se ingreso
     */
    public Empleado buscarEmpleado(String cedula){
        for(int i=0; i<empleados.size();i++){
            Empleado unEmpleado = empleados.get(i);
            if(unEmpleado.getCedula().equalsIgnoreCase(cedula)){
                return unEmpleado;
            }
        }
        return null;
    }

    /**
     * Funcion para buscar una computadora mediante el numero de serie
     *
     * @param serie de la computadora
     * @return retorna una instancia del objeto compputadora que coincide con el paramtero de busqueda numero de serie
     */

    public Computadora buscarComputadora(String serie){
        for(int i=0;i<computadoras.size();i++){
            Computadora unaComputadora = computadoras.get(i);
            if(unaComputadora.getSerie().equalsIgnoreCase(serie)){
                return unaComputadora;
            }
        }
        return null;
    }


}

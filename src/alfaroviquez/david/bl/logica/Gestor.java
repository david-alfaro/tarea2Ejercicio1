package alfaroviquez.david.bl.logica;

import alfaroviquez.david.bl.entidades.Computadora;
import alfaroviquez.david.bl.entidades.Empleado;

import java.util.ArrayList;

public class Gestor {

    ArrayList<Computadora> computadoras;
    ArrayList<Empleado> empleados;

    public Gestor(){
        this.computadoras=new ArrayList<>();
        this.empleados=new ArrayList<>();
    }

    public void crearEmpleado(String nombre, String cedula, String departamento){
        Empleado nuevoEmpleado = new Empleado(nombre,cedula,departamento);
        empleados.add(nuevoEmpleado);
    }
    public void crearComputadora(String serie, String marca){
        Computadora nuevaCompu = new Computadora();
        nuevaCompu.setMarca(marca);
        nuevaCompu.setSerie(serie);
        computadoras.add(nuevaCompu);
    }

    public void asignarComputadora(Computadora compu, Empleado empleado){
        compu.setResponsable(empleado);
    }


    public ArrayList<Computadora> listarComputadoras(){
        return this.computadoras;
    }

    public ArrayList<Empleado> listarEmpleados(){
        return this.empleados;
    }

    public Empleado buscarEmpleado(String cedula){
        for(int i=0; i<empleados.size();i++){
            Empleado unEmpleado = empleados.get(i);
            if(unEmpleado.getCedula().equalsIgnoreCase(cedula)){
                return unEmpleado;
            }
        }
        return null;
    }

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

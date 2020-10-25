package alfaroviquez.david.bl.entidades;

/**
 * Clase Empleado
 * Para definir instancias de tipo empleado
 *
 * @author David Alfaro Viquez
 * @version 1.0
 * @since 22/10/2020
 */
public class Empleado {
    private String nombre;
    private String cedula;
    private String departamento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Empleado() {
    }

    /**
     *
     * @param nombre del empleado
     * @param cedula del empleado
     * @param departamento en el que trabaja el empleado
     */
    public Empleado(String nombre, String cedula, String departamento) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}

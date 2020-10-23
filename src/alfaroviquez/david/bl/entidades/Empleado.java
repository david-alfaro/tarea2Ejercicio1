package alfaroviquez.david.bl.entidades;

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

package boletin31;

/**
 *
 * @author andrea
 */
public abstract class Empleado {

    private String nombre, apellidos, DNI, direccion, telefono;
    private int antiguidade;
    private float salario;
    private Empleado supervisor;

    public Empleado() {
    }

    public Empleado(String nombre, String apellidos, String DNI, String direccion, String telefono, float salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
    }

    public Empleado getSupervisor() {
        return this.supervisor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getAntiguidade() {
        return antiguidade;
    }

    public void setAntiguidade(int antiguidade) {
        this.antiguidade = antiguidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return ("nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI + ", direccion=" + direccion + ", telefono=" + telefono + ", antiguidade=" + antiguidade + ", salario=" + salario );
    }

    public abstract void incrementarSalario();

    public void cambiarSupervisor(Empleado supervisor) {
        Empleado nuevoSupervisor=new Empleado() {
            @Override
            public void incrementarSalario() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        this.supervisor = nuevoSupervisor;
    }
}

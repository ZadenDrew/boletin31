package boletin31;

/**
 *
 * @author andrea
 */
public class Empleado {

    private String nombre, apellidos, DNI, direccion, telefono;
    private int antiguidade;
    private float salario;

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

    @Override
    public String toString() {
        return ("nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI + ", direccion=" + direccion + ", telefono=" + telefono + ", antiguidade=" + antiguidade + ", salario=" + salario );
    }

   

  

}

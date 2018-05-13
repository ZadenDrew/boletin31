package boletin31;

/**
 *
 * @author andrea
 */
public class Secretario extends Empleado {

    private String despacho, fax;
    private float incrementoSalario = (float) 0.005;

    public Secretario() {
    }

    public Secretario(String despacho, String fax, int incrementoSalario, String nombre, String apellidos, String DNI, String direccion, String telefono, float salario) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.despacho = despacho;
        this.fax = fax;
        this.incrementoSalario = incrementoSalario;
    }

    @Override
    public String toString() {
        return ("Secretario :  despacho=" + despacho + ", fax=" + fax + ", incrementoSalario=" + incrementoSalario);
    }

}

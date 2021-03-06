package boletin31;

/**
 *
 * @author andrea
 */
public class Secretario extends Empleado {

    private String despacho, fax;
    private float incrementoSalario;

    public Secretario() {
    }

    public Secretario(String despacho, String fax, String nombre, String apellidos, String DNI, String direccion, String telefono, float salario) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.despacho = despacho;
        this.fax = fax;

    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public float getIncrementoSalario() {
        return incrementoSalario;
    }

    public void setIncrementoSalario(float incrementoSalario) {
        this.incrementoSalario = incrementoSalario;
    }

    @Override
    public String toString() {
        return ("Secretario ->  " + super.toString() + "despacho=" + despacho + ", fax=" + fax);
    }

    @Override
    public void incrementarSalario() {
        incrementoSalario = (float) (super.getSalario() + (0.05 * super.getAntiguidade()));
        System.out.println(incrementoSalario + " €");
    }

    @Override
    public void imprimir() {
        System.out.println(toString());
    }

}

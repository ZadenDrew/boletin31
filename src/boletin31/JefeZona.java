package boletin31;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andrea
 */
public class JefeZona extends Empleado {

    private String despacho;
    private Secretario secretarioJefe;
    List<Vendedor> listaVendedores = new ArrayList();
    private float incrementoSalario;
    private Coche coche2;

    public JefeZona() {
    }

    public JefeZona(String despacho, Secretario secretarioJefe,  Coche coche2, String nombre, String apellidos, String DNI, String direccion, String telefono, float salario) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.despacho = despacho;
        this.secretarioJefe = secretarioJefe;
        this.coche2 = coche2;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public Secretario getSecretarioJefe() {
        return secretarioJefe;
    }

    public void setSecretarioJefe(Secretario secretarioJefe) {
        this.secretarioJefe = secretarioJefe;
    }

    public List<Vendedor> getListaVendedores() {
        return listaVendedores;
    }

    public void setListaVendedores(List<Vendedor> listaVendedores) {
        this.listaVendedores = listaVendedores;
    }

    public float getIncrementoSalario() {
        return incrementoSalario;
    }

    public void setIncrementoSalario(float incrementoSalario) {
        this.incrementoSalario = incrementoSalario;
    }

    public Coche getCoche2() {
        return coche2;
    }

    public void setCoche2(Coche coche2) {
        this.coche2 = coche2;
    }

    @Override
    public String toString() {
        return ("JefeZona : despacho=" + despacho + ", secretarioJefe=" + secretarioJefe + ", listaVendedores=" + listaVendedores + ", incrementoSalario=" + incrementoSalario);
    }

    @Override
    public void incrementarSalario() {
        incrementoSalario = getSalario() + (getSalario() * (float) 0.20);
    }
}

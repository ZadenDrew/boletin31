package boletin31;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author andrea
 */
public class Vendedor extends Empleado {

    private String movil, areaVenda;
    List<Clientes> listaClientes = new ArrayList();
    private float comisiones, incrementoSalario;
    private Coche coche1;

    public Vendedor() {
    }

    public Vendedor(String movil, String areaVenda, float comisiones, Coche coche1, String nombre, String apellidos, String DNI, String direccion, String telefono, float salario) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.movil = movil;
        this.areaVenda = areaVenda;
        this.comisiones = comisiones;
        this.coche1 = coche1;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getAreaVenda() {
        return areaVenda;
    }

    public void setAreaVenda(String areaVenda) {
        this.areaVenda = areaVenda;
    }

    public List<Clientes> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Clientes> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public float getComisiones() {
        return comisiones;
    }

    public void setComisiones(float comisiones) {
        this.comisiones = comisiones;
    }

    public float getIncrementoSalario() {
        return incrementoSalario;
    }

    public void setIncrementoSalario(float incrementoSalario) {
        this.incrementoSalario = incrementoSalario;
    }

    public Coche getCoche1() {
        return coche1;
    }

    public void setCoche1(Coche coche1) {
        this.coche1 = coche1;
    }

    @Override
    public String toString() {
        return ("Vendedor :  movil=" + movil + ", areaVenda=" + areaVenda + ", comisiones=" + comisiones + ", incrementoSalario=" + incrementoSalario);
    }

    @Override
    public void incrementarSalario() {
        incrementoSalario = getSalario() + (getSalario() * (float) 0.10);
    }

    public void cambiarCoche() {
        setCoche1(new Coche(JOptionPane.showInputDialog("Introduce matricula: "),JOptionPane.showInputDialog("Introduce marca: "),JOptionPane.showInputDialog("Introduce modelo: ")));
    }
}

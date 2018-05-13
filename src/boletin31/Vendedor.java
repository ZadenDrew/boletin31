package boletin31;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andrea
 */
public class Vendedor extends Empleado {

    String movil, areaVenda;
    List<Clientes> listaClientes = new ArrayList();
    float comisiones, incrementoSalario = (float) 0.010;

    public Vendedor() {
    }

    public Vendedor(String movil, String areaVenda, float comisiones, String nombre, String apellidos, String DNI, String direccion, String telefono, float salario) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.movil = movil;
        this.areaVenda = areaVenda;
        this.comisiones = comisiones;
    }

    @Override
    public String toString() {
        return ("Vendedor :  movil=" + movil + ", areaVenda=" + areaVenda + ", comisiones=" + comisiones + ", incrementoSalario=" + incrementoSalario);
    }

}

package boletin31;

/**
 *
 * @author andrea
 */
public class Boletin31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche car = new Coche("15478po", "Citroen", "c4");
        Coche car1 = new Coche("157418LU", "Audi", "A4");
        Clientes clien = new Clientes();
        Empleado sec = new Secretario("desp5", "652341218", "Pontevedra", "Ana", "Ruiz", "2548967K", "Urzaiz", 1400);
        Empleado ven = new Vendedor("652341218", "Vigo", 500, car, "Juan", "Sanchez", "2548967K", "Principe", "986542317", 1400);
        Empleado jef = new JefeZona("esp10", (Secretario) sec,car1, "Juan", "Sanchez", "2548967K", "Principe", "986542317", 2000);
        sec.incrementarSalario();
        sec.imprimir();
        ven.incrementarSalario();
        ven.imprimir();
        jef.incrementarSalario();
        jef.imprimir();
    }

}

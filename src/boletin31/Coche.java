
package boletin31;

/**
 *
 * @author andrea
 */
public class Coche {
    private String matricúlaa, marca ,modelo;

    public Coche() {
    }

    public Coche(String matricúlaa, String marca, String modelo) {
        this.matricúlaa = matricúlaa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricúlaa() {
        return matricúlaa;
    }

    public void setMatricúlaa(String matricúlaa) {
        this.matricúlaa = matricúlaa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}

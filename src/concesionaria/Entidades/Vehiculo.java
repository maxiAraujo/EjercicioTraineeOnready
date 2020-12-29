
package concesionaria.Entidades;


public class Vehiculo implements Comparable<Vehiculo>{
    private String marca;
    private String modelo;
    private int puertas;
    private String cilindrada;
    private Double precio;

    public Vehiculo(String marca, String modelo, int puertas, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.puertas = puertas;
        this.precio = precio;
    }

    public Vehiculo(String marca, String modelo, String cilindrada, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.precio = precio;
    }

    public Vehiculo() {
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

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", puertas=" + puertas + 
                ", cilindrada=" + cilindrada + ", precio=" + precio + '}';
    }

    @Override
    public int compareTo(Vehiculo o) {
        return this.precio.compareTo(o.precio);
    }
 
}

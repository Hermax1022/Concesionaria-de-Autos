//Clase hija o sub clase de Vehiculos
package Concesionaria;

public class Motos extends Vehiculos{
    private int cilindrado;

    public Motos(int cilindrado, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.cilindrado = cilindrado;
    }

    public int getCilindrado() {
        return cilindrado;
    }

    @Override
    public String toString() {
        return super.toString()+"// Cilindrado: "+cilindrado+"cc";
    }
    
    
}

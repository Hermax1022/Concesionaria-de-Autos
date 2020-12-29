//Clase hija o sub clase de Vehiculos
package Concesionaria;

public class Autos extends Vehiculos{
    private int puertas;

    public Autos(int puertas, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    @Override
    public String toString() {
        return super.toString()+"// Puertas: "+puertas;
    }
    
    
}

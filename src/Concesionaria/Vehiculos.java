//Clase Padre o super clase
package Concesionaria;

public class Vehiculos {
    private String marca;
    private String modelo;
    private double precio;

    public Vehiculos(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }
      
    public String toString(){
        return "Marca: "+marca+"// Modelo: "+modelo+"// Precio: "+precio;
    }
}

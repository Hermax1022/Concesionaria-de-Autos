//clase principal
package Concesionaria;

import java.util.ArrayList;

public class Principal {
    //creamos una lsita de arrays para los objetos de tipo Vehiculos
    static ArrayList<Vehiculos>vehiculo = new ArrayList<Vehiculos>();        
        
    public static void main(String[] args) {  
        //carga de datos
        llenarVehiculos();
        //imprime los valores agregados a la lista        
        for(Vehiculos vehi:vehiculo){
            System.out.println(vehi.toString());            
        }
        System.out.println("=============================");
        System.out.println("Vehiculo mas caro: "+masCaro());
        System.out.println("Vehiculo mas caro: "+masBarato());
        System.out.println("Modelo que contiene la letra Y: "+modeloY());
        System.out.println("=============================");
        System.out.println("Vehículos ordenados por precio de mayor a menor: "); 
        //ordenamos la lista
        ordenar();
        //imprimimos la lista ordenada por precio
        for(Vehiculos vehi:vehiculo){
            System.out.println(vehi.getMarca()+" "+vehi.getModelo());            
        }
        
    }
    //agregamos los datos a la lista de objetos
    public static void llenarVehiculos(){
        Autos v1 = new Autos(4,"Peugeot","206",200000.00);
        vehiculo.add(v1); 
        Motos v2 = new Motos(125,"Honda","Titan",60000.00);
        vehiculo.add(v2); 
        Autos v3 = new Autos(5,"Peugeot","208",250000.00);
        vehiculo.add(v3); 
        Motos v4 = new Motos(160,"Yamaha","YBR",80500.50);
        vehiculo.add(v4);                
    }
    //metodo que registra el Vehiculo mas caro
    public static String masCaro(){        
        double maxPrecio= vehiculo.get(0).getPrecio();
        String marca = " ";
        for(Vehiculos vehi:vehiculo){
            if(vehi.getPrecio()> maxPrecio){
                maxPrecio = vehi.getPrecio();                
            }
        }
        for(Vehiculos vehi:vehiculo){
            if(vehi.getPrecio() == maxPrecio){                
                marca = vehi.getMarca()+" "+vehi.getModelo();
            }
        }
        return marca;
    }
    //metodo que registra el Vehiculo mas barato
    public static String masBarato(){        
        double minPrecio=vehiculo.get(0).getPrecio();
        String marca = " ";
        for(Vehiculos vehi:vehiculo){
            if(vehi.getPrecio()< minPrecio){
                minPrecio = vehi.getPrecio();                
            }
        }
        for(Vehiculos vehi:vehiculo){
            if(vehi.getPrecio() == minPrecio){                
                marca = vehi.getMarca()+" "+vehi.getModelo();
            }
        }
        return marca;
    }
    //metodo que registra el Vehiculo que contiene Y en su modelo
    public static String modeloY(){        
        String modelo, modeloY = " ";
        for(Vehiculos vehi:vehiculo){
            modelo = vehi.getModelo();
            for(int i=0;i<modelo.length();i++){
               if( modelo.charAt(i)=='Y'){                   
                   modeloY = vehi.getMarca()+" "+vehi.getModelo();
               }
            }
        }
        return modeloY;
    }
    //metodo de ordenamiento
    public static void ordenar(){
        Vehiculos aux;        
        for(int i=0;i<vehiculo.size()-1;i++){
            for(int j=0;j<vehiculo.size()-1;j++){
                if(vehiculo.get(j).getPrecio()<vehiculo.get(j+1).getPrecio()){
                    aux = vehiculo.get(j);
                    vehiculo.set(j,vehiculo.get(j+1));
                    vehiculo.set(j+1,aux);
                    
                }
            }
            
        }
        
    }
        
 }
  
    


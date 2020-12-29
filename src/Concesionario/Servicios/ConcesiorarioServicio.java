
package Concesionario.Servicios;

import concesionaria.Entidades.Vehiculo;
import java.util.List;

public class ConcesiorarioServicio {
    private final VehiculoServicio vehiculoServicio = new VehiculoServicio();
    
    public void central(){
        List<Vehiculo> vehiculos = vehiculoServicio.crearVehiculo();
        printVehiculo(vehiculos);
        separador();
        VehiculoMasCaro(vehiculoServicio.masCaro(vehiculos));
        VehiculoMasBarato(vehiculoServicio.masBarato(vehiculos));
        contieneY(vehiculoServicio.contieneY(vehiculos));
        separador();
        ordenados(vehiculoServicio.ordenarMayor(vehiculos));
 
    }
    
    private void separador(){
        System.out.println("=============================");
    }
    
    private void printVehiculo(List<Vehiculo> vehiculos){
        for (Vehiculo v : vehiculos) {
            if (v.getCilindrada() == null) {
                System.out.println("Marca: " + v.getMarca() + " // Modelo: " + v.getModelo() + " // Puertas: " + v.getPuertas()
                + " // Precio: " + v.getPrecio());
            }else{
                System.out.println("Marca: " + v.getMarca() + " // Modelo: " + v.getModelo() + " // Cilindrada: " + v.getCilindrada()
                + " // Precio: " + v.getPrecio());
            }
            
        }
    }
    
    private void VehiculoMasCaro(Vehiculo vehiculo){
        System.out.println("Vehículo más caro:" + vehiculo.getMarca() + " " + vehiculo.getModelo());
    }
    
    private void VehiculoMasBarato(Vehiculo vehiculo){
        System.out.println("Vehículo más barato:" + vehiculo.getMarca() + " " + vehiculo.getModelo());
    }
    
    private void contieneY(Vehiculo vehiculo){
        System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: "  + vehiculo.getMarca() + " " + vehiculo.getModelo()
        + " " + vehiculo.getPrecio());
    }
    
    private void ordenados(List<Vehiculo>vehiculos){
        System.out.println("Vehículos ordenados por precio de mayor a menor: ");
        vehiculos.forEach((v) -> {
            System.out.println(v.getMarca() + " " + v.getModelo());
        });
    }
}

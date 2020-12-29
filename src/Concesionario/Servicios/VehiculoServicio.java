package Concesionario.Servicios;

import concesionaria.Entidades.Vehiculo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VehiculoServicio {

    public List<Vehiculo> crearVehiculo() {
        List<Vehiculo> vehiculos = new ArrayList<>();

        Vehiculo v1 = new Vehiculo("Peugeot", "206", 4, 200000.00);
        Vehiculo v2 = new Vehiculo("Honda", "Titan", "125cc", 60000.00);
        Vehiculo v3 = new Vehiculo("Peugeot", "208", 5, 250000.00);
        Vehiculo v4 = new Vehiculo("Yamaha", "YBR", "160cc", 80500.50);

        vehiculos.add(v1);
        vehiculos.add(v2);
        vehiculos.add(v3);
        vehiculos.add(v4);
        
        return vehiculos;
    }

    public Vehiculo masCaro(List<Vehiculo> vehiculos) {
        Vehiculo caro = vehiculos.get(0);

        for (Vehiculo v : vehiculos) {
            if (v.getPrecio() > caro.getPrecio()) {
                caro = v;
            }
        }
        return caro;
    }

    public Vehiculo masBarato(List<Vehiculo> vehiculos) {
        Vehiculo barato = vehiculos.get(0);

        for (Vehiculo v : vehiculos) {
            if (v.getPrecio() < barato.getPrecio()) {
                barato = v;
            }
        }
        return barato;
    }

    public Vehiculo contieneY(List<Vehiculo> vehiculos) {
        Vehiculo vehiculoConY = new Vehiculo();
        for (Vehiculo v : vehiculos) {
            if (v.getModelo().contains("Y") || v.getModelo().contains("y")) {
                vehiculoConY = v;
            }
        }
        return vehiculoConY;
    }

    public List<Vehiculo> ordenarMayor(List<Vehiculo> vehiculos){
        Collections.sort(vehiculos, Collections.reverseOrder());
        
//        for (Vehiculo vehiculo : vehiculos) {
//            System.out.println(vehiculo);
//        }
        return vehiculos;
    }
}

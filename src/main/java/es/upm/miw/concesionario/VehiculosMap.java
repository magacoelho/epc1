package es.upm.miw.concesionario;

import java.util.HashMap;
import java.util.Map;

public class VehiculosMap {
    private Map<Integer,Vehiculo> vehiculos; 
    public VehiculosMap() {
       vehiculos= new HashMap<Integer,Vehiculo>();
    }
    private void inicializar(){
        vehiculos.put(1, new Coche(1,"Fiat coche", 'A'));        
        vehiculos.put(2, new Coche(2,"Chevy coche", 'A'));
        vehiculos.put(3, new Bicicleta(3,"Monark bici"));
        vehiculos.put(4, new Moto(4,"Susuiki"));
    }

}

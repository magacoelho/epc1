package es.upm.miw.concesionario;

import java.util.Iterator;
import java.util.Map;

public class GestorVehiculos {
    private Map<Integer,Vehiculo> vehiculos; 
    public void darAlta(Vehiculo v) {
        
        vehiculos.put(v.getId(),v);
        
    }

    public String todosVehiculos() {
        // TODO Auto-generated method stub
        String cadena ="";
        Iterator it = vehiculos.keySet().iterator();
        while(it.hasNext()){
          Integer key = (Integer) it.next();
          cadena= cadena + vehiculos.get(key);
        }
        return cadena;
    }

}

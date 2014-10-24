package es.upm.miw.concesionario;

import java.util.Map;

public class GestorAlquiler {
    private Map<Integer,Vehiculo> vehiculos;
    public double determinarAlquiler(int id, int dias) {
        // vehiculos = bbdd.consultarTodos();
        // supongo q este metodo se encraga de consultar frente a una base de datos
        Vehiculo v =vehiculos.get(id);
       return v.determinarAlquiler(dias);
    }
  
}

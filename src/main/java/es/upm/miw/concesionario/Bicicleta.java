package es.upm.miw.concesionario;

public class Bicicleta extends Vehiculo {

    public Bicicleta() {
        super();
       
    }

    public Bicicleta(Integer id, String descripcion) {
        super(id, descripcion);
       
    }

    @Override
    public String toString() {
        return "Bicicleta [getId()=" + getId() + ", getDescripcion()=" + getDescripcion() + "]";
    }
    
   
}

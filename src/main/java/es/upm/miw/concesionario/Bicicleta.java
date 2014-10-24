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

    @Override
    public double determinarAlquiler(int dias) {
        double valor=0;
        if(dias<=2)
            valor= dias*3;
        else
            valor =dias*3+ (dias-2)*2;
        
        return 0;
    }

    
    
    
   
}

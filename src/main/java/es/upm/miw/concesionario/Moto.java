package es.upm.miw.concesionario;

public class Moto extends Vehiculo{
    public Moto() {
        super();
    }
    public Moto(Integer id, String descripcion) {
        super(id, descripcion);
    }
    @Override
    public String toString() {
        return "Moto [getId()=" + getId() + ", getDescripcion()=" + getDescripcion() + "]";
    }
    @Override
    public double determinarAlquiler(int dias) {
        double precioBase = 0.0;
        double valor = 0;
        
        if(dias<=7)
        {
          valor = 8*dias;    
            
        }
        else
        {
            valor =8*dias+7*(dias-7);
        }
        
        return valor;
    }
     

}

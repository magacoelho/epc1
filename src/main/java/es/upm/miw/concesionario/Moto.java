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
        // TODO Auto-generated method stub
        return 0;
    }
     

}

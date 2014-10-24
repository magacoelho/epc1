package es.upm.miw.concesionario;

public class Moto extends Vehiculo{
    public Moto() {
        super();
    }
    public Moto(Integer id, String descripcion, double precioBase) {
        super(id, descripcion, precioBase);
    }
    @Override
    public String toString() {
        return "Moto [getId()=" + getId() + ", getDescripcion()=" + getDescripcion() + "]";
    }
    @Override
    public double determinarAlquiler(int dias) {
        double precioBase = this.getPrecioBase();
        return 0;
    }
     

}

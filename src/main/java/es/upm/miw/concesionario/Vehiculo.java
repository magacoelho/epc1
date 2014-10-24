package es.upm.miw.concesionario;

public abstract class Vehiculo implements AlquilerVehiculo{
   private Integer id;
   private  String descripcion;
   private double precioBase;
   
    public Vehiculo() {
    super();
}
    
    public Vehiculo(Integer id, String descripcion) {
        super();
        this.id = id;
        this.descripcion = descripcion;
       
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public Integer getId() {
          return this.id;
     }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Vehiculo [id=" + id + ", descripcion=" + descripcion + "precioBase" +precioBase+ "]";
    }
   

}

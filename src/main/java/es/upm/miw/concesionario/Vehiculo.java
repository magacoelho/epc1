package es.upm.miw.concesionario;

public class Vehiculo {
   private Integer id;
   private  String descripcion;
   
    public Vehiculo() {
    super();
}
    public Vehiculo(Integer id, String descripcion) {
    super();
    this.id = id;
    this.descripcion = descripcion;
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
   

}

package es.upm.miw.concesionario;

public class Coche extends Vehiculo{
    private char categoria;

    public Coche(Integer id, String descripcion, char categoria) {
        super(id, descripcion);
        this.categoria = categoria;
    }

    public Coche() {
        super();
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Coche [categoria=" + categoria + ", getId()=" + getId() + ", getDescripcion()="
                + getDescripcion() + "]";
    }

    @Override
    public double determinarAlquiler(int dias) {
        // TODO Auto-generated method stub
        return 0;
    }

   
    
   
}

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
    

}
